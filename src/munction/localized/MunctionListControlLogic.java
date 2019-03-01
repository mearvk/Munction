package munction.localized;

import java.util.ArrayList;

public class MunctionListControlLogic
{
    public MunctionDriverList driverlist = new MunctionDriverList();

    //

    public MunctionListControlLogic(MunctionListControlExtender extender, String bodiname, String bodinamespace, String classname)
    {
        Bodi.pull(bodiname, bodiname, classname);
    }

    public boolean add(ArrayList list, Object o)
    {
        return true;
    }
}
