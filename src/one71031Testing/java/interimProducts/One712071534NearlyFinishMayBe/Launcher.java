
import java.util.ArrayList;

/**
 * Created by Eric's laptop on 20/11/2017.
 */
public class Launcher {

    public static void main(String[] args){

        CheckRoomSizeSufficiency crss = new CheckRoomSizeSufficiencyImpl();
        //FormModuleList fml=new FormModuleListImpl();
        InputAndTidyUpTimeTable iattt=new InputAndTidyUpTimeTableImpl();
        TeachingOverlapAndHours toah = new TeachingOverlapAndHoursImpl();
        CheckTutorialGroupSufficiency ctgs = new CheckTutorialGroupSufficiencyImpl();

        ArrayList<ArrayList<String>> inputTimeTable=iattt.inputAndTidyTimeTable(
                "one711121412textSampleWithDataAlteredForLearning.txt");

        //toah.teachersHavingTimeCrashes(inputTimeTable);
        //toah.teachesTeachMoreThanSixHoursADay(inputTimeTable);
        //ctgs.checkTutorialGroupSufficiency(inputTimeTable);
        crss.tutGroupAndRoomSize(inputTimeTable);
    }
}
