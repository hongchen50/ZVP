package Bullet;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import Zombie.Zombie;

public abstract class Bullet {
	private Image imgBullet;
	private int x;
	private int y;
	private int height;
	private int width;
	private int damage;
	private int speed;
	private boolean exist;
	public Thread thisth;
    
	public abstract void BulletMove();
	public abstract void BulletDelete();
	public abstract Rectangle getRect();
	public abstract void DrawMe(Graphics g);
	public abstract void Bulletattack(Zombie zombie);
	
	
	public Image getImgBullet() {
		return imgBullet;
	}
	public void setImgBullet(Image imgBullet) {
		this.imgBullet = imgBullet;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isExist() {
		return exist;
	}
	public void setExist(boolean exist) {
		this.exist = exist;
	}
	
	
}
