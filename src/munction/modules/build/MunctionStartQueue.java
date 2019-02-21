package munction.modules.build;

public class MunctionStartQueue
{
    public static MunctionStartQueue reference = new MunctionStartQueue();

    public MunctionStartQueueExtender extender = new MunctionStartQueueExtender(reference);

    //

    public static MunctionStartQueue lazy()
    {
        return reference;
    }

    public MunctionStartQueue enqueue(Runnable runnable)
    {
        return reference;
    }

    public MunctionStartQueue enqueue(Thread thread)
    {
        return reference;
    }

    public MunctionStartQueue enqueue(MunctionWorkUnit unit)
    {
        return reference;
    }
}
