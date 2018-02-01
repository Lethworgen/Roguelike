package RogueLikeTut.screens;

import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;

public class LoseScreen implements Screen {
	
	//Implements displayOutput. The YOU LOSE screen
	public void displayOutput(AsciiPanel terminal) {
		terminal.write("YOU LOSE.", 1, 1);
		terminal.writeCenter("-- press [enter] to restart", 22);
	}
	
	//Press Enter to restart
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreen() : this;
	}
}
