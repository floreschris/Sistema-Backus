package com.flowired.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Proveedor extends JFrame {

	private JPanel rdbtnT;
	private JTextField txtCantidad;
	private JTextField txtTipo;
	private JTextField txtRemuneracion;
	private JTextField txtCompra;
	private JTextField txtVenta;
	private JTextField txtGanancia;
	private JTextField txtIdDistrito;
	private JTextField txtNombreDistrito;
	private JTextField txtSelecion;

	public void LimpiarDatos() {

		txtCantidad.setText("");
		txtGanancia.setText("");
		txtRemuneracion.setText("");
		txtTipo.setText("");
		txtCompra.setText("");
		txtVenta.setText("");
		txtIdDistrito.setText("");
		txtNombreDistrito.setText("");
		txtSelecion.setText("");

	}

	public Proveedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 800);
		rdbtnT = new JPanel();
		rdbtnT.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(rdbtnT);
		rdbtnT.setLayout(null);

		JLabel lblNewLabel = new JLabel("CALCULO DE PROVEEDORES");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 67));
		lblNewLabel.setBounds(0, 0, 1264, 72);
		rdbtnT.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Sistema de remuneracion de la empres Backus");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 44));
		lblNewLabel_1.setBounds(23, 94, 867, 56);
		rdbtnT.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Datos agente");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-real-estate-agent-skin-type-4-48.png"));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setBounds(47, 181, 305, 56);
		rdbtnT.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Datos importantes");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-correo-48.png"));
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2_1.setBounds(856, 184, 305, 56);
		rdbtnT.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("Nombre");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setBackground(Color.WHITE);
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2_2.setBounds(23, 477, 137, 56);
		rdbtnT.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_2_1 = new JLabel("Id Proveedor");
		lblNewLabel_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2_2_1.setBounds(23, 322, 172, 56);
		rdbtnT.add(lblNewLabel_2_2_1);

		JComboBox comboBoxPersonal = new JComboBox();
		comboBoxPersonal.setBackground(Color.LIGHT_GRAY);
		comboBoxPersonal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		comboBoxPersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int telefono;
				String nombres = "";
				String id_Distrito = "", nombreDistrito;
				String tipo = comboBoxPersonal.getSelectedItem().toString();
				txtTipo.setText(tipo);

				if (tipo.equalsIgnoreCase("M0001") || id_Distrito.equalsIgnoreCase("CO1")) {

					telefono = 991579760;

					txtRemuneracion.setText(String.valueOf(telefono));
					nombres = "AQUINO SERPA IRINIA DANIELA";
					txtCantidad.setText(nombres);

					nombreDistrito = "Los Olivos";
					txtNombreDistrito.setText(nombreDistrito);
					txtIdDistrito.setText("C01");

				} else if (tipo.equalsIgnoreCase("M0002") || id_Distrito.equalsIgnoreCase("CO2")) {

					telefono = 991579212;
					txtRemuneracion.setText(String.valueOf(telefono));
					nombres = "BENITO AVILA EDITH BERTHA";
					txtCantidad.setText(nombres);

					nombreDistrito = "San Juan de Miraflores";
					txtNombreDistrito.setText(nombreDistrito);
					txtIdDistrito.setText("CO2");

				} else if (tipo.equalsIgnoreCase("M0003") || id_Distrito.equalsIgnoreCase("CO3")) {

					telefono = 991579455;
					txtRemuneracion.setText(String.valueOf(telefono));
					nombres = "BRAVO GALVEZ ALFREDO JAVIER";
					txtCantidad.setText(nombres);
					nombreDistrito = "Miraflores";
					txtNombreDistrito.setText(nombreDistrito);
					txtIdDistrito.setText("CO3");

				} else if (tipo.equalsIgnoreCase("M0004") || id_Distrito.equalsIgnoreCase("CO4")) {

					telefono = 991578148;
					txtRemuneracion.setText(String.valueOf(telefono));
					nombres = "DIONICIO OCHOA ANA MARIA'";
					txtCantidad.setText(nombres);

					nombreDistrito = "Ventanilla";
					txtNombreDistrito.setText(nombreDistrito);
					txtIdDistrito.setText("CO4");

				} else if (tipo.equalsIgnoreCase("M0005") || id_Distrito.equalsIgnoreCase("CO5")) {

					telefono = 991576398;
					txtRemuneracion.setText(String.valueOf(telefono));
					nombres = "RAMOS VALLADARES JOSE ALEX";
					txtCantidad.setText(nombres);
					nombreDistrito = "San Miguel";
					txtNombreDistrito.setText(nombreDistrito);
					txtIdDistrito.setText("CO5");

				}

			}
		});
		comboBoxPersonal
				.setModel(new DefaultComboBoxModel(new String[] { "", "M0001", "M0002", "M0003", "M0004", "M0005" }));
		comboBoxPersonal.setBounds(233, 248, 172, 56);
		rdbtnT.add(comboBoxPersonal);

		txtCantidad = new JTextField();
		txtCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad.setBackground(Color.LIGHT_GRAY);
		txtCantidad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtCantidad.setBounds(158, 477, 378, 56);
		rdbtnT.add(txtCantidad);
		txtCantidad.setColumns(10);

		JLabel lblNewLabel_2_2_1_1 = new JLabel("Seleccion");
		lblNewLabel_2_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2_2_1_1.setBounds(23, 244, 137, 56);
		rdbtnT.add(lblNewLabel_2_2_1_1);

		txtTipo = new JTextField();
		txtTipo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTipo.setBackground(Color.LIGHT_GRAY);
		txtTipo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtTipo.setColumns(10);
		txtTipo.setBounds(233, 322, 172, 56);
		rdbtnT.add(txtTipo);

		JLabel lblNewLabel_2_2_2 = new JLabel("Telefono");
		lblNewLabel_2_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2_2.setBackground(Color.WHITE);
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2_2_2.setBounds(23, 393, 184, 56);
		rdbtnT.add(lblNewLabel_2_2_2);

		txtRemuneracion = new JTextField();
		txtRemuneracion.setHorizontalAlignment(SwingConstants.CENTER);
		txtRemuneracion.setBackground(Color.LIGHT_GRAY);
		txtRemuneracion.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		txtRemuneracion.setColumns(10);
		txtRemuneracion.setBounds(233, 394, 172, 56);
		rdbtnT.add(txtRemuneracion);

		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Seleccion");
		lblNewLabel_2_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2_2_1_1_1.setBounds(761, 251, 137, 56);
		rdbtnT.add(lblNewLabel_2_2_1_1_1);

		JLabel lblNewLabel_2_2_1_2 = new JLabel("Precio Compra");
		lblNewLabel_2_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_2_1_2.setBackground(Color.WHITE);
		lblNewLabel_2_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_1_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2_2_1_2.setBounds(761, 394, 212, 56);
		rdbtnT.add(lblNewLabel_2_2_1_2);

		txtCompra = new JTextField();
		txtCompra.setHorizontalAlignment(SwingConstants.CENTER);
		txtCompra.setBackground(Color.LIGHT_GRAY);
		txtCompra.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtCompra.setColumns(10);
		txtCompra.setBounds(1082, 398, 172, 56);
		rdbtnT.add(txtCompra);

		JLabel lblNewLabel_2_2_2_1 = new JLabel("Precio Venta");
		lblNewLabel_2_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2_2_2_1.setBounds(761, 472, 184, 56);
		rdbtnT.add(lblNewLabel_2_2_2_1);

		txtVenta = new JTextField();
		txtVenta.setHorizontalAlignment(SwingConstants.CENTER);
		txtVenta.setBackground(Color.LIGHT_GRAY);
		txtVenta.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtVenta.setColumns(10);
		txtVenta.setBounds(1082, 465, 172, 56);
		rdbtnT.add(txtVenta);

		JLabel lblNewLabel_2_2_3 = new JLabel("Ganancia");
		lblNewLabel_2_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_2_3.setBackground(Color.WHITE);
		lblNewLabel_2_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2_2_3.setBounds(761, 532, 160, 56);
		rdbtnT.add(lblNewLabel_2_2_3);

		txtGanancia = new JTextField();
		txtGanancia.setHorizontalAlignment(SwingConstants.CENTER);
		txtGanancia.setBackground(Color.LIGHT_GRAY);
		txtGanancia.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtGanancia.setColumns(10);
		txtGanancia.setBounds(970, 532, 284, 56);
		rdbtnT.add(txtGanancia);

		JButton btnNewButton = new JButton("Ganancia");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-an\u00E1lisis-de-ganancias-96.png"));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int compra, venta, ganancia;
				try {
					compra = Integer.parseInt(txtCompra.getText());
					venta = Integer.parseInt(txtVenta.getText());
					ganancia = venta - compra;
					txtGanancia.setText(String.valueOf("Ganancia de la empresa Backus " + ganancia));

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Se necesita datos.....");
				}

			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		btnNewButton.setBounds(631, 616, 295, 95);
		rdbtnT.add(btnNewButton);

		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\icons8-broom-with-a-lot-of-dust-96.png"));
		btnLimpiar.setBackground(Color.LIGHT_GRAY);
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				LimpiarDatos();

			}
		});
		btnLimpiar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		btnLimpiar.setBounds(970, 616, 267, 95);
		rdbtnT.add(btnLimpiar);

		JLabel lblNewLabel_2_2_5 = new JLabel("Id Distrito");
		lblNewLabel_2_2_5.setForeground(Color.WHITE);
		lblNewLabel_2_2_5.setBackground(Color.WHITE);
		lblNewLabel_2_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2_2_5.setBounds(23, 544, 137, 56);
		rdbtnT.add(lblNewLabel_2_2_5);

		txtIdDistrito = new JTextField();
		txtIdDistrito.setHorizontalAlignment(SwingConstants.CENTER);
		txtIdDistrito.setBackground(Color.LIGHT_GRAY);
		txtIdDistrito.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtIdDistrito.setColumns(10);
		txtIdDistrito.setBounds(316, 549, 89, 56);
		rdbtnT.add(txtIdDistrito);

		txtNombreDistrito = new JTextField();
		txtNombreDistrito.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombreDistrito.setBackground(Color.LIGHT_GRAY);
		txtNombreDistrito.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtNombreDistrito.setColumns(10);
		txtNombreDistrito.setBounds(316, 616, 220, 56);
		rdbtnT.add(txtNombreDistrito);

		JLabel lblNewLabel_2_2_5_1 = new JLabel("Nombre Distrito");
		lblNewLabel_2_2_5_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_5_1.setBackground(Color.WHITE);
		lblNewLabel_2_2_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_5_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2_2_5_1.setBounds(23, 611, 221, 56);
		rdbtnT.add(lblNewLabel_2_2_5_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String producto = comboBox.getSelectedItem().toString();

				txtSelecion.setText(producto);

			}
		});
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "", "\t Pilsen", "\t Maltin Power", "\t San Mateo", "\t Cusque\u00F1a", "\t Trujillo",
						"\t Barena", "\t Guarana", "\t Viva", "\t Ice", "\t Corona", "\t Licer", "\t Moun" }));
		comboBox.setBounds(1082, 259, 172, 53);
		rdbtnT.add(comboBox);

		JLabel lblNewLabel_2_2_1_2_1 = new JLabel("Producto");
		lblNewLabel_2_2_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_2_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_1_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2_2_1_2_1.setBounds(761, 327, 212, 56);
		rdbtnT.add(lblNewLabel_2_2_1_2_1);

		txtSelecion = new JTextField();
		txtSelecion.setHorizontalAlignment(SwingConstants.CENTER);
		txtSelecion.setBackground(Color.LIGHT_GRAY);
		txtSelecion.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtSelecion.setColumns(10);
		txtSelecion.setBounds(1082, 327, 172, 56);
		rdbtnT.add(txtSelecion);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\12541.jpg"));
		lblNewLabel_3.setBounds(0, 0, 1264, 761);
		rdbtnT.add(lblNewLabel_3);

	}
}
