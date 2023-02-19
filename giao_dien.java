package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.Canvas;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Label;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;

import javax.swing.DropMode;
import javax.swing.JComboBox;
import javax.swing.JComponent;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Insets;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.RootPaneContainer;
import javax.swing.border.LineBorder;

import controller.dieu_kien;

import java.awt.Window.Type;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.JDesktopPane;
import javax.swing.JList;
import javax.swing.JTable;
import java.util.Locale;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class giao_dien extends JFrame {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	
			
										
			
	

	class RoundBtn implements Border 
	{
	    private int r;
	    RoundBtn(int r) {
	        this.r = r;
	    }
	    public Insets getBorderInsets1(Component c) {
	        return new Insets(this.r+1, this.r+1, this.r+2, this.r);
	    }
	    public boolean isBorderOpaque() {
	        return true;
	    }
	    public void paintBorder1(Component c, Graphics g, int x, int y, 
	    int width, int height) {
	        g.drawRoundRect(x, y, width-1, height-1, r, r);
	    }
		@Override
		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public Insets getBorderInsets(Component c) {
			// TODO Auto-generated method stub
			return null;
		}
	}
	/**
	 * Create the frame.
	 */
	public giao_dien() {
		
		ActionListener ac = new dieu_kien(this);
		setBackground(new Color(240, 230, 140));
	
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Download\\Hinh_Anh\\anh-avatar-dep-62.jpg"));
		setTitle("KIDENGLISH");
		
		
		this.setSize(705, 805);
		contentPane = new JPanel();
		contentPane.setVerifyInputWhenFocusTarget(false);
		contentPane.setDoubleBuffered(false);
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));

		setContentPane(contentPane);
		
		
		JButton btnNewButton_2 = new JButton("Làm kiểm tra");
		
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_2.setBackground(Color.LIGHT_GRAY);
				btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 32));
				btnNewButton_2.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\icons8-book-and-pencil-100.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_2.setBackground(Color.WHITE);
				btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 32));
				btnNewButton_2.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\no_pen.png"));
			}
		});
		
		btnNewButton_2.setBounds(148, 479, 411, 134);
		btnNewButton_2.setForeground(new Color(191, 40, 45));
		btnNewButton_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 32));
		btnNewButton_2.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\no_pen.png"));
		
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\goi_y1.png"));
		lblNewLabel_4.setBounds(10, 462, 346, 236);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.hide();
		
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				giao_dien_kiem_tra kt = new giao_dien_kiem_tra();
			}
		});
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(0, 255, 255));
		comboBox.setBorder(new LineBorder(new Color(30, 144, 255), 2));
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comboBox.setVerifyInputWhenFocusTarget(false);
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"học cách chào hỏi và giao tiếp", "học từ vựng về cơ thể", "ôn tập kiến thức về lớp 3-4", "học bản chử cái", "học bản số đếm", "học từ vựng về gia đình", "học từ vựng về màu sắc", "ôn tập kiến thức lớp 1-2", "học từ vựng về động vật", "học từ vựng về phương tiện giao thông"}));
		comboBox.setBounds(446, 30, 176, 39);
		contentPane.add(comboBox);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(112, 156, 70, -65);
		contentPane.add(desktopPane);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\icons8-cloud-64.png"));
		lblNewLabel_2.setBounds(630, 80, 70, 55);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Vào Học");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_1.setBackground(Color.LIGHT_GRAY);
				btnNewButton_1.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\doc.png"));
				btnNewButton_1.setFont(new Font("Ebrima", Font.BOLD | Font.ITALIC, 35));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setBackground(Color.WHITE);
				btnNewButton_1.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\ko_doc.png"));
				btnNewButton_1.setFont(new Font("Ebrima", Font.BOLD | Font.ITALIC, 35));
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				giao_dien_vao_hoc vh = new giao_dien_vao_hoc();
			}
		});
		btnNewButton_1.addActionListener(ac);
		btnNewButton_1.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\ko_doc.png"));
		btnNewButton_1.setFont(new Font("Ebrima", Font.BOLD | Font.ITALIC, 35));
		btnNewButton_1.setMnemonic(KeyEvent.VK_AMPERSAND);
		btnNewButton_1.setForeground(new Color(160, 82, 45));
		
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(212, 171, 283, 191);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\icons8-cloud-64.png"));
		lblNewLabel_2_1.setBounds(34, 197, 70, 55);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\icons8-cloud-64.png"));
		lblNewLabel_2_1_1.setBounds(112, 448, 70, 55);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\Search-icon.png"));
		lblNewLabel_1.setBounds(620, 20, 59, 49);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\icons8-cloud-64.png"));
		lblNewLabel_2_1_1_1.setBounds(544, 396, 70, 55);
		contentPane.add(lblNewLabel_2_1_1_1);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_4.show();
			}
			
			@Override
			public void mouseExited(MouseEvent e) {	
				lblNewLabel_4.hide();
			}
		});
		lblNewLabel.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\coro1.png"));
		lblNewLabel.setBounds(10, 669, 96, 86);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\tieude3.png"));
		lblNewLabel_3.setBounds(10, 11, 243, 93);
		contentPane.add(lblNewLabel_3);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
