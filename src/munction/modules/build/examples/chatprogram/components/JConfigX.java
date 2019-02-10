package munction.modules.build.examples.chatprogram.components;

public class JConfigX
{
	public String munctionname;

	public String munctionurl;

	//

	public JConfigX(String url)
	{
	
	}

	public JConfigX()
	{
		this("{STANDARD}","{STANDARD}");
	}

	public JConfigX(JConfigFileX file)
	{
		this("{STANDARD}","{STANDARD}");
	}

	public JConfigX(String munctionname, String munctionurl)
	{
		this.munctionname = munctionname;

		this.munctionurl = munctionurl;
	}
	
}
