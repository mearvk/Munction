package munction.modules.build.examples.chatprogram.components;

import munction.modules.build.examples.chatprogram.NullParent;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;

public class JComponentX extends JComponent
{
	public HashSet<Cord> cords = new HashSet();

	public JComponent jComponent = this;
	
	public JComponentX root(JConfigX config)
	{
		this.cords.add(new Cord(config, new NullParent()));

		return this;
	}
	
	public JComponentX cord(JConfigX config, JComponentX parent)
	{
		this.cords.add(new Cord(config, parent));

		return this;
	}

	public JComponentX cord(JConfigX config, JEventListenerX eventlistener)
	{
		this.cords.add(new Cord(config, eventlistener));

		return this;
	}
}
