package tela;

import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JSpinnerDateEditor;

import camadaNegocio.CuidaDoArray;
import camadaNegocio.Dados;
import relatorios.CriaArquivo;
import relatorios.ImprimirTexto;


public class RunDeprecied {

	private static String version = "1.5.15";
	private static String ab[] = new String[2];
	
	public static String[] getAb() {
		return ab;
	}

	public static void setAb(String[] ab) {
		RunDeprecied.ab = ab;
	}

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
//		
//		try {
//			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//				if ("Nimbus".equals(info.getName())) {
//					UIManager.setLookAndFeel(info.getClassName());
//					break;
//				}
//				
//			} 
//		} catch (Exception e) {
//			// TODO: handle exception
//			
//			JOptionPane.showMessageDialog(null, e, "Erro",0);
//		}
//		
		
		/*	String idString = JOptionPane.showInputDialog("Digite a quantidade de clientes");
		int id = Integer.parseInt(idString);
	*/	
		
		//Date data = new Date();
		Calendar calendarioBrasil = Calendar.getInstance();
		Calendar calendarioBrasil2 = Calendar.getInstance();
		SimpleDateFormat formatoDeData = new SimpleDateFormat("dd-MM-yyyy");
		//impede alteração no formato de data
		formatoDeData.setLenient(false);
		//data = formatoDeData.parse("27-10-2002");
		
		ab[0] = formatoDeData.format(calendarioBrasil.getTime());
		//permite a manipulação de uma informação coletada
		calendarioBrasil2.add(Calendar.DAY_OF_MONTH, 7);
		
		ab[1] = formatoDeData.format(calendarioBrasil2.getTime());
		//System.out.println(ab[1]);
		//data = formatoDeData.parse("25-10-2002");
		//ab[1] = formatoDeData.format(data);
		//System.out.println(ab[1]);
		
		ImprimirTexto c1 = new ImprimirTexto();
		CuidaDoArray cuidaDoArray = new CuidaDoArray();		
		Color colorBlack = new Color(119,119,119);
		Color colorWhite = new Color(255,255,255);
		
		Font b = new Font(null, Font.BOLD, 14);
		//Font b = new Font(null, Font.BOLD, 16);
		
		JFrame janela = new JFrame("Contatos da semana "+version+" - Dark Mode Edition");
		janela.setIconImage(Toolkit.getDefaultToolkit().getImage("./ContatosBranch/icones/telefone.png"));
		
		JPanel painel = new JPanel();
		painel.setBackground(colorBlack);
		painel.setLayout(null);

		JLabel codigo = new JLabel("Código: ");
		codigo.setBounds(250 , 10, 60, 20);
		codigo.setForeground(colorWhite);
		painel.add(codigo);
		JTextField codigoOrientador = new JTextField(5);
		codigoOrientador.setBounds(320 , 10, 30, 20);
		codigoOrientador.setFont(b);
		codigoOrientador.setText("1");
		//codigoOrientador.setBackground(Color.YELLOW);
		codigoOrientador.setHorizontalAlignment(codigoOrientador.CENTER);
		codigoOrientador.setEnabled(false);
		painel.add(codigoOrientador);
		
		// campo Texto: Nome da empresa
		JLabel textoNomeDaEmpresa = new JLabel("Nome da Empresa: ");
		textoNomeDaEmpresa.setBounds(25, 50, 150, 20);
		textoNomeDaEmpresa.setForeground(colorWhite);
		painel.add(textoNomeDaEmpresa);
		JTextField informacaoDoNome = new JTextField(30);
		// setToolTipText é uma mensagem de texto que aparece ao pairar o mouse sobre o componente, pode ser aplicado em qualquer componente
		informacaoDoNome.setToolTipText("Digite o Nome da empresa neste campo");
		informacaoDoNome.setBackground(Color.YELLOW);
		informacaoDoNome.setBounds(169, 50, 405, 20);
		painel.add(informacaoDoNome);
		
		// campo Texto: Contatos novos
		JLabel textoContatosNovos = new JLabel("Contatos novos:");
		textoContatosNovos.setBounds(25, 90, 120, 20);
		textoContatosNovos.setForeground(colorWhite);
		textoContatosNovos.setBackground(colorBlack);
		painel.add(textoContatosNovos);
		JTextField informacaoDoContato = new JTextField(30);
		informacaoDoContato.setBounds(153, 90, 420, 20);
		informacaoDoContato.setToolTipText("Digite os contatos novos neste campo");
		painel.add(informacaoDoContato);
		JCheckBox ticaContatoNovo = new JCheckBox("N/A", true);
		ticaContatoNovo.setBounds(590, 90, 60, 20);
		ticaContatoNovo.setBackground(colorBlack);
		ticaContatoNovo.setForeground(colorWhite);
		ticaContatoNovo.setToolTipText("Assinale a caixa para informar que não há contatos novos");
		painel.add(ticaContatoNovo);

		// campo Texto: Contatos novos
		JLabel textoContatosInativos = new JLabel("Contatos Inativos:");
		textoContatosInativos.setBounds(25, 130, 185, 20);
		textoContatosInativos.setForeground(colorWhite);
		painel.add(textoContatosInativos);
		JTextField informacaoDoContatoAntigo = new JTextField(30);
		informacaoDoContatoAntigo.setBounds(190, 130, 385, 20);
		//informacaoDoContatoAntigo.setBackground(colorBlack);
		informacaoDoContatoAntigo.setToolTipText("Digite os contatos desligados ou antigos neste campo");
		painel.add(informacaoDoContatoAntigo);
		JCheckBox ticaContatoDesligado = new JCheckBox("N/A", true);
		ticaContatoDesligado.setBounds(590, 130, 60, 20);
		ticaContatoDesligado.setBackground(colorBlack);
		ticaContatoDesligado.setForeground(colorWhite);
		ticaContatoDesligado.setToolTipText("Assinale a caixa para informar que n�o h� contatos inativos");
		painel.add(ticaContatoDesligado);
		
		// Campo texto Endere�o
		JLabel textoEndereco = new JLabel("Endereço: ");
		textoEndereco.setBounds(25, 170, 100, 20);
		textoEndereco.setForeground(colorWhite);
		painel.add(textoEndereco);
		JTextField informacaoDoEndereco = new JTextField(30);
		informacaoDoEndereco.setBounds(110, 170, 465, 20);
		informacaoDoEndereco.setToolTipText("Digite o endereço da empresa ou cliente neste campo");
		painel.add(informacaoDoEndereco);
		
		// Campo texto n�mero do Endere�o
		JLabel textoNumeroEndereco = new JLabel("Nº: ");
		textoNumeroEndereco.setBounds(25, 210, 90, 20);
		textoNumeroEndereco.setForeground(colorWhite);
		painel.add(textoNumeroEndereco);
		JTextField informacaoDoNumeroEndereco = new JTextField(30);
		informacaoDoNumeroEndereco.setBounds(90, 210, 50, 20);
		informacaoDoNumeroEndereco.setBackground(colorWhite);
		informacaoDoNumeroEndereco.setToolTipText("Digite o(s) número(s) do endereço neste campo");
		painel.add(informacaoDoNumeroEndereco);
		
		//Campo texto cidade
		JLabel textoCidade = new JLabel("Cidade:");
		textoCidade.setBounds(25, 250, 120, 20);
		textoCidade.setForeground(colorWhite);
		painel.add(textoCidade);
		JTextField informacaoCidade = new JTextField(30);
		informacaoCidade.setBounds(90, 250, 485, 20);
		informacaoCidade.setToolTipText("Digite o nome da cidade neste campo");
		painel.add(informacaoCidade);
		
		
		// Campo Checagem endere�o
		JCheckBox ticaEnderecoCidadenumeroCidade = new JCheckBox("N/A", true);
		ticaEnderecoCidadenumeroCidade.setBounds(590, 170, 60, 20);
		ticaEnderecoCidadenumeroCidade.setBackground(colorBlack);
		ticaEnderecoCidadenumeroCidade.setForeground(colorWhite);
		ticaEnderecoCidadenumeroCidade.setToolTipText("Assinale a caixa para informar que não há cidades e endereços novos");
		painel.add(ticaEnderecoCidadenumeroCidade);
		
		//Campo de formatação de data
		
		
		JLabel campodaData = new JLabel();
		campodaData.setText("Selecione o período:");
		campodaData.setToolTipText("Este campo pede a data para realizar os contatos da semana");
		campodaData.setBounds(25, 290, 160, 20);
		campodaData.setForeground(colorWhite);
		painel.add(campodaData);
		
		JLabel campodaDataDE = new JLabel();
		campodaDataDE.setText("A");
		campodaDataDE.setToolTipText("Este campo pede a data para realizar os contatos da semana");
		campodaDataDE.setBounds(310, 290, 15, 20);
		campodaDataDE.setForeground(colorWhite);
		painel.add(campodaDataDE);
		
		JDateChooser dataEscolha = new JDateChooser();
		dataEscolha.setDate(formatoDeData.parse(ab[0]));
		//dataEscolha.setToolTipText("Este campo pede a data para realizar os contatos da semana");
		dataEscolha.setDateFormatString("dd-MM-yyyy");
		dataEscolha.setBounds(180, 290, 100, 20);
		//dataEscolha.setCalendar(null);
		painel.add(dataEscolha);
		
		JDateChooser dataEscolha2 = new JDateChooser();
		dataEscolha2.setDate(formatoDeData.parse(ab[1]));
		dataEscolha2.setDateFormatString("dd-MM-yyyy");
		//dataEscolha2.setToolTipText("Este campo pede a data para realizar os contatos da semana");
		dataEscolha2.setBounds(350, 290, 100, 20);
		//dataEscolha.setCalendar(null);
		painel.add(dataEscolha2);
		
		
		
		// Botão
		JButton botaoInserir = new JButton("Inserir");
		botaoInserir.setBounds(290, 350, 100, 30);
		botaoInserir.setToolTipText("Aperte o botão inserir para incluir registro novo de contato");
		// Define tecla que aciona o evento do botão no caso é preciso pressionar Alt + S 
		botaoInserir.setMnemonic('S');
		painel.add(botaoInserir);
		JButton botaoImprimir = new JButton("Fazer o Relatório");
		botaoImprimir.setBounds(410, 350, 170, 30);
		botaoImprimir.setToolTipText("Aperte o botão impressão para imprimir o Relatório");
		painel.add(botaoImprimir);
		
		//janela.setBackground(color);
		janela.setSize(650,450);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setContentPane(painel);
		//Deixa a janela centralizada no meio da tela quando o programa é iniciado
		janela.setLocationRelativeTo(null);
		
		
		botaoInserir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			try {
				
				if (!informacaoDoNome.getText().isEmpty() && informacaoDoNome.getText().length() < 50 ) {
					if ((!informacaoDoContato.getText().isEmpty() && !ticaContatoNovo.isSelected()) || (informacaoDoContato.getText().isEmpty() && ticaContatoNovo.isSelected())) {
						if ((!informacaoDoContatoAntigo.getText().isEmpty() && !ticaContatoDesligado.isSelected()) || (informacaoDoContatoAntigo.getText().isEmpty() && ticaContatoDesligado.isSelected())) {
							if (((!informacaoDoEndereco.getText().isEmpty() || !informacaoDoNumeroEndereco.getText().isEmpty() || !informacaoCidade.getText().isEmpty()) && !ticaEnderecoCidadenumeroCidade.isSelected()) || 
								((informacaoDoEndereco.getText().isEmpty() || informacaoDoNumeroEndereco.getText().isEmpty() || informacaoCidade.getText().isEmpty()) && ticaEnderecoCidadenumeroCidade.isSelected())) {
									
								
									cuidaDoArray.setArray(new Dados
											(informacaoDoNome.getText(),
											informacaoDoContato.getText(),
											informacaoDoContatoAntigo.getText(), 
											ticaContatoNovo.isSelected(), 
											ticaContatoDesligado.isSelected(),
											informacaoDoEndereco.getText(),
											informacaoDoNumeroEndereco.getText(),
											ticaEnderecoCidadenumeroCidade.isSelected(),
											informacaoCidade.getText()
											));	
									
									dataEscolha.setEnabled(false);
									dataEscolha2.setEnabled(false);
									
									JOptionPane.showMessageDialog(null, "Registro inserido !", "Mensagem",1);
									String a = Integer.toString(cuidaDoArray.retornaLista().size()+1);
									codigoOrientador.setText(a);
									
									informacaoDoNome.setText("");
									informacaoDoContato.setText("");
									informacaoDoContatoAntigo.setText("");
									informacaoDoEndereco.setText("");
									informacaoDoNumeroEndereco.setText("");
									informacaoCidade.setText("");
							
							}else {
								String aaa = "Verifique se os campos Cidade, Número cidade e Endereço foram preenchidos corretamente.";
								JOptionPane.showMessageDialog(null, aaa , "Mensagem",2);
							}
	
						}else {
							String aaa = "O campo contatos antigos não foi preenchido ou foi preenchido e está com a opção N/A marcada.";
							JOptionPane.showMessageDialog(null, aaa , "Mensagem",2);
						}
						
					}else {
						String aaa = "O campo contatos novos não foi preenchido ou foi preenchido e está com a opção N/A marcada.";
						JOptionPane.showMessageDialog(null, aaa , "Mensagem",2);
					}
					
				}else {
					String aaa = "Verifique se o campo obrigatorio foi preenchido.";
					JOptionPane.showMessageDialog(null, aaa , "Mensagem",2);
				}
				
			} catch(Exception e2) {
					JOptionPane.showMessageDialog(null, e2, "Erro",0);
			}
						
			}
				
			});
				
			
		botaoImprimir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e){
							
				if (!cuidaDoArray.retornaLista().isEmpty()) {
					
					try {
						CriaArquivo criaArquivo = new CriaArquivo();
						ab[0] = formatoDeData.format(dataEscolha.getDate());
						ab[1] = formatoDeData.format(dataEscolha2.getDate());
						
						if (criaArquivo.getCaminhodiretorio() != null && 
						   (criaArquivo.getInteger() != 1 && criaArquivo.getInteger() != -1 && criaArquivo.getInteger() != 2)) {
							
							int a = c1.imprimeDados(cuidaDoArray.retornaLista(), criaArquivo.getCaminhodiretorio(), ab);
							if (a == 1) {
								//janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
								JOptionPane.showMessageDialog(null, "Impressão realizada com sucesso !");
							}else {
								JOptionPane.showMessageDialog(null, "Não foi possível realizar a impressão !");
							}
						}else {
							JOptionPane.showMessageDialog(null, "O arquivo não foi gerado");
						}
					} catch(IOException e1) {
							JOptionPane.showMessageDialog(null, e1, "Erro",0);
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Você não inseriu nenhum cliente no programa", "Mensagem",1);
				}
				
			}
		});
			
	}

	
	
	
	
	

}
