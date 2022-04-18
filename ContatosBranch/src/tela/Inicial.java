package tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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

public abstract class Inicial extends JFrame {

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
	//private JLayeredPane layeredPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblCep;
	private JTextField textFieldCep;
	private JLabel lblObservaes;
	private JButton btnPesquisar, btnInserir, btnEditar, btnExcluir, btnFazerRelatorio, btnInserirRegistro;
	private JDateChooser dataescolhaper01, dataescolhaper02;
	private Calendar calendarioper01, calendarioper02;
	private SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	private JLabel lblDe;

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextField getCaixacodigo() {
		return caixacodigo;
	}

	public void setCaixacodigo(JTextField caixacodigo) {
		this.caixacodigo = caixacodigo;
	}

	public JTextField getCaixaEmpresa() {
		return caixaEmpresa;
	}

	public void setCaixaEmpresa(JTextField caixaEmpresa) {
		this.caixaEmpresa = caixaEmpresa;
	}

	public JTextField getCaixaContatosNovos() {
		return caixaContatosNovos;
	}

	public void setCaixaContatosNovos(JTextField caixaContatosNovos) {
		this.caixaContatosNovos = caixaContatosNovos;
	}

	public JTextField getCaixaContatosInativos() {
		return caixaContatosInativos;
	}

	public void setCaixaContatosInativos(JTextField caixaContatosInativos) {
		this.caixaContatosInativos = caixaContatosInativos;
	}

	public JLabel getLblEndereco() {
		return lblEndereco;
	}

	public void setLblEndereco(JLabel lblEndereco) {
		this.lblEndereco = lblEndereco;
	}

	public JTextField getCaixaEndereco() {
		return caixaEndereco;
	}

	public void setCaixaEndereco(JTextField caixaEndereco) {
		this.caixaEndereco = caixaEndereco;
	}

	public JLabel getLblN() {
		return lblN;
	}

	public void setLblN(JLabel lblN) {
		this.lblN = lblN;
	}

	public JTextField getTextFieldNumeroLogradouro() {
		return textFieldNumeroLogradouro;
	}

	public void setTextFieldNumeroLogradouro(JTextField textFieldNumeroLogradouro) {
		this.textFieldNumeroLogradouro = textFieldNumeroLogradouro;
	}

	public JTextField getTextFieldCodigoCidade() {
		return textFieldCodigoCidade;
	}

	public void setTextFieldCodigoCidade(JTextField textFieldCodigoCidade) {
		this.textFieldCodigoCidade = textFieldCodigoCidade;
	}

	public JTextField getTextFieldDescricaoCidade() {
		return textFieldDescricaoCidade;
	}

	public void setTextFieldDescricaoCidade(JTextField textFieldDescricaoCidade) {
		this.textFieldDescricaoCidade = textFieldDescricaoCidade;
	}

	public JTextField getTextFieldUfCidade() {
		return textFieldUfCidade;
	}

	public void setTextFieldUfCidade(JTextField textFieldUfCidade) {
		this.textFieldUfCidade = textFieldUfCidade;
	}

	public JTextField getTextFieldBairro() {
		return textFieldBairro;
	}

	public void setTextFieldBairro(JTextField textFieldBairro) {
		this.textFieldBairro = textFieldBairro;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JLabel getLblCep() {
		return lblCep;
	}

	public void setLblCep(JLabel lblCep) {
		this.lblCep = lblCep;
	}

	public JTextField getTextFieldCep() {
		return textFieldCep;
	}

	public void setTextFieldCep(JTextField textFieldCep) {
		this.textFieldCep = textFieldCep;
	}

	public JLabel getLblObservaes() {
		return lblObservaes;
	}

	public void setLblObservaes(JLabel lblObservaes) {
		this.lblObservaes = lblObservaes;
	}

	public JButton getBtnPesquisar() {
		return btnPesquisar;
	}

	public void setBtnPesquisar(JButton btnPesquisar) {
		this.btnPesquisar = btnPesquisar;
	}

	public JButton getBtnInserir() {
		return btnInserir;
	}

	public void setBtnInserir(JButton btnInserir) {
		this.btnInserir = btnInserir;
	}

	public JButton getBtnEditar() {
		return btnEditar;
	}

	public void setBtnEditar(JButton btnEditar) {
		this.btnEditar = btnEditar;
	}

	public JButton getBtnExcluir() {
		return btnExcluir;
	}

	public void setBtnExcluir(JButton btnExcluir) {
		this.btnExcluir = btnExcluir;
	}

	public JButton getBtnFazerRelatorio() {
		return btnFazerRelatorio;
	}

	public void setBtnFazerRelatorio(JButton btnFazerRelatorio) {
		this.btnFazerRelatorio = btnFazerRelatorio;
	}

	public JButton getBtnInserirRegistro() {
		return btnInserirRegistro;
	}

	public void setBtnInserirRegistro(JButton btnInserirRegistro) {
		this.btnInserirRegistro = btnInserirRegistro;
	}

	public JDateChooser getDataescolhaper01() {
		return dataescolhaper01;
	}

	public void setDataescolhaper01(JDateChooser dataescolhaper01) {
		this.dataescolhaper01 = dataescolhaper01;
	}

	public JDateChooser getDataescolhaper02() {
		return dataescolhaper02;
	}

	public void setDataescolhaper02(JDateChooser dataescolhaper02) {
		this.dataescolhaper02 = dataescolhaper02;
	}

	public Calendar getCalendarioper01() {
		return calendarioper01;
	}

	public void setCalendarioper01(Calendar calendarioper01) {
		this.calendarioper01 = calendarioper01;
	}

	public Calendar getCalendarioper02() {
		return calendarioper02;
	}

	public void setCalendarioper02(Calendar calendarioper02) {
		this.calendarioper02 = calendarioper02;
	}

	public SimpleDateFormat getFormat() {
		return format;
	}

	public void setFormat(SimpleDateFormat format) {
		this.format = format;
	}

	public JLabel getLblDe() {
		return lblDe;
	}

	public void setLblDe(JLabel lblDe) {
		this.lblDe = lblDe;
	}

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
		
		calendarioper01 = Calendar.getInstance();
		calendarioper02 = Calendar.getInstance();
		calendarioper02.add(Calendar.DAY_OF_MONTH, 7);
		
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
		
		btnInserir = new JButton("Inserir");
		btnInserir.setIcon(new ImageIcon("./icones/insert.png"));
		btnInserir.setBounds(173, 337, 100, 34);
		contentPane.add(btnInserir);
		
		btnEditar = new JButton("Editar");
		btnEditar.setIcon(new ImageIcon("./icones/edit.png"));
		btnEditar.setBounds(314, 337, 100, 34);
		contentPane.add(btnEditar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setIcon(new ImageIcon("./icones/delete.png"));
		btnExcluir.setBounds(452, 337, 100, 34);
		contentPane.add(btnExcluir);
		
		btnPesquisar = new JButton("Pesquisar");
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
		
		btnInserirRegistro = new JButton("Inserir Registro");
		btnInserirRegistro.setBounds(512, 17, 140, 38);
		panel.add(btnInserirRegistro);
		
		btnFazerRelatorio = new JButton("Fazer relatório");
		btnFazerRelatorio.setBounds(512, 74, 140, 38);
		panel.add(btnFazerRelatorio);
		
		textFieldCep = new JTextField();
		textFieldCep.setColumns(10);
		textFieldCep.setBounds(163, 211, 196, 27);
		contentPane.add(textFieldCep);
		
		dataescolhaper01 = new JDateChooser();
		dataescolhaper01.setBounds(308, 34, 130, 28);
		dataescolhaper01.setDate(calendarioper01.getTime());
		dataescolhaper01.setDateFormatString("dd-MM-yyyy");
		panel.add(dataescolhaper01);
		
		JLabel lblperiodo = new JLabel("Período");
		lblperiodo.setForeground(Color.WHITE);
		lblperiodo.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		lblperiodo.setBounds(308, 5, 135, 15);
		panel.add(lblperiodo);
		
		dataescolhaper02 = new JDateChooser();
		dataescolhaper02.setBounds(308, 84, 130, 28);
		panel.add(dataescolhaper02);
		dataescolhaper02.setDate(calendarioper02.getTime());
		dataescolhaper02.setDateFormatString("dd-MM-yyyy");
		
		lblDe = new JLabel("De");
		lblDe.setForeground(Color.WHITE);
		lblDe.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		lblDe.setBounds(277, 65, 37, 15);
		panel.add(lblDe);
		
		
		//System.out.println(format.format(calendarioper01.getTime()));
		
		
		
	
	}
}
