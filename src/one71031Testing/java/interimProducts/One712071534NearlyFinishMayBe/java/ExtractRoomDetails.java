import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Eric's laptop on 06/12/2017.
 */
public class ExtractRoomDetails {

    public ArrayList<ArrayList<String>> formRoomSizeList() {

        //System.out.println(inputDataFromTable("RoomDetails-2017-18 UPDATED.csv"));
        ArrayList<ArrayList<String>> roomSizeList =
                formingRoomSizeList(inputDataFromTable("RoomDetails-2017-18 UPDATED.csv"));
        try {
            FileWriter writer = new FileWriter("roomSizeList.txt");
            for (ArrayList<String> rmAndSz : roomSizeList) {
                String row = rmAndSz.get(0) + "," + rmAndSz.get(1);
                //System.out.println(row);
                writer.write(row);
                writer.write(System.getProperty("line.separator"));
            }
            writer.flush();
            writer.close();
        }catch(IOException e){
            System.out.println(e);
        }
        return  roomSizeList;
    }

    public static ArrayList<ArrayList<String>> inputDataFromTable(String roomDetailsPath) {
        ArrayList<ArrayList<String>> firstList = new ArrayList<>();
        //ArrayList<ArrayList<String>> secondList = new ArrayList<>();
        //"one711121412textSampleWithDataAlteredForLearning.txt"
        Path path = Paths.get(roomDetailsPath);
        try {
            Files.lines(path).forEach(s ->firstList.add(new ArrayList<>
                    (Arrays.asList(s.split(",")))));
        } catch (IOException e) {
            System.out.println(e);
        }
        return firstList;
    }

    public static ArrayList<ArrayList<String>> formingRoomSizeList(ArrayList<ArrayList<String>> firstList){

        ArrayList<ArrayList<String>> roomSizeList = new ArrayList<>();
        for(ArrayList<String> row:firstList){

            ArrayList<String> findRoomSize=new ArrayList<>();
            if (row.get(3).matches("\\d+")){
                findRoomSize.add(row.get(0));
                findRoomSize.add(row.get(3));
                roomSizeList.add(findRoomSize);
                //System.out.println(row.get(0)+" "+row.get(3));
            }
        }
        //firstList.forEach(s->roomSizeList.add(roomAndItsSize(s)));
        return roomSizeList;
    }

}
