import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortMapUsingComparatorJava8 {
    
    /*public static void main(String[] args) {
        

        Map<String, Integer> map = new HashMap<String,Integer>();
        
        map.put("John",38);
        map.put("Kishan",24);
        map.put("Emily",34);
        map.put("Seema",20);

        Map<String,Integer> sortedMap = map.entrySet().stream().sorted((e1,e2)-> 
                                           e1.getValue().compareTo(e2.getValue())).collect(Collectors.toMap(
                                         Map.Entry::getKey,
                                         Map.Entry::getValue,
                                         (e1,e2)-> e1,
                                         LinkedHashMap :: new));

                                         sortedMap.forEach((key,value)-> System.out.println(key + ":" + value));

    }*/






    public static void main(String args[]){
        Map<String,Integer> map = new HashMap<String,Integer>();

        map.put("Arvind",35);
        map.put("Anil",34);
        map.put("Amit",21);
        map.put("Ankit",26);

        Map<String,Integer> sortedMap = map.entrySet().stream().sorted((entry1,entry2)->
        entry1.getValue().compareTo(entry2.getValue())).collect(Collectors.toMap(
            Map.Entry::getKey, Map.Entry::getValue ,
            (e1,e2)-> e1,
            LinkedHashMap::new));

            sortedMap.forEach((key,value) -> System.out.println(key + ":" + value));
        
        
    }
}
