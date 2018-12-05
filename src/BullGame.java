import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

// Jeff Tombolini

public class BullGame extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Bull Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final BullGame panel = new BullGame();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				panel.tick();
				panel.repaint();
			}
		}, 0, 1000 / 60);
	}

	public final S_WIDTH = 800, S_HEIGHT = 600;
	public InputHandler input;
	
	public BullGame() {
		input = new InputHandler();

		this.setFocusable(true);
		this.requestFocus();
		this.addKeyListener(input);
		this.addMouseListener(input);
		this.addMouseMotionListener(input);
		
		this.setPreferredSize(new Dimension(S_WIDTH, S_HEIGHT));
	}

	public void tick() {
		//Game logic
	}

	public void paintComponent(Graphics g) {
		//Render code
	}

}
