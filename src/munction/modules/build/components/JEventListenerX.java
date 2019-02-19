package munction.modules.build.components;

import java.util.ArrayList;

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

    class ClassTokenizer
    {
        public void tokenize(String input, ArrayList<String> output)
        {
            String[] tokens = input.split(",");

            for(int i=0; i<tokens.length; i++)
            {
                output.add(tokens[i]);
            }
        }
    }
}
