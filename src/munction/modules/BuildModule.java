package munction.modules;

import munction.modules.atoms.AbstractFunctionalAtom;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import system.Presystem;
import system.System;

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


    }
}

class BuildModuleAtom extends AbstractFunctionalAtom
{
    public static final String version = "1.01";
}