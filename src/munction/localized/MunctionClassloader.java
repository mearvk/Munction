package munction.localized;

public class MunctionClassloader extends ClassLoader
{
    StandardMunctionClassloaderExtender extender = new StandardMunctionClassloaderExtender();

    public void load(String classname)
    {
        this.extender.standardload(classname);
    }
}
