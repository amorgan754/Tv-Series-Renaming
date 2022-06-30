import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI {
	
	//renaming
	public static class RenamingHandler implements ActionListener{
		public JFrame window = null;
		
		//renaming handler
		public RenamingHandler(JFrame frame) {
			window = frame;
		}
		
		public void actionPerformed(ActionEvent e) {
			String location = JOptionPane.showInputDialog("Directory Path: ");
			String name = JOptionPane.showInputDialog("TV series name: ");
			String mass = JOptionPane.showInputDialog("Multiple seasons? (y/n)");
			String season = JOptionPane.showInputDialog("What season?: ");
			Renaming renaming = new Renaming(location, name, season);
			if(mass.equalsIgnoreCase("n")) {
				renaming.Rename();
			}
			
			String msg = "Renaming complete";
	

			JOptionPane.showMessageDialog(window, msg);
			
			
			
		}
	}

	
	
	
	//delimiter
	public static class DelimiterHandler implements ActionListener{
		public JFrame window = null;
		
		//delimiter handler
		public DelimiterHandler(JFrame frame) {
			window = frame;
		}
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("Make it do something here from the delimiter class");
		}
		
	}
	
	
	
	
	//exit
	public static class ExitHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

}
