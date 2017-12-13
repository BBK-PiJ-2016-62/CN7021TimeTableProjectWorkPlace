import java.util.ArrayList;

/**
 * Project: Time Table Project
 * Date: 18 December 2017
 * Version: 1.0
 * Programmers: ZAHID HUSSAIN, JOHN OLORUNSUYI, Eric Chiu
 * Course: MSc Computer Science (CN7021), University of East London
 */
public interface Module {
    /**
     * these methods are general getters and setters of relevant variables/information
     * of each module object.
     */
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
