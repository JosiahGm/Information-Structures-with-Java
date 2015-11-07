package cs520.hw4;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Legos3 extends JFrame {
	
	//Declare the object's instance variables; The first two values represent the top-left coordinates 
	//of the first red block in the bottom row. The next two values are the 
	//width and height of each block. 
	int startX, startY, legoWidth, legoHeight;
	
	//Represents number of blocks in bottom row
	int baseLength;
	
	public Legos3(){
		
		super("Vint's LEGO's");
		startX = 20;
		startY = 300;
		legoWidth = 50;
		legoHeight = 20;
		baseLength = 10;
		
	}
	
	public void paint(Graphics g){
		
		super.paint(g);
		
		Color[] colors = {Color.RED, Color.BLUE, Color.YELLOW,
				Color.GREEN, Color.PINK, Color.BLACK, Color.MAGENTA,
				Color.ORANGE, Color.CYAN};
		
		Random gen = new Random();
		
		//randomly generated int that stores index of most recent
		//color used from array
		int colorIndex = gen.nextInt(9);
		
		//for loop tracks the row
		for (int row = 0; row < baseLength; row++){
			
			//set color using the random generator
			g.setColor(colors[colorIndex]);
			
			//tracks number of vblocks on the current row
			int numBlocks = baseLength - row;
			
			//yIndex maintains y coordinate for current rectangle
			int yIndex = startY - (legoHeight * row);
			
			//rowStart maintains the x coordinate of first rectangle in 
			//the current row
			int rowStart = startX + ((legoWidth / 2) * row);
			
			//nested while loop to actually create rectangles
			while (numBlocks > 0){
				
				//create rectangle and then update index variables
				g.fillRoundRect(rowStart, yIndex, legoWidth, legoHeight, 2, 2);
				numBlocks--;
				rowStart += legoWidth;
				
				//generate next color and make sure it's not the same as the last. then 
				//set color of next block
				int tempColorIndex = colorIndex;
				while (tempColorIndex == colorIndex){
					colorIndex = gen.nextInt(9);
				}
				g.setColor(colors[colorIndex]);
			}
		}
		
	}
	
	public static void main(String[] args){
		
		//Create lego pyramid object
		Legos3 legoTest = new Legos3();
		legoTest.setSize(550, 325);
		legoTest.setVisible(true);
		
		//close properly
		legoTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}

}
