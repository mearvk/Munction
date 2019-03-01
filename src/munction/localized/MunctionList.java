package munction.localized;

import java.util.ArrayList;

public class MunctionList<Type> extends ArrayList<Type>
{
    MunctionListControlExtender controller = new MunctionListControlExtender();

    @Override
    public boolean add(Object o)
    {
        controller.logic.add(this, o);

        //

        return true;
    }
}
