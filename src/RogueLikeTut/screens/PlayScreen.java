/*
 The PlayScreen class is responsible for showing the dungeon
 and all it's inhabitants and loot. Eventually. For now,
 we are testing Screen functionality.
 */

package RogueLikeTut.screens;

import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;

//Implementation of the interface Screen
public class PlayScreen implements Screen {
	
	public void displayOutput(AsciiPanel terminal) {
		terminal.write("You are having fun.", 1, 1);
		terminal.writeCenter("-- press [esc] to lose or [enter] to win --", 22);	
	}
	
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
			case KeyEvent.VK_ESCAPE: return new LoseScreen(); //Returns "YOU LOSE" when esc is pressed
			case KeyEvent.VK_ENTER : return new WinScreen(); //Returns "YOU WIN" when enter is pressed
		}
		
		return this;
	}
}
