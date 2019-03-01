package munction.localized;

public class ShutdownMonitor extends Thread
{
    public MunctionThread thread;

    public ShutdownMonitor(MunctionThread thread)
    {
        this.thread = thread;
    }

    public void run()
    {
        if(SystemExtender.debug)
        {
            java.lang.System.out.println("[munction] shutdown monitor started.");
        }
    }
}
