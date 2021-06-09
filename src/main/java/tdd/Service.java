package tdd;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private final Dbo dboObj;

    public Service(Dbo dboObj) {
        this.dboObj = dboObj;
    }

    public String getData(String name) {
        return "this is service class OG output"+ name;
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