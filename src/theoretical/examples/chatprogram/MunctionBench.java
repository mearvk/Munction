package theoretical.examples.chatprogram;

import munction.localized.Bodi;
import munction.localized.MunctionException;

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
