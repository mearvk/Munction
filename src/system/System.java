package system;

import system.handlers.RegisteredHandler;

import java.util.ArrayList;

public class System {
    ArrayList<RegisteredHandler> handlers = new ArrayList();

    public static System staticsystem;

    public Presystem presystem;

    public System system;

    static {
        System.staticsystem = new System();
    }

    public System() {
        this.system = this;
    }

    public System(Presystem presystem) {
        this.presystem = presystem;

        this.system = this;
    }

    public void addObject(Object object, RegisteredHandler handler) {
        this.handlers.add(handler);

        handler.addObject(object);

        //java.lang.System.out.println("System accepts ["+object+"]");
    }
}
