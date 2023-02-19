package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import controller.dieu_kien;

import java.awt.Rectangle;
import java.awt.Window;

import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class giao_dien_vao_hoc extends JFrame {
	public JFrame jf;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					giao_dien_vao_hoc frame = new giao_dien_vao_hoc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public giao_dien_vao_hoc() {
		setTitle("KIDENGLISH");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Download\\Hinh_Anh\\anh-avatar-dep-62.jpg"));
		setResizable(false);
		setBounds(100, 100, 638, 419);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.setSize(705, 805);

		setContentPane(contentPane);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new LineBorder(new Color(30, 144, 255), 2, true));
		comboBox.setBackground(new Color(0, 255, 255));
		comboBox.setBounds(494, 112, 146, 32);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"học cách chào hỏi và giao tiếp", "học từ vựng về cơ thể", "ôn tập kiến thức về lớp 3-4", "học bản chử cái", "học bản số đếm", "học từ vựng về gia đình", "học từ vựng về màu sắc", "ôn tập kiến thức lớp 1-2", "học từ vựng về động vật", "học từ vựng về phương tiện giao thông"}));
		comboBox.setVerifyInputWhenFocusTarget(false);
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
		comboBox.setEditable(true);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(636, 98, 53, 48);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\Search-icon.png"));
		contentPane.setLayout(null);
		contentPane.add(comboBox);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\tieude3vaohoc.png"));
		lblNewLabel.setBounds(222, 0, 243, 93);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Lớp 3-4");
		btnNewButton.setForeground(new Color(139, 0, 0));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 34));
		btnNewButton.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
		btnNewButton.setBounds(199, 575, 266, 105);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Lớp 2-3");
		btnNewButton_1.setForeground(new Color(0, 139, 139));
		btnNewButton_1.setFont(new Font("Sitka Text", Font.BOLD, 32));
		btnNewButton_1.setBorder(new LineBorder(new Color(30, 144, 255), 3, true));
		btnNewButton_1.setBounds(199, 412, 266, 105);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Lớp 1-2");
		btnNewButton_2.setForeground(new Color(255, 165, 0));
		btnNewButton_2.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		btnNewButton_2.setBorder(new LineBorder(new Color(255, 140, 0), 3, true));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(199, 248, 266, 105);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton((String) null);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				giao_dien gd = new giao_dien();
				
			}
		});
		btnNewButton_3.setBorder(UIManager.getBorder("RadioButton.border"));
		btnNewButton_3.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\icons8-home-page-50.png"));
		btnNewButton_3.setBounds(10, 17, 48, 42);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\icons8-cloud-64.png"));
		lblNewLabel_2.setBounds(187, 36, 64, 64);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\icons8-cloud-64.png"));
		lblNewLabel_2_1.setBounds(451, 17, 64, 64);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\cro2.png"));
		lblNewLabel_3.setBounds(-4, 645, 120, 113);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\icons8-cloud-64.png"));
		lblNewLabel_2_2.setBounds(71, 305, 64, 64);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\icons8-cloud-64.png"));
		lblNewLabel_2_3.setBounds(559, 561, 64, 64);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("");
		lblNewLabel_2_3_1.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\icons8-cloud-64.png"));
		lblNewLabel_2_3_1.setBounds(-19, 475, 64, 64);
		contentPane.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("");
		lblNewLabel_2_3_2.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\icons8-cloud-64.png"));
		lblNewLabel_2_3_2.setBounds(593, 248, 64, 64);
		contentPane.add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_3_2_1 = new JLabel("");
		lblNewLabel_2_3_2_1.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\icons8-cloud-64.png"));
		lblNewLabel_2_3_2_1.setBounds(411, 378, 64, 64);
		contentPane.add(lblNewLabel_2_3_2_1);
		
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
