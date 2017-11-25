package currentWorkingDen171124;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Eric's laptop on 20/11/2017.
 */
public class InputAndTidyUpTimeTableImpl implements InputAndTidyUpTimeTable {

    @Override
    public ArrayList<ArrayList<String>> inputAndTidyTimeTable(String timeTablePath) {
        ArrayList<ArrayList<String>> firstList = new ArrayList<>();
        //ArrayList<ArrayList<String>> secondList = new ArrayList<>();
        //"one711121412textSampleWithDataAlteredForLearning.txt"
        Path path = Paths.get(timeTablePath);
        try {
            Files.lines(path).forEach(s ->/*firstList.add(s));*/firstList.add(new ArrayList<>(Arrays.asList(s.split(",")))));
        } catch (IOException e) {
            System.out.println(e);
        }
        for (ArrayList<String> tempArrayList : firstList) {
            //ArrayList<String> tempArrayList = new ArrayList<>(Arrays.asList(s.split(",")));
            //if (tempArrayList.size()<14 ||tempArrayList.get(11).isEmpty())
            if (tempArrayList.size() >= 7) {
                combinTheFirstFewItems(tempArrayList);
            }
            //ArrayList<String> tempArrayList1 = new ArrayList<>();
            //System.out.println(tempArrayList.get(0));
            //ArrayList<ArrayList<String>> secondList = new ArrayList<>();
        }
        return firstList;
    }

    public ArrayList<String> combinTheFirstFewItems (ArrayList<String> stringArrayList){

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
