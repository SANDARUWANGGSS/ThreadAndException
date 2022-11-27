package Exception;

public class Example4 {
    public static void main(String args[])
    {
        int x=10;
        if(x>10)
        {
            System.out.println("Welcome");
        }
        else
        {
            try
            {
                throw new CustomException(5);
            }
            catch (CustomException customException)
            {
                System.out.println(customException.getError());
            }
        }
    }
}
