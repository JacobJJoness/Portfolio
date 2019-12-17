import java.util.HashMap;

public class PigLatinTest {

    private HashMap<String, String> tests;
    private HashMap<String, Integer> vowels;

    public PigLatinTest() {
        tests = new HashMap<String,String>();
        tests.put("pig","igpay");
        tests.put("latin","atinlay");
        tests.put("banana","ananabay");
        tests.put("happy","appyhay");
        tests.put("duck","uckday");
        tests.put("Duck","Uckday");
        tests.put("me","emay");
        tests.put("too","ootay");
        tests.put("bagel","agelbay");
        tests.put("smile","ilesmay");
        tests.put("string","ingstray");
        tests.put("stupid","upidstay");
        tests.put("glove","oveglay");
        tests.put("Glove","Oveglay");
        tests.put("trash","ashtray");
        tests.put("floor","oorflay");
        tests.put("store","orestay");
        tests.put("store.","orestay.");
        tests.put("eat","eatway");
        tests.put("omelet","omeletway");
        tests.put("omelet?","omeletway?");
        tests.put("are","areway");
        tests.put("egg","eggway");
        tests.put("explain","explainway");
        tests.put("always","alwaysway");
        tests.put("ends","endsway");
        tests.put("honest","onesthay");
        tests.put("I","Iway");
        vowels = new HashMap<String,Integer>();
        vowels.put("pig",1);
        vowels.put("latin",1);
        vowels.put("banana",1);
        vowels.put("happy",1);
        vowels.put("duck",1);
        vowels.put("me",1);
        vowels.put("too",1);
        vowels.put("bagel",1);
        vowels.put("smile",2);
        vowels.put("string",3);
        vowels.put("stupid",2);
        vowels.put("glove",2);
        vowels.put("trash",2);
        vowels.put("floor",2);
        vowels.put("store",2);
        vowels.put("eat",0);
        vowels.put("omelet",0);
        vowels.put("are",0);
        vowels.put("egg",0);
        vowels.put("explain",0);
        vowels.put("always",0);
        vowels.put("ends",0);
        vowels.put("honest",1);
        vowels.put("I",0);
    }
    
    public void toPigLatinTest() {
        System.out.println("*****************Testing toPigLatin*********************");
        int numPassed = 0;
        int numTests = 0;
        for(HashMap.Entry<String, String> entry: tests.entrySet()) {
            numTests++;
            String word = entry.getKey();
            String pigLatin = entry.getValue();
            if(PigLatin.toPigLatin(word).equals(pigLatin)) {
                numPassed++;
            } else {
                System.out.printf("Expected: %10s \t\tGot: %10s\n",pigLatin, PigLatin.toPigLatin(word));
            }

        }
        System.out.printf("Tests Passed: %d out of %d\n", numPassed, numTests);
        System.out.println("********************************************************");

    }

    public void firstVowelTest() {
        System.out.println("*****************Testing firstVowel*********************");
        int numPassed = 0;
        int numTests = 0;
        for(HashMap.Entry<String, Integer> entry: vowels.entrySet()) {
            numTests++;
            String word = entry.getKey();
            int index = entry.getValue();
            if(PigLatin.firstVowel(word) == index) {
                numPassed++;
            } else {
                System.out.printf("Word: %10s \tExpected: %d \t\tGot: %d\n", word, index, PigLatin.firstVowel(word));
            }

        }
        System.out.printf("Tests Passed: %d out of %d\n", numPassed, numTests);
        System.out.println("********************************************************");
    }


    public static void main(String[] args) {
        PigLatinTest test = new PigLatinTest();
        test.toPigLatinTest();
        test.firstVowelTest();
    }


}