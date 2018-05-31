package Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class RenderPanel extends JPanel {

	public static Color green = new Color(1666073);
	//public static Color green = new Color(247183);
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(green);
		g.fillRect(0, 0, 800, 700);
		Snake snake = Snake.snake;
		g.setColor(Color.BLUE);
		for(Point point : snake.snakeParts)
		{
			g.fillRect(point.x * Snake.SCALE, point.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);
		}
		g.fillRect(snake.head.x * Snake.SCALE, snake.head.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);
		g.setColor(Color.RED);
		g.fillRect(snake.cherry.x * Snake.SCALE, snake.cherry.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);
		String string = "Score: " + snake.score + ", Length: " + snake.taillength + ", Time: " + snake.time / 20;
		g.setColor(Color.white);
		g.drawString(string, (int) (snake.dim.getWidth() / 2 - string.length()), 10);
	}
}
