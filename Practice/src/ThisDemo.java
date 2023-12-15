class Student{
    int rollno;
    String name;
    float fee;
    Student(int rollno, String name, float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }
}
public class ThisDemo {
    public static void main(String args[]){
        Student s1 = new Student(10,"abc",20000);
        Student s2 = new Student(11,"xyz",35000);
        s1.display();
        s2.display();

    }
}
