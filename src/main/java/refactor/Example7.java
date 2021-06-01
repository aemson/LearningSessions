package refactor;

import java.util.HashMap;

/***
 * Give proper types instead of Raw type
 * Use Stream Api instead of traditional apprach
 * Use method reference instead of lambda
 * **/
public class Example7 {
    public static void main(String[] args) {
        Example7 refactor = new Example7();
        HashMap map = refactor.getData();
        refactor.processMap(map);
    }

    private HashMap getData() {
        HashMap map = new HashMap();
        map.put(1, "value1");
        map.put(2, "value2");
        map.put(3, "value3");
        return map;
    }

    private void processMap(HashMap<Integer, String> map) {
        for (int i = 1; i < map.size() + 1; i++) {
            System.out.println(map.get(i));
        }

        map.entrySet().stream().forEach(it -> System.out.println(it));

        for (int i = 1; i < map.size() + 1; i++) {
            map.put(1, "newValue" + i);
        }
    }
}


/****
 * ***** Hint ****
 * Use `HashMap<String, String> map` instead of `HashMap map` or `var map`
 * Use good variable names n also camel case .
 * Use stream api wherever possible
 * Line 30 -> can be converted to forEach(System.out::println)
 *
 * Map<Integer, String> collect = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> "newValue" + entry.getKey()));
 * ****/