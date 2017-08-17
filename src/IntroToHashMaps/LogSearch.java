package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class LogSearch implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JButton button1;
	JButton button2;
	JButton button3;
	String IDnum;
	String name;
	String IDentry;
	HashMap<Integer, String> logSearch = new HashMap<Integer, String>();
	public static void main(String[] args) {
		
		LogSearch log = new LogSearch();
		log.main2();
		
	}
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	void main2(){
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button.setText("Add Entry");
		button1.setText("Search by ID");
		button2.setText("View List");
		button3.setText("Remove Entry");
		frame.setVisible(true);
		frame.setSize(500, 500);
		button.addActionListener(this);
		button2.addActionListener(this);
		button1.addActionListener(this);
		button3.addActionListener(this);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			IDnum =JOptionPane.showInputDialog("Enter an ID number");
			name =JOptionPane.showInputDialog("Enter a name");
			int ID = Integer.parseInt(IDnum);
			logSearch.put(ID, name);
		}
		
		else if (e.getSource() == button1) {
			String ID2 = JOptionPane.showInputDialog("Enter an ID number");
			int ID3 = Integer.parseInt(ID2);
				String names = logSearch.get(ID3);
				JOptionPane.showMessageDialog(null, names);
		}
		
		
		else if (e.getSource() == button2) {
			String view = "";
			for (Integer views : logSearch.keySet()) {
				view+="ID: " + views + " Name: " + logSearch.get(views) + "\n";
			}
			JOptionPane.showMessageDialog(null, view);	
		
		}
		
		else if (e.getSource() == button3) {
			IDentry = JOptionPane.showInputDialog("Enter an ID number");
			int entry = Integer.parseInt(IDentry);
			if (logSearch.containsKey(entry)) {
				logSearch.remove(entry);
			}
			else {
				JOptionPane.showMessageDialog(null, "That ID number does not exist");
			}
			
		}
		
	}
}
