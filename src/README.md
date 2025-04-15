classDiagram
TileType <|-- Mud
TileType <|-- Grass
TileType <|-- Meadow
TileType <|-- Rubble
TileType <|-- Clay
TileType <|-- Stone_Dirt
TileType <|-- Stone_Path
TileType <|-- Water
TileType <|-- Road
TileType <|-- Dirt
Tile <|-- TileType
Value <|-- Value_Implement
Mud <|-- Value_Implement
Grass <|-- Value_Implement
Meadow <|-- Value_Implement
Rubble <|-- Value_Implement
Clay <|-- Value_Implement
Stone_Dirt <|-- Value_Implement
Stone_Path <|-- Value_Implement
Water <|-- Value_Implement
Road <|-- Value_Implement
Dirt <|-- Value_Implement


    class Tile {
        <<interface>>
        +TileType getType()
    }

    class TileType {
        <<enum>>
        +MUD: int
        +GRASS: int
        +MEADOW: int
        +RUBBLE: int
        +CLAY: int
        +STONE_DIRT: int
        +STONE_PATH: int
        +ROAD: int
        +WATER: int
        +DIRT: int
        +getValue(): int
    }

    class Mud {
        +TileType getType()
    }

    class Grass {
        +TileType getType()
    }

    class Meadow {
        +TileType getType()
    }

    class Rubble {
        +TileType getType()
    }

    class Clay {
        +TileType getType()
    }

    class Stone_Dirt {
        +TileType getType()
    }

    class Stone_Path {
        +TileType getType()
    }

    class Water {
        +TileType getType()
    }

    class Road {
        +TileType getType()
    }

    class Dirt {
        +TileType getType()
    }

    
    class Value {
        <<interface>>
        +int velocity()
        +Tile getTile()
    }

    class Value_Implement {
        +Tile tile
        +int velocity
        +Value_Implement(Tile tile)
        +int velocity()
        +Tile getTile()
        +int setVelocity(int velocity)
    }
    class Main {
        +main(String[] args)
    }