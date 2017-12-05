package currentWorkingDen171205;

import java.util.ArrayList;

/**
 * Created by Eric's laptop on 16/11/2017.
 */
public class CheckTutorialGroupSufficiencyImpl implements CheckTutorialGroupSufficiency {

    @Override
    public void checkTutorialGroupSufficiency(ArrayList<ModuleImpl> moduleCodes) {

        for (ModuleImpl m : moduleCodes) {
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