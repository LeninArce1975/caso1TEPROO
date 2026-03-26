package caso1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Base");
			lblNewLabel.setBounds(10, 24, 45, 13);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Altura");
			lblNewLabel_1.setBounds(10, 57, 45, 13);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtBase = new JTextField();
			txtBase.setBounds(56, 21, 96, 19);
			contentPane.add(txtBase);
			txtBase.setColumns(10);
		}
		{
			txtAltura = new JTextField();
			txtAltura.setBounds(56, 54, 96, 19);
			contentPane.add(txtAltura);
			txtAltura.setColumns(10);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 105, 403, 132);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(196, 24, 85, 21);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Limpiar");
			btnNewButton_1.setBounds(196, 53, 85, 21);
			contentPane.add(btnNewButton_1);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	double base=Double.parseDouble(txtBase.getText());
	double altura=Double.parseDouble(txtAltura.getText());
	Triángulo t1=new Triángulo(base, altura);
	Listado(t1);
	t1.setAltura(1.10*t1.getAltura());
	t1.setBase(0.90*t1.getBase());
	Listado(t1);
	}
	void Imprimir(String s) {
		txtS.append(s+"\n");
	}
	void Imprimir() {
		txtS.append("------------------\n");
	}
	void Listado(Triángulo t) {
		Imprimir("La base es: "+t.getBase());
		Imprimir("La altura es: "+t.getAltura());
		Imprimir("El área es: "+t.Área());
		Imprimir();
	}
}
