package munction.modules.build.examples.chatprogram;

import java.util.ArrayList;

public class NetworkContainer extends NetworkContainerAtom
{
    public NetworkContainer()
    {

    }
}

class NetworkContainerAtom
{
    ArrayList<NetworkContainer> networkcontainers = new ArrayList();

    public NetworkContainer networkcontainer001;

    public NetworkContainer networkcontainer002;
}
