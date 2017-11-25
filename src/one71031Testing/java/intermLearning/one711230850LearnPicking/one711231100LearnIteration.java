package intermLearning.one711230850LearnPicking;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Eric's laptop on 23/11/2017.
 */
public class one711231100LearnIteration {

    public static void main(String[] args){

        ArrayList<String> dayRoom = new ArrayList<>();
        String dayRoomString = "Mon- EB.1.44/Tuesay WB.2.06/ Fri ITC11";
        String oneRoomString = "  EB.1.44";
        dayRoom = new ArrayList<>(Arrays.asList(/*dayRoomString*/oneRoomString.split("/")));
        ArrayList<String[]> roomList = new ArrayList<>();
        Path path = Paths.get("one711131351RoomSizeSorted1.txt");
        try {
            Files.lines(Paths.get("one711131409RoomSizeSortedCurrentWorking.txt")).
                    forEach(s -> roomList.add(s.split(",")));
        } catch (IOException e) {
            System.out.println(e);
        }
        for (String[] strings: roomList){
            Iterator<String> itr=dayRoom.iterator();
            while(itr.hasNext()) {
                //System.out.println(itr.next());  //temp

                if(itr.next().contains(strings[0])){
                    System.out.printf("Room %s size is: %s\n", strings[0].trim(),strings[1].trim());
                }
            }
            //String element = itr.next();
                //System.out.print(element + " ");
        }
        System.out.println("EB.1.08".replace(".","").toLowerCase());
        System.out.println("EB.1.08".replace(".","").toLowerCase().equals("eb108"));
        String s1="ABC";
        String s2=new String("ABC");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

    }
}
