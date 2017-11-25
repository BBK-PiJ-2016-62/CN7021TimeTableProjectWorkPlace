package intermLearning.one711230850LearnPicking;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Eric's laptop on 23/11/2017.
 */
public class one711230851LearnPicking {

    public static void main(String[] args) {

        ArrayList<String[]> roomList = new ArrayList<>();
        Path path = Paths.get("one711131351RoomSizeSorted1.txt");
        try {
            Files.lines(Paths.get("one711131409RoomSizeSortedCurrentWorking.txt")).forEach(s -> roomList.add(s.split(",")));
        } catch (IOException e) {
            System.out.println(e);
        }
        String s = "begin here. Then ";
        String s1 = "Monday EB.3.19";
        for (String[] strings : roomList) {
            if (s1.contains(strings[0])) {
                System.out.printf(s1 + " room size is %s", strings[1]);
            }
        }

    }
}
