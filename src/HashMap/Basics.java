package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Basics {
    public static void main(String[] args) {

       HashMap<String,Integer> mp= new HashMap<>(); // string integer mapping h . we can do int-string or string-string or int-int etc.
       //ADDING ELEMENTS
       mp.put("soumya",21); // 21 is the value and soumya is the key
       mp.put("lakshya",24);
       mp.put("ujjwal",22);
       // Getting VALUE of a key from hashmap
       System.out.println(mp.get("soumya")); //21
       // Changing/ updating value of a key in the hashmap
       mp.put("soumya",25); // soumya --> 25
       // Removing a key
       System.out.println(mp.remove("soumya")); // 25 . its like pop
       // checking if a key is in the hashmap
       System.out.println(mp.containsKey("lakshya")); // true
       // adding a new entry only if the new key doesn't already exist.
       mp.putIfAbsent("jimin",29);
       // get all the keys in the hashmap
       System.out.println(mp.keySet()); // [lakshya, ujjwal, jimin]
       // get all the values in the hashmap
       System.out.println(mp.values()); // [24, 22, 29]
        // get all entries in the hashmap
       System.out.println(mp.entrySet());
       // TRAVERSING using keys
       for(String key: mp.keySet()){ // here we write the datatype of the variable like here "string key" . alternative is we can use var to avoid writing the dataype
          System.out.printf("Age of %s is %d\n",key, mp.get(key)); // we used PRINTF okay
       }
       // TRAVERSING using entryset
       for(Map.Entry<String, Integer> e: mp.entrySet()){ // in this the datatype of entryset e is  "Map.Entry<String, Integer>"
          System.out.printf("Age %s is %d\n",e.getKey(),e.getValue());
       }
       // BUT this is problem and difficult to learn so instead of writing its datatype we can use "VAR"
       for(var e: mp.entrySet()){ // in this the datatype of entryset e is  "Map.Entry<String, Integer>"
          System.out.printf("Age %s is %d\n",e.getKey(),e.getValue());
       }

   }
}
