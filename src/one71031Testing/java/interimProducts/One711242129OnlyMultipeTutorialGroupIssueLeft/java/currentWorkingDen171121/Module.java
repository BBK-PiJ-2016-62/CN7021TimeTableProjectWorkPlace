package currentWorkingDen171124;

import java.util.ArrayList;

/**
 * Created by Eric's laptop on 20/11/2017.
 */
public interface Module {

    public void setCourseCode(String courseCode);

    public void setStudentNum(int studentNum);

    public void setTypeOfMeetingNRmNum(ArrayList<String> typeOfMeetingNRmNum);

    public void setTypeOfMeetingNRmNumList(ArrayList<ArrayList<String>> typeOfMeetingNRmNumList);

    public void addToTypeOfMeetingNRmNumList(ArrayList<String> typeOfMeetingNRmNum);

    public String getCourseCode();

    public int getStudentNum();

    public ArrayList<String> getTypeOfMeetingNRmNum();

    public ArrayList<ArrayList<String>> getTypeOfMeetingNRmNumList();
}
