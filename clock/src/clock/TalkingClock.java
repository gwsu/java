package clock;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;


public class TalkingClock {
	
	private int interval;
	private boolean beep;
	
	public TalkingClock(int interal,boolean beep)
	{
		this.interval = interal;
		this.beep =beep;
		
	}
	
	public void start()
	{
	
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval,listener);
		t.start();
		
	}
	
	public class TimePrinter implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
		System.out.println("At the tone,the time is" + new Date());
		if (beep) Toolkit.getDefaultToolkit().beep();
		}
		
	}

}
