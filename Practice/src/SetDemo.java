import java.util.*;
public class SetDemo {
    public static void main(String args[]){
        Set<Integer> sets = new HashSet<>();
        sets.add(33);
        sets.add(11);
        sets.add(55);
        sets.add(44);
        sets.add(22);
        System.out.println("Hashset: ");
        System.out.println(sets);
        sets.remove(44);
        System.out.println(sets);
        System.out.println(sets.contains(44));
        System.out.println("Size is: "+sets.size());
        sets.clear();
        System.out.println(sets);

        Set<Integer> sets2 = new LinkedHashSet<>();
        sets2.add(33);
        sets2.add(11);
        sets2.add(55);
        sets2.add(44);
        sets2.add(22);
        System.out.println("LinkedHashset: ");
        System.out.println(sets2);
        sets2.remove(44);
        System.out.println(sets2);
        System.out.println(sets2.contains(22));
        System.out.println("Size is: "+sets2.size());
        sets2.clear();
        System.out.println(sets2);

        Set<Integer> sets3 = new TreeSet<>();
        sets3.add(33);
        sets3.add(11);
        sets3.add(55);
        sets3.add(44);
        sets3.add(22);
        System.out.println("Treeset: ");
        System.out.println(sets3);
        sets3.remove(44);
        System.out.println(sets3);
        System.out.println(sets3.contains(44));
        System.out.println("Size is: "+sets3.size());
        sets3.clear();
        System.out.println(sets3);

    }
}
