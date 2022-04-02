package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import com.toedter.calendar.JDateChooser;

import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame{

	private JFrame frmContatos;
	private JTextField textFieldEmpresa;
	private JLabel lblContatosNovos;
	private JTextField textFieldcontatosnovos;
	private JLabel lblContatosDesligados;
	private JTextField textFieldcontatosdesligados;
	private JLabel lblEndereo;
	private JTextField textFieldEndereco;
	private JLabel lblnumeroCasa;
	private JTextField textFieldNumeroCasa;
	private JLabel lblCidade;
	private JTextField textFieldcodigoCidade;
	private JTextField textFieldDescricaoCidade;
	private JTextField textFielduf;
	private JButton btnPesquisar, btnIncluir, btnEditar, btnFazerRelatrio, btnInserirRegistro, btnExcluir;
	private JTextField textFieldContador;
	private JTextArea textAreaObservaçoes;
	private JDateChooser dataEscolha, dataEscolha2;
	private JTextField textField;
	
	public JTextField getTextFieldEmpresa() {
		return textFieldEmpresa;
	}

	public void setTextFieldEmpresa(JTextField textFieldEmpresa) {
		this.textFieldEmpresa = textFieldEmpresa;
	}

	public JTextField getTextFieldcontatosnovos() {
		return textFieldcontatosnovos;
	}

	public void setTextFieldcontatosnovos(JTextField textFieldcontatosnovos) {
		this.textFieldcontatosnovos = textFieldcontatosnovos;
	}

	public JTextField getTextFieldcontatosdesligados() {
		return textFieldcontatosdesligados;
	}

	public void setTextFieldcontatosdesligados(JTextField textFieldcontatosdesligados) {
		this.textFieldcontatosdesligados = textFieldcontatosdesligados;
	}

	public JTextField getTextFieldEndereco() {
		return textFieldEndereco;
	}

	public void setTextFieldEndereco(JTextField textFieldEndereco) {
		this.textFieldEndereco = textFieldEndereco;
	}

	public JTextField getTextFieldNumeroCasa() {
		return textFieldNumeroCasa;
	}

	public void setTextFieldNumeroCasa(JTextField textFieldNumeroCasa) {
		this.textFieldNumeroCasa = textFieldNumeroCasa;
	}

	public JTextField getTextFieldcodigoCidade() {
		return textFieldcodigoCidade;
	}

	public void setTextFieldcodigoCidade(JTextField textFieldcodigoCidade) {
		this.textFieldcodigoCidade = textFieldcodigoCidade;
	}

	public JTextField getTextFieldDescricaoCidade() {
		return textFieldDescricaoCidade;
	}

	public void setTextFieldDescricaoCidade(JTextField textFieldDescricaoCidade) {
		this.textFieldDescricaoCidade = textFieldDescricaoCidade;
	}

	public JTextField getTextFielduf() {
		return textFielduf;
	}

	public void setTextFielduf(JTextField textFielduf) {
		this.textFielduf = textFielduf;
	}

	public JButton getBtnPesquisar() {
		return btnPesquisar;
	}

	public void setBtnPesquisar(JButton btnPesquisar) {
		this.btnPesquisar = btnPesquisar;
	}

	public JButton getBtnIncluir() {
		return btnIncluir;
	}

	public void setBtnIncluir(JButton btnIncluir) {
		this.btnIncluir = btnIncluir;
	}

	public JButton getBtnEditar() {
		return btnEditar;
	}

	public void setBtnEditar(JButton btnEditar) {
		this.btnEditar = btnEditar;
	}

	public JButton getBtnFazerRelatrio() {
		return btnFazerRelatrio;
	}

	public void setBtnFazerRelatrio(JButton btnFazerRelatrio) {
		this.btnFazerRelatrio = btnFazerRelatrio;
	}

	public JButton getBtnInserirRegistro() {
		return btnInserirRegistro;
	}

	public void setBtnInserirRegistro(JButton btnInserirRegistro) {
		this.btnInserirRegistro = btnInserirRegistro;
	}

	public JButton getBtnExcluir() {
		return btnExcluir;
	}

	public void setBtnExcluir(JButton btnExcluir) {
		this.btnExcluir = btnExcluir;
	}

	public JTextField getTextFieldContador() {
		return textFieldContador;
	}

	public void setTextFieldContador(JTextField textFieldContador) {
		this.textFieldContador = textFieldContador;
	}

	public JTextArea getTextAreaObservaçoes() {
		return textAreaObservaçoes;
	}

	public void setTextAreaObservaçoes(JTextArea textAreaObservaçoes) {
		this.textAreaObservaçoes = textAreaObservaçoes;
	}

	public JDateChooser getDataEscolha() {
		return dataEscolha;
	}

	public void setDataEscolha(JDateChooser dataEscolha) {
		this.dataEscolha = dataEscolha;
	}

	public JDateChooser getDataEscolha2() {
		return dataEscolha2;
	}

	public void setDataEscolha2(JDateChooser dataEscolha2) {
		this.dataEscolha2 = dataEscolha2;
	}

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
					JanelaPrincipal window = new JanelaPrincipal();
					window.frmContatos.setVisible(true);
					window.frmContatos.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws ParseException 
	 */
	public JanelaPrincipal() {
		
		try {
			initialize();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize() throws ParseException {
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension d = t.getScreenSize();
		
		frmContatos = new JFrame();
		frmContatos.setResizable(false);
		frmContatos.getContentPane().setLocation(new Point(0, 10));
		frmContatos.getContentPane().setBackground(Color.DARK_GRAY);
		frmContatos.setBackground(Color.DARK_GRAY);
		frmContatos.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 12));
		frmContatos.setIconImage(Toolkit.getDefaultToolkit().getImage("./telefone"));
		frmContatos.setForeground(UIManager.getColor("EditorPane.selectionForeground"));
		frmContatos.setTitle("Contatos - 1.6 - Interface reformulada");
		frmContatos.setSize(934, 542);
		frmContatos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmContatos.getContentPane().setLayout(springLayout);
		
		JLabel lblEmpresa = new JLabel("Empresa");
		springLayout.putConstraint(SpringLayout.WEST, lblEmpresa, 10, SpringLayout.WEST, frmContatos.getContentPane());
		lblEmpresa.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpresa.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		lblEmpresa.setForeground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, lblEmpresa, 21, SpringLayout.NORTH, frmContatos.getContentPane());
		frmContatos.getContentPane().add(lblEmpresa);
		
		textFieldEmpresa = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, lblEmpresa, -6, SpringLayout.WEST, textFieldEmpresa);
		springLayout.putConstraint(SpringLayout.WEST, textFieldEmpresa, 102, SpringLayout.WEST, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textFieldEmpresa, -29, SpringLayout.EAST, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, textFieldEmpresa, 17, SpringLayout.NORTH, frmContatos.getContentPane());
		textFieldEmpresa.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		textFieldEmpresa.setBackground(Color.YELLOW);
		textFieldEmpresa.setForeground(Color.BLACK);
		frmContatos.getContentPane().add(textFieldEmpresa);
		textFieldEmpresa.setColumns(10);
		
		lblContatosNovos = new JLabel("Contatos Novos");
		lblContatosNovos.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		lblContatosNovos.setForeground(Color.WHITE);
		frmContatos.getContentPane().add(lblContatosNovos);
		
		textFieldcontatosnovos = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblContatosNovos, 3, SpringLayout.NORTH, textFieldcontatosnovos);
		springLayout.putConstraint(SpringLayout.EAST, lblContatosNovos, -15, SpringLayout.WEST, textFieldcontatosnovos);
		springLayout.putConstraint(SpringLayout.NORTH, textFieldcontatosnovos, 19, SpringLayout.SOUTH, textFieldEmpresa);
		springLayout.putConstraint(SpringLayout.WEST, textFieldcontatosnovos, 154, SpringLayout.WEST, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textFieldcontatosnovos, -29, SpringLayout.EAST, frmContatos.getContentPane());
		textFieldcontatosnovos.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		frmContatos.getContentPane().add(textFieldcontatosnovos);
		textFieldcontatosnovos.setColumns(10);
		
		lblContatosDesligados = new JLabel("Contatos Desligados");
		springLayout.putConstraint(SpringLayout.WEST, lblContatosDesligados, -2, SpringLayout.WEST, lblContatosNovos);
		lblContatosDesligados.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		lblContatosDesligados.setForeground(Color.WHITE);
		frmContatos.getContentPane().add(lblContatosDesligados);
		
		textFieldcontatosdesligados = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblContatosDesligados, 3, SpringLayout.NORTH, textFieldcontatosdesligados);
		springLayout.putConstraint(SpringLayout.NORTH, textFieldcontatosdesligados, 19, SpringLayout.SOUTH, textFieldcontatosnovos);
		springLayout.putConstraint(SpringLayout.WEST, textFieldcontatosdesligados, 180, SpringLayout.WEST, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textFieldcontatosdesligados, -29, SpringLayout.EAST, frmContatos.getContentPane());
		textFieldcontatosdesligados.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		frmContatos.getContentPane().add(textFieldcontatosdesligados);
		textFieldcontatosdesligados.setColumns(10);
		
		lblEndereo = new JLabel("Endereço");
		springLayout.putConstraint(SpringLayout.NORTH, lblEndereo, 32, SpringLayout.SOUTH, lblContatosDesligados);
		springLayout.putConstraint(SpringLayout.WEST, lblEndereo, 0, SpringLayout.WEST, lblContatosNovos);
		lblEndereo.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		lblEndereo.setForeground(Color.WHITE);
		frmContatos.getContentPane().add(lblEndereo);
		
		textFieldEndereco = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textFieldEndereco, 12, SpringLayout.EAST, lblEndereo);
		springLayout.putConstraint(SpringLayout.EAST, textFieldEndereco, -445, SpringLayout.EAST, frmContatos.getContentPane());
		textFieldEndereco.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		frmContatos.getContentPane().add(textFieldEndereco);
		textFieldEndereco.setColumns(10);
		
		lblnumeroCasa = new JLabel("Nº");
		springLayout.putConstraint(SpringLayout.NORTH, lblnumeroCasa, 0, SpringLayout.NORTH, lblEndereo);
		springLayout.putConstraint(SpringLayout.WEST, lblnumeroCasa, 47, SpringLayout.EAST, textFieldEndereco);
		lblnumeroCasa.setForeground(Color.WHITE);
		lblnumeroCasa.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		frmContatos.getContentPane().add(lblnumeroCasa);
		
		textFieldNumeroCasa = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textFieldNumeroCasa, 0, SpringLayout.NORTH, lblEndereo);
		springLayout.putConstraint(SpringLayout.WEST, textFieldNumeroCasa, 15, SpringLayout.EAST, lblnumeroCasa);
		springLayout.putConstraint(SpringLayout.EAST, textFieldNumeroCasa, -274, SpringLayout.EAST, frmContatos.getContentPane());
		textFieldNumeroCasa.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		frmContatos.getContentPane().add(textFieldNumeroCasa);
		textFieldNumeroCasa.setColumns(10);
		
		lblCidade = new JLabel("Cidade");
		springLayout.putConstraint(SpringLayout.NORTH, lblCidade, 35, SpringLayout.SOUTH, lblEndereo);
		springLayout.putConstraint(SpringLayout.EAST, lblCidade, -861, SpringLayout.EAST, frmContatos.getContentPane());
		lblCidade.setForeground(Color.WHITE);
		lblCidade.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		frmContatos.getContentPane().add(lblCidade);
		
		textFieldcodigoCidade = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textFieldcodigoCidade, 210, SpringLayout.NORTH, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textFieldEndereco, -20, SpringLayout.NORTH, textFieldcodigoCidade);
		springLayout.putConstraint(SpringLayout.WEST, textFieldcodigoCidade, 16, SpringLayout.EAST, lblCidade);
		springLayout.putConstraint(SpringLayout.EAST, textFieldcodigoCidade, -741, SpringLayout.EAST, frmContatos.getContentPane());
		textFieldcodigoCidade.setBackground(Color.cyan);
		textFieldcodigoCidade.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		frmContatos.getContentPane().add(textFieldcodigoCidade);
		textFieldcodigoCidade.setColumns(10);
		
		textFieldDescricaoCidade = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textFieldDescricaoCidade, 210, SpringLayout.NORTH, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textFieldDescricaoCidade, 18, SpringLayout.EAST, textFieldcodigoCidade);
		springLayout.putConstraint(SpringLayout.EAST, textFieldDescricaoCidade, -350, SpringLayout.EAST, frmContatos.getContentPane());
		textFieldDescricaoCidade.setEditable(false);
		textFieldDescricaoCidade.setBackground(Color.YELLOW);
		textFieldDescricaoCidade.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		frmContatos.getContentPane().add(textFieldDescricaoCidade);
		textFieldDescricaoCidade.setColumns(10);
		
		textFielduf = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textFielduf, 0, SpringLayout.NORTH, textFieldcodigoCidade);
		springLayout.putConstraint(SpringLayout.WEST, textFielduf, 19, SpringLayout.EAST, textFieldDescricaoCidade);
		textFielduf.setEditable(false);
		textFielduf.setBackground(Color.YELLOW);
		textFielduf.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		frmContatos.getContentPane().add(textFielduf);
		textFielduf.setColumns(10);
		
		btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		springLayout.putConstraint(SpringLayout.EAST, textFielduf, -27, SpringLayout.WEST, btnPesquisar);
		springLayout.putConstraint(SpringLayout.NORTH, btnPesquisar, 70, SpringLayout.SOUTH, textFieldcontatosdesligados);
		springLayout.putConstraint(SpringLayout.SOUTH, btnPesquisar, -260, SpringLayout.SOUTH, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnPesquisar, 744, SpringLayout.WEST, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnPesquisar, -29, SpringLayout.EAST, frmContatos.getContentPane());
		frmContatos.getContentPane().add(btnPesquisar);
		
		btnIncluir = new JButton("Incluir");
		btnIncluir.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 14));
		springLayout.putConstraint(SpringLayout.NORTH, btnIncluir, 27, SpringLayout.SOUTH, textFieldcodigoCidade);
		springLayout.putConstraint(SpringLayout.WEST, btnIncluir, 89, SpringLayout.WEST, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnIncluir, -694, SpringLayout.EAST, frmContatos.getContentPane());
		frmContatos.getContentPane().add(btnIncluir);
		
		btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		springLayout.putConstraint(SpringLayout.NORTH, btnEditar, 0, SpringLayout.NORTH, btnIncluir);
		springLayout.putConstraint(SpringLayout.WEST, btnEditar, 86, SpringLayout.EAST, btnIncluir);
		frmContatos.getContentPane().add(btnEditar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		springLayout.putConstraint(SpringLayout.EAST, btnEditar, -79, SpringLayout.WEST, btnExcluir);
		springLayout.putConstraint(SpringLayout.WEST, btnExcluir, 556, SpringLayout.WEST, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnExcluir, 27, SpringLayout.SOUTH, textFielduf);
		springLayout.putConstraint(SpringLayout.EAST, btnExcluir, 0, SpringLayout.EAST, textFielduf);
		frmContatos.getContentPane().add(btnExcluir);
		
		JLabel lblObservaes = new JLabel("Observações");
		springLayout.putConstraint(SpringLayout.SOUTH, lblObservaes, -170, SpringLayout.SOUTH, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblObservaes, 0, SpringLayout.EAST, lblContatosDesligados);
		lblObservaes.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		lblObservaes.setForeground(Color.WHITE);
		frmContatos.getContentPane().add(lblObservaes);
				
		JLabel lblContador = new JLabel("Contador");
		springLayout.putConstraint(SpringLayout.WEST, lblContador, 0, SpringLayout.WEST, btnPesquisar);
		lblContador.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		lblContador.setForeground(Color.WHITE);
		frmContatos.getContentPane().add(lblContador);
		
		btnFazerRelatrio = new JButton("Fazer relatório");
		springLayout.putConstraint(SpringLayout.EAST, btnFazerRelatrio, 0, SpringLayout.EAST, textFieldNumeroCasa);
		btnFazerRelatrio.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		frmContatos.getContentPane().add(btnFazerRelatrio);
		
		btnInserirRegistro = new JButton("Inserir Registro");
		btnInserirRegistro.addActionListener(new ActionListener() {
			int ac = 1;
			public void actionPerformed(ActionEvent e) {
				
				ac++;
				textFieldContador.setText(String.valueOf(ac));
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnFazerRelatrio, 0, SpringLayout.NORTH, btnInserirRegistro);
		springLayout.putConstraint(SpringLayout.SOUTH, lblContador, -97, SpringLayout.NORTH, btnInserirRegistro);
		springLayout.putConstraint(SpringLayout.SOUTH, btnInserirRegistro, -51, SpringLayout.SOUTH, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnInserirRegistro, -80, SpringLayout.EAST, frmContatos.getContentPane());
		btnInserirRegistro.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		frmContatos.getContentPane().add(btnInserirRegistro);
		
		textAreaObservaçoes = new JTextArea();
		textAreaObservaçoes.setLineWrap(true);
		textAreaObservaçoes.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		springLayout.putConstraint(SpringLayout.NORTH, textAreaObservaçoes, 23, SpringLayout.SOUTH, lblObservaes);
		springLayout.putConstraint(SpringLayout.WEST, textAreaObservaçoes, 31, SpringLayout.WEST, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textAreaObservaçoes, -28, SpringLayout.SOUTH, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textAreaObservaçoes, 218, SpringLayout.WEST, frmContatos.getContentPane());
		frmContatos.getContentPane().add(textAreaObservaçoes);
		
		//frmContatos.getContentPane().add(new JScrollPane(textAreaObservaçoes));
		
		JLabel lblPerodoDeRegistro = new JLabel("Período de registro");
		springLayout.putConstraint(SpringLayout.NORTH, lblPerodoDeRegistro, 0, SpringLayout.NORTH, lblObservaes);
		springLayout.putConstraint(SpringLayout.WEST, lblPerodoDeRegistro, 85, SpringLayout.EAST, lblObservaes);
		lblPerodoDeRegistro.setForeground(Color.WHITE);
		lblPerodoDeRegistro.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		frmContatos.getContentPane().add(lblPerodoDeRegistro);
		
		textFieldContador = new JTextField();
		textFieldContador.setEditable(false);
		//textFieldContador.setEnabled(false);
		textFieldContador.setBackground(Color.CYAN);
		springLayout.putConstraint(SpringLayout.NORTH, textFieldContador, 6, SpringLayout.SOUTH, lblContador);
		springLayout.putConstraint(SpringLayout.EAST, textFieldContador, -98, SpringLayout.EAST, frmContatos.getContentPane());
		frmContatos.getContentPane().add(textFieldContador);
		textFieldContador.setColumns(10);
		
		Calendar calendarioBrasil = Calendar.getInstance();
		Calendar calendarioBrasil2 = Calendar.getInstance();
		SimpleDateFormat formatoDeData = new SimpleDateFormat("dd-MM-yyyy");
		//impede alteração no formato de data
		formatoDeData.setLenient(false);
		//data = formatoDeData.parse("27-10-2002");
		
		String a = formatoDeData.format(calendarioBrasil.getTime());
		//permite a manipulação de uma informação coletada
		calendarioBrasil2.add(Calendar.DAY_OF_MONTH, 7);
		
		String b = formatoDeData.format(calendarioBrasil2.getTime());
		
		JDateChooser dataEscolha = new JDateChooser();
		springLayout.putConstraint(SpringLayout.WEST, dataEscolha, 51,  SpringLayout.EAST, textAreaObservaçoes);
		springLayout.putConstraint(SpringLayout.EAST, dataEscolha, 185, SpringLayout.EAST, textAreaObservaçoes);
		dataEscolha.setDate(formatoDeData.parse(a));
		//dataEscolha.setToolTipText("Este campo pede a data para realizar os contatos da semana");
		dataEscolha.setDateFormatString("dd-MM-yyyy");
		springLayout.putConstraint(SpringLayout.NORTH, dataEscolha, 35,  SpringLayout.SOUTH, lblPerodoDeRegistro);
		//dataEscolha.setLayout(springLayout);
		//dataEscolha.setCalendar(null);
		frmContatos.getContentPane().add(dataEscolha);
		
		JDateChooser dataEscolha2 = new JDateChooser();
		dataEscolha2.setDate(formatoDeData.parse(b));
		dataEscolha2.setDateFormatString("dd-MM-yyyy");
		//dataEscolha2.setToolTipText("Este campo pede a data para realizar os contatos da semana");
		springLayout.putConstraint(SpringLayout.NORTH, dataEscolha2, 100,  SpringLayout.SOUTH, lblPerodoDeRegistro);
		springLayout.putConstraint(SpringLayout.EAST, dataEscolha2, 185, SpringLayout.EAST, textAreaObservaçoes);
		springLayout.putConstraint(SpringLayout.WEST, dataEscolha2, 51,  SpringLayout.EAST, textAreaObservaçoes);
		//dataEscolha.setCalendar(null);
		frmContatos.getContentPane().add(dataEscolha2);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		lblCep.setForeground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, lblCep, 30, SpringLayout.SOUTH, textFieldcontatosdesligados);
		springLayout.putConstraint(SpringLayout.WEST, lblCep, 28, SpringLayout.EAST, textFieldNumeroCasa);
		springLayout.putConstraint(SpringLayout.EAST, lblCep, 78, SpringLayout.EAST, textFieldNumeroCasa);
		frmContatos.getContentPane().add(lblCep);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 1, SpringLayout.NORTH, lblEndereo);
		springLayout.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, btnInserirRegistro);
		frmContatos.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
	}
}
