package munction.modules.build.examples.chatprogram;

import munction.modules.build.*;
import munction.modules.build.System;

public class ChatClient extends ChatClientExtent
{
    public static void main(String...args)
    {
        new ChatClient();
    }

    static
    {
        System.extender.staticref("munction://org.mearvk.munction", "munction://chatclient", ChatClient.class);
    }

    public ChatClient()
    {
        System.extender.ref("munction://org.mearvk.munction", "munction://chatclient", this);
    }
}

class ChatClientExtent extends MunctionComponent
{
    ApplicationContainer container = new ApplicationContainer();

    //

    public ChatClientExtent()
    {
        this.thread.setstartupmonitor(StartupMonitor.class);

        this.thread.setruntimemonitor(RuntimeMonitor.class);

        this.thread.setshutdownmonitor(ShutdownMonitor.class);
    }

    class StartupMonitor implements Runnable
    {
        @Override
        public void run()
        {

        }
    }

    class RuntimeMonitor implements Runnable
    {

        @Override
        public void run()
        {

        }
    }

    class ShutdownMonitor implements Runnable
    {
        @Override
        public void run()
        {

        }
    }

    class FramingMonitor extends FramingProcessor implements Runnable
    {
        @Override
        public void run()
        {

        }
    }
}




