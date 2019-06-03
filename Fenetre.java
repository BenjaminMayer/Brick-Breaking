package com.estiam.ihm;


import java.awt.Color;


import java.awt.Image;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Fenetre extends JFrame{
	private Panneau panneau = new Panneau();
	
	public static void main(String[] args) {
		
		Fenetre fenetre = new Fenetre();
		fenetre.afficherFenetre();
		
		
	}
	
	public void afficherFenetre() {
		this.setVisible(true);
		this.setTitle("Ma premiere fenetre");
		this.setSize(600,600);
		
		
		panneau.addKeyListener(panneau);
        panneau.setFocusable(true);
		panneau.setBackground(Color.yellow);
		
		this.setContentPane(panneau);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mooveBall();
		
	}
	
	public void mooveBall() {
		boolean backX = false;
		boolean backY = false;
		int x = panneau.getpX();
		int y = panneau.getpY();
		while(true) {
			
			
			//Si la coordonnée x est inférieure à 1, on avance
		    if(x < 1)
		      backX = false;

		    //Si la coordonnée x est supérieure à la taille du Panneau moins la taille du rond, on recule
		    if(x > panneau.getWidth()-50)
		      backX = true; 

		    //Idem pour l'axe y
		    if(y < 1)
		      backY = false;
		  /*  if(y > panneau.getHeight()-50)
		      backY = true; */
		    
		   // Rebond de la balle sur la platforme 
		   if((y > (int) Math.floor(this.getHeight()*0.90) - 50) && (panneau.getpXBar() - 10 < x) && (x < panneau.getpXBar() + panneau.getSizeBar() + 10)) {
			   backY = true;
			   if((x < panneau.getpXBar() + panneau.getSizeBar()/3 && backX == false) ||  (x > panneau.getpXBar() + 2*panneau.getSizeBar()/3 && backX==true) )
				   backX = !backX;
		   }
		   
		   if(x+25 > panneau.getpBrick1X() && x+25 < panneau.getpBrick1X()+80 && y+25 > panneau.getpBrick1Y() && y+25 < panneau.getpBrick1Y()+25 && Panneau.brick1) {
               backY = !backY;
               Panneau.brick1 = false;
               panneau.nbrBrick--;
           }
		   if(x+25 > panneau.getpBrick2X() && x+25 < panneau.getpBrick2X()+80 && y+25 > panneau.getpBrick2Y() && y+25 < panneau.getpBrick2Y()+25 && Panneau.brick2) {
               backY = !backY;
               Panneau.brick2 = false;
               panneau.nbrBrick--;
           }
		   
		   if(x+25 > panneau.getpBrick3X() && x+25 < panneau.getpBrick3X()+80 && y+25 > panneau.getpBrick3Y() && y+25 < panneau.getpBrick3Y()+25 && Panneau.brick3) {
               backY = !backY;
               Panneau.brick3 = false;
               panneau.nbrBrick--;
           }
		   if(x+25 > panneau.getpBrick4X() && x+25 < panneau.getpBrick4X()+80 && y+25 > panneau.getpBrick4Y() && y+25 < panneau.getpBrick4Y()+25 && Panneau.brick4) {
               backY = !backY;
               Panneau.brick4 = false;
               panneau.nbrBrick--;
           }
		   if(x+25 > panneau.getpBrick5X() && x+25 < panneau.getpBrick5X()+80 && y+25 > panneau.getpBrick5Y() && y+25 < panneau.getpBrick5Y()+25 && Panneau.brick5) {
               backY = !backY;
               Panneau.brick5 = false;
               panneau.nbrBrick--;
           }
		   if(x+25 > panneau.getpBrick6X() && x+25 < panneau.getpBrick6X()+80 && y+25 > panneau.getpBrick6Y() && y+25 < panneau.getpBrick6Y()+25 && Panneau.brick6) {
               backY = !backY;
               Panneau.brick6 = false;
               panneau.nbrBrick--;
           }
		   
		   // GAME OVER
		   if(y > (int) Math.floor(this.getHeight()*0.90)) {
			   JOptionPane.showMessageDialog(null, "You loose" ,"Game over", JOptionPane.WARNING_MESSAGE);
			 //You have to add the following
			  // System.exit(0);
			   
			   break;
		   } 
		   // VICTORY
		   	if(panneau.nbrBrick == 0) {
		   	 JOptionPane.showMessageDialog(null, "You win !!" ,"Congraculation", JOptionPane.WARNING_MESSAGE);
			 //You have to add the following
			  // System.exit(0);
			   
			   break;
		   		
		   	}
		    //Si on avance, on incrémente la coordonnée
		    //backX est un booléen, donc !backX revient à écrire
		    //if (backX == false)
		    if(!backX) {
		    	if(!panneau.isPause())
		    		panneau.setpX(++x);
		    }

		    //Sinon, on décrémente
		    else {
		     if(!panneau.isPause())	
		       panneau.setpX(--x);}

		    //Idem pour l'axe Y
		    if(!backY) {
		      if(!panneau.isPause()) 	
		         panneau.setpY(++y);}
		    else {
		      if(!panneau.isPause()) 	
		         panneau.setpY(--y);}

		   
			panneau.repaint();
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		repaint();
		
		
		
	}

	

}
