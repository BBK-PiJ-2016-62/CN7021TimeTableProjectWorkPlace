package currentWorkingDen171127;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Eric's laptop on 20/11/2017.
 */
public interface TeachingOverlapAndHours {

    public void teachingOverlapAndHours(ArrayList<ArrayList<String>> firstList);

    public ArrayList<ArrayList<String>> splitArrayLists(ArrayList<String> arrayList, int itemNo);

    public ArrayList<ArrayList<String>> pick(ArrayList<ArrayList<String>> stringAArrayList);

    public ArrayList<ArrayList<String>> teachingTimeExceedSixHoursADay(ArrayList<ArrayList<String>> stringAArrayList);

    public ArrayList<ArrayList<String>> splittingWeekdays(ArrayList<String> arrayList);
}

interface CompareItemsInTheRowsOfTheTimetable extends Comparator<ArrayList<String>> {


    public int compare(ArrayList<String> arrayList1, ArrayList<String> arrayList2);
}
