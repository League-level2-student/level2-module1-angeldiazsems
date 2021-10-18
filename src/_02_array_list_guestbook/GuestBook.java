package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	ArrayList<String> list = new ArrayList<String>();
	

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("add name");
	JButton button2 = new JButton("view names");


void setup() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	panel.add(button2);
	button.addActionListener(this);
	button2.addActionListener(this);
	list.add("Bob Banders");
	list.add("Sandy Summers");
	list.add("Greg Ganders");
	list.add("Donny Doners");
	
	frame.pack();
}




@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource() .equals(button)) {
		
	String input = JOptionPane.showInputDialog("Enter a name");
		list.add(input);
	}
	if(arg0.getSource() .equals(button2)) {
		
		JOptionPane.showMessageDialog(null, " "+list);
	}
	
	
	
	
	
	
}
}