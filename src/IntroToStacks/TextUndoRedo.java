package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener{
	JFrame frame;
	JPanel panel;
	JLabel label;
	String hi;
	Stack<Character> stack = new Stack<Character>();
	Stack<Character> words = new Stack<Character>();
	public static void main(String[] args) {
		TextUndoRedo text = new TextUndoRedo();
		text.main2();
		
	}
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	

void main2() {
	frame = new JFrame();
	panel = new JPanel();
	label = new JLabel();
	frame.add(panel);
	panel.add(label);
	frame.setVisible(true);
	frame.setSize(500, 500);
	frame.addKeyListener(this);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
	
	if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE ) {
		
		hi = label.getText();
		if (hi.length()>0) {
		String hola = hi.substring(0, hi.length()-1);
		stack.push(hi.charAt(hi.length()-1));
		label.setText(hola);	
	}
	}
	
	
	else if (e.getKeyCode() == KeyEvent.VK_UP) {
		Character undo = stack.pop();
		String current = label.getText();
		label.setText(current + undo);
	}
	else {
		String currentText = label.getText();
	currentText += (char) e.getKeyCode();
	label.setText(currentText);
	panel.repaint();
	System.out.println("keyTyped");
	}
	
}


@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


}

