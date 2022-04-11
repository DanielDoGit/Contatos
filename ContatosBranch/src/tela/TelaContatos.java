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
import javax.swing.Icon;

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
import java.nio.file.Paths;
import java.awt.event.ActionEvent;

public class TelaContatos extends JFrame{

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
	private JButton btnIncluir, btnEditar, btnFazerRelatrio, btnInserirRegistro, btnExcluir, btnNewButton;
	private JTextField textFieldContador;
	private JTextArea textAreaObservaçoes;
	private JDateChooser dataEscolha, dataEscolha2;
	private JTextField textFieldCep;
	private JScrollPane barraDeRolagem;
	private JLabel lblBairro;
	private JTextField textField;
	private JLabel lblcep;
	private JLabel lblObservaes, lblContador;
	
	
	

	/**
	 * Launch the application.
	 */
	
	
	/**
	 * Create the application.
	 * @throws ParseException 
	 */
	public TelaContatos() {
		
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
		
		new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				frmContatos = new JFrame();
				frmContatos.setResizable(false);
				frmContatos.getContentPane().setBackground(Color.DARK_GRAY);
				frmContatos.setBackground(Color.DARK_GRAY);
				frmContatos.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 12));
				frmContatos.setIconImage(Toolkit.getDefaultToolkit().getImage("./telefone"));
				frmContatos.setForeground(UIManager.getColor("EditorPane.selectionForeground"));
				frmContatos.setTitle("Contatos - 1.6 - Interface reformulada");
				//frmContatos.getContentPane().setLocation(new Point(0, 10));
				frmContatos.setSize(934, 599);
				frmContatos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frmContatos.setLocationRelativeTo(null);
				frmContatos.setVisible(true);
				
			}
		};
		
		//posicionamento no meio
		
		
		
		
		
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
		springLayout.putConstraint(SpringLayout.EAST, lblEmpresa, -84, SpringLayout.WEST, textFieldEmpresa);
		springLayout.putConstraint(SpringLayout.EAST, textFieldEmpresa, -29, SpringLayout.EAST, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, textFieldEmpresa, 17, SpringLayout.NORTH, frmContatos.getContentPane());
		textFieldEmpresa.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		textFieldEmpresa.setBackground(Color.YELLOW);
		textFieldEmpresa.setForeground(Color.BLACK);
		frmContatos.getContentPane().add(textFieldEmpresa);
		textFieldEmpresa.setColumns(10);
		
		lblContatosNovos = new JLabel("Contatos Novos");
		springLayout.putConstraint(SpringLayout.NORTH, lblContatosNovos, 30, SpringLayout.SOUTH, lblEmpresa);
		lblContatosNovos.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		lblContatosNovos.setForeground(Color.WHITE);
		frmContatos.getContentPane().add(lblContatosNovos);
		
		textFieldcontatosnovos = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, lblContatosNovos, -41, SpringLayout.WEST, textFieldcontatosnovos);
		springLayout.putConstraint(SpringLayout.NORTH, textFieldcontatosnovos, 19, SpringLayout.SOUTH, textFieldEmpresa);
		springLayout.putConstraint(SpringLayout.WEST, textFieldcontatosnovos, 180, SpringLayout.WEST, frmContatos.getContentPane());
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
		springLayout.putConstraint(SpringLayout.NORTH, textFieldcontatosdesligados, 19, SpringLayout.SOUTH, textFieldcontatosnovos);
		springLayout.putConstraint(SpringLayout.WEST, textFieldEmpresa, 0, SpringLayout.WEST, textFieldcontatosdesligados);
		springLayout.putConstraint(SpringLayout.NORTH, lblContatosDesligados, 3, SpringLayout.NORTH, textFieldcontatosdesligados);
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
		springLayout.putConstraint(SpringLayout.NORTH, textFieldEndereco, 0, SpringLayout.NORTH, lblEndereo);
		springLayout.putConstraint(SpringLayout.WEST, textFieldEndereco, 12, SpringLayout.EAST, lblEndereo);
		textFieldEndereco.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		frmContatos.getContentPane().add(textFieldEndereco);
		textFieldEndereco.setColumns(10);
		
		lblnumeroCasa = new JLabel("Nº");
		springLayout.putConstraint(SpringLayout.EAST, textFieldEndereco, -31, SpringLayout.WEST, lblnumeroCasa);
		springLayout.putConstraint(SpringLayout.NORTH, lblnumeroCasa, 0, SpringLayout.NORTH, lblEndereo);
		lblnumeroCasa.setForeground(Color.WHITE);
		lblnumeroCasa.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		frmContatos.getContentPane().add(lblnumeroCasa);
		
		textFieldNumeroCasa = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, lblnumeroCasa, -6, SpringLayout.WEST, textFieldNumeroCasa);
		springLayout.putConstraint(SpringLayout.NORTH, textFieldNumeroCasa, 0, SpringLayout.NORTH, lblEndereo);
		springLayout.putConstraint(SpringLayout.WEST, textFieldNumeroCasa, 794, SpringLayout.WEST, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textFieldNumeroCasa, -49, SpringLayout.EAST, frmContatos.getContentPane());
		textFieldNumeroCasa.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		frmContatos.getContentPane().add(textFieldNumeroCasa);
		textFieldNumeroCasa.setColumns(10);
		
		lblCidade = new JLabel("Cidade");
		springLayout.putConstraint(SpringLayout.NORTH, lblCidade, 89, SpringLayout.SOUTH, lblEndereo);
		springLayout.putConstraint(SpringLayout.WEST, lblCidade, 0, SpringLayout.WEST, lblContatosNovos);
		lblCidade.setForeground(Color.WHITE);
		lblCidade.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		frmContatos.getContentPane().add(lblCidade);
		
		textFieldcodigoCidade = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textFieldcodigoCidade, 30, SpringLayout.EAST, lblCidade);
		textFieldcodigoCidade.setBackground(Color.cyan);
		textFieldcodigoCidade.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		frmContatos.getContentPane().add(textFieldcodigoCidade);
		textFieldcodigoCidade.setColumns(10);
		
		textFieldDescricaoCidade = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, textFieldcodigoCidade, -17, SpringLayout.WEST, textFieldDescricaoCidade);
		springLayout.putConstraint(SpringLayout.WEST, textFieldDescricaoCidade, 210, SpringLayout.WEST, frmContatos.getContentPane());
		textFieldDescricaoCidade.setEditable(false);
		textFieldDescricaoCidade.setBackground(Color.YELLOW);
		textFieldDescricaoCidade.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		frmContatos.getContentPane().add(textFieldDescricaoCidade);
		textFieldDescricaoCidade.setColumns(10);
		
		textFielduf = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, textFieldDescricaoCidade, -16, SpringLayout.WEST, textFielduf);
		springLayout.putConstraint(SpringLayout.WEST, textFielduf, 625, SpringLayout.WEST, frmContatos.getContentPane());
		textFielduf.setEditable(false);
		textFielduf.setBackground(Color.YELLOW);
		textFielduf.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		frmContatos.getContentPane().add(textFielduf);
		textFielduf.setColumns(10);
		
		btnIncluir = new JButton("Incluir");
		springLayout.putConstraint(SpringLayout.WEST, btnIncluir, 86, SpringLayout.WEST, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnIncluir, -697, SpringLayout.EAST, frmContatos.getContentPane());
		btnIncluir.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 14));
		frmContatos.getContentPane().add(btnIncluir);
		
		btnEditar = new JButton("Editar");
		springLayout.putConstraint(SpringLayout.NORTH, btnEditar, 0, SpringLayout.NORTH, btnIncluir);
		springLayout.putConstraint(SpringLayout.WEST, btnEditar, 81, SpringLayout.EAST, btnIncluir);
		btnEditar.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		frmContatos.getContentPane().add(btnEditar);
		
		btnExcluir = new JButton("Excluir");
		springLayout.putConstraint(SpringLayout.WEST, btnExcluir, 550, SpringLayout.WEST, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnExcluir, -223, SpringLayout.EAST, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnEditar, -81, SpringLayout.WEST, btnExcluir);
		springLayout.putConstraint(SpringLayout.NORTH, btnExcluir, 0, SpringLayout.NORTH, btnIncluir);
		btnExcluir.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		frmContatos.getContentPane().add(btnExcluir);
		
		lblObservaes = new JLabel("Observações");
		springLayout.putConstraint(SpringLayout.SOUTH, btnIncluir, -27, SpringLayout.NORTH, lblObservaes);
		springLayout.putConstraint(SpringLayout.SOUTH, lblObservaes, -170, SpringLayout.SOUTH, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblObservaes, 0, SpringLayout.EAST, lblContatosDesligados);
		lblObservaes.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		lblObservaes.setForeground(Color.WHITE);
		frmContatos.getContentPane().add(lblObservaes);
				
		 lblContador = new JLabel("Contador");
		//springLayout.putConstraint(SpringLayout.WEST, btnPesquisar, 50, SpringLayout.EAST, textFielduf);
		lblContador.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		lblContador.setForeground(Color.WHITE);
		frmContatos.getContentPane().add(lblContador);
		
		btnFazerRelatrio = new JButton("Fazer relatório");
		btnFazerRelatrio.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		frmContatos.getContentPane().add(btnFazerRelatrio);
		
		btnInserirRegistro = new JButton("Inserir Registro");
		springLayout.putConstraint(SpringLayout.EAST, btnFazerRelatrio, -48, SpringLayout.WEST, btnInserirRegistro);
		btnInserirRegistro.addActionListener(new ActionListener() {
			int ac = 0;
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
		
		barraDeRolagem = new JScrollPane(textAreaObservaçoes);
		springLayout.putConstraint(SpringLayout.NORTH, barraDeRolagem, 23, SpringLayout.SOUTH, lblObservaes);
		springLayout.putConstraint(SpringLayout.WEST, barraDeRolagem, 31, SpringLayout.WEST, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, barraDeRolagem, -28, SpringLayout.SOUTH, frmContatos.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, barraDeRolagem, 218, SpringLayout.WEST, frmContatos.getContentPane());

		frmContatos.getContentPane().add(barraDeRolagem);
		
		//frmContatos.getContentPane().add(new JScrollPane(textAreaObservaçoes));
		
		JLabel lblPerodoDeRegistro = new JLabel("Período de registro");
		springLayout.putConstraint(SpringLayout.WEST, lblContador, 348, SpringLayout.EAST, lblPerodoDeRegistro);
		springLayout.putConstraint(SpringLayout.NORTH, lblPerodoDeRegistro, 0, SpringLayout.NORTH, lblObservaes);
		springLayout.putConstraint(SpringLayout.WEST, lblPerodoDeRegistro, 85, SpringLayout.EAST, lblObservaes);
		lblPerodoDeRegistro.setForeground(Color.WHITE);
		lblPerodoDeRegistro.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		frmContatos.getContentPane().add(lblPerodoDeRegistro);
		
		textFieldContador = new JTextField();
		//textFieldContador.setEditable(false);
		textFieldContador.setHorizontalAlignment(textFieldContador.CENTER);
		textFieldContador.setEnabled(false);
		textFieldContador.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, textFieldContador, 6, SpringLayout.SOUTH, lblContador);
		springLayout.putConstraint(SpringLayout.EAST, textFieldContador, -90, SpringLayout.EAST, frmContatos.getContentPane());
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
		
		dataEscolha = new JDateChooser();
		springLayout.putConstraint(SpringLayout.WEST, dataEscolha, 80,  SpringLayout.EAST, textAreaObservaçoes);
		springLayout.putConstraint(SpringLayout.EAST, dataEscolha, 215, SpringLayout.EAST, textAreaObservaçoes);
		dataEscolha.setDate(formatoDeData.parse(a));
		//dataEscolha.setToolTipText("Este campo pede a data para realizar os contatos da semana");
		dataEscolha.setDateFormatString("dd-MM-yyyy");
		springLayout.putConstraint(SpringLayout.NORTH, dataEscolha, 35,  SpringLayout.SOUTH, lblPerodoDeRegistro);
		//dataEscolha.setLayout(springLayout);
		//dataEscolha.setCalendar(null);
		frmContatos.getContentPane().add(dataEscolha);
		
		dataEscolha2 = new JDateChooser();
		dataEscolha2.setDate(formatoDeData.parse(b));
		dataEscolha2.setDateFormatString("dd-MM-yyyy");
		//dataEscolha2.setToolTipText("Este campo pede a data para realizar os contatos da semana");
		springLayout.putConstraint(SpringLayout.NORTH, dataEscolha2, 100,  SpringLayout.SOUTH, lblPerodoDeRegistro);
		springLayout.putConstraint(SpringLayout.EAST, dataEscolha2, 215, SpringLayout.EAST, textAreaObservaçoes);
		springLayout.putConstraint(SpringLayout.WEST, dataEscolha2, 80,  SpringLayout.EAST, textAreaObservaçoes);
		//dataEscolha.setCalendar(null);
		frmContatos.getContentPane().add(dataEscolha2);
		
		textFieldCep = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textFielduf, 30, SpringLayout.SOUTH, textFieldCep);
		springLayout.putConstraint(SpringLayout.NORTH, textFieldCep, 75, SpringLayout.SOUTH, textFieldcontatosdesligados);
		springLayout.putConstraint(SpringLayout.EAST, textFieldCep, 0, SpringLayout.EAST, btnExcluir);
		frmContatos.getContentPane().add(textFieldCep);
		textFieldCep.setColumns(10);
		
		lblBairro = new JLabel("Bairro");
		springLayout.putConstraint(SpringLayout.NORTH, lblBairro, 27, SpringLayout.SOUTH, lblEndereo);
		springLayout.putConstraint(SpringLayout.WEST, lblBairro, 0, SpringLayout.WEST, lblContatosNovos);
		springLayout.putConstraint(SpringLayout.SOUTH, lblBairro, 230, SpringLayout.NORTH, lblEmpresa);
		lblBairro.setForeground(Color.WHITE);
		lblBairro.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		frmContatos.getContentPane().add(lblBairro);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textFieldcodigoCidade, 26, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.NORTH, textFieldDescricaoCidade, 26, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.NORTH, textField, 5, SpringLayout.NORTH, lblBairro);
		springLayout.putConstraint(SpringLayout.WEST, textField, 36, SpringLayout.EAST, lblBairro);
		textField.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 14));
		textField.setColumns(10);
		frmContatos.getContentPane().add(textField);
		
		lblcep = new JLabel("CEP");
		springLayout.putConstraint(SpringLayout.EAST, textField, -43, SpringLayout.WEST, lblcep);
		springLayout.putConstraint(SpringLayout.NORTH, lblcep, 79, SpringLayout.SOUTH, textFieldcontatosdesligados);
		springLayout.putConstraint(SpringLayout.EAST, lblcep, -23, SpringLayout.WEST, textFieldCep);
		lblcep.setForeground(Color.WHITE);
		lblcep.setFont(new Font("DejaVu Sans Condensed", Font.PLAIN, 16));
		frmContatos.getContentPane().add(lblcep);
		
		btnNewButton = new JButton("Pesquisar");
		btnNewButton.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 14));
		btnNewButton.setIcon(new ImageIcon("./icones/lupa.png"));
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 75, SpringLayout.SOUTH, textFieldNumeroCasa);
		springLayout.putConstraint(SpringLayout.EAST, textFielduf, -31, SpringLayout.WEST, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, lblnumeroCasa);
		frmContatos.getContentPane().add(btnNewButton);
		
		
		
	}
}
