package theoretical.examples.chatprogram;

import theoretical.userinterface.UserInterfaceStrategyImpl;

public class UserInterfaceSettingsReader
{
    public UserInterfaceStrategyImpl impl;

    public UserInterfaceSettingsReader ref(UserInterfaceStrategyImpl impl)
    {
        this.impl = impl;

        return this;
    }

    public UserInterfaceSettingsReader process()
    {
        return this;
    }

    public UserInterfaceSettingsReader ready()
    {
        return this;
    }

    public UserInterfaceSettingsReader scan()
    {
        return this;
    }

    public UserInterfaceSettingsReader close()
    {
        return this;
    }
}
