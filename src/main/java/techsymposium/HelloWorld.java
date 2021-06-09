package techsymposium;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public List<String> getSomeNullLists() {
        return null;
    }

    public List<String> getSomeLists() {
        return new ArrayList<>() {{
            add("one");
            add("two");
            add("three");
        }};
    }

    public static void staticMethodCall() {
        System.out.println("called staticMethod");
    }
}
