public class Tile {
    private String letter;
    private int value;
    

    public Tile(String letter, int value) {
        this.letter = letter;
        this.value = value;
    }
    public String toString() {
        return String.format("%s %d\n", this.letter, this.value);
    }
    public static void printTile(Tile t){
        System.out.printf("Letter %s = %d\n", t.letter, t.value);

    }
    public boolean equals(Tile that) {
        return this.value == that.value && this.letter == that.letter;
    }
    public String getLetter() {
        return this.letter;
    }

    public int getValue() {
        return this.value;
    }
    public void setLetter(String letter) {
        this.letter = letter;
    }

    public void setValue(int value) {
        this.value = value;
    }






    























}