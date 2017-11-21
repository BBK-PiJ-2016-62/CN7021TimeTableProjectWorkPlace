package one71031Testing.java.intermLearning.comparing.one71112Q2AndQ4FromReadThenComparator;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Eric's laptop on 12/11/2017.
 */
public class one711121858FromReadThenCompareThenSort {

    static ArrayList<ArrayList<String>> firstList = new ArrayList<>();

    public static void main(String[] args) {

        //Path path = Paths.get("one711121412textSampleWithDataAlteredForLearning.txt"/*timetableExampleCSAndITimetableCSVTEXT.txt"*/);
        try {
            Files.lines(Paths.get("one711131430StudentNumSortedCurrentWorking.txt")).forEach(s -> firstList.add(
                    new ArrayList<String>(Arrays.asList(s.split(",")))));

        } catch (IOException e) {
            System.out.println(e);
        }

        for (ArrayList<String> stringArrayList : firstList)
            System.out.println(stringArrayList);

        ArrayList<ArrayList<String>> firstList1 = new ArrayList<>(firstList);
        firstList1.sort((lhs, rhs) -> {
            if (lhs.get(1).equals(rhs.get(1))) {
                return lhs.get(0).compareTo(rhs.get(0));
            } else {
                return lhs.get(1).compareTo(rhs.get(1));
            }
        });
        try(
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("one711121935TutOrLectGroupSizeRoomSorted_CN.txt"))){
            for (ArrayList<String> s : firstList1)

                writer.write(s.get(0)+","+s.get(1)+","+s.get(2)+","+s.get(3)+"\n");
                //writer.newLine();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
