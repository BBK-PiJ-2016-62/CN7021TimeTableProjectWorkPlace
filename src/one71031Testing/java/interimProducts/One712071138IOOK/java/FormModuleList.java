import java.util.ArrayList;

/**
 * Created by Eric's laptop on 20/11/2017.
 */
public interface FormModuleList {

    public ArrayList<ModuleImpl> moduleCodes();

    public ModuleImpl formModuleCode(String s);

    public ArrayList<ModuleImpl> addingDataToModuleCodes(ArrayList<ArrayList<String>> firstList, ArrayList<ModuleImpl> moduleCodes);

    public void addingData(ModuleImpl m, ArrayList<String> s);
}
