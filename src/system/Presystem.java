package system;

import system.handlers.RegisteredHandler;

import java.util.ArrayList;

public class Presystem
{
    ArrayList<RegisteredHandler> handlers = new ArrayList();

    public static Presystem staticpresystem;

    public static System staticsystem;

    public Presystem presystem;

    public System system;

    public Presystem()
    {
        this.presystem = this;
    }

    static
    {
        staticpresystem = new Presystem();
    }

    public void addObject(Object object, RegisteredHandler handler)
    {
        this.handlers.add(handler);

        handler.addObject(object);

        //java.lang.System.out.println("Presystem accepts ["+object+"]");
    }
}
