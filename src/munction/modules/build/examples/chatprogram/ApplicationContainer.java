package munction.modules.build.examples.chatprogram;

import munction.modules.build.*;
import munction.modules.build.Process;

import java.util.Queue;

public class ApplicationContainer
{
    public ListProcessor listprocessor = new ListProcessor();

    public CallbackProcessor callbackprocessor = new CallbackProcessor();

    public MunctionProcessor munctionprocessor = new MunctionProcessor();

    public FramingProcessor framingprocessor = new FramingProcessor();

    public ApplicationContainer()
    {
        //System.preinit(this);

        //System.init(this);
    }

    public ApplicationContainer enframe(String name, String namespace, String munctionname, String munctionurl, Queue<Frame> frames)
    {
        return this;
    }

    public ApplicationContainer enprocess(String name, String namespace, String munctionname, String munctionurl, Queue<Process> processes)
    {
        return this;
    }

    //

    public ApplicationContainer enlist(String name, String namespace, String munctionname, String munctionurl, Queue<List> lists)
    {
        return this;
    }

    //

    public ApplicationContainer getframe(String username, String password, String name, String namespace, String munctionname, String munctionurl, Queue<Frame> retval)
    {
        MunctionProcessor processor = this.munctionprocessor
                .instance()
                .addhandler(MunctionProcessor.STANDARD_EXCEPTION_HANDLER)
                .asset("retval", munctionname, munctionurl)
                .trylock(username, password)
                .pull("retval", munctionname, munctionurl)
                .ref("retval", retval)
                .freelock(username, password)
                .close();

        //

        MunctionReporter reporter = processor
                .reporter()
                .lock()
                .report()
                .free();

        //

        return this;
    }

}
