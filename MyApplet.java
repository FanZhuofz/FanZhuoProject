package test.java.fans;

import java.awt.*;

import javax.swing.*;

public class MyApplet extends JFrame {		//���췽������������
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyApplet() {
		super("��ʾ���塢��ɫ����ͼ");				//���û��๹�췽�������ô��ڱ���
		setSize(470,320);				//���ô��ڴ�С
		setVisible(true);				//��ʾ����
	}

	public void paint(Graphics g) {
		
	super.paint(g);
	
	g.drawLine(20, 60, 460, 60);		//����ֱ��
	g.setFont(new Font("SansSerif",Font.BOLD,12));		//��������
	g.setColor(Color.blue);				//������ɫ
	g.drawString("����: SansSerif,����,12��,��ɫ", 20, 50);	//�����ַ���
	g.setFont(new Font("SansSerif",Font.BOLD,12));
	g.drawString("����:��׿", 250, 50);
	
	g.drawLine(20, 90, 460, 90);		//����ֱ��
	g.setFont(new Font("���Ŀ���",Font.BOLD,14));		//��������
	g.setColor(Color.green);				//������ɫ
	g.drawString("����: ���Ŀ���,����,14��,��ɫ", 20, 80);	//�����ַ���
	g.setFont(new Font("���Ŀ���",Font.BOLD,14));
	g.drawString("�Ա�:��", 280, 80);
	
	g.drawLine(20, 120, 460, 120);		//����ֱ��
	g.setFont(new Font("���Ĳ���",Font.BOLD,16));		//��������
	g.setColor(Color.orange);				//������ɫ
	g.drawString("����: ���Ĳ���,����,16��,��ɫ", 20, 110);	//�����ַ���
	g.setFont(new Font("���Ĳ���",Font.BOLD,16));
	g.drawString("����:����", 310, 110);
	
	g.setColor(Color.cyan);
	g.draw3DRect(20, 130, 100, 50, true);		//��������άͻ��Ч���Ŀ��ľ���
	g.fill3DRect(130, 130, 100, 50, false);		//��������ά����Ч����ʵ�ľ���
	
	g.setColor(Color.pink);
	g.drawOval(240, 130, 100, 50);		//���ƿ�����Բ
	g.fillOval(350, 130, 100, 50);		//����ʵ����Բ
	g.setColor(new Color(0,120,20));
	g.drawArc(20, 190, 100, 50, 0, 90);		//����һ��Բ��
	g.fillArc(130, 190, 100, 50, 0, 90);		//�������Σ�������Բ�������뾶Ȧ��
	
	g.setColor(Color.black);
	int xValues[] = {250, 280, 290, 300, 330, 310, 320, 290, 260, 270};
	int yValues[] = {210, 210, 190, 210, 210, 220, 230, 220, 230, 220};
	g.drawPolygon(xValues, yValues, 10);			//���ƿ��Ķ����
	
	int xValues2[] = {360, 390, 400, 410, 440, 420, 430, 400, 370, 380};
	g.fillPolygon(xValues2, yValues, 10);		//����ʵ�Ķ����
	
	g.setColor(Color.green);
	g.drawRect(20, 250, 100, 50);		//���ƿ��ľ���
	g.fillRect(130,250, 100, 50);		//����ʵ�ľ���
	
	g.setColor(Color.yellow);
	g.drawRoundRect(240, 250, 100, 50, 50, 50);		//���ƿ���Բ�Ǿ���
	g.fillRoundRect(350, 250, 100, 50, 50, 50);		//����ʵ��Բ�Ǿ���
	
	}

	public static void main(String[] args) {
		extracted();
											//���ô��ڵ���۸о�ΪJavaĬ��
		MyApplet application = new MyApplet();
											//����GraphicsTester���һ��ʵ��
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	private static void extracted() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		}
	}
	
