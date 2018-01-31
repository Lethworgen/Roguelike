package RogueLikeTut.screens;

import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;
public interface Screen {
	
	//Display a screen
	public void displayOutput(AsciiPanel terminal);
	
	//Get user interaction
	public Screen respondToUserInput(KeyEvent key); //Returns type Screen
	
}
