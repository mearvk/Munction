package munction.modules.build.examples.chatprogram;

import munction.modules.build.examples.chatprogram.components.*;

public class InterfaceContainer {
    JFrameX jframe;

    JPanelX jpanelA;

    JPanelX jpanelB;

    JMenuBarX jmenubarA;

    JMenuX jmenuA;

    JMenuX jmenuB;

    JButtonX jbuttonA;

    JButtonX jbuttonB;

    JButtonX jbuttonC;

    public InterfaceContainer() {
        InitializationStrategy initstrategy = new InitializationStrategy(this);

        initstrategy.container.jframe.cord(new JConfigX("{DEFAULT}", "{MUNCTION}"), null);

        initstrategy.container.jframe.cord(new JConfigX("{DEFAULT}", "{MUNCTION}"), jmenubarA);

        initstrategy.container.jframe.cord(new JConfigX("{DEFAULT}", "{MUNCTION}"), jpanelA);

        initstrategy.container.jframe.cord(new JConfigX("{DEFAULT}", "{MUNCTION}"), jpanelB);

        initstrategy.container.jmenubarA.cord(new JConfigX("{DEFAULT}", "{MUNCTION}"), jmenuA);

        initstrategy.container.jmenubarA.cord(new JConfigX("{DEFAULT}", "{MUNCTION}"), jmenuB);

        initstrategy.container.jpanelA.cord(new JConfigX("{DEFAULT}", "{MUNCTION}"), jbuttonA);

        initstrategy.container.jpanelA.cord(new JConfigX("{DEFAULT}", "{MUNCTION}"), jbuttonB);

        initstrategy.container.jpanelA.cord(new JConfigX("{DEFAULT}", "{MUNCTION}"), jbuttonC);

        //

        initstrategy.loose();

        initstrategy.run();
    }
}

class InitializationStrategy extends Thread {
    public Thread thread;

    public InterfaceContainer container;

    //

    public InitializationStrategy(InterfaceContainer container) {
        this.container = container;
    }

    //

    public InitializationStrategy loose() {
        return this;
    }

    public InitializationStrategy tight() {
        return this;
    }
}


