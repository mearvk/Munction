package munction.modules;

import atomscripts.ASNought;
import components.Builder;
import components.Connector;
import components.Enhancer;
import components.Persistor;
import helpers.CallbackHandler;
import helpers.Documenter;
import helpers.Options;
import helpers.SwingObject;
import system.Presystem;
import system.System;

import javax.swing.*;

public class MunctionModule extends MunctionModuleAtom
{
    public Presystem presystem;

    public System system;

    public MunctionModule(Presystem presystem, System system)
    {
        this.presystem = presystem;

        this.system = system;
    }

    static
    {

    }

    public void setRegistered()
    {
        java.lang.System.out.println("  >> Munction module v."+ MunctionModuleAtom.version+" registered");
    }

    public void unsetRegistered()
    {
        java.lang.System.out.println("  >> Munction module v."+ MunctionModuleAtom.version+" unregistered");
    }
}

class MunctionModuleAtom
{
    public static final String version = "1.001";

    public ASNought.BuilderContainer container = null;

    public Builder builder = null;

    public Enhancer enhancer = null;

    public Connector connector = null;

    public Persistor persistor = null;

    //

    public MunctionModuleAtom()
    {
        this.builder = null;

        this.container = null;

        this.enhancer = null;

        this.connector = null;

        this.persistor = null;
    }

    public void addComponent(ASNought.BuildContainer container, JComponent component, SwingObject object, CallbackHandler handler)
    {
        container.reference(container, component, object, handler); //store information for meta-documentation of product

        container.serialize(container, component, object, handler); //pre-process object for munction.modules.MunctionModule, RMI, etc.
    }

    public void addDocument(Documenter documenter, ASNought.BuildContainer container, JComponent component, SwingObject object, CallbackHandler handler, Options options)
    {
        documenter.reference(container, component, object, handler, options); //store information for meta-documentation of product

        documenter.serialize(container, component, object, handler, options); //process object for munction.modules.MunctionModule, RMI, etc.
    }
}