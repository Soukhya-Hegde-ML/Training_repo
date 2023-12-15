public class EnumDemo {
    enum status {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        status myVar = status.MEDIUM;
        System.out.println(myVar);
    }
}
