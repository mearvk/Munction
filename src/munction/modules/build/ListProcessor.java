package munction.modules.build;

import java.util.HashMap;

public class ListProcessor
{
    public HashMap<String, List> list = new HashMap<>();

    public HashMap<String, ListProcessor> processor = new HashMap<>();

    public List getList(String name)
    {
        return this.list.get(name);
    }

    public void addList(String name, List list)
    {

    }
}
