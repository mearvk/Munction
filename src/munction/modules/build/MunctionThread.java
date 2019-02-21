package munction.modules.build;

public class MunctionThread extends Thread
{
    public Runnable startupmonitor;

    public Runnable runtimemonitor;

    public Runnable shutdownmonitor;

    public Runnable framingmonitor;

    //

    public void setstartupmonitor(Class<? extends Runnable> klass)
    {
        try
        {
            this.startupmonitor = klass.newInstance();
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
            this.runtimemonitor = klass.newInstance();
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
            this.shutdownmonitor = klass.newInstance();
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
            this.framingmonitor = klass.newInstance();
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "","",true,true);
        }
    }
}
