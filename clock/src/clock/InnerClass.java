package clock;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;


public class InnerClass {

/**
 * this promgram demostrate the use of inner class.
 * @version 1.11 2015-05-12
 * @author wsguo
 */
	public static void  main(String[] agrs)
	{
		TalkingClock clock= new TalkingClock(10,true);
		clock.start();
		
		//keep program runinng until user selects "ok"
		JOptionPane.showMessageDialog(null,"Quit proram");
	}
}
