package one71031Testing.java.interimProducts.One711101737PreliminaryProuctForTasksOneAndThree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Eric's laptop on 01/11/2017.
 */
public class One711011524Regex {

    public static void main(String[] args) {

        //ArrayList<String> arrayList = new ArrayList(Arrays.asList("As discussed in Chapter Four/Five/Six, you can apply".split(" ")));
        //System.out.println(arrayList.get(4).matches("[,/a-zA-Z]+"));
        ArrayList<String> arrayList1 = new ArrayList(Arrays.asList("CS, cN5101,Database Systems,Lecture,1 & 2,Tuesday,09:00,10:00,01:00,0,75,Mufajjul Ali,ML,WB.G.02,124,,,11,11,,,,,,,,,,,,,,,,".split(",")));
        System.out.println(arrayList1.size());
        ArrayList<Integer> tempToBeDeletedItemIndex = new ArrayList<>();
        String s=arrayList1.get(0);
        for (int i = 1; i < 5; i++) {
            if (arrayList1.get(i).matches("\\s*[a-zA-Z]{2}[0-9]{4}\\s*")) {
                System.out.println(arrayList1.get(i));
                break;
            } else {
                String s1 = arrayList1.get(i);
                s = s+s1;
                tempToBeDeletedItemIndex.add(i);
            }
        }
        Collections.reverse(tempToBeDeletedItemIndex);
        for (int i : tempToBeDeletedItemIndex) arrayList1.remove(i);
        arrayList1.set(0, s);
        System.out.println(arrayList1.size());
        System.out.println(arrayList1.get(0));
        System.out.println(arrayList1.get(1));
        System.out.println(arrayList1.get(2));
        System.out.println(arrayList1.get(3));
        System.out.println(arrayList1.get(4));
        System.out.println(arrayList1.get(5));

        System.out.println(" cN5101".matches("\\s*[a-zA-Z]{2}[0-9]{4}\\s*"));
    }

    public static ArrayList<String> combinTheFirstFewItems (ArrayList<String> stringArrayList){

        ArrayList<Integer> tempToBeDeletedItemIndex = new ArrayList<>();
        String s=stringArrayList.get(0);
        for (int i = 1; i < 5; i++) {
            if (stringArrayList.get(i).matches("\\s*[a-zA-Z]{2}[0-9]{4}\\s*")) {
                //System.out.println(stringArrayList.get(i));
                break;
            } else {
                String s1 = stringArrayList.get(i);
                s = s+","+s1;
                tempToBeDeletedItemIndex.add(i);
            }
        }
        Collections.reverse(tempToBeDeletedItemIndex);
        for (int i : tempToBeDeletedItemIndex) stringArrayList.remove(i);
        stringArrayList.set(0, s);
        return stringArrayList;

    }
}
