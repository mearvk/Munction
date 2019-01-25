package munction.modules.enhancement;

import munction.modules.atoms.AbstractFunctionalAtom;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import system.Presystem;
import system.System;
import system.handlers.RegisteredHandler;

public class EnhancementModule extends EnhancementModuleAtom
{
    public Presystem presystem;

    public System system;

    public EnhancementModule(Presystem presystem, System system)
    {
        this.presystem = presystem;

        this.system = system;
    }

    static
    {

    }

    public void setRegistered()
    {
        java.lang.System.out.println("  >> Enhancement module v."+EnhancementModuleAtom.version+" registered");
    }

    public void unsetRegistered()
    {
        java.lang.System.out.println("  >> Enhancement module v."+EnhancementModuleAtom.version+" registered");
    }

    @Override
    public void process()
    {
        BeanFactory factory = new ClassPathXmlApplicationContext("enhancement.xml");

        //

        java.lang.System.out.println("Munction Enhancement Document Loading:");

        //

        munction.modules.enhancement.Presystem presystem = (munction.modules.enhancement.Presystem)factory.getBean("enhancer.presystem");

        munction.modules.enhancement.System system = (munction.modules.enhancement.System)factory.getBean("enhancer.system");

        //

        StandardEnhancement standardenhancer = (StandardEnhancement)factory.getBean("enhancer.standard");

        CustomEnhancement customenhancer = (CustomEnhancement)factory.getBean("enhancer.custom");

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

class EnhancementModuleAtom extends AbstractFunctionalAtom
{
    public static final String version = "1.001";
}
