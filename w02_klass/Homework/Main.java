import java.util.HashSet;
import java.util.Vector;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("Comms");
        vector.add("Solved");
        vector.add(0, "Keep");

        System.out.println(vector);

        vector.remove(2);

        System.out.println(vector);
        
        HashSet<String> hashset = new HashSet<String>();

        hashset.add("Mercantile");
        hashset.add("Solution");
        hashset.add("Development");
        hashset.add("Procedure");
        hashset.add("Procedure");
        for (String i : hashset){
            System.out.println(i);
        }

        hashset.remove("Development");
        for (String i : hashset){
            System.out.println(i);
        }

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("43", "Denmark");
        map.put("56", "France");
        map.put("23", "Hagen");
        map.put("78", "London");

        
        System.out.println(map.get("78"));
        System.out.println(map.get("23"));
    

        map.remove("43");

        System.out.println(map.get("43"));
        
        for (String i : map.values()){
            System.out.println(i);
        }
        
        for (String i : map.keySet()){
            System.out.println(i);
        }
        map.clear();
        for (String i : map.keySet()){
            System.out.println(i);

        /* Vector muudab järjekorda liikmete eemaldamisel, 
        set liiikmed ühekordsed, map mitu liiget kirjes, key*/
        }
    }
}