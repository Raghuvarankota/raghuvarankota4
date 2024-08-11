public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[5];
            numbers[10] = 100;  // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
            System.out.println("This block always services.");
        }
    }
}