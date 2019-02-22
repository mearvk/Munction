package system.handlers;

import theoretical.MunctionProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ProjectFileHandler
{
    private String startupURL;

    private File startupFile;

    protected ArrayList<MunctionProject> projects = null;

    //

    public ProjectFileHandler()
    {

    }

    public ProjectFileHandler(String startupURL) throws FileNotFoundException
    {
        this.startupURL = startupURL;

        this.startupFile = new File(this.startupURL);
    }

    public void setprojectfile(String startupURL)
    {
        this.startupURL = startupURL;
    }

    public void setprojectlist(ArrayList<MunctionProject> projects)
    {
        this.projects = projects;
    }

    public void build()
    {

    }
}
