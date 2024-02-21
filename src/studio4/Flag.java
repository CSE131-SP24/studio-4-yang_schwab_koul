package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.3);
			
		StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledSquare(0.1, 0.69, 0.01);
			
		StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledRectangle(0.5, 0.4, 0.05, 0.1);
		
			double [] x = {0.4, 0.5, 0.6};
			double [] y = {0.5, 0.6, 0.5};
			StdDraw.filledPolygon(x, y);
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.text(0.5, 0.5, "FREEDOM");
	}
}