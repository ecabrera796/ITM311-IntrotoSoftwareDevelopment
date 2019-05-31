import javax.swing.*;
import java.awt.event.*;

public class JavaMenus extends JFrame {

	public JavaMenus()
	{
		super("Java Menu Example");
		
		JMenu file = new JMenu("File");
		file.setMnemonic('F');
		JMenuItem ItemNew = new JMenuItem("New");
		ItemNew.setMnemonic('N');
		file.add(ItemNew);
		JMenuItem ItemOpen = new JMenuItem("Open");
		ItemOpen.setMnemonic('O');
		file.add(ItemOpen);	
		JMenuItem ItemExit = new JMenuItem("Exit");
		ItemExit.setMnemonic('x');
		file.add(ItemExit);
		
		final JLabel label1 = new JLabel(" Welcome");
	     	add(label1);
	      	this.setSize(1000, 1000);
		setVisible(true);
				
		ItemNew.addActionListener(
		 new ActionListener() {
		  public void actionPerformed(ActionEvent e)
		  {
			label1.setText(" New");
			JOptionPane.showMessageDialog(null, "New was Clicked", 
			   "Result", JOptionPane.PLAIN_MESSAGE);
			 }
			}
		);
		ItemOpen.addActionListener(
		  new ActionListener(){
		    public void actionPerformed(ActionEvent e)
		    {
			label1.setText(" Open");
			JOptionPane.showMessageDialog(null, "Open was Clicked", 
			   "Result", JOptionPane.PLAIN_MESSAGE);
		    }
		   }
		);

		ItemExit.addActionListener(
		  new ActionListener(){
		    public void actionPerformed(ActionEvent e)
		    {
			label1.setText(" Exit");
			JOptionPane.showMessageDialog(null, "Exit was Clicked", 
			   "Result", JOptionPane.PLAIN_MESSAGE);
		    }
		  }
		);						
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		bar.add(file);
		
		getContentPane();
		setSize(250, 250);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		JavaMenus appMenu = new JavaMenus();
		appMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}