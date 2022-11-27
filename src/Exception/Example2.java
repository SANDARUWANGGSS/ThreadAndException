package Exception;

public class Example2 {
    public static void main(String args[])
    {
        int a =10;
        int b = 7;
        int c = 5;
        int x =0;
        try{
            String number = "123";
            int value = Integer.parseInt(number);
            x = a/(b-c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot devide values by zero");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Number format error");
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Hii 2");
        }
        System.out.println("x = " +x);
        int y = a/(b+c);
        System.out.println("y = " +y);
    }
}
