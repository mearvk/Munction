package munction.modules.build;

public class ApplicationContext
{
	public String username;
	
	public String password;
	
	public ApplicationContext setusername(String username)
	{
		this.username = username;
		
		return this;
	}
	
	public ApplicationContext setpassword(String password)
	{
		this.password = password;
		
		return this;
	}
	
	public ApplicationContext setlocalname(String name)
	{
		return this;
	}
	
	public ApplicationContext setmoduleurl(String url)
	{
		return this;
	}
	
	public ApplicationContext setnamespace(String namespace)
	{
		return this;
	}
	
	public ApplicationContext setmodulename(String url)
	{
		return this;
	}
	
	public ApplicationContext setreference(String url, String modulename)
	{
		return this;
	}
	
	public ApplicationContext setup(String url, Object object)
	{
		return this;
	}
	
	public ApplicationContext report(String url, Object object)
	{
		return this;
	}
	
	public ApplicationContext lists(String url, Object object)
	{
		return this;
	}
	
	public ApplicationContext signal(String url, Object object)
	{
		return this;
	}
	
	public ApplicationContext state(String url, Object object)
	{
		return this;
	}
	
	public ApplicationContext exceptions(String url, Object object)
	{
		return this;
	}
	
	public ApplicationContext fail(String type)
	{
		return this;
	}
}
