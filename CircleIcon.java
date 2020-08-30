import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
   An icon that has the shape of a car.
 */
public class CircleIcon implements Icon
{
	/**
      Constructs a car of a given width.
      @param width the width of the car
	 */
	public CircleIcon(int aheight)
	{
		height = aheight;
	}

	public int getIconWidth()
	{
		return width;
	}

	public int getIconHeight()
	{
		return height;
	}
	public void setSize(int newSize) {
		height = newSize;
	}
	public int getSize() {
		return this.height;
	}
	
	public Color getColor() {
		return this.newColor;
	}
	public void setColor(Color color) {
		this.newColor = color;
	}
	public void paintIcon(Component c, Graphics g, int x, int y)
	{
		Graphics2D g2 = (Graphics2D) g;

		Ellipse2D.Double body
		= new Ellipse2D.Double(x,y,width,height);
		g2.setColor(newColor);
		g2.fill(body);
	}
	
	Color newColor = Color.gray;
	private int height;
	private int width = 50;
}



