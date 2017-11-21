package one71031Testing.java.intermLearning.one71111LearnLambdaAgain;

/**
 * Created by Eric's laptop on 15/11/2017.
 */
class SubFunction {
    private static String drawTribleX(){

        // *** move trible(t) inside drawTribleX() ***
        class Trible {
            private String trible(String t){
                return t + t + t;
            }
        }

        return new Trible().trible("X");
    }
    public static void main(String[] args){
        SubFunction o = new SubFunction();
        System.out.println(o.drawTribleX());
    }
}