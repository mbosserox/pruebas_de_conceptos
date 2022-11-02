import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapsTest {
/*Write a method that accepts a Map<String, Map<Long, Integer>> and returns Map<Long, Integer>
such that Integer values are summed together for the same Long values regardless of String key in the outer map.
 */

    public static void main(String[] args) {
        HashMap<String, Map<Integer, Integer>>  testArgs  = new HashMap<>();
        Map<Integer, Integer> solution1  = new HashMap<>() ;
        Map<Integer, Integer> solution2  = new HashMap<>() ;
        Map<Integer, Integer> solution3  = new HashMap<>() ;

        solution1.put(1,10);
        solution2.put(2,20);
        solution3.put(3,30);
        testArgs.put("A1",solution1);
        testArgs.put("A2",solution2);
        testArgs.put("A3",solution3);
        testArgs.put("A4",solution3);
        testArgs.put("A5",solution3);

        testArgs.entrySet().forEach(e ->System.out.println(e.getKey()+"-"+e.getValue()));
        testArgs.values().forEach(e ->System.out.println(e));
        testArgs.keySet().forEach(e ->System.out.println(e));
        Map<Integer, Integer> solution = new HashMap<>();
        Iterator<Map<Integer, Integer>> iterator = testArgs.values().iterator();
        while (iterator.hasNext()){
            Map<Integer, Integer> entry = iterator.next();
            entry.entrySet().forEach(e -> System.out.println(e.getValue()+"-"+e.getKey()));

            Integer key = entry.keySet().stream().reduce((k,v)-> k).get();
            Integer value = solution.get(key);
            if(value==null){
                solution.put(key,entry.get(key));
            }else {
                solution.put(key, value + entry.get(key));
            }
         //   System.out.println(entry.getValue());
        }

        solution.entrySet().forEach(e ->System.out.println(e.getKey()+"-"+e.getValue()));
    }
    public static Map<Long, Integer> solution (HashMap<String, Map<Integer, Integer>>  testArgs){
        Map<Integer, Integer> solution  = new HashMap<>() ;
        //testArgs.values().stream().map( kv -> System.out.println(Map.Entry::getKey+"-"+Map.Entry::getValue));
        return null;

    }

}
