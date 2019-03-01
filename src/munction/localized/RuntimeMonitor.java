package munction.localized;

public class RuntimeMonitor extends Thread
{
    public Thread thread;

    public RuntimeMonitor(MunctionThread thread)
    {
        this.thread = thread;
    }

    public void run()
    {
        if(SystemExtender.debug)
        {
            java.lang.System.out.println("[munction] runtime monitor started.");
        }
    }
}
