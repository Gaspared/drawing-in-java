package draw;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Canvas extends JFrame {
	Container c;
	Board b;
	JButton green, red, blue, gradient, circle;
	static boolean gb = true;
	static boolean rb = false;
	static boolean bb = false;
	static boolean gr = false;
	static boolean ci = false;
	
	public Canvas() {
		c = getContentPane();
		b = new Board();
		
		//buttons
		circle = new JButton("Circle");
		gradient = new JButton("Gradient");
		green = new JButton("Green");
		red = new JButton("Red");
		blue = new JButton("Blue");
		
		//listener
		green.addActionListener(new BListener());
		red.addActionListener(new BListener());
		blue.addActionListener(new BListener());
		circle.addActionListener(new BListener());
		gradient.addActionListener(new BListener());
		
		//add
		b.add(gradient);
		b.add(circle);
		b.add(green);
		b.add(red);
		b.add(blue);
		c.add(b);
		
	}
	
	//Listener
	class BListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == green) {
				gb = true;
			}
			if (e.getSource() == blue) {
				bb = true;
			}
			if (e.getSource() == red) {
				rb = true;
			}
			if (e.getSource() == gradient) {
				gr = true;
			}
			if (e.getSource() == circle) {
				ci = true;
			}
			b.repaint();
		}
	}
	
	
	
	public static void main(String[] args) {
		Canvas frame = new Canvas();
		frame.setVisible(true);
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
