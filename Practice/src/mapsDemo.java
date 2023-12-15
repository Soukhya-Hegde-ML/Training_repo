import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapsDemo {
    public static void main(String[] args) {
        Map<Integer,String> nums = new HashMap<>();
        nums.put(1,"One");
        nums.put(2,"Two");
        nums.put(4,"Four");
        nums.put(3,"Three");
        System.out.println(nums);
        if(!nums.containsKey(2)){
            nums.put(2,"twice");
        }
        nums.putIfAbsent(5,"twice");
        System.out.println(nums);
        for (Map.Entry<Integer,String> e : nums.entrySet()){
            System.out.println("pair "+e);
            System.out.println("key: "+e.getKey());
            System.out.println("Value: "+e.getValue());

        }
        for (Integer key:nums.keySet()){
            System.out.println(key);
        }
        for (String val:nums.values()){
            System.out.println(val);
        }
        Map<Integer,String> nums2 = new TreeMap<>();
        nums2.put(1,"One");
        nums2.put(2,"Two");
        nums2.put(3,"Three");
        nums2.put(4,"Four");
        System.out.println(nums2);
    }
}
