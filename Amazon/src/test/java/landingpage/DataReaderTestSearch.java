package landingpage;

import base.CommonAPI;
import datasupply.DataReader;
import org.testng.annotations.Test;

import java.util.List;

public class DataReaderTestSearch extends CommonAPI {
    DataReader dataReader = new DataReader();
    @Test
    public void search() throws Exception {
        List<String> list = dataReader.getItemListFromDB();
        for (String item:list){
            typeOnCss("#twotabsearchtextbox", item);
            clearInputField("#twotabsearchtextbox");

        }
    }
}
