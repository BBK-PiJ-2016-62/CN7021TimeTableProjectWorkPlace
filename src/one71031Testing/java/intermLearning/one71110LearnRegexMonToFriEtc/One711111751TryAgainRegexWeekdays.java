package one71031Testing.java.intermLearning.one71110LearnRegexMonToFriEtc;

import java.util.regex.Pattern;

/**
 * Created by Eric's laptop on 11/11/2017.
 */
public class One711111751TryAgainRegexWeekdays {

    public static void main(String[] args){

        boolean bln = Pattern.matches("[[A-Za-z]{3}/]+[A-Za-z]{3}", "Mon/Tue/Thu");
        boolean bln1 = Pattern.matches("[[A-Za-z]{3}/]{2}","Mon/Tue/");
        System.out.println(bln+" "+bln1);

    }
}
