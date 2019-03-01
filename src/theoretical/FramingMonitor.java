package theoretical;

public class FramingMonitor extends Thread
{
    public MunctionThread thread;

    public FramingMonitor(MunctionThread thread)
    {
        this.thread = thread;
    }

    public void run()
    {
        if(SystemExtender.debug)
        {
            java.lang.System.out.println("[munction] framing monitor started.");
        }
    }
}
