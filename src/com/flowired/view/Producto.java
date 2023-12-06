package com.flowired.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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
import com.flowired.model.Productos;

public class Producto extends JFrame {
	private JPanel contentPane;
	private JTextField txtIdProduct;
	private JTextField txtIdCate;
	private JTextField txtNombre;
	private JTextField txtCantidad;
	private JTextField txtMarca;
	private JTextField txtPrecioCompra;

	private ArrayList<Productos> list_P;
	private JTable tableProductos;
	private JTextField txtPrecioVenta;
	private JTextField txtIDproveedores;

	public void Limpiar() {

		txtCantidad.setText("");
		txtMarca.setText("");
		txtIdProduct.setText("");
		txtIdCate.setText("");
		txtNombre.setText("");
		txtPrecioCompra.setText("");
		txtPrecioVenta.setText("");
		txtIDproveedores.setText("");

	}

	public void Ver_Datos() {

		String Mat[][] = new String[list_P.size()][8];
		Productos produc;

		for (int i = 0; i < Mat.length; i++) {
			produc = list_P.get(i);
			Mat[i][0] = produc.getId_Producto();
			Mat[i][1] = produc.getId_Categoria();
			Mat[i][2] = produc.getId_Marca();
			Mat[i][3] = produc.getId_Proveedores();
			Mat[i][4] = produc.getNombre_Producto();
			Mat[i][5] = Double.toString(produc.getPrecio_Compra());
			Mat[i][6] = Double.toString(produc.getPrecio_Venta());
			Mat[i][7] = Double.toString(produc.getCantidad());

		}

		tableProductos.setModel(new DefaultTableModel(Mat, new String[] { "Id Producto", "Id Catergoria", "Id Marca",
				"Id Proveedores", "Nombre Producto", "Precio Compra", "Precio Venta", "Cantidad" }));

	}

	public Producto() {

		list_P = new ArrayList<Productos>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtIDproveedores = new JTextField();
		txtIDproveedores.setHorizontalAlignment(SwingConstants.CENTER);
		txtIDproveedores.setForeground(Color.WHITE);
		txtIDproveedores.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtIDproveedores.setColumns(10);
		txtIDproveedores.setBackground(Color.DARK_GRAY);
		txtIDproveedores.setBounds(175, 186, 210, 49);
		contentPane.add(txtIDproveedores);

		JLabel lblIdproveedores = new JLabel("Id_Proveedores");
		lblIdproveedores.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdproveedores.setForeground(new Color(255, 215, 0));
		lblIdproveedores.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblIdproveedores.setBounds(34, 191, 131, 38);
		contentPane.add(lblIdproveedores);

		JLabel lblPrecioVenta = new JLabel("Precio Venta");
		lblPrecioVenta.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecioVenta.setForeground(new Color(255, 215, 0));
		lblPrecioVenta.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblPrecioVenta.setBounds(255, 257, 130, 47);
		contentPane.add(lblPrecioVenta);

		txtPrecioVenta = new JTextField();
		txtPrecioVenta.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrecioVenta.setForeground(Color.WHITE);
		txtPrecioVenta.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		txtPrecioVenta.setColumns(10);
		txtPrecioVenta.setBackground(Color.DARK_GRAY);
		txtPrecioVenta.setBounds(396, 257, 208, 47);
		contentPane.add(txtPrecioVenta);

		tableProductos = new JTable();
		tableProductos.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		tableProductos.setBackground(Color.LIGHT_GRAY);
		tableProductos.setModel(new DefaultTableModel(new Object[][] {
				{ "Id Producto", "Id Catergoria", "Id Marca", "Id Proveedores", "Nombre Producto", "Precio Compra",
						"Precio Venta", "Cantidad" },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, },
				new String[] { "Id Producto", "Id Catergoria", "Id Marca", "Id Proveedores", "Nombre Producto",
						"Precio Compra", "Precio Venta", "Cantidad" }));
		tableProductos.setBounds(492, 401, 704, 318);
		contentPane.add(tableProductos);

		JLabel lblTitul = new JLabel("Registro de Productos");
		lblTitul.setBackground(Color.WHITE);
		lblTitul.setForeground(new Color(255, 215, 0));
		lblTitul.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitul.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 70));
		lblTitul.setBounds(0, 0, 1264, 82);
		contentPane.add(lblTitul);

		JLabel lblId = new JLabel("Id Producto");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBackground(Color.WHITE);
		lblId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblId.setForeground(new Color(255, 215, 0));
		lblId.setBounds(34, 129, 131, 47);
		contentPane.add(lblId);

		JLabel lblNombre = new JLabel("Nombre Producto");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNombre.setForeground(new Color(255, 215, 0));
		lblNombre.setBounds(474, 191, 148, 38);
		contentPane.add(lblNombre);

		JLabel lblApellido_P = new JLabel("Cantidad");
		lblApellido_P.setHorizontalAlignment(SwingConstants.CENTER);
		lblApellido_P.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblApellido_P.setForeground(new Color(255, 215, 0));
		lblApellido_P.setBounds(691, 265, 98, 28);
		contentPane.add(lblApellido_P);

		JLabel lblEdad = new JLabel("Id Marca");
		lblEdad.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblEdad.setForeground(new Color(255, 215, 0));
		lblEdad.setBounds(895, 129, 124, 28);
		contentPane.add(lblEdad);

		JLabel lblTelefono = new JLabel("Precio Compra");
		lblTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefono.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblTelefono.setForeground(new Color(255, 215, 0));
		lblTelefono.setBounds(895, 196, 139, 28);
		contentPane.add(lblTelefono);

		JLabel lblId_Paciente = new JLabel("Id Categoria");
		lblId_Paciente.setHorizontalAlignment(SwingConstants.CENTER);
		lblId_Paciente.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblId_Paciente.setForeground(new Color(255, 215, 0));
		lblId_Paciente.setBounds(492, 120, 130, 47);
		contentPane.add(lblId_Paciente);

		txtIdProduct = new JTextField();
		txtIdProduct.setHorizontalAlignment(SwingConstants.CENTER);
		txtIdProduct.setForeground(Color.WHITE);
		txtIdProduct.setBackground(Color.DARK_GRAY);
		txtIdProduct.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtIdProduct.setBounds(175, 129, 210, 47);
		contentPane.add(txtIdProduct);
		txtIdProduct.setColumns(10);

		txtIdCate = new JTextField();
		txtIdCate.setForeground(Color.WHITE);
		txtIdCate.setHorizontalAlignment(SwingConstants.CENTER);
		txtIdCate.setBackground(Color.DARK_GRAY);
		txtIdCate.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtIdCate.setColumns(10);
		txtIdCate.setBounds(632, 120, 210, 47);
		contentPane.add(txtIdCate);

		txtNombre = new JTextField();
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombre.setForeground(Color.WHITE);
		txtNombre.setBackground(Color.DARK_GRAY);
		txtNombre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		txtNombre.setColumns(10);
		txtNombre.setBounds(632, 188, 208, 47);
		contentPane.add(txtNombre);

		txtCantidad = new JTextField();
		txtCantidad.setForeground(Color.WHITE);
		txtCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad.setBackground(Color.DARK_GRAY);
		txtCantidad.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(833, 256, 210, 47);
		contentPane.add(txtCantidad);

		txtMarca = new JTextField();
		txtMarca.setForeground(Color.WHITE);
		txtMarca.setHorizontalAlignment(SwingConstants.CENTER);
		txtMarca.setBackground(Color.DARK_GRAY);
		txtMarca.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtMarca.setColumns(10);
		txtMarca.setBounds(1044, 118, 210, 52);
		contentPane.add(txtMarca);

		txtPrecioCompra = new JTextField();
		txtPrecioCompra.setForeground(Color.WHITE);
		txtPrecioCompra.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrecioCompra.setBackground(Color.DARK_GRAY);
		txtPrecioCompra.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		txtPrecioCompra.setColumns(10);
		txtPrecioCompra.setBounds(1044, 186, 210, 49);
		contentPane.add(txtPrecioCompra);

		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBackground(Color.LIGHT_GRAY);
		btnAgregar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnAgregar.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\add-to-queue-solid-24.png"));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nombre_Producto;
				String id_Producto, id_Categoria, id_Marca, id_Proveedores;
				Double precio_Compra, precio_Venta, cantidad;

				try {

					id_Producto = txtIdProduct.getText();
					id_Categoria = txtIdCate.getText();
					id_Marca = txtMarca.getText();
					id_Proveedores = txtIDproveedores.getText();
					nombre_Producto = txtNombre.getText();
					precio_Compra = Double.parseDouble(txtPrecioCompra.getText());
					precio_Venta = Double.parseDouble(txtPrecioVenta.getText());
					cantidad = Double.parseDouble(txtCantidad.getText());

					list_P.add(new Productos(id_Producto, id_Categoria, id_Marca, id_Proveedores, nombre_Producto,
							precio_Compra, precio_Venta, cantidad));

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Verifique los datos...");

				}

				Limpiar();
				Ver_Datos();

			}
		});
		btnAgregar.setBounds(47, 396, 155, 62);
		contentPane.add(btnAgregar);

		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBackground(Color.LIGHT_GRAY);
		btnModificar.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\edit-solid-24.png"));
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Productos produc;
				int fila_determinada;
				String nombre_Producto, determinado = "";
				String id_Producto, id_Categoria, id_Marca, id_Proveedores;
				double precio_Compra, precio_Venta, cantidad;

				try {

					fila_determinada = tableProductos.getSelectedRow();
					produc = list_P.get(fila_determinada);

					determinado = JOptionPane.showInputDialog(
							"Columna de moficacion?.... \nid_Producto \nid_Categoria \nid_Marca \nid_Proveedores \nnombre_Producto \nprecio_Compra \nprecio_venta \ncantidad ");

					switch (determinado.toLowerCase()) {
					case "id_Producto":

						id_Producto = JOptionPane.showInputDialog("Nuevo id_Producto");
						produc.setId_Producto(id_Producto);
						break;
					case "id_Categoria":
						id_Categoria = JOptionPane.showInputDialog("Nuevo  id_Categoria");
						produc.setId_Categoria(id_Categoria);
						break;
					case "id_Marca":
						id_Marca = JOptionPane.showInputDialog("Nuevo id_Marca");
						produc.setId_Marca(id_Marca);
						break;
					case "id_Proveedores":
						id_Proveedores = JOptionPane.showInputDialog("Nuevo id_Proveedores");
						produc.setId_Proveedores(id_Proveedores);
						break;
					case "nombre_Producto":
						nombre_Producto = JOptionPane.showInputDialog("Nuevo nombre_Producto");
						produc.setNombre_Producto(nombre_Producto);
						break;
					case "precio_Compra":
						precio_Compra = Double.parseDouble(JOptionPane.showInputDialog("Nuevo precio_Compra"));
						produc.setPrecio_Compra(precio_Compra);
						break;
					case "precio_venta":
						precio_Venta = Double.parseDouble(JOptionPane.showInputDialog("Nuevo precio_venta"));
						produc.setPrecio_Venta(precio_Venta);
					case "cantidad":
						cantidad = Double.parseDouble(JOptionPane.showInputDialog("Nueva cantidad"));
						produc.setCantidad(cantidad);

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
		btnModificar.setBounds(47, 482, 155, 62);
		contentPane.add(btnModificar);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(Color.LIGHT_GRAY);
		btnEliminar.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\IdeaProjects\\System_Hospital\\src\\main\\java\\com\\project\\img\\message-x-solid-24.png"));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int eliminar_fila;

				try {

					eliminar_fila = tableProductos.getSelectedRow();
					list_P.remove(eliminar_fila);

				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Seleccione fila para ser eliminada...");
				}

				Ver_Datos();

			}
		});
		btnEliminar.setBounds(47, 564, 155, 62);
		contentPane.add(btnEliminar);

		JLabel lblFondo = new JLabel("");
		lblFondo.setForeground(new Color(255, 215, 0));
		lblFondo.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\F_Backus\\src\\com\\flowired\\img\\Drinks_soda_bottles-Food_Theme_HD_Wallpaper_2560x1600.jpg"));
		lblFondo.setBounds(0, 0, 1264, 761);
		contentPane.add(lblFondo);
	}
}
