package theoretical;

import java.util.ArrayList;

public class NetworkDoor extends NetworkContainerAtom
{
    public NetworkDoor()
    {

    }
}

class NetworkContainerAtom
{
    ArrayList<NetworkDoor> networkcontainers = new ArrayList();

    public NetworkDoor networkcontainer001;

    public NetworkDoor networkcontainer002;
}
