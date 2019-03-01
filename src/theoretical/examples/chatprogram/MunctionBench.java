package theoretical.examples.chatprogram;

import munction.localized.MunctionBodi;
import munction.localized.MunctionException;

public class MunctionBench
{
    public String classname;

    public String benchclassname;

    public MunctionBench(String classname, String benchclassname)
    {
        try
        {
            MunctionBodi.staticref(this.classname = classname);

            MunctionBodi.staticref(this.benchclassname = benchclassname);
        }
        catch (Exception exception)
        {
            MunctionException.relist(exception, "","", true, true);
        }
    }
}
