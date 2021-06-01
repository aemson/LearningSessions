package tdd;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private Dbo dboObj;

    public Service() {
    }

    public Service(Dbo dboObj) {
        this.dboObj = dboObj;
    }

    public String getData() {
        return "this is service class OG output";
    }

    public  List<String> getDbData() {
        return dboObj.getData();
    }
}

class Dbo {
    public List<String> getData() {
        return new ArrayList<>() {{
            add("value1");
            add("value2");
        }};
    }
}