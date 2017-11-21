package one71031Testing.java.interimProducts.One711191844AllFour;

import java.io.BufferedWriter;
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

        Path path = Paths.get("one711121412textSampleWithDataAlteredForLearning.txt"/*timetableExampleCSAndITimetableCSVTEXT.txt"*/);
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
        //temp block 1711121731 for getting information
        String ss=" ";  //temp
        try(BufferedWriter writer=Files.newBufferedWriter(
                Paths.get("one711131430StudentNumSortedCurrentWorking.txt"))) {
            for (ArrayList<String> arrayList : secondList) {

                if (arrayList.size() < 13 || arrayList.get(13).length()==0) ss = "empty";
                else ss = arrayList.get(13);
                System.out.println(arrayList.get(3) + " " + arrayList.get(10) + " " + " " + ss);
                //try(BufferedWriter writer=Files.newBufferedWriter(
                //Paths.get("one711131430StudentNumSortedCurrentWorking.txt"))){
                writer.write(arrayList.get(1)+","+arrayList.get(3) + "," + arrayList.get(10) + "," + ss);
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println(e);
        }
        //temp block 1711121731 end
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
        ArrayList<ArrayList<String>> fifthList = new ArrayList<>();
        for (ArrayList<String> s : forthList) {
            if (s.get(5).trim().matches("\\w{3}\\/\\w+.*")||
                    s.get(5).trim().matches("[a-zA-Z]{3}\\s*-\\s*[a-zA-Z]{3}")) {
                for (ArrayList<String> arrayList : splitArrayLists(s, 5))
                    fifthList.add(arrayList);
            } else {/*System.out.println(s);*/fifthList.add(s);}
        }
        Collections.sort(fifthList, new CompareFifthList());
        for (ArrayList<String> s : fifthList) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("It seems that the following teachers have been allocated the same time for more than a lesson and their details:");
        ArrayList<ArrayList<String>> picked = pick(fifthList);
        for (ArrayList<String> pk: picked){
            String pk1=pk.toString().replace("[","").replace("]","");
            System.out.println(pk1);
        }
        System.out.println();
        System.out.println("Teachers who teach more than six hours a day (name, term, day and hours):");
        ArrayList<ArrayList<String>> tTimeEx6ADay = teachingTimeExceedSixHoursADay(fifthList);
        for (ArrayList<String> ttex6: tTimeEx6ADay){
            String ttex61=ttex6.toString().replace("[","").replace("]","");
            System.out.println(ttex61);
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
        if (itemNo == 5){// && (arrayList.get(5).trim().matches("[[A-Za-z]{3}/]+[A-Za-z]{3}")||
                          //  arrayList.get(5).trim().matches("[a-zA-Z]{3}\\s*-\\s*[a-zA-Z]{3}"))) {
            /*String[] fromMondayToFridayString = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
            for (String s : fromMondayToFridayString) {
                ArrayList<String> arrayList2 = new ArrayList<>(arrayList);
                arrayList2.set(5, s);
                arrayLists.add(arrayList2);
            }*/
            arrayLists= One711101803LearnRegexMonToFriEtc.splittingWeekdays(arrayList);
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
    static public ArrayList<ArrayList<String>> teachingTimeExceedSixHoursADay (ArrayList<ArrayList<String>> stringAArrayList){

        ArrayList<ArrayList<String>> teachingTimeExceededList=new ArrayList<>();
        Double accumulatedTeachingTime = 0.0;
        for(int i = 0; i<stringAArrayList.size(); i++){
            accumulatedTeachingTime =
                    accumulatedTeachingTime+
                            Double.parseDouble(stringAArrayList.get(i).get(7).trim().replace(":","."))-
                            Double.parseDouble(stringAArrayList.get(i).get(6).trim().replace(":","."));
            if(i==stringAArrayList.size()-1){
                if (accumulatedTeachingTime>6.0) {
                    teachingTimeExceededList.add(new ArrayList<String>
                            (Arrays.asList(stringAArrayList.get(i).get(11), stringAArrayList.get(i).get(4),
                                    stringAArrayList.get(i).get(5), String.valueOf(accumulatedTeachingTime))));
                    return teachingTimeExceededList;
                }
                else return teachingTimeExceededList;
            }
            else if((!stringAArrayList.get(i).get(11).trim().equals(stringAArrayList.get(i+1).get(11).trim())||
                    !stringAArrayList.get(i).get(4).trim().equals(stringAArrayList.get(i+1).get(4).trim())||
                    !stringAArrayList.get(i).get(5).trim().equals(stringAArrayList.get(i+1).get(5).trim()))){
                if (accumulatedTeachingTime>6.0) {
                    teachingTimeExceededList.add(new ArrayList<String>
                            (Arrays.asList(stringAArrayList.get(i).get(11), stringAArrayList.get(i).get(4),
                                    stringAArrayList.get(i).get(5), String.valueOf(accumulatedTeachingTime))));
                    accumulatedTeachingTime = 0.0;
                }else accumulatedTeachingTime = 0.0;
            }
        }
        return teachingTimeExceededList;
    }
}


/*for (String s : strings) {
        ArrayList<String> arrayList2 = new ArrayList<>(arrayList);
        arrayList2.set(itemNo, s);
        arrayLists.add(arrayList2);*/


