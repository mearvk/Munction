package munction;

import atomscripts.ASNought;
import components.Builder;
import components.Connector;
import components.Enhancer;
import components.Persistor;
import helpers.CallbackHandler;
import helpers.Documenter;
import helpers.Options;
import helpers.SwingObject;
import system.startup.Startup;

import javax.swing.*;

public class Munction extends MunctionAtom
{
    public static void main(String...args)
    {
        Startup startup = new Startup();
    }
}

class MunctionAtom
{
    public ASNought.BuilderContainer container = null;

    public Builder builder = null;

    public Enhancer enhancer = null;

    public Connector connector = null;

    public Persistor persistor = null;

    //

    public MunctionAtom()
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

        container.serialize(container, component, object, handler); //pre-process object for munction.Munction, RMI, etc.
    }

    public void addDocument(Documenter documenter, ASNought.BuildContainer container, JComponent component, SwingObject object, CallbackHandler handler, Options options)
    {
        documenter.reference(container, component, object, handler, options); //store information for meta-documentation of product

        documenter.serialize(container, component, object, handler, options); //process object for munction.Munction, RMI, etc.
    }
}