package munction.modules.build.components;

import java.util.ArrayList;

public class Cord
{
    public String componentname;

    public String parentname;

    public ArrayList<String> classnames = new ArrayList();

    //

    public JConfigX config;

    public JConfigFileX configfile;

    public JComponentX component;

    //

    public Cord()
    {
        
    }
    
    public Cord(JConfigFileX config, JEventListenerX eventlistener)
    {

    }

    public Cord(JConfigX config, JEventListenerX eventlistener)
    {

    }

    public Cord(JConfigX config, JComponentX component)
    {

    }
    
    //
    
    public void setComponent(JConfigX config, JComponentX component)
    {
        
    }

    public void setComponent(String component) {
    }
}
