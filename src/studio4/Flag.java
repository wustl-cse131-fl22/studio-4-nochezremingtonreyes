package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
		StdDraw.setXscale(0,10);
		StdDraw.setYscale(0,10); 
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(5, 5, 4, 3);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(5, 5, 1);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(3.5, 3.5, 2.5, 1.5);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(7.5, 3.5, 1.5, 1.5);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.rectangle(2.5, 3.5, 0.8, 0.8);
		StdDraw.rectangle(4.5, 3.5, 0.8, 0.8);
		
	}
}