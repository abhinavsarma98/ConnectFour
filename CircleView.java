import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

public class CircleView {

	CircleIcon circle = new CircleIcon(50);
	JLabel Label = new JLabel(circle);
	testerLogic logic = new testerLogic();

	static int Rows = 7;
	int Colums = 6;
	static int turns = 2;

	public Color getColor(){
		return circle.getColor();
	}

	public void setColor(Color color){

		circle.setColor(color);
	}

	public int checkColors(int Colums) {
		int Rows = 7-1;

		while(!(ConnectFour.GameBoard[Rows][Colums].getColor().equals(Color.gray)) || Rows<0) {
			Rows--;
		}
		return Rows;
	}


	public void changeColor(ConnectFour four, int row, int col) {

		Label.addMouseListener(new MouseAdapter() {
			@Override

			public void mouseClicked(MouseEvent e) {


				if(circle.getColor().equals(Color.gray)) {

					int myRow = checkColors(col);
					//"+ row+"
					System.out.println(myRow +"  "+ col);
					ConnectFour.GameBoard[myRow][col].setColor(Color.RED);					
					if(turns%2 == 0) {
						ConnectFour.GameBoard[myRow][col].setColor(Color.RED);
						ConnectFour.GameBoard[myRow][col].Label.repaint();
						logic.checkWinner(row, col);

					}else{ 
						ConnectFour.GameBoard[myRow][col].setColor(Color.YELLOW);
						ConnectFour.GameBoard[myRow][col].Label.repaint();
						logic.checkWinner(row, col);
					}	
					turns++;

				}
				ConnectFour.playerTurn++;
				if(ConnectFour.playerTurn >=7) {
					System.out.println();
				}

			}

		});

	}


}
