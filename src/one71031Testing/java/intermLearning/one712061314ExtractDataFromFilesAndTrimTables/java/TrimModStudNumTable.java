import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Eric's laptop on 06/12/2017.
 */
public class TrimModStudNumTable {

    /*public static void main(String[] args){
        ExtractModuleInformation emi = new ExtractModuleInformation();
        ArrayList<ArrayList<String>> modStudNumList= emi.modStudNumList();
        //System.out.println(modStudNumList);
        InputAndTidyUpTimeTable iattt=new InputAndTidyUpTimeTable();
        ArrayList<ArrayList<String>> firstList = iattt.inputAndTidyTimeTable();
        TrimModStudNumTable ttbles = new TrimModStudNumTable();
        //System.out.println(ttbles.tydyingModStudNumList(modStudNumList, firstList));
        //System.out.println(ttbles.modulesInModStudNumListButNotTimeTable);
        ArrayList<String> modulesNotInTimeTable = ttbles.modulesNotInTimeTable(modStudNumList, firstList);
        ArrayList<ArrayList<String>> trimModListAllInTmTable
            =ttbles.trimModListAllInTmTable(modStudNumList, modulesNotInTimeTable);
        System.out.println(modulesNotInTimeTable);
        System.out.println(trimModListAllInTmTable);
        ArrayList<String> modLstdOnTmTblButNotModLt = ttbles.modulesNotInModuleList(modStudNumList, firstList);
        System.out.println(modLstdOnTmTblButNotModLt);
    }*/

    public ArrayList<String> modulesNotInTimeTable
            (ArrayList<ArrayList<String>> modStudNumList, ArrayList<ArrayList<String>> firstList){
        //ArrayList<String> modulesInModStudNumListButNotTimeTable= new ArrayList<>();
        ArrayList<String> modulesListed= new ArrayList<>();
        ArrayList<String> modulesInTimeTable= new ArrayList<>();
        ArrayList<String> modulesNotInTimeTable= new ArrayList<>();
        abc:
        for (ArrayList<String> m:modStudNumList) {
            modulesListed.add(m.get(0));
            for (ArrayList<String> f : firstList) {
                //System.out.println(m.get(0));
                if(f.size()>=2) {
                    //System.out.println(m.get(0)+" "+f.get(1));
                    if (m.get(0).trim().toLowerCase().equals(f.get(1).trim().toLowerCase())){
                        //System.out.println(m.get(0)+" "+f.get(1));
                        modulesInTimeTable.add(m.get(0));
                        continue abc;
                    }
                }
            }
        }
        //System.out.println(modulesListed);
        //System.out.println(modulesInTimeTable);
        modulesNotInTimeTable= new ArrayList<>(modulesListed);
        //System.out.println(modulesNotInTimeTable);
        //System.out.println(modulesListed);
        abc:
        for(int i=modulesListed.size()-1; i>=0; i--){
                //(int i=0; i<modulesListed.size()-1; i++){
            //System.out.println(modulesListed.get(i));
            for(String str:modulesInTimeTable){
                if(modulesListed.get(i).equals(str)){
                    //System.out.println(str);
                    modulesNotInTimeTable.remove(i);
                    continue abc;
                }
            }
        }
        return modulesNotInTimeTable;
    }

    public ArrayList<ArrayList<String>> trimModListAllInTmTable
            (ArrayList<ArrayList<String>> modStudNumList, ArrayList<String> modulesNotInTimeTable ){

        ArrayList<ArrayList<String>> trimModListAllInTmTable =new ArrayList<>();
        abc:
        for(int i=modStudNumList.size()-1;i>=0;i--){
            for(String mnitt: modulesNotInTimeTable){
                if(modStudNumList.get(i).get(0).equals(mnitt)){
                    modStudNumList.remove(i);
                    continue abc;
                }
            }
        }
        return modStudNumList;
    }
    public ArrayList<String> modulesNotInModuleList
        (ArrayList<ArrayList<String>> modStudNumList, ArrayList<ArrayList<String>> firstList){

        ArrayList<String> modulesListedOnModList= new ArrayList<>();
        for (ArrayList<String> m:modStudNumList) {
            modulesListedOnModList.add(m.get(0));
        }
        ArrayList<String> modulesListedOnTimTable= new ArrayList<>();
        Set<String> modulesListedOnTimeTableSet= new LinkedHashSet<>();
        for(ArrayList<String> m: firstList){
            if(m.size()>=2 && m.get(1).matches("[A-Za-z]{2}[0-9]{4}"))
            modulesListedOnTimTable.add(m.get(1));
        }
        modulesListedOnTimeTableSet.addAll(modulesListedOnTimTable);
        ArrayList<String> modLstdOnTmTblButNotModLt= new ArrayList<>(modulesListedOnTimeTableSet);
        System.out.println(modulesListedOnTimTable);
        System.out.println(modulesListedOnTimeTableSet);
        System.out.println(modLstdOnTmTblButNotModLt);
        System.out.println(modulesListedOnModList);
        abc:
        for(int i=modLstdOnTmTblButNotModLt.size()-1;i>=0;i--){
            for(String s:modulesListedOnModList){
                if(modLstdOnTmTblButNotModLt.get(i).trim().toLowerCase().equals(s.trim().toLowerCase())) {
                    //System.out.println(modLstdOnTmTblButNotModLt.get(i)+" "+s);
                    modLstdOnTmTblButNotModLt.remove(i);
                    continue abc;
                }
            }
        }
        return modLstdOnTmTblButNotModLt;
    }
}

