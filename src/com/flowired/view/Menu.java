package com.flowired.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;

import javax.swing.event.AncestorEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.UIManager;

public class Menu extends JFrame {

	private JPanel contentPane;

	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 800);
		contentPane = new JPanel();
		contentPane.setAlignmentY(5.0f);
		contentPane.setAlignmentX(212.0f);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblImg_4 = new JLabel("");
		lblImg_4.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-no-bebidas-100 (1).png"));
		lblImg_4.setBounds(209, 659, 111, 102);
		contentPane.add(lblImg_4);

		JLabel lblImg_2 = new JLabel("");
		lblImg_2.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-no-bebidas-100 (2).png"));
		lblImg_2.setBounds(115, 648, 116, 138);
		contentPane.add(lblImg_2);

		JLabel lblImg_6 = new JLabel("");
		lblImg_6.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-botella-de-cerveza-100.png"));
		lblImg_6.setBounds(419, 637, 86, 138);
		contentPane.add(lblImg_6);

		JLabel lblImg_8 = new JLabel("");
		lblImg_8.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-jarra-de-luna-100.png"));
		lblImg_8.setBounds(1143, 159, 111, 149);
		contentPane.add(lblImg_8);

		JLabel lblTitul = new JLabel("Bienvenido a la empresa Backus");
		lblTitul.setForeground(Color.WHITE);
		lblTitul.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitul.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 70));
		lblTitul.setBounds(10, 116, 1254, 138);
		contentPane.add(lblTitul);

		JLabel lblImg_9 = new JLabel("");
		lblImg_9.setBounds(348, 637, 100, 149);
		contentPane.add(lblImg_9);
		lblImg_9.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-cerveza-guinness-96.png"));

		JLabel lblImg = new JLabel("");
		lblImg.setBounds(280, 670, 100, 102);
		contentPane.add(lblImg);
		lblImg.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-no-bebidas-96.png"));

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(UIManager.getColor("Button.darkShadow"));
		menuBar.setBounds(0, 0, 1264, 105);
		contentPane.add(menuBar);

		JMenu mnNewMenu_4 = new JMenu("Empleado");
		mnNewMenu_4.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-tarjeta-de-empleado-96.png"));
		mnNewMenu_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		menuBar.add(mnNewMenu_4);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Empleado");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Empleado E = new Empleado();
				E.setVisible(true);
				E.setLocationRelativeTo(null);
				E.setTitle("SECCION EMPLEADOS");

			}
		});
		mntmNewMenuItem_5.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-sala-de-reuniones-96.png"));
		mntmNewMenuItem_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		mnNewMenu_4.add(mntmNewMenuItem_5);

		JMenu mnNewMenu_5 = new JMenu("Producto");
		mnNewMenu_5.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-grocery-shelf-96.png"));
		mnNewMenu_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		menuBar.add(mnNewMenu_5);

		JMenuItem mntmNewMenuItem_4_1 = new JMenuItem("Producto");
		mntmNewMenuItem_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Producto P = new Producto();
				P.setVisible(true);
				P.setLocationRelativeTo(null);
				P.setTitle("SECCION DE PRODUCTOS");

			}
		});
		mntmNewMenuItem_4_1.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-cerveza-guinness-96 (1).png"));
		mntmNewMenuItem_4_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		mnNewMenu_5.add(mntmNewMenuItem_4_1);

		JMenu mnNewMenu_2 = new JMenu("Venta");
		mnNewMenu_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		mnNewMenu_2.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-precio-de-venta-96.png"));
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ventas");
		mntmNewMenuItem_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Venta V = new Venta();
				V.setVisible(true);
				V.setLocationRelativeTo(null);
				V.setTitle("SECCION VENTAS");

			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-transferencia-de-dinero-96.png"));
		mnNewMenu_2.add(mntmNewMenuItem_2);

		JMenu mnNewMenu_1 = new JMenu("Proveedor");
		mnNewMenu_1.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-proveedor-96.png"));
		mnNewMenu_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 39));
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Proveedores");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Proveedor P = new Proveedor();
				P.setVisible(true);
				P.setLocationRelativeTo(null);
				P.setTitle("SECCION PROVEEDORES");

			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-proveedor-de-datos-96.png"));
		mntmNewMenuItem_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		mnNewMenu_1.add(mntmNewMenuItem_1);

		JMenu mnNewMenu = new JMenu("Salir");
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});
		mnNewMenu.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-cancelar-96.png"));
		mnNewMenu.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-cancelar-96 (1).png"));
		mnNewMenu.add(mntmNewMenuItem);

		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\wallpaper-abstracto-3d (1).jpg"));
		lblFondo.setBounds(0, 105, 1264, 670);
		contentPane.add(lblFondo);
	}
}
