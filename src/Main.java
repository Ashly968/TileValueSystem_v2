public class Main {
    public static void main(String[] args) {
        Tile mudTile = new TileType.Mud();
        Tile grassTile = new TileType.Grass();
        Tile roadTile = new TileType.Road();
        Tile waterTile = new TileType.Water();
        Tile dirtTile = new TileType.Dirt();

        Value_Implement valueEntity_1 = new Value_Implement(mudTile);
        Value_Implement valueEntity_2 = new Value_Implement(grassTile);
        Value_Implement valueEntity_3 = new Value_Implement(roadTile);
        Value_Implement valueEntity_4 = new Value_Implement(waterTile);
        Value_Implement valueEntity_5 = new Value_Implement(dirtTile);

        Character character = new Character("Hero", new Position(0, 0), new ResourcePoints(100, 50));

        // Command execution based on the CommandType
        Cell targetCell = MapGenerator.getCellAt(2, 2);
        assert targetCell != null;
        MoveCommand moveCommand = new MoveCommand(character, targetCell, CommandType.MOVE);
        moveCommand.execute();

        // Undoing the move
        moveCommand = new MoveCommand(character, targetCell, CommandType.UNDO);
        moveCommand.execute();

        // Resetting the move command
        moveCommand = new MoveCommand(character, targetCell, CommandType.RESET);
        moveCommand.execute();
    }
}

