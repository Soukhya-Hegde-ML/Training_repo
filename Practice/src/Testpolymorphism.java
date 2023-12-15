class adder{
    static int add(int a, int b){
        return a+b;
    }
    static int add (int a,int b, int c){
        return a+b+c;
    }
    static double add(double a,double b){
        return a+b;
    }
}
public class Testpolymorphism {
    public static void main(String args[]){
        System.out.println("sum of 2 nums : "+adder.add(11,11));
        System.out.println("sum of 3 nums : "+adder.add(10,10,10));
        System.out.println(adder.add(12.1,10.1));
    }
}
