public class TryDemo {
    public static void main(String[] args) {
        try {
            int i=20;
            int j=0;
            j=18/i;
            if(j==0){
                throw new ArithmeticException("I dont want to print zero");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
