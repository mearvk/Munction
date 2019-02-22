package theoretical.userinterface;

import theoretical.examples.chatprogram.UserInterfaceSettingsReader;

public class UserInterfaceStrategyImpl
{
    public String fileURL = "./settings/config/ui.xml";

    public UserInterfaceSettingsReader reader = new UserInterfaceSettingsReader();

    public UserInterfaceBuilder builder = new UserInterfaceBuilder();

    //

    public UserInterfaceStrategyImpl()
    {

    }
}
