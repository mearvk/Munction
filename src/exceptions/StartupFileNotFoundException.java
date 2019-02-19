package exceptions;

public class StartupFileNotFoundException extends Exception
{
    private Exception exception = null;

    public String message = null;

    public StartupFileNotFoundException(String message)
    {
        this.message = message;
    }

    public StartupFileNotFoundException(Exception exception)
    {
        this.exception = exception;

        this.message = exception.getMessage();
    }
}
