package munction.modules.build;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MunctionStartQueue
{
    public static MunctionStartQueue reference = new MunctionStartQueue();

    public static Queue<Thread> runnables = new ArrayBlockingQueue(100);

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

        try{Thread.sleep(1000);}catch(Exception e){}

        return reference;
    }

    public MunctionStartQueue start()
    {
        for(Thread thread : this.runnables)
        {
            thread.start();

            java.lang.System.out.println("MunctionStartQueue working...");

            this.runnables.remove(thread);
        }

        return reference;
    }

    public MunctionStartQueue enqueue(MunctionWorkUnit unit)
    {
        return reference;
    }
}
