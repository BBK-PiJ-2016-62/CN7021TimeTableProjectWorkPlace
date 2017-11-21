package one71031Testing.java.interimProducts.One711191844AllFour.One711191844AllFourA;

import java.util.ArrayList;

/**
 * Created by Eric's laptop on 16/11/2017.
 */
public class One711161252TutorialGroupSufficient {

    static void checkTutorialGroupSufficiency(ArrayList<One711141445TutorialGroupRoomSizeRoot.ModuleCode> moduleCodes) {

        for (One711141445TutorialGroupRoomSizeRoot.ModuleCode m : moduleCodes) {
            int count = 0;
            for (ArrayList<String> as : m.getTypeOfMeetingNRmNumList()) {
                if (as.get(0).trim().toLowerCase().contains("tutorial") ||
                        as.get(0).trim().toLowerCase().contains("practical")) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.printf("%s: This module does not has tutorial/practical or " +
                        "lecture and tutorial/practical are combined.", m.getCourseCode());
                System.out.println();
            }
            else if (m.getStudentNum() > 25 * count) {
                int additionalGroupNum = (int) Math.ceil(m.getStudentNum() / 25d) - count;
                System.out.printf("%s: Number of students: %d. Tutorial/practical group number: %d. " +
                                "Therefore, %d tutorial/practical group(s) need to be added.\n" +
                                "(Caveat: classroom size has not been taken into consideration.)",
                                m.getCourseCode(), m.getStudentNum(), count, additionalGroupNum);
                System.out.println();
            }
            else if (m.getStudentNum() <= 25 * count && m.getStudentNum() > 25 * (count - 1)) {
                System.out.printf("%s: Tutorial/Practical group number: %d. It commensurates number of students: %d.\n" +
                                "(Caveat: classroom size has not been taken into consideration.)",
                                m.getCourseCode(), count, m.getStudentNum());
                System.out.println();
            }
            else {
                int reducingGroupNum = count - (int) Math.ceil(m.getStudentNum() / 25d);
                System.out.printf("%s: Number of students: %d. Tutorial/practical group number: %d. " +
                                "Therefore, %d tutorial/practical group(s) need to be withdrawn.\n" +
                                "(Caveat: classroom size has not been taken into consideration.)",
                                m.getCourseCode(), m.getStudentNum(), count, reducingGroupNum);
                System.out.println();
            }
        }
    }
}

    /*arrayLists.forEach(a->{picking(a, moduleCodeAndStudentNum.get(0));});
    int numberOfStudents = Integer.parseInt(moduleCodeAndStudentNum.get(1));
        if (count==0) System.out.println("%s: This module does not has tutorial/practical.");
        else if (numberOfStudents> 25 * count){
        int additionalGroupNum = (int)Math.ceil(numberOfStudents/25d)-count;
        System.out.printf("%s: Tutorial/practical group number: %d. Number of students: %d. " +
                        "Therefore, tutorial/practical group(s) may need to be increased by %d.",
                moduleCodeAndStudentNum.get(0), count, numberOfStudents, additionalGroupNum);
    }else if (numberOfStudents<=25*count && numberOfStudents>25*(count-1)) {
        System.out.printf("%s: Tutorial/Practical group number: %d. It commensurates number of students: %d.",
                moduleCodeAndStudentNum.get(0), count, numberOfStudents);
    }else {
        int reducingGroupNum=count -(int)Math.ceil(numberOfStudents/25d);
        System.out.printf("%s: Tutorial/practical group number: %d. Number of students: %d. " +
                        "Therefore, tutorial/practical group(s) may be reduced by %d.",
                moduleCodeAndStudentNum.get(0), count, numberOfStudents, reducingGroupNum);

    }

}
    //moduleCodeAndStudentNum.get(0), count, numberOfStudents);

    //System.out.println("Tutorial".contains("T"));


    static void picking(ArrayList<String> a, String s){

        String ss = moduleCodeAndStudentNum.get(0);
        if(a.get(0).contains(ss))
            if (a.get(1).contains("Tutorial")||a.get(1).contains("Practical")) count++;
    }*/

