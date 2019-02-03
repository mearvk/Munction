package munction.modules.build;

public class MunctionProcessor
{
    //write these up for a factory and dynamic [source generated at runtime] solution set

    public static final Integer STANDARD_EXCEPTION_HANDLER = 0;

    public static final Integer LOCALE_EXCEPTION_HANDLER = 1;

    //

    public Integer procid = 0x0000;

    //

    public MunctionReporter reporter = new MunctionReporter();

    //

    public MunctionProcessor instance()
    {
        return new MunctionProcessor();
    }

    public MunctionProcessor addhandler(Integer type)
    {
        return this;
    }

    public MunctionProcessor trylock(String username, String password)
    {
        return this;
    }

    public MunctionProcessor asset(String name, String munctionname, String munctionurl)
    {
        return this;
    }

    public MunctionProcessor pull(String name, String munctionname, String munctionurl)
    {
        return this;
    }

    public MunctionProcessor ref(String name, Object assignation)
    {
        return this;
    }

    public MunctionProcessor freelock(String name, Object assignation)
    {
        return this;
    }

    public MunctionProcessor close()
    {
        return this;
    }

    //

    public MunctionReporter reporter()
    {
        return this.reporter;
    }
}
