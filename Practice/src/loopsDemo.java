import java.io.IOException;
import java.util.Scanner;
import java.io.FileOutputStream;
public class loopsDemo{
    int id;
    String name;//instance variable
    public static void main(String args[]) {
        //object creation and usage
        loopsDemo pr = new loopsDemo();
        pr.id = 101;
        pr.name = "xyz";
        System.out.println("id = " + pr.id + " name = " + pr.name);
        //loops and decision statements

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            } else {
                System.out.println(i);
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number");
        int num1 = sc.nextInt();
        switch(num1)
        {
            case 10 :
            case 20 :
                System.out.println("Valid ");
                break;
            default : System.out.println("Invalid ");
                break;

        }
        int k=1;//local variable
        System.out.println("demonstrating while loop");
        while(k<10) {
            System.out.println(k);
            k++;
        }
        try{
            FileOutputStream fout = new FileOutputStream("/home/soukhya/testout.txt");
            String s = "Welcome to java";
            byte b[]= s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Successfully written to file");
        } catch (IOException e) {
            System.out.println(e);;
        }


    }
}
