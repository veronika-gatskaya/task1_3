public class Exceprion {
    public static void main (String[] args) {
        try{
            int[] array = {1,2,3};
            array[4] = 12;
        }
        catch (Exception ex) {
            System.out.println("No such index in array");
        }
        finally {
            System.out.println("Finally block");
        }
    }
}
