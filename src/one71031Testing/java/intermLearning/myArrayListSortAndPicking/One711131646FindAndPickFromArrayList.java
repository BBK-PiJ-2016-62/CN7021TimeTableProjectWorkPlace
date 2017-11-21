package one71031Testing.java.intermLearning.myArrayListSortAndPicking;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Eric's laptop on 13/11/2017.
 */
public class One711131646FindAndPickFromArrayList {

    static int count = 0;
    static ArrayList<String> moduleCodeAndStudentNum=new ArrayList<>(Arrays.asList("CN5122","29"));

    public static void main (String[] args){

        ArrayList<ArrayList<String>> arrayLists=new ArrayList<>();
        arrayLists.add(new ArrayList<String>(Arrays.asList("CN5122", "Lecture")));
        arrayLists.add(new ArrayList<String>(Arrays.asList("CN5122", "Tutorial")));
        arrayLists.add(new ArrayList<String>(Arrays.asList("CN5122", "Tutorial")));
        arrayLists.add(new ArrayList<String>(Arrays.asList("CN5123", "Lecture")));
        arrayLists.add(new ArrayList<String>(Arrays.asList("CN5123", "Practical")));
        arrayLists.add(new ArrayList<String>(Arrays.asList("CN5123", "Practicals")));
        arrayLists.add(new ArrayList<String>(Arrays.asList("CN5123", "Practical")));
        arrayLists.forEach(a->{picking(a, moduleCodeAndStudentNum.get(0));});
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
    }
}
