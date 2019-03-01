package munction.localized;

public class ChatClientFramingMonitor extends Thread
{
    public MunctionThread thread;

    public ChatClientFramingMonitor(MunctionThread thread)
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
