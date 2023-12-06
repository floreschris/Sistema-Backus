package com.flowired.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;

public class LoginBackus extends JFrame {

	private JPanel panel_control;
	private JTextField txtUsuario;
	private JPasswordField passwordField;

	public void Limpiar() {

		txtUsuario.setText("");
		passwordField.setText("");

	}

	public LoginBackus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 800);
		panel_control = new JPanel();
		panel_control.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel_control);
		panel_control.setLayout(null);

		JLabel lblUsu = new JLabel("");
		lblUsu.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-usuario-masculino-en-c\u00EDrculo-96.png"));
		lblUsu.setBounds(1120, 38, 98, 80);
		panel_control.add(lblUsu);

		JLabel lblhuella = new JLabel("");
		lblhuella.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\fingerprint-regular-24.png"));
		lblhuella.setBounds(1093, 436, 24, 65);
		panel_control.add(lblhuella);

		JLabel lbladorno = new JLabel("");
		lbladorno.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\git-merge-regular-24.png"));
		lbladorno.setBounds(824, 421, 80, 94);
		panel_control.add(lbladorno);

		JLabel lblLogin = new JLabel("Log In");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(856, 178, 219, 44);
		panel_control.add(lblLogin);

		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 50));
		txtUsuario.setBackground(UIManager.getColor("Button.disabledForeground"));
		txtUsuario.setBounds(867, 244, 239, 50);
		panel_control.add(txtUsuario);
		txtUsuario.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 50));
		passwordField.setBackground(UIManager.getColor("Button.disabledForeground"));
		passwordField.setBounds(867, 333, 239, 50);
		panel_control.add(passwordField);

		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\hand-right-solid-24.png"));
		btnIngresar.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btnIngresar.setBackground(Color.GRAY);
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Menu M = new Menu();

				String usuario = txtUsuario.getText();
				String password = passwordField.getText();

				try {
					if (usuario.isEmpty() || password.isEmpty()) {

						JOptionPane.showMessageDialog(null, "Complete la informacion...");

					} else {
						if (usuario.equalsIgnoreCase("admin") && password.equalsIgnoreCase("1234")) {

							JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
							M.setVisible(true);
							M.setLocationRelativeTo(null);
							M.setTitle("Menu");

						} else if (usuario.equalsIgnoreCase("flores@test.com") && password.equalsIgnoreCase("12345")) {

							JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
							M.setVisible(true);
							M.setLocationRelativeTo(null);
							M.setTitle("Menu");
						}
					}

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Informacion Incorrecta...");
				}

				Limpiar();
			}
		});
		btnIngresar.setBounds(867, 453, 216, 32);
		panel_control.add(btnIngresar);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\window-close-regular-24.png"));
		btnSalir.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		btnSalir.setBackground(Color.GRAY);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});
		btnSalir.setBounds(867, 514, 216, 34);
		panel_control.add(btnSalir);

		JLabel lblFondo = new JLabel("");
		lblFondo.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		lblFondo.setBackground(new Color(0, 204, 255));
		lblFondo.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\Black Modern Website Desktop Prototype .png"));
		lblFondo.setBounds(0, 0, 1264, 777);
		panel_control.add(lblFondo);
	}
}
