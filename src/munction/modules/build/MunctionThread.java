package munction.modules.build;

public class MunctionThread extends Thread
{
    public ChatClientExtent.StartupMonitor startupmonitor;

    public ChatClientExtent.RuntimeMonitor runtimemonitor;

    public ChatClientExtent.ShutdownMonitor shutdownmonitor;

    public ChatClientExtent.FramingMonitor framingmonitor;

    //

    public void setstartupmonitor(Class<? extends Thread> klass)
    {
        try
        {
            this.startupmonitor = (ChatClientExtent.StartupMonitor)klass.getConstructors()[0].newInstance();
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
            this.runtimemonitor = (ChatClientExtent.RuntimeMonitor)klass.newInstance();
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
            this.shutdownmonitor = (ChatClientExtent.ShutdownMonitor)klass.newInstance();
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
            this.framingmonitor = (ChatClientExtent.FramingMonitor)klass.newInstance();
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception, "","",true,true);
        }
    }
}
