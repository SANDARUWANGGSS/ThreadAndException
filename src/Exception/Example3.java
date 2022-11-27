package Exception;

public class Example3 {
    public static void main(String args[])
    {
//        int a=7;
//        int b=7;
//        int c=a/(a-b);
//        System.out.println(c);
        try{
            throw new ArithmeticException();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Hello");
        }

//        throw new ArithmeticException();

    }


}
