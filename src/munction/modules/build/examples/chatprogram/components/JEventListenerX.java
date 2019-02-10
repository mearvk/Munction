package munction.modules.build.examples.chatprogram.components;

public class JEventListenerX
{
    public String munctionclass;

    public String munctionname;

    public String munctionurl;

    //

    public JEventListenerX(String munctionclass, String munctionname, String munctionurl)
    {
        this.munctionclass = munctionclass;

        this.munctionname = munctionname;

        this.munctionurl = munctionurl;
    }

    public JEventListenerX(String munctionclass)
    {
        this.munctionclass = munctionclass;

        this.munctionname = "{STANDARD}";

        this.munctionurl = "{STANDARD}";
    }

}
