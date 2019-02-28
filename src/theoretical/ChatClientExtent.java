package theoretical;

import munction.modules.annotations.Munction;

@Munction
public class ChatClientExtent extends MunctionComponent
{
    public MunctionContainer container = new MunctionContainer();

    //

    static
    {
        System.staticref("xmnx://org.mearvk.examples","xmnx://chatclientextent", ChatClientExtent.class);
    }

    @Munction
    public ChatClientExtent()
    {
        System.reference.ref("xmnx://org.mearvk.examples","xmnx://chatclientextent", this);

        //

        this.container.setprojectURL("xmnx://chatclient");

        this.container.setservername("xmnx://chatclient/theoretical");

        this.container.setnamespace("xmnx://org.mearvk");

        //

        this.thread.setstartupmonitor(StartupMonitor.class);

        this.thread.setruntimemonitor(RuntimeMonitor.class);

        this.thread.setshutdownmonitor(ShutdownMonitor.class);

        this.thread.setframingmonitor(FramingMonitor.class);

        //

        MunctionStartQueue
                .reference()
                .enqueue(ChatClientExtent.this.thread.startupmonitor)
                .enqueue(ChatClientExtent.this.thread.runtimemonitor)
                .enqueue(ChatClientExtent.this.thread.framingmonitor)
                .enqueue(ChatClientExtent.this.thread.shutdownmonitor)
                .start();
    }

    @Munction
    static class StartupMonitor extends Thread
    {
        public StartupMonitor()
        {

        }

        @Override
        public void run()
        {
            java.lang.System.out.println("[monitor] startup called.");
        }
    }

    @Munction
    static class RuntimeMonitor extends Thread
    {
        @Override
        public void run()
        {
            java.lang.System.out.println("[monitor] runtime called.");
        }
    }

    @Munction
    static class ShutdownMonitor extends Thread
    {
        @Override
        public void run()
        {
            java.lang.System.out.println("[monitor] shutdown called.");
        }
    }

    @Munction
    static class FramingMonitor extends Thread
    {
        @Override
        public void run()
        {
            java.lang.System.out.println("[monitor] framing called.");
        }
    }
}
