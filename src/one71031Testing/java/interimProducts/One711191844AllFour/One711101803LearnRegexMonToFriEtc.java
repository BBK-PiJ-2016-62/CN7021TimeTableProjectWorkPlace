package one71031Testing.java.interimProducts.One711191844AllFour;

import java.util.ArrayList;

/**
 * Created by Eric's laptop on 10/11/2017.
 */
public class One711101803LearnRegexMonToFriEtc {

    public static void main(String[] args) {

        /*String string = " Tue -  Thu ";
        String[] strings = string.split("-");
        System.out.println(strings[0] + " " + strings[1]);
        boolean b = string.trim().matches("[a-zA-Z]{3}\\s*-\\s*[a-zA-Z]{3}") &&
                (strings[0].trim().toLowerCase().matches("mon") || strings[0].trim().toLowerCase().matches("tue") ||
                        strings[0].trim().toLowerCase().matches("wed") || strings[0].trim().toLowerCase().matches("thu")) &&
                (strings[1].trim().toLowerCase().matches("tue") || strings[1].trim().toLowerCase().matches("wed") ||
                        strings[1].trim().toLowerCase().matches("thu") || strings[1].trim().toLowerCase().matches("fri"));
        switches(strings[0],strings[1]);
        String string1 = "Mon/Wed/Thu/Fri";
        String[] strings1 = string1.split("/");
        for (String s : strings1) {
            switches(s, s);
        }*/
        //switches("mon","mon");

    }

    public static ArrayList<ArrayList<String>> splittingWeekdays(ArrayList<String> arrayList) {

        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();

        if (arrayList.get(5).trim().matches("[[A-Za-z]{3}/]+[A-Za-z]{3}")) {

            String[] weekdays = arrayList.get(5).trim().split("/");
            for (String s : weekdays) {
                ArrayList<String> arrayList2 = new ArrayList<>(arrayList);
                if (s.trim().toLowerCase().equals("mon")) {
                    arrayList2.set(5, "Monday");
                    arrayLists.add(arrayList2);
                }
                if (s.trim().toLowerCase().equals("tue")) {
                    arrayList2.set(5, "Tuesday");
                    arrayLists.add(arrayList2);
                }
                if (s.trim().toLowerCase().equals("wed")) {
                    arrayList2.set(5, "Wednesday");
                    arrayLists.add(arrayList2);
                }
                if (s.trim().toLowerCase().equals("thu")) {
                    arrayList2.set(5, "Thursday");
                    arrayLists.add(arrayList2);
                }
                if (s.trim().toLowerCase().equals("fri")) {
                    arrayList2.set(5, "Friday");
                    arrayLists.add(arrayList2);
                }
            }
        }
        if (arrayList.get(5).trim().matches("[a-zA-Z]{3}\\s*-\\s*[a-zA-Z]{3}")) {

            String[] weekdays = arrayList.get(5).trim().split("-");

            String s1 = weekdays[0].trim().toLowerCase();
            String s2 = weekdays[1].trim().toLowerCase();
            switch (s1) {
                case "mon":
                    ArrayList<String> arrayList21 = new ArrayList<>(arrayList);
                    arrayList21.set(5, "Monday");
                    arrayLists.add(arrayList21);
                    if (s2.equals("mon")) break;
                case "tue":
                    ArrayList<String> arrayList22 = new ArrayList<>(arrayList);
                    arrayList22.set(5, "Tuesday");
                    arrayLists.add(arrayList22);
                    if (s2.equals("tue")) break;
                case "wed":
                    ArrayList<String> arrayList23 = new ArrayList<>(arrayList);
                    arrayList23.set(5, "Wednesday");
                    arrayLists.add(arrayList23);
                    if (s2.equals("wed")) break;
                case "thu":
                    ArrayList<String> arrayList24 = new ArrayList<>(arrayList);
                    arrayList24.set(5, "Thursday");
                    arrayLists.add(arrayList24);
                    if (s2.equals("thu")) break;
                case "fri":
                    ArrayList<String> arrayList25 = new ArrayList<>(arrayList);
                    arrayList25.set(5, "Friday");
                    arrayLists.add(arrayList25);
                    if (s2.equals("fri")) break;
            }
        }
        return arrayLists;
    }
}