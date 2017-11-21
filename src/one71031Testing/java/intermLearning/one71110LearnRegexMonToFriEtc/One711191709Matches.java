package one71031Testing.java.intermLearning.one71110LearnRegexMonToFriEtc;

/**
 * Created by Eric's laptop on 19/11/2017.
 */
public class One711191709Matches {

    static String as = "  Practical ";
    public static void main(String[] args){
        if (!as.trim().toLowerCase().contains("lecture") &&
                (as.trim().toLowerCase().contains("tutorial") ||
                as.trim().toLowerCase().contains("practical"))) {
            System.out.println("yes");
        }
        else System.out.println("No");

        boolean b = false;
        if(b==true)System.out.println("good");
        System.out.println(b);
    }
}
