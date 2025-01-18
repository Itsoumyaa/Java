import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer,String> mp= new HashMap<>();
        mp.put(3,"jimin");
        mp.put(1,"soumya");
        mp.put(2,"jin");
        //mp.put(1,"jk"); // toh yeh OVERRIDE kr dega and soumya ki jagah jk aa jaaega
        // BUT IF U DON'T WANT IT TO OVERRRIDE THEN
        mp.putIfAbsent(1,"jk"); // toh yaha agar 1 pr kn hua toh hi yeh value dalegi wrna soumya change hoke jk nhi hoga
        System.out.println(mp); //{1=soumya, 2=jin, 3=jimin}
        System.out.println(mp.get(2)); // jin
        System.out.println(mp.containsKey(4)); // false
        System.out.println(mp.containsValue("soumya")); // true
        System.out.println(mp.keySet()); // 1 2 3
        System.out.println(mp.values()); // soumya jin jimin

    }
}
