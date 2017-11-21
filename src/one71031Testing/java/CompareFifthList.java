package one71031Testing.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Eric's laptop on 02/11/2017.
 */
public class CompareFifthList implements Comparator<ArrayList<String>> {


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
