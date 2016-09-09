package main.sromku.polygon;

/**
 * Point on 2D landscape
 * 
 * @author Roman Kushnarenko (sromku@gmail.com)</br>
 * @author Opba (hkanata@gmail.com)
 */
public class Point
{
	public Point(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	public Point(){	}
	
	public float x;
	public float y;

	@Override
	public String toString()
	{
		return String.format("(%.2f,%.2f)", x, y);
	}
}