package munction.modules.build;

import java.math.BigInteger;
import java.util.*;

public class MunctionProcessor extends MunctionProcessorAtom
{
	//write these up for a factory and dynamic [source generated at runtime] solution set
	
	public static final Integer MUNCTION_HANDLER = 0;
	
	//
	
	public BigInteger framesetid;
	
	//
	
	public ArrayList<Frameset> framesets = new ArrayList<Frameset>();
	
	//
	
	
	
	//
	
	public MunctionReporter reporter = new MunctionReporter();
	
	//
	
	public MunctionProcessor instance(String refref, String frameref, String username, String password, String munctionname, String munctionurl)
	{
		return new MunctionProcessor();
	}
	
	public MunctionProcessor instance(String refref, String username, String password, String munctionname, String munctionurl)
	{
		return new MunctionProcessor();
	}
	
	public MunctionProcessor addframe()
	{
		this.framesets.add(new Frameset(this));
		
		return this;
	}
	
	public MunctionProcessor sethandler(Integer type, String munctionname, String munctionurl)
	{
		super.sethandler(type, munctionname, munctionurl);
		
		return this;
	}
	
	public MunctionProcessor setcontext(ApplicationContext context)
	{
		super.setcontext(context);
		
		return this;
	}
	
	public MunctionProcessor lock()
	{
		super.lock();
		
		return this;
	}
	
	public MunctionProcessor flush()
	{
		super.flush();
		
		return this;
	}
	
	public MunctionProcessor sed()
	{
		super.sed();
		
		return this;
	}
	
	public MunctionProcessor lock(String username, String password)
	{
		super.lock();
		
		return this;
	}
	
	public MunctionProcessor asset(String name, String munctionname, String munctionurl)
	{
		super.asset(name,munctionname,munctionurl);
		
		return this;
	}
	
	public MunctionProcessor cycle(String name, String munctionname, String munctionurl)
	{
		super.cycle(name, munctionname, munctionurl);
		
		return this;
	}
	
	public MunctionProcessor cycle()
	{
		super.cycle();
		
		return this;
	}
	
	public MunctionProcessor pullnotify()
	{
		super.pullnotify();
		
		return this;
	}
	
	public MunctionProcessor ref(String name, Object assignation)
	{
		super.ref(name, assignation);
		
		return this;
	}
	
	public MunctionProcessor ref()
	{
		super.ref();
		
		return this;
	}
	
	public MunctionProcessor unlock()
	{
		super.unlock();
		
		return this;
	}
	
	public MunctionProcessor unlock(String name, Object assignation)
	{
		super.unlock(name, assignation);
		
		return this;
	}
	
	public MunctionProcessor close()
	{
		super.close();
		
		return this;
	}
	
	//
	
	public MunctionReporter reporter()
	{
		return this.reporter;
	}
}



class MunctionProcessorAtom
{
	public MunctionProcessorAtom sethandler(Integer type, String munctionname, String munctionurl)
	{
		return this;
	}
	
	public MunctionProcessorAtom setcontext(ApplicationContext context)
	{
		return this;
	}
	
	public MunctionProcessorAtom flush(){ return this; }
	
	public MunctionProcessorAtom lock()
	{
		return this;
	}
	
	public MunctionProcessorAtom sed() { return this; }
	
	public MunctionProcessorAtom lock(String username, String password)
	{
		return this;
	}
	
	public MunctionProcessorAtom asset(String name, String munctionname, String munctionurl)
	{
		return this;
	}
	
	public MunctionProcessorAtom cycle(String name, String munctionname, String munctionurl)
	{
		return this;
	}
	
	public MunctionProcessorAtom cycle() { return this; }
	
	public MunctionProcessorAtom pullnotify() { return this; }
	
	public MunctionProcessorAtom ref(String name, Object assignation)
	{
		return this;
	}
	
	public MunctionProcessorAtom ref()
	{
		return this;
	}
	
	public MunctionProcessorAtom unlock()
	{
		return this;
	}
	
	public MunctionProcessorAtom unlock(String name, Object assignation)
	{
		return this;
	}
	
	public MunctionProcessorAtom close()
	{
		return this;
	}
	
	//
	
	public MunctionReporter reporter()
	{
		return null;
		
		//return this.reporter;
	}
}

class Frameset
{
	public ArrayList<StackTraceElement[]> frameset = new ArrayList();
	
	public Integer procid = 0x0000;
	
	//
	
	public MunctionProcessor processor;
	
	//
	
	public Frameset(MunctionProcessor processor)
	{
		this.processor = processor;
	}
	
}