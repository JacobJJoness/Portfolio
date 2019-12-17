public class PigLatin {

    public static String toPigLatin(String english) {
        int vowel = firstVowel(english);
        String firstLet = english.substring(0,1);

        if (vowel == 0){
            return english + "way";
        }
        if (firstLet.compareTo("A") >=0 && firstLet.compareTo("Z")<=0){
            String capString = english.substring(vowel,vowel+1).toUpperCase();
            String lowerString = english.substring(vowel+1) + english.substring(0,vowel).toLowerCase();
            return  capString + lowerString + "ay";
        }
        
        return english.substring(vowel) +  english.substring(0,vowel) + "ay";
        }

    public static int firstVowel(String str) {
        String[] arrVowels = {"a","e","i","o","u"};
        int smallIndex = 50;
        for (int i = 0; i < arrVowels.length; i++) {
            int curIndex = str.indexOf(arrVowels[i]);
            if (smallIndex >= curIndex &&  curIndex > -1){
                smallIndex = curIndex;
            }
        }
        if( smallIndex ==50 ){
            return 0;
        }
        return smallIndex;
        
    }
}