// Grzegorz Ko�czak, 11.08.2016
// Exercise number 13.27 page 635
// Exercise from Java:How to program 10th edition


package chapter_13;

import javax.swing.JFrame;

public class PieChartTest {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Pie Chart");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PieChart panel = new PieChart();

		frame.add(panel);
		frame.setSize(340, 340);
		frame.setVisible(true);
	}
}
