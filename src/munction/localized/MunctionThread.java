package munction.localized;

public class MunctionThread extends Thread
{
    public ChatClientStartupMonitor startupmonitor;

    public ChatClientRuntimeMonitor runtimemonitor;

    public ChatClientShutdownMonitor shutdownmonitor;

    public ChatClientFramingMonitor framingmonitor;

    //

    public void setstartupmonitor(Class<? extends Thread> klass)
    {
        try
        {
            this.startupmonitor = (ChatClientStartupMonitor)klass.getConstructors()[0].newInstance();
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
            this.runtimemonitor = (ChatClientRuntimeMonitor)klass.getConstructors()[0].newInstance();
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
            this.shutdownmonitor = (ChatClientShutdownMonitor)klass.getConstructors()[0].newInstance();
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
            this.framingmonitor = (ChatClientFramingMonitor)klass.getConstructors()[0].newInstance();
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "","",true,true);
        }
    }
}
