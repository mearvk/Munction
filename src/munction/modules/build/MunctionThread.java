package munction.modules.build;

public class MunctionThread extends Thread
{
    public Runnable startup;

    public Runnable maintenance;

    public Runnable shutdown;

    public Runnable framing;

    //

    public void setstartupmonitor(Class<? extends Runnable> klass)
    {
        try
        {
            this.startup = klass.newInstance();
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "","",true,true);
        }
    }

    public void setruntimemonitor(Class<? extends Runnable> klass)
    {
        try
        {
            this.maintenance = klass.newInstance();
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "","",true,true);
        }
    }

    public void setshutdownmonitor(Class<? extends Runnable> klass)
    {
        try
        {
            this.shutdown = klass.newInstance();
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "","",true,true);
        }
    }

    public void setframingmonitor(Class<? extends Runnable> klass)
    {
        try
        {
            this.framing = klass.newInstance();
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "","",true,true);
        }
    }
}
