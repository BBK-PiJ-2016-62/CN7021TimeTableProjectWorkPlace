
import java.util.ArrayList;

/**
 * Project: Time Table Project
 * Date: 18 December 2017
 * Version: 1.0
 * Programmers: ZAHID HUSSAIN, JOHN OLORUNSUYI, Eric Chiu
 * Course: MSc Computer Science (CN7021), University of East London
 */
public interface CheckRoomSizeSufficiency {

    public ArrayList<String> tutGroupAndRoomSize(ArrayList<ArrayList<String>> firstList);

    public ArrayList<String> checkRoomSizeSufficiency(ArrayList<ModuleImpl> moduleCodes);
}
