package one71031Testing.java.interimProducts.One711021940PreliminaryProuctForTaskOne;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Eric's laptop on 31/10/2017.
 */
public class One710311918ImportAsArrayListArrayList {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> firstList = new ArrayList<>();
        ArrayList<ArrayList<String>> secondList = new ArrayList<>();

        Path path = Paths.get("one710311922textSample.txt"/*timetableExampleCSAndITimetableCSVTEXT.txt"*/);
        try {
            Files.lines(path).forEach(s ->/*firstList.add(s));*/firstList.add(new ArrayList<>(Arrays.asList(s.split(",")))));
            for (ArrayList<String> tempArrayList : firstList) {
                //ArrayList<String> tempArrayList = new ArrayList<>(Arrays.asList(s.split(",")));
                //if (tempArrayList.size()<14 ||tempArrayList.get(11).isEmpty())
                if (tempArrayList.size() >= 7) {
                    One711011524Regex.combinTheFirstFewItems(tempArrayList);
                }
                ArrayList<String> tempArrayList1 = new ArrayList<>();
                //System.out.println(tempArrayList.get(0));
                if (tempArrayList.size() >= 7) {
                    if (tempArrayList.get(0).length() != 0) {
                        if (tempArrayList.get(6).length() != 0) {
                            if (tempArrayList.get(11).length() != 0) {

                                if (tempArrayList.size() >= 14)
                                    tempArrayList1 = new ArrayList<String>(tempArrayList.subList(0, 14));
                                if (tempArrayList.size() == 13)
                                    tempArrayList1 = new ArrayList<String>(tempArrayList.subList(0, 13));
                                if (tempArrayList.size() == 12)
                                    tempArrayList1 = new ArrayList<String>(tempArrayList.subList(0, 12));
                                secondList.add(tempArrayList1);
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        ArrayList<ArrayList<String>> thirdList = new ArrayList<>();
        for (ArrayList<String> s : secondList) {
            //for(int i=0; i<secondList.size();i++)
            //System.out.println(s);
            /*if (s.get(4).matches("[&0-9]+")){
                for(ArrayList<String> arrayList: splitArrayLists(s,4))
                    thirdList.add(arrayList);
            }
            else*/
            if (s.get(11).matches("[/a-zA-Z\\s]+")) {
                for (ArrayList<String> arrayList : splitArrayLists(s, 11))
                    thirdList.add(arrayList);
            } else thirdList.add(s);
        }
        //for(ArrayList<String> s: thirdList){
        //  System.out.println(s);

        ArrayList<ArrayList<String>> forthList = new ArrayList<>();
        for (ArrayList<String> s : thirdList) {
            //for(int i=0; i<secondList.size();i++)
            //System.out.println(s);
            /*if (s.get(4).matches("[&0-9]+")){
                for(ArrayList<String> arrayList: splitArrayLists(s,4))
                    thirdList.add(arrayList);
            }
            else*/
            if (s.get(4).matches("[&0-9\\s]+")) {
                for (ArrayList<String> arrayList : splitArrayLists(s, 4))
                    forthList.add(arrayList);
            } else forthList.add(s);
        }
        Collections.sort(forthList, new CompareForthList());
        for (ArrayList<String> s : forthList) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("It seems that the following teachers have been allocated the same time for more than a lesson and their details:");
        ArrayList<ArrayList<String>> picked = pick(forthList);
        for (ArrayList<String> pk: picked){
            String pk1=pk.toString().replace("[","").replace("]","");
            System.out.println(pk1);
        }
    }

    static ArrayList<ArrayList<String>> splitArrayLists(ArrayList<String> arrayList, int itemNo) {

        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();
        //ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        if (itemNo == 4 || itemNo == 11) {
            if (itemNo == 4 && arrayList.get(4).matches("[&0-9\\s]+"))
                strings = new ArrayList<String>(Arrays.asList(arrayList.get(4).split("[\\s]*&[\\s]*")));
            if (itemNo == 11 && arrayList.get(11).matches("[/a-zA-Z\\s]+"))
                strings = new ArrayList<String>(Arrays.asList(arrayList.get(11).split("/")));
            for (String s : strings) {
                ArrayList<String> arrayList2 = new ArrayList<>(arrayList);
                arrayList2.set(itemNo, s);
                arrayLists.add(arrayList2);

            }
        }
        return arrayLists;
    }

    static public ArrayList<ArrayList<String>> pick(ArrayList<ArrayList<String>> stringAArrayList) {
        ArrayList<ArrayList<String>> pickedAArrayList = new ArrayList<>();
        for (int i = 0; i < stringAArrayList.size() - 1; i++) {
            if (stringAArrayList.get(i).get(11).trim().equals(stringAArrayList.get(i + 1).get(11).trim()) &&
                    stringAArrayList.get(i).get(4).trim().equals(stringAArrayList.get(i + 1).get(4).trim()) &&
                    stringAArrayList.get(i).get(5).trim().equals(stringAArrayList.get(i + 1).get(5).trim())) {
                if (Double.parseDouble(stringAArrayList.get(i).get(7).trim().replace(":", ".")) >
                        Double.parseDouble(stringAArrayList.get(i + 1).get(6).trim().replace(":", "."))) {
                    if (i == 0) pickedAArrayList.add(stringAArrayList.get(i));
                    else if (!stringAArrayList.get(i).equals(stringAArrayList.get(i - 1)))
                        pickedAArrayList.add(stringAArrayList.get(i));
                    pickedAArrayList.add(stringAArrayList.get(i + 1));
                }
            }
        }
        return pickedAArrayList;
    }
}


/*for (String s : strings) {
        ArrayList<String> arrayList2 = new ArrayList<>(arrayList);
        arrayList2.set(itemNo, s);
        arrayLists.add(arrayList2);*/


