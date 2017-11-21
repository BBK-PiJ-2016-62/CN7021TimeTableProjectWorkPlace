package one71031Testing.java.intermLearning.myArrayListSortAndPicking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Eric's laptop on 02/11/2017.
 */
public class One711021037LearningComparator{

    public static void main(String[] args) {

        Swan[] swanArray = new Swan[]{
                new Swan("Peter", "Black", 2, 4),
                new Swan("Betty", "White", 7, 10),
                new Swan("Betty", "White", 7, 9),
                new Swan("Zoe", "White", 8, 8),
                new Swan("Yevonne", "Black", 8, 6),
                new Swan("Amy", "Black", 5, 5),
                new Swan("Grace", "Black", 2, 4)};

        ArrayList<Swan> swanArrayList = new ArrayList<Swan>(Arrays.asList(swanArray));

        Collections.sort(swanArrayList, new MultiFieldComparatorOfSwanArrayList());
        for(Swan s: swanArrayList){
            System.out.println(s.colour+" "+s.age+" "+s.weight+" "+s.name);
        }
    }

}

class Swan{

    String name;
    String colour;
    int age;
    int weight;

    Swan(String name, String colour, int age, int weight) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.weight = weight;
    }
}

class MultiFieldComparatorOfSwanArrayList implements Comparator<Swan>{


    public int compare(Swan s1, Swan s2){

        int result=s1.colour.compareTo(s2.colour);
        if (result !=0) return result;
        if (s1.age>s2.age) return 1;
        else if(s1.age<s2.age) return-1;
        if (s1.weight>s2.weight) return 1;
        else if(s1.weight<s2.weight) return -1;
        return s1.name.compareTo(s2.name);
    }
}
