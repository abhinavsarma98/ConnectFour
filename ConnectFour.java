import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConnectFour {
	static JFrame frame = new JFrame();
	static JFrame frame2 = new JFrame();
	static JPanel panel = new JPanel();
	static JPanel panel2 = new JPanel();
	static JPanel panel3 = new JPanel();
	static JLabel label = new JLabel();
	static JTextField text0 = new JTextField(20);
	enum lastColor {Red, Yellow};
	public static Color oldColor = null;
	static int redCounter = 0;
	static int yellowCounter = 0;
	public static int playerTurn = 0;
	static int Rows = 7;
	static int Colums = 6;
	int turns = 2;
	static int Board[][] = new int [Rows][Colums];

	public static void reset() {
		text0.setText("");
		for(int i  =0; i < 7; i++) {
			for(int j = 0; j< 6; j++) {
				ConnectFour.GameBoard[i][j].setColor(Color.gray);
				ConnectFour.GameBoard[i][j].Label.repaint();
			}
		}
	}
	
	public static void main(String[] args)
	{
		testerLogic test = new testerLogic();
		ConnectFour four = new ConnectFour();	
		FlowLayout flowl = new FlowLayout();
		panel2.setLayout(flowl);
		panel2.setBackground(Color.BLUE);
		frame.add(panel2);

		panel2.add(text0);
		frame.add(panel2);	
		
		JButton resetGame = new JButton("Restart");
		resetGame.addActionListener(event -> reset());
		panel2.add(resetGame);
		frame.add(panel2);
		
		for(int row  =0; row < Board.length; row++) {
			for(int col = 0; col< Board[row].length; col++) {
	
				CircleView sview = new CircleView();

				frame.add(panel2);
				panel2.add(sview.Label);
				frame.add(panel2);

				myArray.add(sview);
				GameBoard[row][col] = sview;
				sview.changeColor(four,row,col);
			}
		}

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(380, 470);
		frame.setVisible(true);
		frame.setLocation(250, 0);

	}
	public static CircleView GameBoard[][] = new CircleView [Rows][Colums];
	public static ArrayList<CircleView> myArray = new ArrayList<>();

}
