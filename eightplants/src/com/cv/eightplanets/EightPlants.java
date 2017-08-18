package com.cv.eightplanets;

import javax.swing.JFrame;

public class EightPlants
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("EightPlants");
		Air air = new Air();
		frame.add(air);
		frame.setVisible(true);
		frame.setSize(Air.WIDTH, Air.HEIGHT);
		frame.setResizable(false);
		frame.setAlwaysOnTop(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(Air.di_);
		
		air.action();

	}

}
