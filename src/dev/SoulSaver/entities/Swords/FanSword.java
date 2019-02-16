package dev.SoulSaver.entities.Swords;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import dev.SoulSaver.Handler;
import dev.SoulSaver.data.JukeBox;
import dev.SoulSaver.entities.creatures.Enemies.FanBlast;
import dev.SoulSaver.entities.creatures.Enemies.Projectile;
import dev.SoulSaver.gfx.Animation;
import dev.SoulSaver.gfx.Assets;

public class FanSword extends Weapon{
	private Animation fan;
	private float pX, pY;
	private boolean fired;

	public FanSword(Handler handler) {
		super(handler);
		fan=new Animation(175, Assets.fanSword);
		timer.Start();
		
		fired = false;
	}

	@Override
	public void setPosition() {
		if(equipped && handler.getKeyManager().attack && !handler.getWorld().getEntityManager().getPlayer().getFall() &&
				!handler.getWorld().getEntityManager().getPlayer().getSlide()){
		if(leftD){
			x=(int) (handler.getWorld().getEntityManager().getPlayer().getX() + 17);
			y=(int) (handler.getWorld().getEntityManager().getPlayer().getY() + 26);
			bounds.x = -40;
			bounds.y = 5;
			bounds.width = 30;
			bounds.height = 20;
			rotate=90;
		}else if(rightD){
			x=(int) (handler.getWorld().getEntityManager().getPlayer().getX() + 46);
			y=(int) (handler.getWorld().getEntityManager().getPlayer().getY() + 70);
			bounds.x = 2;
			bounds.y = -45;
			bounds.width = 30;
			bounds.height = 41;
			rotate=-90;
		}else if(upD){
			x=(int) (handler.getWorld().getEntityManager().getPlayer().getX() + 45);
			y=(int) (handler.getWorld().getEntityManager().getPlayer().getY() + 25);
			bounds.x = -45;
			bounds.y = -45;
			bounds.width = 30;
			bounds.height = 41;
			rotate=180;
		}else{
			x=(int) (handler.getWorld().getEntityManager().getPlayer().getX() + 20);
			y=(int) (handler.getWorld().getEntityManager().getPlayer().getY() + 59);
			bounds.x = 2;
			bounds.y = 5;
			bounds.width = 30;
			bounds.height = 30;
			rotate=0;
		}
		}else{
			bounds.width=0;
			bounds.height=0;
		}
		
	}
	
	private void setProj() {
		if (leftD) {
			pX = x - 64;
			pY = y + 64;
		} else if (rightD) {
			pX = x + 96;
			pY = y - 64;
		} else if (upD) {
			pX = x - 64;
			pY = y - 64;
		} else {
			pX = x+64;
			pY = y+64;
		}
	}
	
	public void action(){
		if (handler.getKeyManager().attack && isEquipped() && timer.run(.5f)) {
			setProj();
			handler.getWorld().getEntityManager().addEntity(new FanBlast(handler, pX, pY, false, upD, leftD, rightD));
			JukeBox.play("Fan");
			timer.Start();
		}
	}
	
	public void checkEquipped(){
		equipped = handler.getInventory().isFan();
	}

	@Override
	public void tick() {
		getDirection();
		setPosition();
		action();
		fan.tick();
		checkEquipped();
	}

	@Override
	public void render(Graphics2D g) {
		AffineTransform at=AffineTransform.getTranslateInstance((int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()));
		at.rotate(Math.toRadians(rotate));
		at.scale(2, 2);
		
		
		if(handler.getKeyManager().attack && isEquipped()){
			g.drawImage(getCurrentAnimationFrame(),at,null);
		}
		
		//g.setColor(Color.blue);
		//g.fillRect((int) (xD + bounds.x - handler.getGameCamera().getxOffset()),
		//	(int) (yD + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
	}
	
	private BufferedImage getCurrentAnimationFrame(){
		return fan.getCurrentFrame();	
	}

}
