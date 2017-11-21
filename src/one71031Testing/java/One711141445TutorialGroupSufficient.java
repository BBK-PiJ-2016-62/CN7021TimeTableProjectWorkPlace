package one71031Testing.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Eric's laptop on 14/11/2017.
 */
public class One711141445TutorialGroupSufficient {

        public static void main(String[] args) {
            ArrayList<ArrayList<String>> firstList = new ArrayList<>();
            //ArrayList<ArrayList<String>> secondList = new ArrayList<>();

            Path path = Paths.get("one711121412textSampleWithDataAlteredForLearning.txt"/*timetableExampleCSAndITimetableCSVTEXT.txt"*/);
            try {
                Files.lines(path).forEach(s ->/*firstList.add(s));*/firstList.add(new ArrayList<>(Arrays.asList(s.split(",")))));
                int i=0;
                for (ArrayList<String> tempArrayList : firstList) {
                    //ArrayList<String> tempArrayList = new ArrayList<>(Arrays.asList(s.split(",")));
                    //if (tempArrayList.size()<14 ||tempArrayList.get(11).isEmpty())
                    if (tempArrayList.size() >= 7) {
                        One711011524Regex.combinTheFirstFewItems(tempArrayList);
                    }
                    //System.out.println(tempArrayList);
                    //if(tempArrayList.size()>=4 && tempArrayList.get(1).length()!=0 &&tempArrayList.get(3).length()!=0) {
                        //i++;
                        //System.out.println(i);
                    //}
                }
            } catch (IOException e) {

                System.out.println(e);
            }
        }
}
