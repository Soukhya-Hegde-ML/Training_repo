import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Parent {

}
class Person extends Parent {
    private final String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Person(String name) {
        this.name = name;
    }

    public void speaks(){
        String Language = "English";
        System.out.println("I speak English");
    }
}
public class Reflection {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Person person= new Person("xyz");
        Class classs = person.getClass();
        String name = classs.getName();
        System.out.println("Class name : "+name);
        Method methods[] = classs.getDeclaredMethods();
        for(Method method : methods){
            System.out.println("Method name: "+method.getName());
            if(method.getName().equals("speaks")) {
                method.invoke(person);
            }
        }
        Class superclass = classs.getSuperclass();
        System.out.println("Super class name: "+superclass.getName());

        Field[] fields = classs.getDeclaredFields();
        for (Field field:fields){
            System.out.println("Fields : "+field.getName());
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(person,"Sam");
            }
        }
        System.out.println(" name "+person.getName());

    }
}
