package C7.set;

import java.util.*;

public class Main {
    public static void createSet(){
        List <Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,2,4,5,6,7));     // sterge duplicatele
        Collection<Integer> hashSet = new HashSet<>(list);
        System.out.println(hashSet);
    }

    public static Map createMap(){
        Map newMap = new HashMap();
        newMap.put(1,"One");
        newMap.put(5,"five");
        newMap.put(7,"Seven");
        newMap.put(5,"fiveee");

        /*System.out.println(newMap);*/

        return newMap;
    }

    public static void main(String[] args) {
        createSet();
        createMap();

        Map<Integer,String> newMap = createMap();

        for(Map.Entry<Integer,String> entry: newMap.entrySet()) {
            System.out.println(entry.getKey() + " " +entry.getValue());
        }
    }
}
