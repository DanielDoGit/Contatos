package tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.SystemColor;

public class Teste2 extends JFrame {

	private JPanel contentPane;
	private JTextField caixacodigo;
	private JTextField caixaEmpresa;
	private JTextField caixaContatosNovos;
	private JTextField caixaContatosInativos;
	private JLabel lblEndereco;
	private JTextField caixaEndereco;
	private JLabel lblN;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}				
			} 
		} catch (Exception e) {
			// TODO: handle exception

		JOptionPane.showMessageDialog(null, e, "Erro",0);
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste2 frame = new Teste2();
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
	public Teste2() {
		setBackground(SystemColor.inactiveCaption);
		setTitle("Contatos 1.15 - Dark Mode");
		setIconImage(Toolkit.getDefaultToolkit().getImage("./icones/telefone"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 488);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlDkShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setForeground(SystemColor.text);
		lblCodigo.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		lblCodigo.setBounds(301, 11, 49, 17);
		contentPane.add(lblCodigo);
		
		caixacodigo = new JTextField();
		caixacodigo.setEnabled(false);
		caixacodigo.setEditable(false);
		caixacodigo.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		caixacodigo.setBounds(362, 6, 56, 27);
		contentPane.add(caixacodigo);
		caixacodigo.setColumns(10);
		
		JLabel lblEmpresa = new JLabel("Empresa");
		lblEmpresa.setForeground(SystemColor.text);
		lblEmpresa.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		lblEmpresa.setBounds(38, 61, 60, 15);
		contentPane.add(lblEmpresa);
		
		caixaEmpresa = new JTextField();
		caixaEmpresa.setBackground(Color.CYAN);
		caixaEmpresa.setForeground(Color.BLACK);
		caixaEmpresa.setBounds(163, 55, 552, 27);
		contentPane.add(caixaEmpresa);
		caixaEmpresa.setColumns(10);
		
		JLabel lblConta = new JLabel("Contatos Novos");
		lblConta.setForeground(SystemColor.text);
		lblConta.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		lblConta.setBounds(38, 100, 106, 15);
		contentPane.add(lblConta);
		
		caixaContatosNovos = new JTextField();
		caixaContatosNovos.setColumns(10);
		caixaContatosNovos.setBounds(163, 94, 552, 27);
		contentPane.add(caixaContatosNovos);
		
		JLabel lblContatosInativos = new JLabel("Contatos Inativos");
		lblContatosInativos.setForeground(SystemColor.text);
		lblContatosInativos.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		lblContatosInativos.setBounds(38, 139, 115, 15);
		contentPane.add(lblContatosInativos);
		
		caixaContatosInativos = new JTextField();
		caixaContatosInativos.setColumns(10);
		caixaContatosInativos.setBounds(163, 133, 552, 27);
		contentPane.add(caixaContatosInativos);
		
		lblEndereco = new JLabel("Endereço");
		lblEndereco.setForeground(SystemColor.text);
		lblEndereco.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		lblEndereco.setBounds(38, 178, 115, 15);
		contentPane.add(lblEndereco);
		
		caixaEndereco = new JTextField();
		caixaEndereco.setColumns(10);
		caixaEndereco.setBounds(163, 172, 414, 27);
		contentPane.add(caixaEndereco);
		
		lblN = new JLabel("Nº");
		lblN.setForeground(SystemColor.text);
		lblN.setBounds(602, 178, 32, 15);
		contentPane.add(lblN);
		
		textField = new JTextField();
		textField.setBounds(631, 172, 56, 27);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
