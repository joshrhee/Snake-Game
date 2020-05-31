import javax.swing.JFrame;

public class Main {
	
	public Main() {
		
		final JFrame frame = new JFrame();
		final Gamepanel gamepanel = new Gamepanel();

		frame.add(gamepanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SNAKECODING");
		frame.setLocationRelativeTo(null);

		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}

	public static void main(final String[] args) {

		new Main();
	}

}
