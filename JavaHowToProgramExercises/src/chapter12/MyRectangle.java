// Grzegorz Ko�czak, 25.07.2016
// Exercise number 12.17 page 594
// Exercise from Java:How to program 10th edition

package chapter12;

import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends MyBoundedShape {


	public MyRectangle(int x1, int y1, int x2, int y2, Color color, boolean filled) {
		super(x1, y1, x2, y2, color, filled);
	}

	// no argument constructor
	public MyRectangle() {
		this(0, 0, 0, 0, Color.BLACK, false);
	}

	// Actually draws the rectangle
	@Override
	public void draw(Graphics g) {
		g.setColor(super.getColor());
		if (super.isFilled() == true)
			g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
		else
			g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
	}

}
