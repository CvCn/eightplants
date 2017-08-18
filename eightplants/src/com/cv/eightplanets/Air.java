package com.cv.eightplanets;

import java.awt.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.util.Timer;
import java.util.TimerTask;

public class Air extends JPanel
{

	/**
	 * 1.0
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 1280;//面板大小
	public static final int HEIGHT = 720;
	private static final int IMAGE_WIDTH = 40;//图片大小
	private static final int IMAGE_HEIGHT = 40;
	/**
	 * 运行状态
	 */
	private int state = 1;
	private static final int RUNING = 1;
//	private static final int PAUSE = 2;
	/**
	 * 声明图片对象
	 */
	public static  BufferedImage background_;
	public static  BufferedImage tai_;
	public static  BufferedImage shui_;
	public static  BufferedImage jin_;
	public static  BufferedImage di_;
	public static  BufferedImage huo_;
	public static  BufferedImage mu_;
	public static  BufferedImage tu_;
	public static  BufferedImage tian_;
	public static  BufferedImage hai_;
	public static  BufferedImage yue_;
	
	/**
	 * 定时器
	 */
	private Timer timer;
	/**
	 * 八大行星
	 */
	private Shui shui = new Shui();
	private Jin jin = new Jin();
	private Di di = new Di();
	private Huo huo = new Huo();
	private Mu mu = new Mu();
	private Tu tu = new Tu();
	private Tian tian = new Tian();
	private Hai hai = new Hai();
	private YueQiu yueQiu  = new YueQiu();
	
	/**
	 * 初始化图片
	 */
	static{
		try
		{
			background_ = ImageIO.read(Air.class.getResource("background.png"));
			tai_ = ImageIO.read(Air.class.getResource("tai.png"));
			shui_ = ImageIO.read(Air.class.getResource("shui.png"));
			jin_ = ImageIO.read(Air.class.getResource("jin.png"));
			di_ = ImageIO.read(Air.class.getResource("di.png"));
			huo_ = ImageIO.read(Air.class.getResource("huo.png"));
			mu_ = ImageIO.read(Air.class.getResource("mu.png"));
			tu_ = ImageIO.read(Air.class.getResource("tu.png"));
			tian_ = ImageIO.read(Air.class.getResource("tian.png"));
			hai_ = ImageIO.read(Air.class.getResource("hai.png"));
			yue_ = ImageIO.read(Air.class.getResource("yue.png"));
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/** 
	 * 画
	 */
 
	public void paint(Graphics g)
	{
		//super.paint(g);
		g.drawImage(background_, 0, 0, getWidth(), getHeight(), null);
		g.drawImage(tai_, getWidth()/2, getHeight()/2, IMAGE_WIDTH, IMAGE_HEIGHT, null);
		cvDraw(g);
		plantsLine(g);
	}
	
	/**
	 * 移动
	 */
	public void moveAction(){
		shui.move(getWidth()/2, getHeight()/2,130, 60);
		jin.move(getWidth()/2, getHeight()/2,200, 100);
		di.move(getWidth()/2, getHeight()/2,270, 140);
		huo.move(getWidth()/2, getHeight()/2,340, 180);
		mu.move(getWidth()/2, getHeight()/2,410, 220);
		tu.move(getWidth()/2, getHeight()/2,480, 260);
		tian.move(getWidth()/2, getHeight()/2,550, 300);
		hai.move(getWidth()/2, getHeight()/2,620, 340);
		yueQiu.move(di.getX()+10, di.getY()+10,30, 10);
	}
	
	/**
	 * 八大行星绘图
	 * @param g
	 */
	public void cvDraw(Graphics g){
		g.drawImage(shui.getImage(), shui.getX(), shui.getY(), IMAGE_WIDTH, IMAGE_HEIGHT, null);
		g.drawImage(jin.getImage(), jin.getX(), jin.getY(), IMAGE_WIDTH, IMAGE_HEIGHT, null);
		g.drawImage(di.getImage(), di.getX(), di.getY(), IMAGE_WIDTH, IMAGE_HEIGHT, null);
		g.drawImage(huo.getImage(), huo.getX(), huo.getY(), IMAGE_WIDTH, IMAGE_HEIGHT, null);
		g.drawImage(mu.getImage(), mu.getX(), mu.getY(), IMAGE_WIDTH, IMAGE_HEIGHT, null);
		g.drawImage(tu.getImage(), tu.getX(), tu.getY(), IMAGE_WIDTH, IMAGE_HEIGHT, null);
		g.drawImage(tian.getImage(), tian.getX(), tian.getY(), IMAGE_WIDTH, IMAGE_HEIGHT, null);
		g.drawImage(hai.getImage(), hai.getX(), hai.getY(), IMAGE_WIDTH, IMAGE_HEIGHT, null);
		g.drawImage(yueQiu.getImage(), yueQiu.getX(), yueQiu.getY(), IMAGE_WIDTH/3, IMAGE_HEIGHT/3, null);
	}
	
	/**
	 * 八大行星轨迹
	 */
	public void plantsLine(Graphics g){
		g.setColor(new Color(255, 255, 255));
		g.drawOval(WIDTH/2-80, HEIGHT/2-40, 200, 110);
		g.drawOval(WIDTH/2-170, HEIGHT/2-80, 390, 200);
		g.drawOval(WIDTH/2-260, HEIGHT/2-120, 560, 270);
		g.drawOval(WIDTH/2-330, HEIGHT/2-160, 690, 360);
		g.drawOval(WIDTH/2-380, HEIGHT/2-200, 800, 430);
		g.drawOval(WIDTH/2-450, HEIGHT/2-250, 930, 520);
		g.drawOval(WIDTH/2-520, HEIGHT/2-300, 1060, 610);
	}

	/**
	 * 执行
	 */
	public void action(){
		
		
//		MouseAdapter mouse = new MouseAdapter()
//		{
//
//			@Override
//			public void mouseClicked(MouseEvent e)
//			{
//	
//				state = RUNING;
//			}
//
//			@Override
//			public void mouseExited(MouseEvent e)
//			{
//				if(state == RUNING)
//				state = PAUSE;
//			}
//		};
//		
//		this.addMouseListener(mouse);
		
		timer = new Timer();
		timer.schedule(new TimerTask()
		{
			@Override
			public void run()
			{
				if (state == RUNING)
				{
					moveAction();
					repaint();
				}
			}
		}, 1, 1);
	}
}
