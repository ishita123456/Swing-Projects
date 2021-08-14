import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Menu1
{
	public static void main(String[] args)
	{
		Smenu ob = new Smenu();
		ob.setVisible(true);
		ob.setSize(500,500);
	}
}

class Smenu extends JFrame implements ActionListener
{
	Smenu(){
		setLayout(new FlowLayout());
		//JFrame f = new JFrame("Menu Demo");
		JMenuItem m1 = new JMenuItem("New");
		JMenuItem m2 = new JMenuItem("Open");
		JMenuItem m3 = new JMenuItem("Save");
		JMenu file = new JMenu("File");
		add(m1);
		add(m2);
		add(m3);
		JMenuBar br = new JMenuBar();
		add(file);
		add(br);
	}
}
