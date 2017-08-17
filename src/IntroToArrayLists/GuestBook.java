package IntroToArrayLists;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook {
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.main2();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	void main2() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JButton button1 = new JButton();
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		button.setText("Add Name");
		button1.setText("View Names");
	}
	
}
