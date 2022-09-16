package frame;
import java.awt.Component;

import javax.swing.*;
public class tictactoe {
	JFrame fr=new JFrame("Tic Tac Toe");
	JLabel img=new JLabel(new ImageIcon(getClass().getResource("images/t2.jpg")));
	JPanel[] pa=new JPanel[3];
	
	
	public tictactoe() {
		fr.setSize(500, 600);
		fr.setDefaultCloseOperation(3);
		fr.setResizable(false);
		fr.setLocationRelativeTo(null);
		fr.add(img);
		addpaneIs();
		fr.setVisible(true);
		
	}
	private void addpaneIs() {
		// TODO Auto-generated method stub
		img.setLayout(null);
		for(int i=0;i<3;i++) {
			pa[i]=new JPanel();
			img.add(pa(i));
			pa[0].setBounds(50,20,400,40);
			pa[1].setBounds(50,90,400,380);
			pa[2].setBounds(50,500,400,40);
			
		}		
	}
	private Component pa(int i) {
		// TODO Auto-generated method stub
		return null;
		
		
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
