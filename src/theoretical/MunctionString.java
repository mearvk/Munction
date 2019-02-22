package theoretical;

import java.rmi.Remote;

public class MunctionString implements Remote
{
    public String value;

    public MunctionString(String value)
    {
        this.value = value;
    }
}
