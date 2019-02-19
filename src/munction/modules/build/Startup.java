package munction.modules.build;

public class Startup
{
	public Startup()
	{
		MunctionContainer munction = new MunctionContainer("munction","chatprogram","org.mearvk.builds.chatprogram001","./settings/config.project.xml");
	}
	
	public static void main(String... args)
	{
		Startup startup = new Startup();
	}
}
