package one71031Testing.java.intermLearning.one71111LearnLambdaAgain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Eric's laptop on 11/11/2017.
 */
public class one711111411LambdaAndMethodReferenceMultipleConditions {

    static List<Human> humans = new ArrayList<>(Arrays.asList(
            new Human("Sarah", 12),
            new Human("Sarah", 10),
            new Human("Zack", 12),
            new Human("Amy", 12),
            new Human("Zack", 8))
    );


    //pList.sort((p1,p2) -> p1.getName().compareTo(p2.getName()));
    public static void main(String[] args) {
        ArrayList<Human> humans1=new ArrayList<>(humans);
        humans1.sort((lhs, rhs) -> {
            if (lhs.getName().equals(rhs.getName())) {
                return lhs.getAge() - rhs.getAge();
            } else {
                return lhs.getName().compareTo(rhs.getName());
            }
        });

        ArrayList<Human> humans2=new ArrayList<>(humans);
        humans2.sort(
                Comparator.comparing(Human::getName).thenComparing(Human::getAge)
        );
        System.out.println(humans+"\n"+humans1+"\n"+humans2);
    }

static class Human {
    private String name;
    private int age;

    public Human() {
        super();
    }

    public Human(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    @Override
    public String toString(){
        return "Name: "+this.name+", Age: "+this.age;
    }
}

    // standard getters/setters, equals and hashcode
}

