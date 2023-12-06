package com.flowired.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.flowired.model.Empleados;

public class Empleado extends JFrame {

	private JPanel contentPane;
	private JTextField txtId_Empleado;
	private JTextField txtidAlmacen;
	private JTextField txtNombre;
	private JTextField textFApelldoP;
	private JTextField txtIdDistrito;
	private JTextField txtDni;

	private ArrayList<Empleados> list_P;
	private JTable tableEmpleado;

	public void Limpiar() {

		textFApelldoP.setText("");
		txtIdDistrito.setText("");
		txtId_Empleado.setText("");
		txtidAlmacen.setText("");
		txtNombre.setText("");
		txtDni.setText("");

	}

	public void Ver_Datos() {

		String Mat[][] = new String[list_P.size()][6];
		Empleados emple;

		for (int i = 0; i < Mat.length; i++) {
			emple = list_P.get(i);
			Mat[i][0] = emple.getId_Empleado();
			Mat[i][1] = emple.getId_Almacen();
			Mat[i][2] = emple.getId_Distrito();
			Mat[i][3] = emple.getNomEmpleado();
			Mat[i][4] = emple.getApeEmpleado();
			Mat[i][5] = Integer.toString(emple.getDni());

		}

		tableEmpleado.setModel(new DefaultTableModel(Mat,
				new String[] { "Id Empleado", "Id Almacen", "Id Distrito", "Nombre", "Apellido", "Dni" }));

	}

	public Empleado() {

		list_P = new ArrayList<Empleados>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tableEmpleado = new JTable();
		tableEmpleado.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		tableEmpleado.setBackground(Color.LIGHT_GRAY);
		tableEmpleado.setModel(new DefaultTableModel(
				new Object[][] { { "Id Empleado", "Id Almacen", "Id Distrito", "Nombre", "Apellido", "Dni" },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, { null, null, null, null, null, null },
						{ null, null, null, null, null, null }, },
				new String[] { "Id Empleado", "Id Almacen", "Id Distrito", "Nombre", "Apellido", "Dni" }));
		tableEmpleado.setBounds(512, 343, 684, 318);
		contentPane.add(tableEmpleado);

		JLabel lblTitul = new JLabel("Registro de Empleados");
		lblTitul.setForeground(Color.BLACK);
		lblTitul.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitul.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 70));
		lblTitul.setBounds(175, 11, 790, 82);
		contentPane.add(lblTitul);

		JLabel lblId = new JLabel("Id Empleado");
		lblId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblId.setForeground(Color.BLACK);
		lblId.setBounds(34, 129, 112, 28);
		contentPane.add(lblId);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setBounds(34, 196, 97, 28);
		contentPane.add(lblNombre);

		JLabel lblApellido_P = new JLabel("Apellido ");
		lblApellido_P.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblApellido_P.setForeground(Color.BLACK);
		lblApellido_P.setBounds(441, 196, 98, 28);
		contentPane.add(lblApellido_P);

		JLabel lblEdad = new JLabel("Id Distrito");
		lblEdad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblEdad.setForeground(Color.BLACK);
		lblEdad.setBounds(841, 129, 124, 28);
		contentPane.add(lblEdad);

		JLabel lblTelefono = new JLabel("Dni");
		lblTelefono.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblTelefono.setForeground(Color.BLACK);
		lblTelefono.setBounds(841, 196, 84, 28);
		contentPane.add(lblTelefono);

		JLabel lblId_Paciente = new JLabel("Id Almacen");
		lblId_Paciente.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblId_Paciente.setForeground(Color.BLACK);
		lblId_Paciente.setBounds(441, 129, 98, 28);
		contentPane.add(lblId_Paciente);

		txtId_Empleado = new JTextField();
		txtId_Empleado.setHorizontalAlignment(SwingConstants.CENTER);
		txtId_Empleado.setForeground(Color.WHITE);
		txtId_Empleado.setBackground(Color.DARK_GRAY);
		txtId_Empleado.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtId_Empleado.setBounds(190, 129, 210, 47);
		contentPane.add(txtId_Empleado);
		txtId_Empleado.setColumns(10);

		txtidAlmacen = new JTextField();
		txtidAlmacen.setForeground(Color.WHITE);
		txtidAlmacen.setHorizontalAlignment(SwingConstants.CENTER);
		txtidAlmacen.setBackground(Color.DARK_GRAY);
		txtidAlmacen.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtidAlmacen.setColumns(10);
		txtidAlmacen.setBounds(573, 129, 210, 47);
		contentPane.add(txtidAlmacen);

		txtNombre = new JTextField();
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombre.setForeground(Color.WHITE);
		txtNombre.setBackground(Color.DARK_GRAY);
		txtNombre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtNombre.setColumns(10);
		txtNombre.setBounds(192, 188, 208, 47);
		contentPane.add(txtNombre);

		textFApelldoP = new JTextField();
		textFApelldoP.setForeground(Color.WHITE);
		textFApelldoP.setHorizontalAlignment(SwingConstants.CENTER);
		textFApelldoP.setBackground(Color.DARK_GRAY);
		textFApelldoP.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		textFApelldoP.setColumns(10);
		textFApelldoP.setBounds(573, 187, 210, 47);
		contentPane.add(textFApelldoP);

		txtIdDistrito = new JTextField();
		txtIdDistrito.setForeground(Color.WHITE);
		txtIdDistrito.setHorizontalAlignment(SwingConstants.CENTER);
		txtIdDistrito.setBackground(Color.DARK_GRAY);
		txtIdDistrito.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtIdDistrito.setColumns(10);
		txtIdDistrito.setBounds(986, 125, 210, 52);
		contentPane.add(txtIdDistrito);

		txtDni = new JTextField();
		txtDni.setForeground(Color.WHITE);
		txtDni.setHorizontalAlignment(SwingConstants.CENTER);
		txtDni.setBackground(Color.DARK_GRAY);
		txtDni.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtDni.setColumns(10);
		txtDni.setBounds(986, 187, 210, 49);
		contentPane.add(txtDni);

		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBackground(Color.LIGHT_GRAY);
		btnAgregar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnAgregar.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\add-to-queue-solid-24.png"));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nombre, apellido, id_Almacen, id_Empleado, id_Distrito;
				Integer dni;
				
				try {

					id_Empleado = txtId_Empleado.getText();
					id_Almacen = txtidAlmacen.getText();
					id_Distrito = txtIdDistrito.getText();
					nombre = txtNombre.getText();
					apellido = textFApelldoP.getText();
					dni = Integer.parseInt(txtDni.getText());

					list_P.add(new Empleados(id_Empleado, id_Almacen, id_Distrito, nombre, apellido, dni));

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Verifique los datos...");

				}

				Limpiar();
				Ver_Datos();

			}
		});
		btnAgregar.setBounds(47, 343, 155, 62);
		contentPane.add(btnAgregar);

		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBackground(Color.LIGHT_GRAY);
		btnModificar.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\edit-solid-24.png"));
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Empleados empleado;
				int fila_determinada;
				String nombre, apellido, determinado = "";
				String id_Almacen, id_Empleado, id_Distrito;
				Integer dni;

				try {

					fila_determinada = tableEmpleado.getSelectedRow();
					empleado = list_P.get(fila_determinada);

					determinado = JOptionPane.showInputDialog(
							"Columna de moficacion?.... \nid_Empleado \nid_Almacen \nid_Distrito \nnombre \napellido \ndni");

					switch (determinado.toLowerCase()) {
					case "id_Empleado":

						id_Empleado = JOptionPane.showInputDialog("Nuevo id empleado");
						empleado.setId_Empleado(id_Empleado);
						break;
					case "id_Almacen":
						id_Almacen = JOptionPane.showInputDialog("Nuevo id Paciente");
						empleado.setId_Almacen(id_Almacen);
						break;
					case "id_Distrito":
						id_Distrito = JOptionPane.showInputDialog("Nuevo nombre");
						empleado.setId_Distrito(id_Distrito);
						break;
					case "nombre":
						nombre = JOptionPane.showInputDialog("Nuevo apellido Paterno");
						empleado.setNomEmpleado(nombre);
						break;
					case "apellido":
						apellido = JOptionPane.showInputDialog("Nuevo apellido Materno");
						empleado.setApeEmpleado(apellido);
						break;
					case "dni":
						dni = Integer.parseInt(JOptionPane.showInputDialog("Nuevo telefono"));
						empleado.setDni(dni);
						break;

					default:
						JOptionPane.showMessageDialog(null, "No se encuentra la columna de modificacion...");
						break;

					}

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Elija fila para modificar...");
				}

				Ver_Datos();

			}
		});
		btnModificar.setBounds(47, 442, 155, 62);
		contentPane.add(btnModificar);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(Color.LIGHT_GRAY);
		btnEliminar.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\message-x-solid-24.png"));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int eliminar_fila;

				try {

					eliminar_fila = tableEmpleado.getSelectedRow();
					list_P.remove(eliminar_fila);

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Seleccione fila para ser eliminada...");
				}

				Ver_Datos();

			}
		});
		btnEliminar.setBounds(47, 557, 155, 62);
		contentPane.add(btnEliminar);

		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\Free_business-2016_High_Quality_HD_Wallpaper_1920x1200.jpg"));
		lblFondo.setBounds(0, 0, 1264, 761);
		contentPane.add(lblFondo);
	}
}
