package munction.modules.build;

import java.util.ArrayList;
import java.util.Queue;

public class FramingProcessor
{
	public FramingSettingsReader reader;

	//

	public ArrayList<Queue<Process>> processes = new ArrayList<>();
	
	public ArrayList<Queue<Item>> items = new ArrayList<>();
	
	public ArrayList<Queue<Frame>> frames = new ArrayList<>();
	
	public ArrayList<Queue<List>> lists = new ArrayList<>();
	
	//

	public FramingProcessor()
	{
		reader = new FramingSettingsReader("./settings/config/framingmonitor.xml");
	}

	//
	
	public void addProcessSet(String name, String namespace, String munctionname, String munctionurl, Queue<Process> processes)
	{
		this.processes.add(processes);
	}
	
	public void addFrameSet(String name, String namespace, String munctionname, String munctionurl, Queue<Frame> frames)
	{
		this.frames.add(frames);
	}
	
	public void addListSet(String name, String namespace, String munctionname, String munctionurl, Queue<List> lists)
	{
		this.lists.add(lists);
	}
	
	public void addItemSet(String name, String namespace, String munctionname, String munctionurl, Queue<Item> items)
	{
		this.items.add(items);
	}
	
	//
	
	public void removeProcessSet(String name, String namespace, String munctionname, String munctionurl, Queue<Process> processes)
	{
		this.processes.remove(processes);
	}
	
	public void removeFrameSet(String name, String namespace, String munctionname, String munctionurl, Queue<Frame> frames)
	{
		this.frames.remove(frames);
	}
	
	public void removeListSet(String name, String namespace, String munctionname, String munctionurl, Queue<List> lists)
	{
		this.lists.remove(lists);
	}
	
	public void removeItemSet(String name, String namespace, String munctionname, String munctionurl, Queue<Item> items)
	{
		this.items.remove(items);
	}
}

