import java.lang.annotation.*;
import java.lang.reflect.*;
class Base {

    void display()
    {
        System.out.println("Base display()");
    }
}

class Annotations extends Base {

    void display(int x)
    {
        System.out.println("Derived display(int )");
    }


    // Main driver method
    public static void main(String args[])
    {
        // Creating object of this class inside main()
        Annotations obj = new Annotations();

        // Calling display() method inside main()
        obj.display();
    }
}

