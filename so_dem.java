package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class so_dem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					so_dem frame = new so_dem();
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
	public so_dem() {
		setResizable(false);
		setTitle("KIDENGLISH");
		setIconImage(Toolkit.getDefaultToolkit().getImage(giao_dien.class.getResource("/Data/images.jpg")));
		setBounds(100, 100, 638, 419);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Dimension mh = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize(691, mh.height-45);

		setContentPane(contentPane);
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_4.setIcon(new ImageIcon(giao_dien.class.getResource("/Data/moon.png")));

			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_4.setIcon(new ImageIcon(giao_dien.class.getResource("/Data/icons8-smiling-sun-100.png")));

				
			}
		});
		SpringLayout sl_contentPane = new SpringLayout();
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 19, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_4, 550, SpringLayout.WEST, contentPane);
		contentPane.setLayout(sl_contentPane);
		lblNewLabel_4.setIcon(new ImageIcon(giao_dien.class.getResource("/Data/icons8-smiling-sun-100.png")));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 2, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 224, SpringLayout.WEST, contentPane);
		lblNewLabel.setIcon(new ImageIcon(giao_dien.class.getResource("/Data/tieude3vaohoc.png")));
		contentPane.add(lblNewLabel);
		
		
		
		JButton btnNewButton_3 = new JButton((String) null);
		btnNewButton_3.setPreferredSize(new Dimension(33, 45));
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_3, 19, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_3, 12, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_3, 60, SpringLayout.WEST, contentPane);
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_3.setBounds(10, 17, 51, 45);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_3.setBounds(10, 17, 48, 42);
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				giao_dien gd = new giao_dien();
				
			}
		});
		
		btnNewButton_3.setBorder(UIManager.getBorder("RadioButton.border"));
		btnNewButton_3.setIcon(new ImageIcon(giao_dien.class.getResource("/Data/icons8-home-page-50.png")));
		contentPane.add(btnNewButton_3);
		
		JButton back = new JButton((String) null);
		back.setPreferredSize(new Dimension(33, 45));
		sl_contentPane.putConstraint(SpringLayout.NORTH, back, 71, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, back, 12, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, back, 60, SpringLayout.WEST, contentPane);
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				back.setBounds(10, 69, 51, 45);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				back.setBounds(10, 69, 48, 42);
			}
		});
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				giao_dien_vao_hoc vh = new giao_dien_vao_hoc();
				
			}
		});
		
		back.setBorder(UIManager.getBorder("RadioButton.border"));
		back.setIcon(new ImageIcon(giao_dien.class.getResource("/Data/icons8-left-arrow-50.png")));
		contentPane.add(back);
		
		JLabel lblNewLabel_2 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 38, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2, 189, SpringLayout.WEST, contentPane);
		lblNewLabel_2.setIcon(new ImageIcon(giao_dien.class.getResource("/Data/icons8-cloud-64.png")));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2_1, 19, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2_1, 453, SpringLayout.WEST, contentPane);
		lblNewLabel_2_1.setIcon(new ImageIcon(giao_dien.class.getResource("/Data/icons8-cloud-64.png")));
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2_2, 58, SpringLayout.SOUTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_2_2, -244, SpringLayout.EAST, contentPane);
		lblNewLabel_2_2.setIcon(new ImageIcon(giao_dien.class.getResource("/Data/icons8-cloud-64.png")));
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2_3, 647, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2_3, 524, SpringLayout.WEST, contentPane);
		lblNewLabel_2_3.setIcon(new ImageIcon(giao_dien.class.getResource("/Data/icons8-cloud-64.png")));
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2_3_1, 477, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2_3_1, -17, SpringLayout.WEST, contentPane);
		lblNewLabel_2_3_1.setIcon(new ImageIcon(giao_dien.class.getResource("/Data/icons8-cloud-64.png")));
		contentPane.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2_3_2, 250, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2_3_2, 595, SpringLayout.WEST, contentPane);
		lblNewLabel_2_3_2.setIcon(new ImageIcon(giao_dien.class.getResource("/Data/icons8-cloud-64.png")));
		contentPane.add(lblNewLabel_2_3_2);
		
		JLabel lblNewLabel_2_3_2_1 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_2_3_2_1, 380, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2_3_2_1, 413, SpringLayout.WEST, contentPane);
		lblNewLabel_2_3_2_1.setIcon(new ImageIcon(giao_dien.class.getResource("/Data/icons8-cloud-64.png")));
		contentPane.add(lblNewLabel_2_3_2_1);
		
		JButton btnNewButton = new JButton("ấn chuyển về từ trước");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 311, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 73, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ấn chuyển đến từ sau");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1, 0, SpringLayout.SOUTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, 0, SpringLayout.EAST, lblNewLabel_2_3);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Hiển thị ảnh từ vựng");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 21, SpringLayout.SOUTH, lblNewLabel_2_2);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 199, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -6, SpringLayout.NORTH, lblNewLabel_2_3_2_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, lblNewLabel_2_3_2_1);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Hiển thị tên từ vựng");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 72, SpringLayout.SOUTH, lblNewLabel_2_3_2_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_3, 205, SpringLayout.EAST, lblNewLabel_2_3_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, 216, SpringLayout.SOUTH, lblNewLabel_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_3, 12, SpringLayout.EAST, lblNewLabel_2_2);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("Ấn nghe phát âm");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_2, 6, SpringLayout.SOUTH, lblNewLabel_2_3);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_2, 10, SpringLayout.WEST, lblNewLabel_2_3);
		contentPane.add(btnNewButton_2);
		
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
