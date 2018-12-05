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

	public BullGame() {

	}

	public void tick() {

	}

	public void paintComponent(Graphics g) {

	}

}
