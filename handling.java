package frame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class handling {
	JFrame fr=new JFrame("Event handling");
	JPanel pa=new JPanel();
	JButton bt1=new JButton("red button");
	JButton bt2=new JButton("green button");
	JButton bt3=new JButton("black button");
	JButton bt4=new JButton("blue button");
	JButton bt5=new JButton("yellow button");
	
	
	public handling() {
		fr.setSize(1500,1500);
		fr.setResizable(true
				);
		fr.setDefaultCloseOperation(3);
		fr.setLocationRelativeTo(null);
		fr.add(pa);
		pa.add(bt1);
		pa.add(bt2);
		pa.add(bt3);
		pa.add(bt4);
		pa.add(bt5);
		bt1.addActionListener(new AA());
		bt2.addActionListener(new BB());
		bt3.addActionListener(new CC());
		bt4.addActionListener(new DD());
		bt5.addActionListener(new EE());
	
		pa.setBackground(Color.cyan);
		fr.setVisible(true);
	}
	class AA implements ActionListener
	{
		public void actionPerformed(ActionEvent evt) {
			pa.setBackground(Color.red);
		
		}
	}
		class BB implements ActionListener
		{
			public void actionPerformed(ActionEvent evt) {
				pa.setBackground(Color.green);
				
			}			
		}
		
			class CC implements ActionListener
			{
				public void actionPerformed(ActionEvent evt) {
					pa.setBackground(Color.black);
				}
				}
				class DD implements ActionListener
				{
					public void actionPerformed(ActionEvent evt) {
						pa.setBackground(Color.blue);
					}
					}
					class EE implements ActionListener
					{
						public void actionPerformed(ActionEvent evt) {
							pa.setBackground(Color.yellow);
						}
		
		
		
		
		
					}
				
			
		
			public static void main(String[]args) {
				
				new handling();}
	
	}






