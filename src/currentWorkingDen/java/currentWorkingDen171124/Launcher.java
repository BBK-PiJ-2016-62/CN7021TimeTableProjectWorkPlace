package currentWorkingDen171124;

import java.util.ArrayList;

/**
 * Created by Eric's laptop on 20/11/2017.
 */
public class Launcher {

    public static void main(String[] args){

        FormModuleList fml=new FormModuleListImpl();
        InputAndTidyUpTimeTable iattt=new InputAndTidyUpTimeTableImpl();
        TeachingOverlapAndHours toah = new TeachingOverlapAndHoursImpl();

        ArrayList<ArrayList<String>> inputTimeTable=iattt.inputAndTidyTimeTable(
                "one711121412textSampleWithDataAlteredForLearning.txt");

        toah.teachingOverlapAndHours(inputTimeTable);
        fml.tutGroupAndRoomSize(inputTimeTable);
    }
}
