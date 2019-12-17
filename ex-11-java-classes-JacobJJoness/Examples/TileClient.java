public class TileClient {
    public static void main(String[] args) {
        Tile tile = new Tile("a", 30);
    
        
        System.out.println("tile: " + tile);

        System.out.println("tile.Letter = " + tile.getLetter());
        System.out.println("tile.Value = " + tile.getValue());

        tile.setValue(6);
        tile.setLetter("b");

        System.out.println("tile.Letter = " + tile.getLetter());
        System.out.println("tile.Value = " + tile.getValue());

        Tile tile2 = tile;
        Tile tile3= new Tile("c", 5);
        System.out.println();
        System.out.println("tile == tile2 is " + (tile==tile2));
        System.out.println("tile == tile3 is " + (tile==tile3));
        System.out.println("tile.equals(tile2) is " + tile.equals(tile2));
        System.out.println("tile.equals(tile3) is " + tile.equals(tile3));


    }
}