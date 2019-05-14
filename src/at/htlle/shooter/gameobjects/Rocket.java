package at.htlle.shooter.gameobjects;

import javafx.geometry.Bounds;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Rectangle;

public class Rocket 
{
	private int x;
	private int y;
	private String rocketString ="🚀";
	
	/**
	 * ctor
	 * @param x Startposition X 
	 * @param y Startposition Y
	 */
	public Rocket(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void move()
	{
		this.x = this.x + 1;
	}

	/**
	 * Überschreiben der toString Methode, damit wir den Asteroiden bequem
	 * ausgeben können
	 */
	public String toString()
	{
		return "Rocket(" + this.x + "|" + this.y + ")";
	}
	
	/**
	 * Gibt true zurück wenn der Asteroid zerstört werden kann weil er nicht
	 * mehr sichtbar ist
	 * @return
	 */
	public boolean isVisible()
	{
		return (this.x < 1000);
	}
	
	/**
	 * Zeichnet die Rakete in den übergebenen GraphicsContext
	 * @param gc
	 */
	public void paint(GraphicsContext gc)
	{
		gc.fillText(this.rocketString, this.x, this.y);
	}
	
	public Bounds getBoeunds() {
		Rectangle r = new Rectangle(this.x, this.y, 30, 10);
		return r.getBoundsInLocal();
	}
}
