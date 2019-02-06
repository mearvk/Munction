package munction.modules.build;

public class MunctionProcessor {
    //write these up for a factory and dynamic [source generated at runtime] solution set

    public static final Integer STANDARD_EXCEPTION_HANDLER = 0;

    public static final Integer LOCALE_EXCEPTION_HANDLER = 1;

    //

    public Integer procid = 0x0000;

    //

    public MunctionReporter reporter = new MunctionReporter();

    //

    public MunctionProcessor instance(String userref, String username, String password, String munctionname, String munctionurl) {
        return new MunctionProcessor();
    }

    public MunctionProcessor addhandler(Integer type, String munctionname, String munctionurl) {
        return this;
    }

    public MunctionProcessor addcontext(ApplicationContext context) {
        return this;
    }

    public MunctionProcessor trylock() {
        return this;
    }

    public MunctionProcessor trylock(String username, String password) {
        return this;
    }

    public MunctionProcessor asset(String name, String munctionname, String munctionurl) {
        return this;
    }

    public MunctionProcessor pull(String name, String munctionname, String munctionurl) {
        return this;
    }

    public MunctionProcessor pull() {
        return this;
    }

    public MunctionProcessor ref(String name, Object assignation) {
        return this;
    }

    public MunctionProcessor ref() {
        return this;
    }

    public MunctionProcessor tryunlock() {
        return this;
    }

    public MunctionProcessor tryunlock(String name, Object assignation) {
        return this;
    }

    public MunctionProcessor close() {
        return this;
    }

    //

    public MunctionReporter reporter() {
        return this.reporter;
    }
}
