package One71115UseObjectToTackleQs2N4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Eric's laptop on 14/11/2017.
 */
public class One711141445TutorialGroupRoomSizeRoot {

    static ArrayList<ArrayList<String>> firstList = new ArrayList<>();

    public static void main(String[] args) {
        //ArrayList<ArrayList<String>> secondList = new ArrayList<>();

        Path path = Paths.get("one711121412textSampleWithDataAlteredForLearning.txt"/*timetableExampleCSAndITimetableCSVTEXT.txt"*/);
        try {
            Files.lines(path).forEach(s ->/*firstList.add(s));*/firstList.add(new ArrayList<>(Arrays.asList(s.split(",")))));
            int i = 0;
            for (ArrayList<String> tempArrayList : firstList) {
                //ArrayList<String> tempArrayList = new ArrayList<>(Arrays.asList(s.split(",")));
                //if (tempArrayList.size()<14 ||tempArrayList.get(11).isEmpty())
                if (tempArrayList.size() >= 7) {
                    One711011524Regex.combinTheFirstFewItems(tempArrayList);
                }
                //System.out.println(tempArrayList);
                //if(tempArrayList.size()>=4 && tempArrayList.get(1).length()!=0 &&tempArrayList.get(3).length()!=0) {
                //i++;
                //System.out.println(i);
                //}
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        ArrayList<ModuleCode> moduleCodes = moduleCodes();
        //for (ModuleCode m:moduleCodes) System.out.println(m.getCourseCode()+" "+m.getStudentNum()); //temp code 1711161146
        //for (ArrayList<String> a: firstList) if(a.size()>=4) System.out.println(a.get(1));  //temp code 1711161146
        //temp code 1711161144
        /*for (ModuleCode m: moduleCodes){
            boolean bln = false;
            for(ArrayList<String> a: firstList){
                if(a.size()>=4){
                    if(a.get(1).equals(m.getCourseCode())) {
                        System.out.println(m.courseCode + " is in the table");
                        bln = true;
                        break;
                    }
            }
            if(bln == false) println(m.courseCode+" is not in the table");
            //firstList.forEach(a->{if(a.get(0).trim().toLowerCase().equals(m.courseCode.toLowerCase()){
               //                    println(m.courseCode+" is on the table");
               //                     break;}});
            }
        }*/
        //end temp code 1711161144
        //temp code 1711151625
        /*for (ModuleCode moduleCode : moduleCodes) {

            System.out.println(moduleCode.getCourseCode() + " " + moduleCode.getStudentNum());
        }*/
        //end temp code 1711151625
        ArrayList<ModuleCode> moduleCodes1 = addingDataToModuleCodes(moduleCodes);
        for (ModuleCode moduleCode1 : moduleCodes) {

            System.out.println(moduleCode1.getCourseCode() + " " + moduleCode1.getStudentNum());
            System.out.println(moduleCode1.getTypeOfMeetingNRmNumList());
        }

        //One711161252TutorialGroupSufficient.checkTutorialGroupSufficiency(moduleCodes);
        One711161531RoomSize.checkRoomSize(moduleCodes);

    }

    static public ArrayList<ModuleCode> moduleCodes() {

        ArrayList<ModuleCode> moduleCodes = new ArrayList<>();
        try {
            Files.lines(Paths.get("one711191951StudentNumSortedCurrentWorking.txt")).forEach(s -> moduleCodes.add(formModuleCode(s)));


        } catch (IOException e) {
            System.out.println(e);
        }
        return moduleCodes;
    }

    static public ModuleCode formModuleCode(String s) {

        String[] ss = s.split(",");
        ModuleCode moduleCode = new ModuleCode();
        moduleCode.setCourseCode(ss[0]);
        moduleCode.setStudentNum(Integer.parseInt(ss[1]));
        return moduleCode;
    }

    static public ArrayList<ModuleCode> addingDataToModuleCodes(ArrayList<ModuleCode> moduleCodes) {

        ArrayList<ModuleCode> moduleCodes1=new ArrayList<>(moduleCodes);
        for (ModuleCode m : moduleCodes1) {
            firstList.forEach(s -> addingData(m, s));
            //m.addToTypeOfMeetingNRmNumList(new ArrayList<>(Arrays.asList("haha","hahaha")));
        }
        return moduleCodes1;
    }

    static void addingData(ModuleCode m, ArrayList<String> s){

        if(s.size()>=4 && s.get(0).length()!=0 && s.get(1).length()!=0 && s.get(3).length()!=0)
            if(s.get(1).trim().toLowerCase().equals(m.getCourseCode().toLowerCase())){
                ArrayList<String> al=new ArrayList<>();
                al.add(s.get(3));
                if(s.size()>=14 && s.get(13).length()!=0) al.add(s.get(13));
                else al.add("No room assigned");
                //System.out.println(m.getCourseCode()+" "+al);  //temp for checking. checked. waiting for deleting
                m.addToTypeOfMeetingNRmNumList(al);
            }
    }

    static class ModuleCode {

        private String courseCode;
        private int studentNum;
        private ArrayList<String> typeOfMeetingNRmNum = new ArrayList<>();
        private ArrayList<ArrayList<String>> typeOfMeetingNRmNumList = new ArrayList<>();


        public void setCourseCode(String courseCode) {
            this.courseCode = courseCode;
        }

        public void setStudentNum(int studentNum) {
            this.studentNum = studentNum;
        }

        public void setTypeOfMeetingNRmNum(ArrayList<String> typeOfMeetingNRmNum) {
            this.typeOfMeetingNRmNum = typeOfMeetingNRmNum;
        }

        public void setTypeOfMeetingNRmNumList(ArrayList<ArrayList<String>> typeOfMeetingNRmNumList) {
            this.typeOfMeetingNRmNumList = typeOfMeetingNRmNumList;
        }

        public void addToTypeOfMeetingNRmNumList(ArrayList<String> typeOfMeetingNRmNum) {
            this.typeOfMeetingNRmNumList.add(typeOfMeetingNRmNum);
        }


        public String getCourseCode() {
            return this.courseCode;
        }

        public int getStudentNum() {
            return this.studentNum;
        }

        public ArrayList<String> getTypeOfMeetingNRmNum() {
            return this.typeOfMeetingNRmNum;
        }

        public ArrayList<ArrayList<String>> getTypeOfMeetingNRmNumList() {
            return this.typeOfMeetingNRmNumList;
        }
    }

    static class RoomSize{

        private String roomNum;
        private int roomSize;

        public void setRoomNum(String roomNum){this.roomNum=roomNum;}
        public void setRoomSize(int roomSize){this.roomSize=roomSize;}

        public String getRoomNum(){return this.roomNum;}
        public int getRoomSize(){return this.roomSize;}
    }
}
