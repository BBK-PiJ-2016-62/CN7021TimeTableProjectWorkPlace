package currentWorkingDen171205;

import java.util.ArrayList;

/**
 * Created by Eric's laptop on 20/11/2017.
 */
public class ModuleImpl implements Module{

    private String courseCode;
    private int studentNum;
    private ArrayList<String> typeOfMeetingNRmNum = new ArrayList<>();
    private ArrayList<ArrayList<String>> typeOfMeetingNRmNumList = new ArrayList<>();

    @Override
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    @Override
    public void setTypeOfMeetingNRmNum(ArrayList<String> typeOfMeetingNRmNum) {
        this.typeOfMeetingNRmNum = typeOfMeetingNRmNum;
    }

    @Override
    public void setTypeOfMeetingNRmNumList(ArrayList<ArrayList<String>> typeOfMeetingNRmNumList) {
        this.typeOfMeetingNRmNumList = typeOfMeetingNRmNumList;
    }

    @Override
    public void addToTypeOfMeetingNRmNumList(ArrayList<String> typeOfMeetingNRmNum) {
        this.typeOfMeetingNRmNumList.add(typeOfMeetingNRmNum);
    }

    @Override
    public String getCourseCode() {
        return this.courseCode;
    }

    @Override
    public int getStudentNum() {
        return this.studentNum;
    }

    @Override
    public ArrayList<String> getTypeOfMeetingNRmNum() {
        return this.typeOfMeetingNRmNum;
    }

    @Override
    public ArrayList<ArrayList<String>> getTypeOfMeetingNRmNumList() {
        return this.typeOfMeetingNRmNumList;
    }
}
