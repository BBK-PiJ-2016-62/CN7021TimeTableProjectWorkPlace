package one71031Testing.java.intermLearning.comparing;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Eric's laptop on 12/11/2017.
 */
public class one711131347SortData {

    static ArrayList<ArrayList<String>> firstList = new ArrayList<>();

    public static void main(String[] args) {

        try {
            Files.lines(Paths.get("one711131351RoomSizeSorted1.txt")).forEach(s -> firstList.add(
                    new ArrayList<String>(Arrays.asList(s.split(",")))));

        } catch (IOException e) {
            System.out.println(e);
        }

        ArrayList<ArrayList<String>> firstList1 = new ArrayList<>(firstList);
        firstList1.sort((lhs, rhs) -> {
            if (lhs.get(0).equals(rhs.get(0))) {
                return lhs.get(1).compareTo(rhs.get(1));
            } else {
                return lhs.get(0).compareTo(rhs.get(0));
            }
        });
        try(
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("one711131409RoomSizeSortedCurrentWorking.txt"))){
            for (ArrayList<String> s : firstList1)

                writer.write(s.get(0)+","+s.get(1)+"\n");
                //writer.newLine();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
