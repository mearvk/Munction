package munction.modules.build.examples.chatprogram;

import munction.modules.build.Process;
import munction.modules.build.*;

import java.util.Queue;

import static munction.modules.build.MunctionProcessor.STANDARD_EXCEPTION_HANDLER;

//

public class ApplicationContainer {
    public ApplicationContext applcontext = new ApplicationContext();

    public ListProcessor listprocessor = new ListProcessor();

    public MunctionProcessor munctionprocessor = new MunctionProcessor();

    public FramingProcessor framingprocessor = new FramingProcessor();

    //

    public ApplicationContainer() {
        //System.preinit(this);

        //System.init(this);
    }

    public ApplicationContainer enframe(String name, String namespace, String munctionname, String munctionurl, Queue<Frame> frames) {
        this.framingprocessor.addFrameSet(name, namespace, munctionname, munctionurl, frames);

        return this;
    }

    public ApplicationContainer enprocess(String name, String namespace, String munctionname, String munctionurl, Queue<Process> processes) {
        this.framingprocessor.addProcessSet(name, namespace, munctionname, munctionurl, processes);

        return this;
    }

    public ApplicationContainer enlist(String name, String namespace, String munctionname, String munctionurl, Queue<List> lists) {
        this.framingprocessor.addListSet(name, namespace, munctionname, munctionurl, lists);

        return this;
    }

    public ApplicationContainer enset(String name, String namespace, String munctionname, String munctionurl, Queue<Item> lists) {
        this.framingprocessor.addItemSet(name, namespace, munctionname, munctionurl, lists);

        return this;
    }

    //

    public ApplicationContainer deframe(String name, String namespace, String munctionname, String munctionurl, Queue<Frame> frames) {
        this.framingprocessor.removeFrameSet(name, namespace, munctionname, munctionurl, frames);

        return this;
    }

    public ApplicationContainer deprocess(String name, String namespace, String munctionname, String munctionurl, Queue<Process> processes) {
        this.framingprocessor.removeProcessSet(name, namespace, munctionname, munctionurl, processes);

        return this;
    }

    public ApplicationContainer delist(String name, String namespace, String munctionname, String munctionurl, Queue<List> lists) {
        this.framingprocessor.removeListSet(name, namespace, munctionname, munctionurl, lists);

        return this;
    }

    public ApplicationContainer deset(String name, String namespace, String munctionname, String munctionurl, Queue<Item> items) {
        this.framingprocessor.removeItemSet(name, namespace, munctionname, munctionurl, items);

        return this;
    }

    //

    public ApplicationContainer getframe(String username, String password, String name, String namespace, String modulename, String munctionname, String munctionurl, Queue<Frame> retval) {
        ApplicationContext context = this.applcontext;

        context
                .reference("{BASEDIR}/contexts/settings,xml", modulename)
                .setup("{SETUP}", this)
                .report("{REPORT}", this)
                .signal("{SIGNAL}", this)
                .state("{STATE}", this)
                .lists("{LISTS}", this)
                .exceptions("{EXCEPTIONS}", this);

        //

        MunctionProcessor processor = this.munctionprocessor.instance("retval", username, password, munctionname, munctionurl);

        processor
                .addcontext(context)
                .addhandler(STANDARD_EXCEPTION_HANDLER, "stderr", "munction://localhost")
                .trylock()
                .pull()
                .ref()
                .tryunlock()
                .close();

        //

        MunctionReporter reporter = processor.reporter;

        reporter
                .lock()
                .report()
                .free();

        //

        return this;
    }

    public ApplicationContainer getprocess(String username, String password, String name, String namespace, String modulename, String munctionname, String munctionurl, Queue<Process> retval) {
        ApplicationContext context = this.applcontext;

        context
                .reference("{BASEDIR}/contexts/settings,xml", modulename)
                .setup("{SETUP}", this)
                .report("{REPORT}", this)
                .signal("{SIGNAL}", this)
                .state("{STATE}", this)
                .lists("{LISTS}", this)
                .exceptions("{EXCEPTIONS}", this);

        //

        MunctionProcessor processor = this.munctionprocessor.instance("retval", username, password, munctionname, munctionurl);

        processor
                .addcontext(context)
                .addhandler(STANDARD_EXCEPTION_HANDLER, "stderr", "munction://localhost")
                .trylock() //fails then what
                .pull()
                .ref()
                .tryunlock()
                .close();

        //

        MunctionReporter reporter = processor.reporter;

        reporter
                .lock()
                .report()
                .free();

        //

        return this;
    }

    public ApplicationContainer getlist(String username, String password, String name, String namespace, String modulename, String munctionname, String munctionurl, Queue<List> retval) {
        ApplicationContext context = this.applcontext;

        context
                .reference("{BASEDIR}/contexts/settings,xml", modulename)
                .setup("{SETUP}", this)
                .report("{REPORT}", this)
                .signal("{SIGNAL}", this)
                .state("{STATE}", this)
                .lists("{LISTS}", this)
                .exceptions("{EXCEPTIONS}", this);

        //

        MunctionProcessor processor = this.munctionprocessor.instance("retval", username, password, munctionname, munctionurl);

        processor
                .addcontext(context)
                .addhandler(STANDARD_EXCEPTION_HANDLER, "stderr", "munction://localhost")
                .trylock()
                .pull()
                .ref()
                .tryunlock()
                .close();

        //

        MunctionReporter reporter = processor.reporter;

        reporter
                .lock()
                .report()
                .free();

        //

        return this;
    }
}
