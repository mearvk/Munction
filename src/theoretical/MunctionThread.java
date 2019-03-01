package theoretical;

public class MunctionThread extends Thread
{
    public StartupMonitor startupmonitor;

    public RuntimeMonitor runtimemonitor;

    public ShutdownMonitor shutdownmonitor;

    public FramingMonitor framingmonitor;

    //

    public void setstartupmonitor(Class<? extends Thread> klass)
    {
        try
        {
            this.startupmonitor = (StartupMonitor)klass.getConstructors()[0].newInstance();
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "","",true,true);
        }
    }

    public void setruntimemonitor(Class<? extends Thread> klass)
    {
        try
        {
            this.runtimemonitor = (RuntimeMonitor)klass.newInstance();
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "","",true,true);
        }
    }

    public void setshutdownmonitor(Class<? extends Thread> klass)
    {
        try
        {
            this.shutdownmonitor = (ShutdownMonitor)klass.newInstance();
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "","",true,true);
        }
    }

    public void setframingmonitor(Class<? extends Thread> klass)
    {
        try
        {
            this.framingmonitor = (FramingMonitor)klass.newInstance();
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "","",true,true);
        }
    }
}
