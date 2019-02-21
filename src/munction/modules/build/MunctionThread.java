package munction.modules.build;

public class MunctionThread extends Thread
{
    public Thread startupmonitor;

    public Thread runtimemonitor;

    public Thread shutdownmonitor;

    public Thread framingmonitor;

    //

    public void setstartupmonitor(Class<? extends Thread> klass)
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

    public void setruntimemonitor(Class<? extends Thread> klass)
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

    public void setshutdownmonitor(Class<? extends Thread> klass)
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

    public void setframingmonitor(Class<? extends Thread> klass)
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
