package one71031Testing.java.intermLearning;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Eric's laptop on 01/11/2017.
 */
public class One711011343LearningRegexAndSplittingArrayList {

    public static void main(String[] args){

        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("a","b","c"));

        ArrayList<String> arrayList = new ArrayList(Arrays.asList("C4B,CN6108,Business Intelligence Analysis,Lecture,2&3,Thursday,13:00,14:00,01:00,0,50,Sin Wee Lee/Andres Baravalle ,ML,EB.2.88,73,,,7,3.5,,,,,,,,,,,,,,,,".split(",")));
        ArrayList<ArrayList<String>> arrayLists = splitArrayLists(arrayList, 4);
        for (ArrayList<String> arrayls1: arrayLists){
            System.out.println(arrayls1);
        }
        String splitSymbol="/";
        System.out.println("Paolo Falcarin/Andres Baravalle/ Amin Karami".matches("[/0-9a-zA-Z\\s]+"));
        System.out.println("1&2&3".matches("[&0-9]+"));
    }
//"Paolo Falcarin/Andres Baravalle/ Amin Karami" "[0-9a-zA-Z\\s]+"+
    static ArrayList<ArrayList<String>> splitArrayLists (ArrayList<String> arrayList, int itemNo) {

        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();
        //ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        if (itemNo==4 || itemNo ==11) {
            if (itemNo == 4 && arrayList.get(itemNo).matches("[&0-9]+"))
                strings = new ArrayList<String>(Arrays.asList(arrayList.get(itemNo).split("&")));
            if (itemNo == 11 && arrayList.get(11).matches("[/a-zA-Z\\s]+"))
                strings = new ArrayList<String>(Arrays.asList(arrayList.get(itemNo).split("/")));
            for (String s : strings) {
                ArrayList<String> arrayList2 = new ArrayList<>(arrayList);
                arrayList2.set(itemNo, s);
                arrayLists.add(arrayList2);
            }
        }
        return arrayLists;
    }

}
