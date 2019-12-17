

public class PasswordGenerator{
    private int NumberLength;
    private String PassCharacters;
    private String generatedPass;
    private int count;
  
    public PasswordGenerator(int nums, String character){
        NumberLength = nums;
        PassCharacters = character;
    }
    public String pwGen(PasswordGenerator pass){
        generatedPass = PassCharacters + ".";
        for( int i = 1; i <= pass.NumberLength; i ++){
             generatedPass+= (int)(Math.random()*10);

        }
        count+=1;
        return generatedPass;
    }
    public int pwCount(){
        return this.count;
    }








    public static void main(String[] args) {
        PasswordGenerator christianMingle = new PasswordGenerator(4,"christiansucksbutt");
        christianMingle.pwGen(christianMingle);
        System.out.println(christianMingle.pwGen(christianMingle));
    }
}