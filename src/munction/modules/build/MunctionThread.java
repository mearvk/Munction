package munction.modules.build;

public class MunctionThread extends Thread
{
    public Runnable startup;

    public Runnable maintenance;

    public Runnable shutdown;

    public Runnable framing;

    //

    public void setstartrunnable(Class<? extends Runnable> klass)
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

    public void setmaintenancerunnable(Class<? extends Runnable> klass)
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

    public void setshutdownrunnable(Class<? extends Runnable> klass)
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

    public void setframing(Class<? extends Runnable> klass)
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
