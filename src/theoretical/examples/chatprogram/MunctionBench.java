package theoretical.examples.chatprogram;

import theoretical.Bodi;
import theoretical.MunctionException;

public class MunctionBench
{
    public String classname;

    public String benchclassname;

    public MunctionBench(String classname, String benchclassname)
    {
        try
        {
            Bodi.staticref(this.classname = classname);

            Bodi.staticref(this.benchclassname = benchclassname);
        }
        catch (Exception exception)
        {
            MunctionException.relist(exception, "","", true, true);
        }
    }
}
