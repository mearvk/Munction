package munction.modules.build.examples.chatprogram;

import munction.modules.build.*;
import munction.modules.build.Process;

import java.util.Queue;

import static munction.modules.build.MunctionProcessor.STANDARD_EXCEPTION_HANDLER;

public class ApplicationContainer
{
    public ApplicationContainerContext applicationcontainercontext = new ApplicationContainerContext();

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
        ApplicationContainerContext context = this.applicationcontainercontext;

        context
                .report("munction://localhost/", this)
                .signal("munction://localhost/", this)
                .lists("munction://localhost/", this)
                .exceptions("munction://localhost", this);

        //

        MunctionProcessor processor = this.munctionprocessor
                .instance("retval", username, password, munctionname, munctionurl)
                .addhandler(STANDARD_EXCEPTION_HANDLER, "stderr", "munction://localhost")
                .trylock()
                .pull()
                .ref()
                .tryunlock()
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

    public ApplicationContainer getprocess(String username, String password, String name, String namespace, String munctionname, String munctionurl, Queue<Process> retval)
    {
        ApplicationContainerContext context = this.applicationcontainercontext;

        context
                .report("munction://localhost/", this)
                .signal("munction://localhost/", this)
                .lists("munction://localhost/", this)
                .exceptions("munction://localhost", this);

        //

        MunctionProcessor processor = this.munctionprocessor
                .instance("retval", username, password, munctionname, munctionurl)
                .addhandler(STANDARD_EXCEPTION_HANDLER, "stderr", "munction://localhost")
                .trylock()
                .pull()
                .ref()
                .tryunlock()
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

    public ApplicationContainer getlist(String username, String password, String name, String namespace, String munctionname, String munctionurl, Queue<List> retval)
    {
        ApplicationContainerContext context = this.applicationcontainercontext;

        context
                .report("munction://localhost/", this)
                .signal("munction://localhost/", this)
                .lists("munction://localhost/", this)
                .exceptions("munction://localhost", this);

        //

        MunctionProcessor processor = this.munctionprocessor
                .instance("retval", username, password, munctionname, munctionurl)
                .addhandler(STANDARD_EXCEPTION_HANDLER, "stderr", "munction://localhost")
                .trylock()
                .pull()
                .ref()
                .tryunlock()
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
