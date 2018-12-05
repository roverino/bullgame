import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

// Jeff Tombolini

public class BullGame extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Bull Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //make x do thing

		final BullGame panel = new BullGame(); //create panel
		frame.getContentPane().add(panel); //add panel to the frame

		frame.pack(); //prepare the frame
		frame.setLocationRelativeTo(null); //center in screen
		frame.setVisible(true); //see it

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
