package Lesson14.NormalLevel.StringManipulationOverload;

public class StringUtil {

    //    concatenation
    public void manipulation(String first, String second){
        System.out.println(first.concat(second));
    }

    //uppercase conversion
    public void manipulation(String bigWord){
        System.out.println(bigWord.toUpperCase());
    }

    //string reversal
    public void manipulation(String word,String word1, String word2){
        System.out.println(word + word1 + word2);
    }


}
