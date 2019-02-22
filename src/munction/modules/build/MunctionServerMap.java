package munction.modules.build;

import java.util.HashMap;

public class MunctionServerMap<K,V> extends HashMap<K,V>
{
    @Override
    public V put(K key, V value)
    {
        java.lang.System.out.println("[server] instantiation ["+key+","+value+"]");

        return value;
    }

    @Override
    public V get(Object key)
    {
        Object value = null;

        value = this.get(key);

        java.lang.System.out.println("[server] instantiation ["+key+","+value+"]");

        return (V)value;
    }
}
