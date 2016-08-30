package main;

import java.awt.Color;
import java.awt.Graphics2D;

import com.sun.glass.events.KeyEvent;

public class PlayState extends GameState{
	public PlayState(GameStateManager gsm){
		this.gsm = gsm;
	}
	
	public void update() {
		
	}

	public void draw(Graphics2D g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
		g.setColor(Color.BLACK);
		g.drawString("PLAY STATE", 100, 100);
	}

	public void keyPressed(int k) {
		if(k == KeyEvent.VK_ENTER)
			gsm.setCurrentState(GameStateManager.MENUSTATE);
	}

	public void keyReleased(int k) {
	
	}
}
