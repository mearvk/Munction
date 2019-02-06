package munction.modules.build.examples.chatprogram;

import munction.modules.build.examples.chatprogram.components.*;

public class InterfaceContainer
{
    JFrameX jframe;

    JPanelX jpanelA;

    JPanelX jpanelB;

    JMenuBarX jmenubarA;

    JMenuX jmenuA;

    JMenuX jmenuB;

    JButtonX jbuttonA;

    JButtonX jbuttonB;

    JButtonX jbuttonC;

    public InterfaceContainer()
    {
        InitializationStrategy initstrategy = new InitializationStrategy(this);

        initstrategy.container.jframe.cord(jframe, null);

        initstrategy.container.jframe.cord(jmenubarA, jframe);

        initstrategy.container.jframe.cord(jmenuA, jmenubarA);

        initstrategy.container.jframe.cord(jmenuB, jmenubarA);

        initstrategy.container.jframe.cord(jpanelA, jframe);

        initstrategy.container.jframe.cord(jpanelB, jframe);

        initstrategy.container.jframe.cord(jbuttonA, jpanelA);

        initstrategy.container.jframe.cord(jbuttonB, jframe);

        initstrategy.container.jframe.cord(jbuttonC, jframe);

        //

        initstrategy.loose();

        initstrategy.run();
    }
}

class InitializationStrategy extends Thread
{
    public Thread thread;

    public InterfaceContainer container;

    //

    public InitializationStrategy(InterfaceContainer container)
    {
        this.container = container;
    }

    //

    public InitializationStrategy loose()
    {
        return this;
    }

    public InitializationStrategy tight()
    {
        return this;
    }
}


