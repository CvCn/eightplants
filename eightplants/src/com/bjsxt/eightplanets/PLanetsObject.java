package com.bjsxt.eightplanets;

import java.awt.Polygon;
import java.awt.image.BufferedImage;


/**
 * 八大行星公转速度,
 * 水星  87.70	天	 				8.7,			47.89
 * 金星224.701天					6.4,			35
 * 地球365天5时48分46秒。			5.4,			29.79
 * 火星686.98 日					4.42,			24.13
 * 木行4332.589天,约合11.86年,		2.3,			13
 * 土星29.5年						1.7,			9.6
 * 天王星84年						1.2,			6.81
 * 海王星164.8年					1,				5.45
 * 
 * 月球27.32						0.187,			1.023
 * 
 * 
 * 
 * 需要定义的变量,
 * 星球的图片，
 * 速度,
 * 起始的绘图位置，即this.x, this.y,
 * 横向宽度,
 * 纵向宽度
 */

public class PLanetsObject
{
	
	
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected BufferedImage image;
	private double speed = 3;
	protected double su = 0;
	
	
	/**
	 * 速度系数
	 */
	private double z = 0.00001;  //相对速度系数
	
	
	public static final double YUE = 2191; 
	public static final double SHUI = 688; 
	public static final double JIN = 267; 
	public static final double DI = 164; 
	public static final double HUO = 87; 
	public static final double MU = 14; 
	public static final double TU = 5; 
	public static final double TIAN = 2; 
	public static final double HAI = 1; 
	
	
	public int getX()
	{
		return x;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public int getY()
	{
		return y;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public int getWidth()
	{
		return width;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	public int getHeight()
	{
		return height;
	}
	public void setHeight(int height)
	{
		this.height = height;
	}
	public BufferedImage getImage()
	{
		return image;
	}
	public void setImage(BufferedImage image)
	{
		this.image = image;
	}
	
	/**
	 * 移动
	 * 
	 * x,y圆的起始坐标,
	 * z1横向宽度,
	 * z2纵向宽度
	 * 
	 * */
	public void move(int x, int y, int z1, int z2){
		this.x = (int) (x+z1*Math.sin(speed));
		this.y = (int) (y+z2*Math.cos(speed));
		speed += su * this.z;
	}
	
	
	
	public Polygon line(){
		Polygon polygon = new Polygon();
		
		return polygon;
	}
	
	
}
