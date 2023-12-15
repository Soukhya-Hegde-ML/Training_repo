//demonstration of inheritence
class Maplelabs {
    int employee_id = 45231;
    void run(){
        System.out.println("I am an employee of maplelabs");
    }
}
class programmer extends Maplelabs {
    float salary= 40000;
    void run(){
        System.out.println("I am a programmer");
    }
    public static void main (String args[]){
        programmer p = new programmer();
        System.out.println("employee_id : "+p.employee_id);
        System.out.println("salary : "+p.salary);
        //method overriding
        p.run();
    }

}

