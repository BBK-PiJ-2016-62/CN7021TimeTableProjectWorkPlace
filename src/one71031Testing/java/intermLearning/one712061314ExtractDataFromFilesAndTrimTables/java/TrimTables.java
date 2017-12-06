import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Eric's laptop on 06/12/2017.
 */
public class TrimTables {

    ArrayList<String> modulesInModStudNumListButNotTimeTable= new ArrayList<>();

    public static void main(String[] args){
        ExtractModuleInformation emi = new ExtractModuleInformation();
        ArrayList<ArrayList<String>> modStudNumList= emi.modStudNumList();
        InputAndTidyUpTimeTable iattt=new InputAndTidyUpTimeTable();
        ArrayList<ArrayList<String>> firstList = iattt.inputAndTidyTimeTable();
        System.out.println(new TrimTables().tydyingModStudNumList(modStudNumList, firstList));
    }

    public ArrayList<ArrayList<String>> tydyingModStudNumList
            (ArrayList<ArrayList<String>> modStudNumList, ArrayList<ArrayList<String>> firstList){
        //ArrayList<String> modulesInModStudNumListButNotTimeTable= new ArrayList<>();
        abc:
        for (ArrayList<String> al:modStudNumList) {
            int count = 0;
            for (ArrayList<String> al1 : firstList) {
                if (al.get(0).trim().toLowerCase().equals(al1.get(1).trim().toLowerCase())) continue abc;
                if (count == al1.size() - 1) modulesInModStudNumListButNotTimeTable.add(al.get(0));
                count++;
            }
        }
        ArrayList<ArrayList<String>> toBeReturnedList = new ArrayList<>(modStudNumList);
        for(int i=toBeReturnedList.size()-1; i==0;i--){
            for(String str:modulesInModStudNumListButNotTimeTable){
                if(str.trim().toLowerCase().equals(toBeReturnedList.get(i).get(0).trim().toLowerCase())){
                    toBeReturnedList.remove(i);
                }
            }
        }
        return toBeReturnedList;
    }

}

