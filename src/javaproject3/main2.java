package javaproject3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;

public class main2 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main2 window = new main2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\uC8FC\uC18C\uB85D \uD504\uB85C\uADF8\uB7A8");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		// 메인 화면
		JPanel mainpage = new JPanel();
		mainpage.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(mainpage);
		
		JButton inputButton = new JButton("\uB4F1\uB85D");
		inputButton.setBounds(158, 48, 123, 34);
		inputButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mainpage.setLayout(null);
		mainpage.add(inputButton);
		
		JButton deleteButton = new JButton("\uC0AD\uC81C");
		deleteButton.setBounds(158, 114, 123, 34);
		mainpage.add(deleteButton);
		
		JButton SearchButton = new JButton("\uAC80\uC0C9");
		SearchButton.setBounds(158, 179, 123, 34);
		mainpage.add(SearchButton);
		
		JPanel searchpage = new JPanel();
		searchpage.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(searchpage);
		searchpage.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(30, 28, 73, 23);
		searchpage.add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(128, 29, 268, 21);
		searchpage.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(30, 81, 367, 119);
		searchpage.add(textArea_3);
		
		JButton searchButton = new JButton("\uAC80\uC0C9");
		searchButton.setBounds(287, 210, 109, 41);
		searchpage.add(searchButton);
		
		JButton searchlastButton = new JButton("\uB3CC\uC544\uAC00\uAE30");
		searchlastButton.setBounds(168, 210, 109, 41);
		searchpage.add(searchlastButton);
	
		
		
		//등록 화면
		JPanel inputpage = new JPanel();
		inputpage.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(inputpage);
		inputpage.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(24, 37, 57, 23);
		inputpage.add(comboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(181, 36, 241, 24);
		inputpage.add(textArea);
		
		JLabel nameLabel = new JLabel("\uC774\uB984");
		nameLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		nameLabel.setBounds(102, 36, 57, 23);
		inputpage.add(nameLabel);
		
		JLabel numberLabel = new JLabel("\uC804\uD654\uBC88\uD638");
		numberLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		numberLabel.setBounds(102, 95, 88, 23);
		inputpage.add(numberLabel);
		
		JLabel adressLabel = new JLabel("\uC8FC\uC18C");
		adressLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		adressLabel.setBounds(102, 165, 57, 23);
		inputpage.add(adressLabel);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(181, 95, 241, 24);
		inputpage.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(181, 165, 241, 24);
		inputpage.add(textArea_2);
		
		JButton saveButton = new JButton("\uC800\uC7A5");
		saveButton.setBounds(209, 216, 97, 35);
		inputpage.add(saveButton);
		
		JButton lastButton = new JButton("\uB3CC\uC544\uAC00\uAE30");
		lastButton.setBounds(102, 216, 97, 35);
		inputpage.add(lastButton);
		
		//등록 화면에서 돌아가기 버튼 누르면 등록화면 없애고 메인화면 보이기
		lastButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainpage.setVisible(true);
				inputpage.setVisible(false);
				searchpage.setVisible(false);
			}
		});
				
		//등록 버튼 누르면 메인화면 없애고 등록화면 보이기
		inputButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainpage.setVisible(false);
				inputpage.setVisible(true);
				searchpage.setVisible(false);
			}
		});
		
		
		//검색 화면에서 돌아가기 버튼 누르면 검색 화면 없애고 메인화면 보이기
			searchlastButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					mainpage.setVisible(true);
					inputpage.setVisible(false);
					searchpage.setVisible(false);
				}
			});
			
			//메인화면에서 검색 버튼 누르면 메인화면 없애고 검색화면 보이기
			SearchButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					mainpage.setVisible(false);
					inputpage.setVisible(false);
					searchpage.setVisible(true);
				}
			});
		
	}
}


