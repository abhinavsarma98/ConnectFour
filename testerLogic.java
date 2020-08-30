import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class testerLogic 
{
	final int maxx = 7;
	final int maxy = 6;
	Color currentColor;
	
	JLabel text0 = new JLabel();
	JFrame frame2 = new JFrame();
	JPanel panel = new JPanel();
	FlowLayout flowl = new FlowLayout();
	public void checkWinner(int row, int col)
	{
		int[][] directions = {{1,0}, {1,-1}, {1,1}, {0,1}};
	    for (int[] d : directions) {
	        int dx = d[0];
	        int dy = d[1];
	        for (int x = 0; x < maxx; x++) 
	        {
	            for (int y = 0; y < maxy; y++) 
	            {
	                int lastx = x + 3*dx;
	                int lasty = y + 3*dy;
	                if (0 <= lastx && lastx < maxx && 0 <= lasty && lasty < maxy) 
	                {
	                    currentColor = ConnectFour.GameBoard[x][y].getColor();
	                    if (!currentColor.equals(Color.gray) && currentColor.equals(ConnectFour.GameBoard[x+dx][y+dy].getColor())
	                                 && currentColor.equals(ConnectFour.GameBoard[x+2*dx][y+2*dy].getColor())
	                                 && currentColor.equals(ConnectFour.GameBoard[lastx][lasty].getColor()))
	                                 {
	                    	if(currentColor.equals(Color.RED)) {
	                    		ConnectFour.text0.setText("      RED WINS!!");
	                    		
	                    		for(int i  =0; i < 7; i++) {
	                    			for(int j = 0; j< 6; j++) {
	            						ConnectFour.GameBoard[i][j].setColor(Color.gray);
	            						ConnectFour.GameBoard[i][j].Label.repaint();
	                    			}
	                    		}
         		
	                    	}else if(currentColor.equals(Color.YELLOW)){
	                    		ConnectFour.text0.setText("      YELLOW WINS!!");
	                    		
	                    		for(int i  =0; i < 7; i++) {
	                    			for(int j = 0; j< 6; j++) {
	            						ConnectFour.GameBoard[i][j].setColor(Color.gray);
	            						ConnectFour.GameBoard[i][j].Label.repaint();
	                    			}
	                    		}
	                    	}
	        
	                    		return;
	                    }
	                }
	            }
	        }
	    }
	}

}
