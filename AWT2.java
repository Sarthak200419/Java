import java.awt.*;
import java.awt.event.*;

public class AWT2 extends Frame implements ActionListener {
	Button b1, b2;

	AWT2() {
		super("Use of Button");
		b1 = new Button("OK");
		b2 = new Button("Exit");

		b1.addActionListener(this);
		b2.addActionListener(this);
		setLayout(null);

		b1.setBounds(50, 100, 100, 20); // column row width height.
		b2.setBounds(170, 100, 100, 20); // column row width height.

		add(b1); // add it.
		add(b2); // add it.

		setSize(320, 220); // Making it equal.

		setResizable(false); // It will be fixed.
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		Button b = (Button) e.getSource();
		if (b == b2)
			System.exit(0);
		else
			System.out.println("Ok Button Pressed");
	}

	public static void main(String[] args) {
		AWT2 a = new AWT2();
	}
}