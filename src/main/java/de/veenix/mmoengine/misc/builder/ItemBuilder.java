package de.veenix.mmoengine.misc.builder;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.*;

@Getter
public class ItemBuilder {

    private final Material material;

    @Setter
    private Map<Enchantment, Integer> enchantments = new HashMap<>();

    @Setter
    private String displayName;

    @Setter
    private int amount = 1;

    @Setter
    private int damage = 0;

    @Setter
    private Color color;

    @Setter
    private ItemMeta meta;

    @Setter
    private List<String> lore = new ArrayList<>();

    @Setter
    private List<ItemFlag> flags = new ArrayList<>();

    @Setter
    private boolean unbreakable = false;

    public ItemBuilder(Material mat) {
        material = mat;
    }

    public ItemStack build() {
        ItemStack stack = new ItemStack(material);

        if(meta != null) {
            stack.setItemMeta(meta);
        }

        if(color != null) {
            // Casts ItemMeta to LeatherArmorMeta and sets the color
            ((LeatherArmorMeta) Objects.requireNonNull(stack.getItemMeta())).setColor(color);
        }

        stack.addEnchantments(enchantments);
        stack.setAmount(amount);
        Objects.requireNonNull(stack.getItemMeta()).setLore(lore);
        Objects.requireNonNull(stack.getItemMeta()).setDisplayName(displayName);
        Objects.requireNonNull(stack.getItemMeta()).setUnbreakable(unbreakable);
        Objects.requireNonNull((Damageable) stack.getItemMeta()).setDamage(damage);

        return stack;
    }
}
