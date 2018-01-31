package RogueLikeTut.screens;
import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;

public class WinScreen implements Screen{

	//Implement displayOutput. The Win Screen
	public void displayOutput(AsciiPanel terminal) {
		terminal.write("YOU WIN.", 1, 1);
		terminal.writeCenter("-- preess [enter] to restart--", 22);
	}
	
	//Implements User input
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreen() : this;
	}
}
