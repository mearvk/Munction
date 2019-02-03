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

    public ApplicationContainer frame(String name, String namespace, String munctionname, String munctionurl, Queue<Frame> frames)
    {
        return this;
    }

    public ApplicationContainer process(String name, String namespace, String munctionname, String munctionurl, Queue<Process> processes)
    {
        return this;
    }
}
