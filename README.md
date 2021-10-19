# MMO Engine

The "MMO Engine" is a plugin for Minecraft Spigot to create immersive MMO Adventures for your users with ease.  
The whole engine is written **WITHOUT ANY** other dependencies, **BUT** you can connect the engine with other plugins to get more possibilities.

Most heavy lifting, like database connection or File Management, is already done by the engine while not limiting you in your creative process of creating an MMO.  
The "MMO Engine" is providing many features, each feature has its own section down below.

Please remember that the project still is in a very early stage of its lifecycle, this means not every functionality is implemented by this time but you can already read what is planed to be implemented by the first release of this project. Because of this there are very few examples.

The development of this project started in october 2021 and the team is very small, to be exact i work alone on this project. So please understand if your idea is not implemented in the next update, I will try to implement most ideas that would fit and improve the engine.

- [MMO Engine](#mmo-engine)
  - [File Management](#file-management)
  - [Database](#database)
    - [Supported Databases](#supported-databases)
  - [Caching](#caching)
    - [Caching Strategies](#caching-strategies)
      - [All](#all)
      - [None](#none)
      - [Database](#database-1)
  - [Custom In-Game Systems](#custom-in-game-systems)
  - [Money System](#money-system)
  - [Custom NPCs](#custom-npcs)
  - [Custom Mobs](#custom-mobs)
    - [Normal Enemies](#normal-enemies)
    - [Boss Enemies](#boss-enemies)
  - [Quests & Tasks](#quests--tasks)
  - [Custom Items](#custom-items)
  - [Custom Drops](#custom-drops)

---

## File Management

The file-management allows caching(more to caching [here](#caching)) and access to all configuration files you need.  
Besides, that it delivers some extra functionality we don't want to miss.

You will never have to keep track of your files and everything, just add it to the ConfigManager and you can read and write from everywhere.

This example shows how to add a file to the Manager:
```Java
public class Main {
  @Override
  public void onEnable() {
    String path = this.getDataFolder().getAbsolutePath();

    ConfigManager.getInstance().addConfig("foo", path + "/foo.yml");
    // or write
    File cfgFile = new File(path, "bar.yml");
    ConfigManager.getInstance().addConfig("bar", cfgFile);
  }
}
```

## Database

The engine allows you to connect to any [supported](#supported-databases) database.

You can use this database to store any data, via `DatabaseManager` you are able to manage the database and the data inside without having to write any queries to the database. On top of this you get a basic protection against vulnerabilities like SQLInjections.

### Supported Databases

The engine supports many databases to support your environment and infrastructure without forcing you to use any technology.

| Database Type  | Example | Note                              |
| -------------- | ------- | --------------------------------- |
| SQL            | MariaDB | Please test before productive use |
| Document Based | MongoDB | JSON Files                        |

## Caching

The caching can be configured to select certain caching strategies and the amount of time how long each entry is cached before it is deleted again.

### Caching Strategies

By selecting one of the following caching strategies you change it for the whole project. Each one has its own advantages and disadvantages, but these are described in each section

The TTL(=Time To Live) means how long each entry is saved in the cache, for example you want it to be stored for 5 seconds then you set TTL to 5s, otherwise if you don't want your cache to remove the entries input a -1 and the engine won't clear the cache, but you need to remember that the cache uses memory and thus if its never cleared can cause problems

#### All

The strategy 'All' is a pretty simple one, each and every entry is saved in the cache.

**Advantages**:
- Faster data loading from the database/configuration, depending on your environment it can boost your performance significant 

**Disadvantages**:
- Uses more memory to store the data, depending on its size it can use up pretty much memory

#### None

The strategy 'None' is pretty simple as well, long story short, it will cache not a single value.

**Advantages**:
- No extra memory usage, good for limited hardware

**Disadvantages**:
- Worse performance and higher write cycles on the hard drive

#### Database

The strategy 'Database' only caches data coming from the database.

Because most times config files aren't dynamic there is the possibility to only save database entries.

**Advantages**:
- Only saves dynamic data
- Reduces memory usage

**Disadvantages**:
- Higher read time from config files

## Custom In-Game Systems

With the custom in-game systems you are able to introduce your own twist and ideas to the world of MMO, you can implement them with ease, and they get integrated as if they are coded into this engine their self.

## Money System

The engine provides an integrated money system, it can handle all common functionalities a money system needs. It is connected to a database.

The money system provides multiple options to store the money, it can be an Item, but it can be stored in a bank or in the purse of the player, you can manage the money from everywhere without needing to worry to get, update and store the new balance of the player, you can simply work with the raw numbers.

You have the possibility to connect the engine with other economy plugins like vault for better compatibility with other plugins.

## Custom NPCs

The custom NPC system is build to provide an environment without emptiness even if there is only one player is not alone, he has NPCs with which he can interact, trade or get [Quests/Tasks](#quests--tasks) or if you want to its even possible for an NPC to support everything and more.

The NPCs can follow predefined paths which he walks along, or he can move randomly in a predefined area.

## Custom Mobs

What would an MMO be without enemies and bosses? Pretty empty!

That's why we provide you with a custom mob system that allows you to create new and unique mobs, with [custom drops](#custom-drops). They only spawn in their specific spawn location and have different AIs which they can use to make them even more unique.

### Normal Enemies

You can create your own enemy to fight against, they can wear items and armor.  
They can even use the special abilities for the armor or items(if the items have special abilities), you can give them their own attacks and abilities which they use in the battle.

### Boss Enemies

A boss enemy is pretty much like a normal enemy but a boss bar will appear if you are close to him

## Quests & Tasks

The Quest & Task system allows to give your players a reason to play, your quests can range from walking to a certain location to talking with a NPC or gathering some materials, as reward you they can get money, items, xp, or pretty much anything you want them to get.

The Quests can have more steps, these are called tasks. By completing a task you unlock the next task, it's possible to have multiple quest lines or even a quest with multiple different endings and rewards according to which tasks you have done or which path you took.

## Custom Items

Custom Items allow you to be different and stand out from other servers by providing items with custom stats and multiple abilities which can be set for an Item or Armor as well, what the stats look like or what the abilities which item has and what they to, is up to you and your creativity.

## Custom Drops

As mentioned in [Custom Mobs](#custom-mobs) its possible to have your mobs drop special items with different drop chances, the items don't have to be normal items, even custom Items can be dropped.