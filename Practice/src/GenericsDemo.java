import java.util.*;
class GenericsDemo{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("abc");
        list.add("xyz");
        //list.add(33);

        String s=list.get(1);
        System.out.println("element is: "+s);

    }
}
