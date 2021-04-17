package datasupply;

import datassource.ConnectToSqlDB;

import java.util.List;

public class DataReader {

    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getItemListFromDB() throws Exception {
        List<String> list = connectToSqlDB.readDataBase("ItemList", "items");


        return list;
    }
}
