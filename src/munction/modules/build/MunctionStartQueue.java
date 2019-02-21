package munction.modules.build;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MunctionStartQueue
{
    public static MunctionStartQueue reference = new MunctionStartQueue();

    public MunctionStartQueueExtender extender = new MunctionStartQueueExtender(reference);

    public Queue<Thread> runnables = new ConcurrentLinkedQueue<>();

    //

    public static MunctionStartQueue befeel()
    {
        return reference;
    }

    public MunctionStartQueue enqueue(Runnable runnable)
    {
        return reference;
    }

    public MunctionStartQueue enqueue(Thread thread)
    {
        this.runnables.add(thread);

        return reference;
    }

    public MunctionStartQueue start()
    {
        for(Thread thread : this.runnables)
        {
            thread.start();
        }

        return reference;
    }

    public MunctionStartQueue enqueue(MunctionWorkUnit unit)
    {
        return reference;
    }
}
