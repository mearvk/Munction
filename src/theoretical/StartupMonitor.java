package theoretical;

public class StartupMonitor extends Thread
{
    public Thread thread;

    public StartupMonitor(MunctionThread thread)
    {
        this.thread = thread;
    }

    public void run()
    {
        if(SystemExtender.debug)
        {
            java.lang.System.out.println("[munction] startup monitor started.");
        }
    }
}
