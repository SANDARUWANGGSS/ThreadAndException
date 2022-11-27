package Exception;

public class CustomException extends Exception{
    private int number;

    public CustomException(int number)
    {
        this.number=number;
    }

    public int getError()
    {
        return number*2;
    }
}
