package munction.modules.build.examples.chatprogram;

import munction.modules.build.ApplicationContainer;
import munction.modules.build.FramingProcessor;
import munction.modules.build.MunctionComponent;

public class ChatClient extends ChatClientExtent
{
    ChatClientCord startupcord = new ChatClientCord();

    public ChatClient()
    {

    }
}

class ChatClientCord extends MunctionCord
{

}

class ChatClientExtent extends MunctionComponent
{
    ApplicationContainer container = new ApplicationContainer();

    public ChatClientExtent()
    {
        this.thread.setstartrunnable(Startup.class);

        this.thread.setmaintenancerunnable(Maintenance.class);

        this.thread.setshutdownrunnable(Shutdown.class);
    }

    class Startup implements Runnable
    {
        @Override
        public void run()
        {

        }
    }

    class Maintenance implements Runnable
    {

        @Override
        public void run()
        {

        }
    }

    class Shutdown implements Runnable
    {
        @Override
        public void run()
        {

        }
    }

    class Framer extends FramingProcessor implements Runnable
    {
        @Override
        public void run()
        {

        }
    }
}




