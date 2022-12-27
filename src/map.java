import java.util.*;

public class map {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<String, Integer>();

        people.put("김길동",85);
        people.put("김진동",75);
        people.put("김홍동",25);

        System.out.println("총 entity :" + people.size());

        Set<Map.Entry<String, Integer>> set = people.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();

        while(it.hasNext()) {
            Map.Entry<String, Integer> e = it.next();
            System.out.println("\n"+ e.getKey() + ":"+e.getValue());
        }
        Collection values = people.values();
        Collection keys = people.keySet();
        it = values.iterator();
        Iterator<Map.Entry<String,Integer>> it2 = keys.iterator();
        System.out.println("최고점수 : "+ Collections.max(values) +", 이름 : "+ Collections.max(keys));

    }
}
