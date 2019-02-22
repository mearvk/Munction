package theoretical.userinterface;

import com.sun.codemodel.JCodeModel;
import theoretical.examples.chatprogram.UserInterfaceSettingsReader;

public class UserInterfaceBuilder
{
    public UserInterfaceSettingsReader reader = new UserInterfaceSettingsReader();

    public UserInterfaceStrategyImpl impl = new UserInterfaceStrategyImpl();

    //

    public UserInterfaceBuilder()
    {
        System.out.println();
    }

    public UserInterfaceBuilder ref(UserInterfaceStrategyImpl impl)
    {
        this.impl = impl;

        return this;
    }

    public UserInterfaceBuilder ready()
    {
        return this;
    }

    public UserInterfaceBuilder scan()
    {
        return this;
    }

    public UserInterfaceBuilder close()
    {
        return this;
    }


    public UserInterfaceBuilder process()
    {
        JCodeModel codeModel = new JCodeModel();

        return this;
    }
}
