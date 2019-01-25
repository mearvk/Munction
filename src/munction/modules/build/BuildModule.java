package munction.modules.build;

import munction.modules.atoms.AbstractFunctionalAtom;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import system.Presystem;
import system.System;
import system.handlers.RegisteredHandler;

public class BuildModule extends BuildModuleAtom
{
    public Presystem presystem;

    public System system;

    public BuildModule(Presystem presystem, System system)
    {
        this.presystem = presystem;

        this.system = system;
    }

    static
    {

    }

    public void setRegistered()
    {
        java.lang.System.out.println("  >> Build module v."+ BuildModuleAtom.version+" registered");
    }

    public void unsetRegistered()
    {
        java.lang.System.out.println("  >> Build module v."+BuildModuleAtom.version+" unregistered");
    }

    @Override
    public void process()
    {
        BeanFactory factory = new ClassPathXmlApplicationContext("build.xml");

        //

        java.lang.System.out.println("Munction Build Document Loading:");

        //

        munction.modules.build.Presystem presystem = (munction.modules.build.Presystem)factory.getBean("builder.presystem");

        munction.modules.build.System system = (munction.modules.build.System)factory.getBean("builder.system");

        //

        UserInterfaceInterpreter userinterpreter = (UserInterfaceInterpreter)factory.getBean("builder.interface");

        ApplicationInterpreter applicationinterpreter = (ApplicationInterpreter)factory.getBean("builder.application");

        //

        presystem.addObject(userinterpreter, new RegisteredHandler());

        presystem.addObject(applicationinterpreter, new RegisteredHandler());

        //

        system.addObject(userinterpreter, new RegisteredHandler());

        system.addObject(applicationinterpreter, new RegisteredHandler());

        //

        userinterpreter.setRegistered();

        applicationinterpreter.setRegistered();

        //

        //callback based on settings
    }
}

class BuildModuleAtom extends AbstractFunctionalAtom
{
    public static final String version = "1.01";
}