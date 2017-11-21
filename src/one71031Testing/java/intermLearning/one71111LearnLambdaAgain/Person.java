package one71031Testing.java.intermLearning.one71111LearnLambdaAgain;

/**
 * Created by Eric's laptop on 11/11/2017.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Person {
    int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    String name;
    public Person(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
    @Override public String toString() {
        return ("Person Name:" + this.getName() +
                " ::Person Age: " + this.getAge());
    }
    public static void main(String args[]) {
        Person[] personList = new Person[] {
                new Person(23, "Ravi"),
                new Person(27, "Anands"), new Person(32, "Suraj")
        };
        List < Person > pList = ((List) Arrays.asList(personList));
        System.out.println("UnSorted List is ::" + pList);
        // TODO SCENERIO 1: Remove the commented code to try using the customized Comparator Class
        //Collections.sort(pList, new PersonNameComparator() {
        //@Override
        //public int compare(Person p1, Person p2) {
        // // TODO Auto-generated method stub
        //return p1.getName().compareTo(p2.getName());
        //}
        //});  //Don't know how to deal with it
        // TODO SCENERIO 2:: Remove the commented code below to try using the Comparator Anonymous
        //Inner class .. Functional Interface
        Collections.sort(pList, new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
        // // TODO Auto-generated method stub
        return p1.getName().compareTo(p2.getName());
        }
        });
        System.out.println("Sorted(According to scenerio 2) List is ::" + pList);
        // TODO SCENERIO 2A (sort by age)
        Collections.sort(pList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                // // TODO Auto-generated method stub
                if(p1.getAge()>p2.getAge()) return 1;
                else return -1;
            }
        });
        System.out.println("Sorted(According to scenerio 2A) List is ::" + pList);
        // TODO SCENERIO 3: Remove the commented code below to try using lambda expressions..
        //using default methods
        pList.sort((p1,p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println("Sorted(According to scenerio 3) List is ::" + pList);
        // TODO SCENERIO 4: Remove the commented code below to try using lambda expressions..
        //using higher order functions
        pList.sort(Comparator.comparing(p -> p.getName()));
        System.out.println("Sorted(According to scenerio 4) List is ::" + pList);
        // TODO SCENERIO 4A (sort by age)
        pList.sort(Comparator.comparing(p -> p.getAge()));
        System.out.println("Sorted(According to scenerio 4A) List is ::" + pList);
        // TODO SCENERIO 5: Remove the commented code below to try using lambda expressions..
        //using method references
        pList.sort(Comparator.comparing(Person::getName));
        System.out.println("\nsSorted List is ::" + pList);
    }
}


