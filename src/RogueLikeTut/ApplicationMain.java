package RogueLikeTut;

import javax.swing.JFrame;
import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent; //A Keystroke occurred
import java.awt.event.KeyListener; //Receives Keyboard events
import RogueLikeTut.screens.Screen; //The Screen Interface
import RogueLikeTut.screens.StartScreen; //Start Screen

public class ApplicationMain extends JFrame implements KeyListener{
	private static final long serialVersionUID = 1060623638149583738L;
	
	private AsciiPanel terminal;
	private Screen screen; //Screen interface
	
	public ApplicationMain() {
		super();
		terminal = new AsciiPanel();
		add(terminal);
		pack();
		screen = new StartScreen();
		addKeyListener(this);
		repaint();
	}
	
	public void repaint() {
		terminal.clear(); //clears the screen
		screen.displayOutput(terminal);
		super.repaint();
	}
	
	//Invoked when a key is pressed. Screen changes upon key press
	public void keyPressed(KeyEvent e) {
		screen = screen.respondToUserInput(e);
		repaint();
	}
	
	public void keyReleased(KeyEvent e) {}
	
	public void keyTyped(KeyEvent e) {}
	
	public static void main(String[] args) {
		ApplicationMain app = new ApplicationMain();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
