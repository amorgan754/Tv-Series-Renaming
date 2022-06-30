import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Run {
	

	public static void main(String[] args) {
		
		//buttons for the three options
		JButton renamingButton = new JButton("Rename Episodes");
		JButton delimiterButton = new JButton("Replace Delimiter");
		JButton exitButton = new JButton("Exit");
		
		//creating the frame
		JFrame window = new JFrame();
	
		
		//adding buttons to panel
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		
		//listener and add action listeners to buttons
		GUI.RenamingHandler renamingListener = new GUI.RenamingHandler(window);
		renamingButton.addActionListener(renamingListener);
		
		GUI.DelimiterHandler delimiterListener = new GUI.DelimiterHandler(window);
		delimiterButton.addActionListener(delimiterListener);
		
		GUI.ExitHandler exitListener = new GUI.ExitHandler();
		exitButton.addActionListener(exitListener);
		
		
		//add buttons to panel
		content.add(renamingButton, BorderLayout.CENTER);
		content.add(delimiterButton, BorderLayout.EAST);
		content.add(exitButton, BorderLayout.SOUTH);
		
		//add content to window
		window.setContentPane(content);
		
		//size and location of the window
		window.setSize(500, 250);
		window.setLocation(400, 400);
		window.setVisible(true);
		

	}

}
