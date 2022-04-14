package tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JDesktopPane;
import java.awt.Rectangle;

public class Inicial extends JFrame {

	private JPanel contentPane;
	private JTextField caixacodigo;
	private JTextField caixaEmpresa;
	private JTextField caixaContatosNovos;
	private JTextField caixaContatosInativos;
	private JLabel lblEndereco;
	private JTextField caixaEndereco;
	private JLabel lblN;
	private JTextField textFieldNumeroLogradouro;
	private JTextField textFieldCodigoCidade;
	private JTextField textFieldDescricaoCidade;
	private JTextField textFieldUfCidade;
	private JTextField textFieldBairro;
	private JLayeredPane layeredPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblCep;
	private JTextField textField;
	private JLabel lblObservaes;

	/**
	 * Launch the application.
	 * @throws Exception 
	 */
	public Inicial() throws Exception {
		// TODO Auto-generated constructor stub
	 
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
		
		InicialAction();
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	/**
	 * Create the frame.
	 */
	public void InicialAction() throws Exception{
		setBackground(SystemColor.inactiveCaption);
		setTitle("Contatos 1.15 - Dark Mode");
		setIconImage(Toolkit.getDefaultToolkit().getImage("./icones/telefone"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 595);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlDkShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("Código");
		lblCodigo.setForeground(SystemColor.text);
		lblCodigo.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		lblCodigo.setBounds(310, 11, 49, 17);
		contentPane.add(lblCodigo);
		
		caixacodigo = new JTextField();
		caixacodigo.setEnabled(false);
		caixacodigo.setEditable(false);
		caixacodigo.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		caixacodigo.setBounds(370, 6, 56, 27);
		contentPane.add(caixacodigo);
		caixacodigo.setColumns(10);
		
		JLabel lblEmpresa = new JLabel("Empresa");
		lblEmpresa.setForeground(SystemColor.text);
		lblEmpresa.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		lblEmpresa.setBounds(26, 61, 74, 15);
		contentPane.add(lblEmpresa);
		
		caixaEmpresa = new JTextField();
		caixaEmpresa.setBackground(Color.CYAN);
		caixaEmpresa.setForeground(Color.BLACK);
		caixaEmpresa.setBounds(163, 55, 552, 27);
		contentPane.add(caixaEmpresa);
		caixaEmpresa.setColumns(10);
		
		JLabel lblConta = new JLabel("Contatos Novos");
		lblConta.setForeground(SystemColor.text);
		lblConta.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		lblConta.setBounds(26, 100, 115, 15);
		contentPane.add(lblConta);
		
		caixaContatosNovos = new JTextField();
		caixaContatosNovos.setColumns(10);
		caixaContatosNovos.setBounds(163, 94, 552, 27);
		contentPane.add(caixaContatosNovos);
		
		JLabel lblContatosInativos = new JLabel("Contatos Inativos");
		lblContatosInativos.setForeground(SystemColor.text);
		lblContatosInativos.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		lblContatosInativos.setBounds(26, 139, 127, 15);
		contentPane.add(lblContatosInativos);
		
		caixaContatosInativos = new JTextField();
		caixaContatosInativos.setColumns(10);
		caixaContatosInativos.setBounds(163, 133, 552, 27);
		contentPane.add(caixaContatosInativos);
		
		lblEndereco = new JLabel("Endereço");
		lblEndereco.setForeground(SystemColor.text);
		lblEndereco.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		lblEndereco.setBounds(26, 178, 115, 15);
		contentPane.add(lblEndereco);
		
		caixaEndereco = new JTextField();
		caixaEndereco.setColumns(10);
		caixaEndereco.setBounds(163, 172, 414, 27);
		contentPane.add(caixaEndereco);
		
		lblN = new JLabel("Nº");
		lblN.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
		lblN.setForeground(SystemColor.text);
		lblN.setBounds(599, 178, 32, 15);
		contentPane.add(lblN);
		
		textFieldNumeroLogradouro = new JTextField();
		textFieldNumeroLogradouro.setBounds(631, 172, 56, 27);
		contentPane.add(textFieldNumeroLogradouro);
		textFieldNumeroLogradouro.setColumns(10);
		
		textFieldCodigoCidade = new JTextField();
		textFieldCodigoCidade.setBounds(163, 289, 92, 27);
		contentPane.add(textFieldCodigoCidade);
		textFieldCodigoCidade.setColumns(10);
		
		textFieldDescricaoCidade = new JTextField();
		textFieldDescricaoCidade.setEditable(false);
		textFieldDescricaoCidade.setEnabled(false);
		textFieldDescricaoCidade.setColumns(10);
		textFieldDescricaoCidade.setBounds(267, 289, 344, 27);
		contentPane.add(textFieldDescricaoCidade);
		
		textFieldUfCidade = new JTextField();
		textFieldUfCidade.setEditable(false);
		textFieldUfCidade.setEnabled(false);
		textFieldUfCidade.setColumns(10);
		textFieldUfCidade.setBounds(623, 289, 92, 27);
		contentPane.add(textFieldUfCidade);
		
		textFieldBairro = new JTextField();
		textFieldBairro.setColumns(10);
		textFieldBairro.setBounds(163, 250, 318, 27);
		contentPane.add(textFieldBairro);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setForeground(Color.WHITE);
		lblBairro.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		lblBairro.setBounds(26, 256, 115, 15);
		contentPane.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setForeground(Color.WHITE);
		lblCidade.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		lblCidade.setBounds(26, 295, 115, 15);
		contentPane.add(lblCidade);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.setIcon(new ImageIcon("./icones/insert.png"));
		btnInserir.setBounds(173, 337, 100, 34);
		contentPane.add(btnInserir);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setIcon(new ImageIcon("./icones/edit.png"));
		btnEditar.setBounds(314, 337, 100, 34);
		contentPane.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setIcon(new ImageIcon("./icones/delete.png"));
		btnExcluir.setBounds(452, 337, 100, 34);
		contentPane.add(btnExcluir);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setIcon(new ImageIcon("./icones/lupa.png"));
		btnPesquisar.setBounds(587, 337, 128, 34);
		contentPane.add(btnPesquisar);
		
		lblCep = new JLabel("CEP");
		lblCep.setForeground(Color.WHITE);
		lblCep.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		lblCep.setBounds(26, 217, 115, 15);
		contentPane.add(lblCep);
		
		panel = new JPanel();
		//panel.setForeground(SystemColor.textHighlight);
		panel.setBorder(new TitledBorder(null, null, TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(SystemColor.controlDkShadow);
		panel.setBounds(43, 404, 688, 130);
		contentPane.add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 20, 251, 92);
		panel.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		lblObservaes = new JLabel("Observações");
		lblObservaes.setForeground(Color.WHITE);
		lblObservaes.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		lblObservaes.setBounds(97, 5, 135, 15);
		panel.add(lblObservaes);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(163, 211, 196, 27);
		contentPane.add(textField);
		
	
	}
}
