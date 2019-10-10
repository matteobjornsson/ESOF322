import java.util.ArrayList;
import java.util.List;

public abstract class Database {

    StorageTool st;
    List<String> fakeDB = new ArrayList<>();

    public void storeData(String data) {
        fakeDB.add(data);
    }

}
