package munction.modules.persistence;

import munction.modules.atoms.AbstractFunctionalAtom;
import munction.modules.enhancement.CustomEnhancer;
import munction.modules.enhancement.StandardEnhancer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import system.Presystem;
import system.System;
import system.handlers.RegisteredHandler;

public class PersistenceModule
{
    public Presystem presystem;

    public System system;

    public PersistenceModule(Presystem presystem, System system)
    {
        this.presystem = presystem;

        this.system = system;
    }

    static
    {

    }

    public void setRegistered()
    {
        java.lang.System.out.println("  >> Persistence module loaded");
    }

    public void unsetRegistered()
    {
        java.lang.System.out.println("  >> Persistence module loaded");
    }

    public void process()
    {
        BeanFactory factory = new ClassPathXmlApplicationContext("enhancement.xml");

        //

        java.lang.System.out.println("Munction [Persistence Document]:");

        //

        munction.modules.persistence.Presystem presystem = (munction.modules.persistence.Presystem)factory.getBean("persistence.presystem");

        munction.modules.persistence.System system = (munction.modules.persistence.System)factory.getBean("persistence.system");

        //

        StandardPersistor standardpersistor = (StandardPersistor)factory.getBean("persistence.standard");

        CustomPersistor custompersistor = (CustomPersistor)factory.getBean("persistence.custom");

        //

        presystem.addObject(standardpersistor, new RegisteredHandler());

        presystem.addObject(custompersistor, new RegisteredHandler());

        //

        system.addObject(standardpersistor, new RegisteredHandler());

        system.addObject(custompersistor, new RegisteredHandler());

        //

        standardpersistor.setRegistered();

        custompersistor.setRegistered();

        //

        java.lang.System.out.println("  >> Munction functional enhancement callbacks set");
    }
}

class PersistenceModuleAtom extends AbstractFunctionalAtom
{
    public static final String version = "1.001";
}
