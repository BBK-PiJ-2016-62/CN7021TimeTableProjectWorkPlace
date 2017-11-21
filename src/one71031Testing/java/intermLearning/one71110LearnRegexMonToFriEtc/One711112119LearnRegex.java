package one71031Testing.java.intermLearning.one71110LearnRegexMonToFriEtc;

/**
 * Created by Eric's laptop on 11/11/2017.
 */
public class One711112119LearnRegex {

    public static void main(String[] args){

        //boolean blr= "Wednesday".matches("[[A-Za-z]{3}\\/]+[A-Za-z]{3}");  ..false
        //boolean blr1="Monday/Tue/Fri/Wer".matches("\\w{3}\\/\\w+.*");    //true
        //System.out.println(blr+" "+blr1);
        System.out.println("Paolo Falcarin/Andres Baravalle/Amin Karami".matches("[/a-zA-Z\\s]+"));
        System.out.println("EB3-1.16".matches("[\\w\\s.\\-]+"));
    }
}
