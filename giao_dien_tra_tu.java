package view;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class giao_dien_tra_tu extends JFrame {

	private JPanel contentPane;
	private JTextField tra_tu;

	
	public static void main(String[] args) {
		new giao_dien_tra_tu();
	}

	
	
	public giao_dien_tra_tu() {
		setTitle("KIDENGLISH");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Download\\Hinh_Anh\\images.jpg"));
		setResizable(false);
		setBounds(100, 100, 638, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.setSize(705, 805);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\buttomHome_en.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\buttomHome.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				giao_dien gd = new giao_dien();
			}
		});
		
		
		
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\goi_y_tra_tu.png"));
		lblNewLabel_8.setBounds(-41, 489, 346, 236);
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.hide();
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\traTu1.png"));
		lblNewLabel_7.setBounds(50, 583, 158, 118);
		contentPane.add(lblNewLabel_7);
		
		
//// Cần chèn thật toán tra từ vựng {
		
// Vùng hiển thị từ đã tiềm được  [
		
		JLabel lblNewLabel_6 = new JLabel("hêlo");
		lblNewLabel_6.setForeground(new Color(255, 255, 0));
		lblNewLabel_6.setFont(new Font("Sylfaen", Font.BOLD, 30));
		lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6.setBorder(new LineBorder(new Color(255, 127, 80), 5, true));
		lblNewLabel_6.setBounds(119, 274, 453, 256);
		contentPane.add(lblNewLabel_6);
		
// ]
			
// Vùng nhập từ cần tra [
		
		tra_tu = new JTextField();
		tra_tu.setFont(new Font("Tahoma", Font.BOLD, 15));
		tra_tu.setToolTipText("Điền vào từ vựng cần tìm");
		tra_tu.setBorder(new LineBorder(new Color(171, 173, 179), 3, true));
		tra_tu.setBounds(64, 143, 277, 51);
		contentPane.add(tra_tu);
		tra_tu.setColumns(10);
		
//  ]
		
// Vùng audio nghe phát âm từ vựng " cần thuật toán chạy file audio nghe cách phát âm" [
		
		JLabel lblNewLabel_9 = new JLabel("");
		
		lblNewLabel_9.setToolTipText("Ấn vào để nghe cách đọc"); // tip chú thích chức năng
		
		lblNewLabel_9.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\Hinh\\button (11).png")); 
		lblNewLabel_9.setBounds(508, 473, 54, 46);
		contentPane.add(lblNewLabel_9);
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {  // sự kiện xãy ra khi nhấn chuột vào " cần thuật toán chạy file audio nghe cách phát âm" 
			
			}
			@Override
			public void mouseEntered(MouseEvent e) { 
				lblNewLabel_9.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\Hinh\\button (13).png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_9.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\Hinh\\button (11).png"));
			}
		});
		
// ]
	
////  }
		
		
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\buttomHome.png"));
		lblNewLabel_1.setBounds(-4, 0, 86, 86);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\tieude3vaohoc.png"));
		lblNewLabel.setBounds(210, 11, 243, 93);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_8.show();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_8.hide();
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\icon1goi_y_Tra_Tu.png"));
		lblNewLabel_3.setBounds(10, 680, 86, 86);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\Search-icon.png"));
		lblNewLabel_4.setBounds(24, 154, 58, 51);
		contentPane.add(lblNewLabel_4);
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\background.png"));
		lblNewLabel_5.setBounds(0, 0, 689, 766);
		contentPane.add(lblNewLabel_5);
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Download\\Hinh_Anh\\goi_y_vao_hoc.png"));
		lblNewLabel_2.setBounds(10, 443, 346, 236);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.hide();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
