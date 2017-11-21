package one71031Testing.java.interimProducts.One711101737PreliminaryProuctForTasksOneAndThree;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Eric's laptop on 02/11/2017.
 */
public class CompareFifthList implements Comparator<ArrayList<String>> {

    /*public static void main(String[] args){

        ArrayList<String> stringArrayList1=new ArrayList<String>(Arrays.asList("\"C4B CS CASS\", CN4106, Introduction to Web Technologies,Practicals, 3, Tuesday, 16:00, 18:00, 02:00, 2, 25, Gaurav Malik, , KD.2.28".split(",")));
        ArrayList<String> stringArrayList2=new ArrayList<String>(Arrays.asList("\"C4B CS CASS\", CN4106, Introduction to Web Technologies,Practicals, 3, Tuesday, 09:00, 11:00, 02:00, 3, 25, Fahimeh Jafari, , ITC03".split(",")));
         ArrayList<String> stringArrayList3=new ArrayList<String>(Arrays.asList("\"C4B CS CASS\", CN4106, Introduction to Web Technologies,Practicals, 1, Saturday, 16:00, 18:00, 02:00, 1, 25, Gaurav Malik, , KD.2.14".split(",")));
        ArrayList<String> stringArrayList4=new ArrayList<String>(Arrays.asList("\"C4B CS CASS\", CN4106, Introduction to Web Technologies,Practicals, 1, Monday, 16:00, 18:00, 02:00, 4, 25, Fahimeh Jafari, , KD.2.28".split(",")));
        ArrayList<String> stringArrayList5=new ArrayList<String>(Arrays.asList("\"C4B CS CASS\", CN4106, Introduction to Web Technologies,Practicals, 2, Monday, 11:00, 13:00, 02:00, 5, 25, Fahimeh Jafari, , ITC1-ITC5".split(",")));
        ArrayList<String> stringArrayList6=new ArrayList<String>(Arrays.asList("\"C4B CS CASS\", CN4106, Introduction to Web Technologies,Practicals, 1, Wednesday, 11:00, 13:00, 02:00, 6, 25, Gaurav Malik, , KD.2.28".split(",")));
        ArrayList<ArrayList<String>>  stringAArrayList = new ArrayList<>();
        stringAArrayList.add(stringArrayList1);
        stringAArrayList.add(stringArrayList2);
        stringAArrayList.add(stringArrayList3);
        stringAArrayList.add(stringArrayList4);
        stringAArrayList.add(stringArrayList5);
        stringAArrayList.add(stringArrayList6);
        Collections.sort(stringAArrayList, new CompareForthList());
        for (ArrayList<String> asl: stringAArrayList){
             System.out.println(asl);
        }
    } */

    public int compare(ArrayList<String> arrayList1, ArrayList<String> arrayList2) {

        int result = arrayList1.get(11).trim().compareTo(arrayList2.get(11).trim());
        if (result != 0) return result;
        if (Integer.parseInt(arrayList1.get(4).trim()) > Integer.parseInt(arrayList2.get(4).trim())) return 1;
        else if (Integer.parseInt(arrayList1.get(4).trim()) < Integer.parseInt(arrayList2.get(4).trim())) return -1;
        result = arrayList1.get(5).trim().compareTo(arrayList2.get(5).trim());
        if (result != 0) return result;
        if (Double.parseDouble(arrayList1.get(6).trim().replace(":", "."))
                > Double.parseDouble(arrayList2.get(6).trim().replace(":", "."))) return 1;
        else if (Double.parseDouble(arrayList1.get(6).trim().replace(":", "."))
                < Double.parseDouble(arrayList2.get(6).trim().replace(":", "."))) return -1;
        return 1;
    }
}
