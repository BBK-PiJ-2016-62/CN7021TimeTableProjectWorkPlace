package currentWorkingDen171205;

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
                "DraftTimeTable1.txt");

        toah.teachingOverlapAndHours(inputTimeTable);
        fml.tutGroupAndRoomSize(inputTimeTable);
    }
}
