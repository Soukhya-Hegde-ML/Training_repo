class A{
    void message(){
        System.out.println("Inside parent class");
    }
}
class B extends A{
    void message(){
        System.out.println("Inside child class");
    }
    void display(){
        message();
        super.message();
    }
}
public class SuperDemo {
    public static void main(String args[]){
        B ob = new B();
        ob.display();
    }
}
