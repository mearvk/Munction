package munction.modules.build.examples.chatprogram;

public class MunctionContainer extends MunctionContainerAtom
{
    public MunctionContainer()
    {

    }
}

class MunctionContainerAtom
{
    public InterfaceContainer userinterface = new InterfaceContainer();

    public ApplicationContainer application = new ApplicationContainer();
}

