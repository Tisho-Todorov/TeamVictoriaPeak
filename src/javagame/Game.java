package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame {
	public final static String gamename = "Icy Tower";
	
	public final static int menu = 0;
	public final static int play = 1;
	public final static int instructions = 2;
	
	
	public Game(String gamename){
		super(gamename);
		this.addState(new Menu(menu));		
		this.addState(new Level_One(play));
		this.addState(new Instructions(instructions));
	}
	
	public void initStatesList ( GameContainer gc) throws SlickException {
		this.getState(menu).init(gc,this);//inicilizaciq
		this.enterState(menu); // koe sastoqnie da se pokazva v na4aloto
	}
	
	public static void main(String[] args) {
		AppGameContainer appgc;
		try{
			appgc = new AppGameContainer(new Game(gamename));//init na obekta
			appgc.setDisplayMode(800,600, false);// razmer na ekrana (ako e false ne moje na cql ekran)
			appgc.start();// startirane
		}catch(SlickException e){
			e.printStackTrace();
		}

	}

}
