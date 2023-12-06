package com.flowired.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Venta extends JFrame {
	private JPanel contentPane;
	private JTextField txtNomPro;
	private JTextField txtDescipcion;
	private JTextField txtPrecioTotal;
	private JTextField txtPreciouno;
	private JTextField txtDescuento;
	private JTextField txtCopiaNombre;
	private JTextField txtInformacion;
	private JTextField txtnumeromedicmaento;
	private JTextField txtCantidad;
	private JTextField txtPagoFinal;

	ButtonGroup group = new ButtonGroup();
	private JTextField txtTiempo;

	public void grupos(AbstractButton btn1, AbstractButton btn2, AbstractButton btn3, AbstractButton btn4,
			AbstractButton btn5) {

		group.add(btn1);
		group.add(btn2);
		group.add(btn3);
		group.add(btn4);
		group.add(btn5);

	}

	public Venta() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id_Product = comboBox.getSelectedItem().toString();
				String nomb;
				try {

					if (id_Product.equalsIgnoreCase("XY001")) {

						nomb = "Pilsen";
						txtNomPro.setText(nomb);

					} else if (id_Product.equalsIgnoreCase("XY002")) {
						nomb = "Maltin Power";
						txtNomPro.setText(nomb);

					} else if (id_Product.equalsIgnoreCase("XY003")) {
						nomb = "San Mateo";
						txtNomPro.setText(nomb);

					} else if (id_Product.equalsIgnoreCase("XY004")) {
						nomb = "Cusqueña";
						txtNomPro.setText(nomb);

					} else if (id_Product.equalsIgnoreCase("XY005")) {
						nomb = "Trujillo";
						txtNomPro.setText(nomb);

					} else if (id_Product.equalsIgnoreCase("XY006")) {
						nomb = "Barena";
						txtNomPro.setText(nomb);
					} else if (id_Product.equalsIgnoreCase("XY007")) {
						nomb = "Guarana";
						txtNomPro.setText(nomb);
					} else if (id_Product.equalsIgnoreCase("XY008")) {
						nomb = "Viva";
						txtNomPro.setText(nomb);
					} else if (id_Product.equalsIgnoreCase("XY009")) {
						nomb = "Ice";
						txtNomPro.setText(nomb);
					} else if (id_Product.equalsIgnoreCase("XY0010")) {
						nomb = "Corona";
						txtNomPro.setText(nomb);
					} else if (id_Product.equalsIgnoreCase("XY0011")) {
						nomb = "Licer";
						txtNomPro.setText(nomb);
					} else if (id_Product.equalsIgnoreCase("XY0012")) {
						nomb = "Moun";
						txtNomPro.setText(nomb);
					}

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "No se encuentra el id producto....");
				}

			}
		});

		JRadioButton rdbtnSi = new JRadioButton("Si");
		rdbtnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inco = JOptionPane.showInputDialog("¿Describa el inveniente?");
				txtDescipcion.setText(inco);

			}
		});

		txtTiempo = new JTextField();
		txtTiempo.setToolTipText("");
		txtTiempo.setHorizontalAlignment(SwingConstants.LEFT);
		txtTiempo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		txtTiempo.setColumns(10);
		txtTiempo.setBackground(SystemColor.scrollbar);
		txtTiempo.setBounds(255, 672, 308, 51);
		contentPane.add(txtTiempo);

		JLabel lblTiempo = new JLabel("Tiempo");
		lblTiempo.setForeground(Color.WHITE);
		lblTiempo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblTiempo.setBounds(23, 676, 211, 43);
		contentPane.add(lblTiempo);
		rdbtnSi.setBackground(SystemColor.controlShadow);
		rdbtnSi.setBounds(967, 115, 109, 23);
		contentPane.add(rdbtnSi);

		JLabel lblNombreProducto = new JLabel("Nombre Producto");
		lblNombreProducto.setForeground(Color.WHITE);
		lblNombreProducto.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNombreProducto.setBounds(23, 423, 178, 43);
		contentPane.add(lblNombreProducto);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "XY001", "XY002", "XY003", "XY004", "XY005",
				"XY006", "XY007", "XY008", "XY009", "XY0010", "XY0011", "XY0012" }));
		comboBox.setBounds(266, 387, 89, 29);
		contentPane.add(comboBox);

		JLabel lblNewLabel_2_3 = new JLabel("Datos Venta");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2_3.setBounds(33, 332, 302, 52);
		contentPane.add(lblNewLabel_2_3);

		JLabel lblInformacion = new JLabel("Informacion");
		lblInformacion.setForeground(Color.WHITE);
		lblInformacion.setHorizontalAlignment(SwingConstants.LEFT);
		lblInformacion.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblInformacion.setBounds(23, 292, 145, 39);
		contentPane.add(lblInformacion);

		JLabel lblFCantidad_1_1 = new JLabel("");
		lblFCantidad_1_1.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-documento-100.png"));
		lblFCantidad_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFCantidad_1_1.setBounds(584, 657, 89, 93);
		contentPane.add(lblFCantidad_1_1);

		JLabel lblFCantidad_2 = new JLabel("");
		lblFCantidad_2.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-contador-100.png"));
		lblFCantidad_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblFCantidad_2.setBounds(471, 466, 86, 51);
		contentPane.add(lblFCantidad_2);

		JLabel lblFCantidad_1 = new JLabel("");
		lblFCantidad_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFCantidad_1.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-pharmacy-shop-48.png"));
		lblFCantidad_1.setBounds(457, 528, 71, 51);
		contentPane.add(lblFCantidad_1);

		JLabel lblFCantidad = new JLabel("");
		lblFCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblFCantidad.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-promedio-64.png"));
		lblFCantidad.setBounds(413, 394, 71, 51);
		contentPane.add(lblFCantidad);

		JLabel lblSoles = new JLabel("Soles");
		lblSoles.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoles.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\badge-dollar-solid-24.png"));
		lblSoles.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblSoles.setBounds(481, 407, 97, 43);
		contentPane.add(lblSoles);

		txtnumeromedicmaento = new JTextField();
		txtnumeromedicmaento.setBackground(SystemColor.scrollbar);
		txtnumeromedicmaento.setBounds(277, 195, 109, 29);
		contentPane.add(txtnumeromedicmaento);
		txtnumeromedicmaento.setColumns(10);

		JLabel lblnromedicamento = new JLabel("Nro\u00B0 Empleado");
		lblnromedicamento.setForeground(Color.WHITE);
		lblnromedicamento.setHorizontalAlignment(SwingConstants.LEFT);
		lblnromedicamento.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblnromedicamento.setBounds(23, 188, 255, 39);
		contentPane.add(lblnromedicamento);

		JLabel lblinformedicamento = new JLabel("Codigo Empleado");
		lblinformedicamento.setForeground(Color.WHITE);
		lblinformedicamento.setHorizontalAlignment(SwingConstants.LEFT);
		lblinformedicamento.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblinformedicamento.setBounds(23, 242, 255, 39);
		contentPane.add(lblinformedicamento);

		txtInformacion = new JTextField();
		txtInformacion.setBackground(SystemColor.scrollbar);
		txtInformacion.setBorder(null);
		txtInformacion.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		txtInformacion.setHorizontalAlignment(SwingConstants.LEFT);
		txtInformacion.setBounds(277, 283, 269, 66);
		contentPane.add(txtInformacion);
		txtInformacion.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Datos Empleado");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-información-del-sistema-64.png"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2.setBounds(133, 96, 302, 52);
		contentPane.add(lblNewLabel_2);

		txtCopiaNombre = new JTextField();
		txtCopiaNombre.setBackground(SystemColor.scrollbar);
		txtCopiaNombre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtCopiaNombre.setBounds(277, 235, 178, 37);
		contentPane.add(txtCopiaNombre);
		txtCopiaNombre.setColumns(10);

		JLabel lblNewLabel = new JLabel("SECTOR DE VENTAS");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 80));
		lblNewLabel.setBounds(0, 11, 1120, 74);
		contentPane.add(lblNewLabel);

		JLabel lblNombreMedicamento = new JLabel("Id Empleado");
		lblNombreMedicamento.setForeground(Color.WHITE);
		lblNombreMedicamento.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNombreMedicamento.setBounds(23, 147, 269, 43);
		contentPane.add(lblNombreMedicamento);

		JLabel lblNumeroDeTomas = new JLabel("Id Producto");
		lblNumeroDeTomas.setForeground(Color.WHITE);
		lblNumeroDeTomas.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNumeroDeTomas.setBounds(23, 378, 137, 43);
		contentPane.add(lblNumeroDeTomas);

		JLabel lblDuracion = new JLabel("Horarios");
		lblDuracion.setForeground(Color.WHITE);
		lblDuracion.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblDuracion.setBounds(23, 616, 145, 43);
		contentPane.add(lblDuracion);

		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setForeground(Color.WHITE);
		lblDescripcion.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblDescripcion.setBounds(740, 146, 124, 45);
		contentPane.add(lblDescripcion);

		txtNomPro = new JTextField();
		txtNomPro.setBackground(SystemColor.scrollbar);
		txtNomPro.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtNomPro.setHorizontalAlignment(SwingConstants.CENTER);
		txtNomPro.setToolTipText("");
		txtNomPro.setColumns(10);
		txtNomPro.setBounds(239, 426, 116, 29);
		contentPane.add(txtNomPro);

		txtDescipcion = new JTextField();
		txtDescipcion.setBackground(SystemColor.scrollbar);
		txtDescipcion.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		txtDescipcion.setHorizontalAlignment(SwingConstants.LEFT);
		txtDescipcion.setToolTipText("");
		txtDescipcion.setColumns(10);
		txtDescipcion.setBounds(937, 143, 308, 51);
		contentPane.add(txtDescipcion);

		JComboBox cbxMedicamentos = new JComboBox();
		cbxMedicamentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id_Empleado = cbxMedicamentos.getSelectedItem().toString();
				String informacion;
				String id_Venta;

				try {

					if (id_Empleado.equalsIgnoreCase("1")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK001";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("2")) {
						// nro += 1;

						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK002";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("3")) {
						// nro += 1;

						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK003";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("4")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK004";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("5")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK005";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("6")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK006";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("7")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK007";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("8")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK008";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("9")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK009";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("10")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK0010";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("11")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK0011";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("12")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK0012";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("13")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK0013";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("14")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK0014";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("15")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK0015";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("16")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK001";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("17")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK0017";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("18")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK0018";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("19")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK0019";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("20")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK0020";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("21")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK0021";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("22")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK0022";
						txtCopiaNombre.setText(id_Venta);
					} else if (id_Empleado.equalsIgnoreCase("23")) {
						// nro += 1;
						informacion = "Empleado numero: " + cbxMedicamentos.getSelectedItem().toString();
						txtInformacion.setText(informacion);
						txtnumeromedicmaento.setText(String.valueOf(cbxMedicamentos.getSelectedIndex()));
						id_Venta = "UK0023";
						txtCopiaNombre.setText(id_Venta);
					}

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "No se encuentra su pastilla");
				}

			}
		});
		cbxMedicamentos.setBackground(SystemColor.scrollbar);
		cbxMedicamentos.setModel(new DefaultComboBoxModel(new String[] { "", "1", "2", "3", "4", "5", "6", "7", "8",
				"9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
		cbxMedicamentos.setBounds(277, 157, 109, 27);
		contentPane.add(cbxMedicamentos);

		JLabel lblAlergivoAlgunMeducamento = new JLabel("Algun incoveniente");
		lblAlergivoAlgunMeducamento.setForeground(Color.WHITE);
		lblAlergivoAlgunMeducamento.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblAlergivoAlgunMeducamento.setBounds(740, 103, 244, 43);
		contentPane.add(lblAlergivoAlgunMeducamento);

		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String descipcion = "Ningun Inoveniente";
				txtDescipcion.setText(descipcion);
			}
		});
		rdbtnNo.setBackground(SystemColor.controlShadow);
		rdbtnNo.setBounds(1122, 115, 109, 23);
		contentPane.add(rdbtnNo);

		JButton btnCalculo = new JButton("Importe");
		btnCalculo.setBackground(SystemColor.controlShadow);
		btnCalculo.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\dollar-circle-solid-24.png"));
		btnCalculo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					double cantidad, preciototal, precio;
					int numeroTomas, acumulacionPastillas;

					precio = Double.parseDouble(txtPreciouno.getText());
					cantidad = Integer.parseInt(txtCantidad.getText());

					preciototal = cantidad * precio;

					txtPrecioTotal.setText(String.valueOf((int) preciototal));

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Datos incompletos para hallar....");
				}
			}
		});
		btnCalculo.setBounds(781, 267, 178, 43);
		contentPane.add(btnCalculo);

		JRadioButton rdbtnMaana = new JRadioButton("Mañana");
		rdbtnMaana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int tiempo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo en hora"));

				if (tiempo > 6 && tiempo < 12) {
					txtTiempo.setText(String.valueOf("Horario de venta " + tiempo + " de la mañana"));
				} else {
					JOptionPane.showMessageDialog(null, "Tiempo incorrecto");
				}

			}
		});
		rdbtnMaana.setBackground(SystemColor.controlShadow);
		rdbtnMaana.setBounds(204, 628, 109, 23);
		contentPane.add(rdbtnMaana);

		JRadioButton rdbtnTarde = new JRadioButton("Tarde");
		rdbtnTarde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tiempo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo en hora"));
				if (tiempo >= 12 && tiempo < 18) {
					txtTiempo.setText(String.valueOf("Horario de venta " + tiempo + " de la tarde"));
				} else {
					JOptionPane.showMessageDialog(null, "Tiempo incorrecto");
				}
			}
		});
		rdbtnTarde.setBackground(SystemColor.controlShadow);
		rdbtnTarde.setBounds(345, 628, 109, 23);
		contentPane.add(rdbtnTarde);

		JRadioButton rdbtnNoche = new JRadioButton("Noche");
		rdbtnNoche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tiempo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo en hora"));
				if (tiempo >= 18 && tiempo < 23) {
					txtTiempo.setText(String.valueOf("Horario de venta " + tiempo + " de la noche"));
				} else {
					JOptionPane.showMessageDialog(null, "Tiempo incorrecto");
				}
			}
		});
		rdbtnNoche.setBackground(SystemColor.controlShadow);
		rdbtnNoche.setBounds(485, 627, 109, 23);
		contentPane.add(rdbtnNoche);

		JLabel lblPrecio = new JLabel("Precio c/u");
		lblPrecio.setForeground(Color.WHITE);
		lblPrecio.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblPrecio.setBounds(23, 562, 145, 43);
		contentPane.add(lblPrecio);

		JLabel lblPrecioTotal = new JLabel("Importe");
		lblPrecioTotal.setForeground(Color.WHITE);
		lblPrecioTotal.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-venta-tienda-financiamiento-finanzas-pago-de-dinero-compras-10-100.png"));
		lblPrecioTotal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblPrecioTotal.setBounds(768, 331, 200, 102);
		contentPane.add(lblPrecioTotal);

		txtPrecioTotal = new JTextField();
		txtPrecioTotal.setBackground(Color.LIGHT_GRAY);
		txtPrecioTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrecioTotal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtPrecioTotal.setToolTipText("");
		txtPrecioTotal.setColumns(10);
		txtPrecioTotal.setBounds(999, 361, 255, 43);
		contentPane.add(txtPrecioTotal);

		txtPreciouno = new JTextField();
		txtPreciouno.setBackground(SystemColor.scrollbar);
		txtPreciouno.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtPreciouno.setHorizontalAlignment(SwingConstants.CENTER);
		txtPreciouno.setColumns(10);
		txtPreciouno.setBounds(266, 565, 89, 29);
		contentPane.add(txtPreciouno);

		JLabel lblCantidadAComprar = new JLabel("Cantidad");
		lblCantidadAComprar.setForeground(Color.WHITE);
		lblCantidadAComprar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblCantidadAComprar.setBounds(23, 521, 145, 43);
		contentPane.add(lblCantidadAComprar);

		JButton btnDescuento = new JButton("Descuento");
		btnDescuento.setBackground(SystemColor.controlShadow);
		btnDescuento.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\discount-solid-24.png"));
		btnDescuento.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnDescuento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					int cantidad;
					double preciototal, precio, descuento, DescuentoPagar;

					cantidad = Integer.parseInt(txtCantidad.getText());
					precio = Double.parseDouble(txtPreciouno.getText());

					preciototal = cantidad * precio;

					if (cantidad >= 2 && cantidad <= 4) {

						// 5%
						descuento = preciototal * 0.05;
						DescuentoPagar = preciototal - descuento;
						txtPagoFinal.setText(String.valueOf((int) descuento));
						txtDescuento.setText(String.valueOf((int) DescuentoPagar));

					} else if (cantidad >= 5 && cantidad <= 8) {

						descuento = preciototal * 0.1;
						DescuentoPagar = preciototal - descuento;
						txtPagoFinal.setText(String.valueOf((int) descuento));

						txtDescuento.setText(String.valueOf((int) DescuentoPagar));

					} else if (cantidad >= 9 && cantidad <= 12) {

						descuento = preciototal * 0.2;
						DescuentoPagar = preciototal - descuento;
						txtPagoFinal.setText(String.valueOf((int) descuento));

						txtDescuento.setText(String.valueOf((int) DescuentoPagar));

					} else if (cantidad >= 13 && cantidad <= 15) {

						descuento = preciototal * 0.25;
						DescuentoPagar = preciototal - descuento;
						txtPagoFinal.setText(String.valueOf((int) descuento));

						txtDescuento.setText(String.valueOf((int) DescuentoPagar));

					} else if (cantidad >= 16 && cantidad <= 20) {
						descuento = preciototal * 0.3;
						DescuentoPagar = preciototal - descuento;
						txtPagoFinal.setText(String.valueOf((int) descuento));

						txtDescuento.setText(String.valueOf((int) DescuentoPagar));
					} else if (cantidad >= 21 && cantidad <= 30) {
						descuento = preciototal * 0.4;
						DescuentoPagar = preciototal - descuento;
						txtPagoFinal.setText(String.valueOf((int) descuento));

						txtDescuento.setText(String.valueOf((int) DescuentoPagar));
					} else if (cantidad >= 31 && cantidad <= 100) {
						descuento = preciototal * 0.5;
						DescuentoPagar = preciototal - descuento;
						txtPagoFinal.setText(String.valueOf((int) descuento));

						txtDescuento.setText(String.valueOf((int) DescuentoPagar));
					}
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Datos incompletos...");
				}

			}
		});
		btnDescuento.setBounds(1076, 267, 178, 43);
		contentPane.add(btnDescuento);

		JLabel lblDescuento = new JLabel("Descuento");
		lblDescuento.setForeground(Color.WHITE);
		lblDescuento.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-lowest-price-100.png"));
		lblDescuento.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblDescuento.setBounds(753, 449, 211, 102);
		contentPane.add(lblDescuento);

		txtDescuento = new JTextField();
		txtDescuento.setHorizontalAlignment(SwingConstants.CENTER);
		txtDescuento.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtDescuento.setBackground(Color.LIGHT_GRAY);
		txtDescuento.setToolTipText("");
		txtDescuento.setColumns(10);
		txtDescuento.setBounds(999, 577, 255, 43);
		contentPane.add(txtDescuento);

		/*
		 * JDateChooser dateChooser = new JDateChooser();
		 * dateChooser.setToolTipText("");
		 * dateChooser.setBackground(SystemColor.controlShadow);
		 * dateChooser.setDateFormatString("yyyy/MM/dd HH:mm:ss");
		 * dateChooser.setBounds(767, 696, 301, 35); dateChooser.setFont(new
		 * Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		 * contentPane.add(dateChooser);
		 */

		JSpinner spnCantidad = new JSpinner();
		spnCantidad.setBackground(SystemColor.scrollbar);
		spnCantidad.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spnCantidad.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

				txtCantidad.setText(spnCantidad.getValue().toString());

			}
		});
		spnCantidad.setBounds(269, 466, 86, 39);
		contentPane.add(spnCantidad);

		JLabel lblNewLabel_2_1 = new JLabel("Fecha");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-horas-extras-48.png"));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2_1.setBounds(956, 708, 244, 42);
		contentPane.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("Datos de Pago");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-información-del-sistema-64 (1).png"));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2_2.setBounds(858, 204, 291, 52);
		contentPane.add(lblNewLabel_2_2);

		txtCantidad = new JTextField();
		txtCantidad.setBackground(SystemColor.scrollbar);
		txtCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(266, 521, 89, 29);
		contentPane.add(txtCantidad);

		JLabel lblElijaElValor = new JLabel("Elija el valor");
		lblElijaElValor.setForeground(Color.WHITE);
		lblElijaElValor.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblElijaElValor.setBounds(23, 479, 145, 43);
		contentPane.add(lblElijaElValor);

		JLabel lblPagoFinal = new JLabel("Pago final");
		lblPagoFinal.setForeground(Color.WHITE);
		lblPagoFinal.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\icons8-historial-de-pagos-100.png"));
		lblPagoFinal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblPagoFinal.setBounds(752, 553, 199, 90);
		contentPane.add(lblPagoFinal);

		txtPagoFinal = new JTextField();
		txtPagoFinal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtPagoFinal.setHorizontalAlignment(SwingConstants.CENTER);
		txtPagoFinal.setBackground(Color.LIGHT_GRAY);
		txtPagoFinal.setToolTipText("");
		txtPagoFinal.setColumns(10);
		txtPagoFinal.setBounds(999, 474, 255, 43);
		contentPane.add(txtPagoFinal);

		JLabel lblFondo = new JLabel("");
		lblFondo.setForeground(Color.WHITE);
		lblFondo.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\4576543-abstract-digital-art-blue-lines.jpg"));
		lblFondo.setBounds(0, 0, 1264, 761);
		contentPane.add(lblFondo);

		grupos(rdbtnNo, rdbtnMaana, rdbtnTarde, rdbtnNoche, rdbtnSi);

	}
}
