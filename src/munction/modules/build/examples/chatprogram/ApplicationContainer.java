package munction.modules.build.examples.chatprogram;

import munction.modules.build.CallbackProcessor;
import munction.modules.build.ListProcessor;
import munction.modules.build.MunctionProcessor;

public class ApplicationContainer
{
    public ListProcessor listprocessor = new ListProcessor();

    public CallbackProcessor callbackprocessor = new CallbackProcessor();

    public MunctionProcessor munctionprocessor = new MunctionProcessor();

    public ApplicationContainer()
    {

    }
}
