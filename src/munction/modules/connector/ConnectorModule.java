package munction.modules.connector;

import munction.modules.atoms.AbstractFunctionalAtom;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import system.Presystem;
import system.System;
import system.handlers.RegisteredHandler;

public class ConnectorModule extends ConnectorModuleAtom {
    public Presystem presystem;

    public System system;

    public ConnectorModule(Presystem presystem, System system) {
        this.presystem = presystem;

        this.system = system;
    }

    static {

    }

    public void setRegistered() {
        java.lang.System.out.println("  >> Enhancement module loaded");
    }

    public void unsetRegistered() {
        java.lang.System.out.println("  >> Enhancement module loaded");
    }

    @Override
    public void process() {
        BeanFactory factory = new ClassPathXmlApplicationContext("enhancement.xml");

        //

        java.lang.System.out.println("Munction [Connector Document]:");

        //

        munction.modules.connector.Presystem presystem = (munction.modules.connector.Presystem) factory.getBean("enhancer.presystem");

        munction.modules.connector.System system = (munction.modules.connector.System) factory.getBean("enhancer.system");

        //

        StandardConnector standardenhancer = (StandardConnector) factory.getBean("enhancer.standard");

        CustomConnector customenhancer = (CustomConnector) factory.getBean("enhancer.custom");

        //

        presystem.addObject(standardenhancer, new RegisteredHandler());

        presystem.addObject(customenhancer, new RegisteredHandler());

        //

        system.addObject(standardenhancer, new RegisteredHandler());

        system.addObject(customenhancer, new RegisteredHandler());

        //

        standardenhancer.setRegistered();

        customenhancer.setRegistered();

        //

        java.lang.System.out.println("  >> Munction functional enhancement callbacks set");
    }
}

class ConnectorModuleAtom extends AbstractFunctionalAtom {
    public static final String version = "1.001";
}
