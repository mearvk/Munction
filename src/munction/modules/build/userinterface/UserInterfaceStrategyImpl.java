package munction.modules.build.userinterface;

import munction.modules.build.examples.chatprogram.UserInterfaceSettingsReader;

public class UserInterfaceStrategyImpl
{
    public String fileURL = "./settings/config/ui.xml";

    public UserInterfaceSettingsReader reader = new UserInterfaceSettingsReader();

    public UserInterfaceBuilder builder = new UserInterfaceBuilder();

    //

    public UserInterfaceStrategyImpl()
    {
        reader
                .ref(this)
                .scan()
                .process()
                .close();

        builder
                .ref(this)
                .scan()
                .process()
                .close();
    }
}
