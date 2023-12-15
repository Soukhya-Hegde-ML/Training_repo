import java.util.*;
public class CollectionsDemo {
    public static void main(String args[]){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(6);
        list1.add(9);
        System.out.println(list1);
        LinkedList<Integer> llist = new LinkedList<>();
        llist.add(10);
        llist.add(20);
        llist.add(30);
        System.out.println(llist);
        llist.addAll(list1);
        System.out.println(llist);
        Iterator<Integer> itr= llist.iterator();

        while(itr.hasNext()){
            System.out.println("Elements:"+itr.next());
        }
        llist.remove(1);
        System.out.println(llist);
        for (Integer ele: llist){

            System.out.println(ele);
        }
        Stack<String> employee = new Stack<>();
        employee.push("Java Developer");
        employee.push("UI Developer");
        employee.push("HR");
        System.out.println(employee);
        System.out.println("last element: "+employee.peek());
        employee.pop();
        System.out.println(employee);

    }
}
