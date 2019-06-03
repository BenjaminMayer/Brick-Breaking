package com.estiam.ihm;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panneau extends JPanel implements KeyListener{
	

	private JButton jbutton = new JButton("mon bouton");
	private int pX=(int) Math.floor(Math.random()*(600));
	private int pY= (int) Math.floor(Math.random()*(150));
	private int pXBar=200;
	private int sizeBar = 180;
	
	private int pBrick1X;
	private int pBrick1Y;
	private int pBrick2X;
	private int pBrick2Y;
	private int pBrick3X;
	private int pBrick3Y;
	private int pBrick4X;
	private int pBrick4Y;
	private int pBrick5X;
	private int pBrick5Y;
	private int pBrick6X;
	private int pBrick6Y;
	
	public static int nbrBrick = 6;
	public static boolean brick1=true;
	public static boolean brick2=true;
	public static boolean brick3=true;
	public static boolean brick4=true;
	public static boolean brick5=true;
	public static boolean brick6=true;
	private boolean pause = false;
	
	
	
	

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
        
		//this.add(jlabel);
		//this.add(jbutton);
		this.setBackground(Color.yellow);
	    g.setColor(Color.red);
	    g.fillOval(pX, pY, 50, 50);
	   // g.fill3DRect(200, 200, 100, 30, false);
	    g.fillRect(pXBar, (int) Math.floor(this.getHeight()*0.90), this.sizeBar, 30);
	    g.drawString("Appuyez sur entrer pour faire pause", 150, (int) Math.floor(this.getHeight()*0.99));
	    
	    this.pBrick1X = (int) Math.floor(this.getWidth()*0.20);
		this.pBrick1Y = (int) Math.floor(this.getHeight()*0.20);
		this.pBrick2X = (int) Math.floor(this.getWidth()*0.40);
		this.pBrick2Y = (int) Math.floor(this.getHeight()*0.20);
		this.pBrick3X = (int) Math.floor(this.getWidth()*0.60);
		this.pBrick3Y = (int) Math.floor(this.getHeight()*0.20);
		this.pBrick4X = (int) Math.floor(this.getWidth()*0.20);
		this.pBrick4Y = (int) Math.floor(this.getHeight()*0.27);
		this.pBrick5X = (int) Math.floor(this.getWidth()*0.40);
		this.pBrick5Y = (int) Math.floor(this.getHeight()*0.27);
		this.pBrick6X = (int) Math.floor(this.getWidth()*0.60);
		this.pBrick6Y = (int) Math.floor(this.getHeight()*0.27);
	   if(brick1) {
	    g.fillRect(this.pBrick1X, this.pBrick1Y, 
	    		80, 25);
	    
	   }
	   if(brick2)
		   g.fillRect(this.pBrick2X, this.pBrick2Y, 
		    		80, 25);
	   if(brick3)
		   g.fillRect(this.pBrick3X, this.pBrick3Y, 
		    		80, 25);  
	  
	if(brick4)
		   g.fillRect(this.pBrick4X, this.pBrick4Y, 
		    		80, 25);  
	  
	if(brick5)
	   g.fillRect(this.pBrick5X, this.pBrick5Y, 
	    		80, 25);
	
	if(brick6)
		   g.fillRect(this.pBrick6X, this.pBrick6Y, 
		    		80, 25);

	
	
	}
	
	public int getpBrick2X() {
		return pBrick2X;
	}




	public void setpBrick2X(int pBrick2X) {
		this.pBrick2X = pBrick2X;
	}




	public int getpBrick2Y() {
		return pBrick2Y;
	}




	public void setpBrick2Y(int pBrick2Y) {
		this.pBrick2Y = pBrick2Y;
	}




	public int getpBrick3X() {
		return pBrick3X;
	}




	public void setpBrick3X(int pBrick3X) {
		this.pBrick3X = pBrick3X;
	}




	public int getpBrick3Y() {
		return pBrick3Y;
	}




	public void setpBrick3Y(int pBrick3Y) {
		this.pBrick3Y = pBrick3Y;
	}




	public int getpBrick4X() {
		return pBrick4X;
	}




	public void setpBrick4X(int pBrick4X) {
		this.pBrick4X = pBrick4X;
	}




	public int getpBrick4Y() {
		return pBrick4Y;
	}




	public void setpBrick4Y(int pBrick4Y) {
		this.pBrick4Y = pBrick4Y;
	}




	public int getpBrick5X() {
		return pBrick5X;
	}




	public void setpBrick5X(int pBrick5X) {
		this.pBrick5X = pBrick5X;
	}




	public int getpBrick5Y() {
		return pBrick5Y;
	}




	public void setpBrick5Y(int pBrick5Y) {
		this.pBrick5Y = pBrick5Y;
	}




	public int getpBrick6X() {
		return pBrick6X;
	}




	public void setpBrick6X(int pBrick6X) {
		this.pBrick6X = pBrick6X;
	}




	public int getpBrick6Y() {
		return pBrick6Y;
	}




	public void setpBrick6Y(int pBrick6Y) {
		this.pBrick6Y = pBrick6Y;
	}




	public int getpBrick1X() {
		return pBrick1X;
	}


	public void setpBrick1X(int pBrick1X) {
		this.pBrick1X = pBrick1X;
	}


	public int getpBrick1Y() {
		return pBrick1Y;
	}


	public void setpBrick1Y(int pBrick1Y) {
		this.pBrick1Y = pBrick1Y;
	}


	public int getpX() {
		return pX;
	}
	
	public void setpX(int pX) {
		this.pX = pX;
	}
	public int getpY() {
		return pY;
	}
	public void setpY(int pY) {
		this.pY = pY;
	}
	
	
	public boolean isPause() {
		return pause;
	}

	public void setPause(boolean pause) {
		this.pause = pause;
	}

	public int getpXBar() {
		return pXBar;
	}
	public void setpXBar(int pXBar) {
		this.pXBar = pXBar;
	}
	public int getSizeBar() {
		return sizeBar;
	}
	public void setSizeBar(int sizeBar) {
		this.sizeBar = sizeBar;
	}
	@Override
	public void keyTyped(KeyEvent e) {
		int c = e.getKeyCode();
		System.out.println("Une touche a été presser");
		System.out.println(c);
		if(c==0) {
			this.setPause(!this.isPause());
			System.out.println("Entrer a été presser " + this.isPause());
		}
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int c = e.getKeyCode();
		
		if(c == KeyEvent.VK_RIGHT && this.pXBar < this.getWidth()-this.sizeBar) {
		this.pXBar=this.pXBar + 50;
		}
		if(c == KeyEvent.VK_LEFT && this.pXBar > 0) {
			this.pXBar=this.pXBar - 50;
		}
	
		repaint();
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
