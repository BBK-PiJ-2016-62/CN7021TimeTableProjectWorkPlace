import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Eric's laptop on 24/11/2017.
 */
public class one711242224MaxOfArrayLisgt {

    public static void main(String[] args) {

        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(9);
        arrInt.add(16);
        arrInt.add(237);
        arrInt.add(-8);
        arrInt.add(1000);
        arrInt.add(111);
        ArrayList<Integer> arrInt1=new ArrayList<>(Arrays.asList(13,85,97,133,96,8000));
        ArrayList<Integer> arrInt2=new ArrayList<>(Arrays.asList(76,5,100700));
        ArrayList<Integer> arrInt3=new ArrayList<>(new ArrayList<Integer>());
        ArrayList<ArrayList<Integer>> arrInts = new ArrayList<>(Arrays.asList(arrInt, arrInt1, arrInt2, arrInt3));
        int totMax=0;
        for (ArrayList<Integer> aI:arrInts){
            if(aI.size()!=0)
                    totMax=totMax+Collections.max(aI);
        }
        System.out.println(totMax);

    }
}
