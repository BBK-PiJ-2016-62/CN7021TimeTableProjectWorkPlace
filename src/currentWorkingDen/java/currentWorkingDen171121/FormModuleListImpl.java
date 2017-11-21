package currentWorkingDen171121;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by Eric's laptop on 14/11/2017.
 */
public class FormModuleListImpl implements FormModuleList {

    @Override
    public void tutGroupAndRoomSize(ArrayList<ArrayList<String>> firstList) {
        ArrayList<ModuleImpl> moduleCodes = moduleCodes();

        ArrayList<ModuleImpl> moduleCodes1 = addingDataToModuleCodes(firstList, moduleCodes);
        CheckRoomSizeSufficiency crss=new CheckRoomSizeSufficiencyImpl();
        crss.checkRoomSizeSufficiency(moduleCodes);
    }

    @Override
    public ArrayList<ModuleImpl> moduleCodes() {

        ArrayList<ModuleImpl> moduleCodes = new ArrayList<>();
        try {
            Files.lines(Paths.get("one711191951StudentNumSortedCurrentWorking.txt")).forEach(s -> moduleCodes.add(formModuleCode(s)));


        } catch (IOException e) {
            System.out.println(e);
        }
        return moduleCodes;
    }

    @Override
    public ModuleImpl formModuleCode(String s) {

        String[] ss = s.split(",");
        ModuleImpl moduleCode = new ModuleImpl();
        moduleCode.setCourseCode(ss[0]);
        moduleCode.setStudentNum(Integer.parseInt(ss[1]));
        return moduleCode;
    }

    @Override
    public ArrayList<ModuleImpl> addingDataToModuleCodes(ArrayList<ArrayList<String>> firstList, ArrayList<ModuleImpl> moduleCodes) {

        ArrayList<ModuleImpl> moduleCodes1 = new ArrayList<>(moduleCodes);
        for (ModuleImpl m : moduleCodes1) {
            firstList.forEach(s -> addingData(m, s));
            //m.addToTypeOfMeetingNRmNumList(new ArrayList<>(Arrays.asList("haha","hahaha")));
        }
        return moduleCodes1;
    }

    @Override
    public void addingData(ModuleImpl m, ArrayList<String> s) {

        if (s.size() >= 4 && s.get(0).length() != 0 && s.get(1).length() != 0 && s.get(3).length() != 0)
            if (s.get(1).trim().toLowerCase().equals(m.getCourseCode().toLowerCase())) {
                ArrayList<String> al = new ArrayList<>();
                al.add(s.get(3));
                if (s.size() >= 14 && s.get(13).length() != 0) al.add(s.get(13));
                else al.add("No room assigned");
                //System.out.println(m.getCourseCode()+" "+al);  //temp for checking. checked. waiting for deleting
                m.addToTypeOfMeetingNRmNumList(al);
        }
    }
}

