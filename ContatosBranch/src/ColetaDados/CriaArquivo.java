package ColetaDados;

import java.awt.Color;
import java.io.File;
import java.math.BigInteger;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class CriaArquivo {

	private JFileChooser escolhaDiretorio;
	private String caminhodiretorio;
	private int integer;
	private int resultado;
	private SimpleDateFormat formatoDeData;
	private Calendar data;
	
	
	
	public SimpleDateFormat getFormatoDeData() {
		return formatoDeData;
	}

	public void setFormatoDeData(SimpleDateFormat formatoDeData) {
		this.formatoDeData = formatoDeData;
	}


	public int getInteger() {
		return this.integer;
	}

	public void setInteger(int integer) {
		this.integer = integer;
	}

	public JFileChooser getEscolhaDiretorio() {
		return this.escolhaDiretorio;
	}

	public void setEscolhaDiretorio(JFileChooser escolhaDiretorio) {
		this.escolhaDiretorio = escolhaDiretorio;
	}

	public String getCaminhodiretorio() {
		
		return this.caminhodiretorio;
	}

	public void setCaminhodiretorio(String caminhodiretorio) {
		this.caminhodiretorio = caminhodiretorio;
	}

	public int getResultado() {
		return this.resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	

	public CriaArquivo() {
		try {
			this.data = Calendar.getInstance();
			this.formatoDeData = new SimpleDateFormat("dd-MM-yyyy");
			this.formatoDeData.setLenient(false);
			String a = this.formatoDeData.format(data.getTime());
			this.integer = 0;
			this.escolhaDiretorio = new JFileChooser();
			//this.escolhaDiretorio.setBackground(new Color(0,0,0));
			//this.escolhaDiretorio.setName("arquivo.txt");
			File arquivo = new File("Relatório de contatos "+ a +".txt");
			this.escolhaDiretorio.setSelectedFile(arquivo);
			this.resultado = this.escolhaDiretorio.showSaveDialog(null);
			
			if (this.resultado == JFileChooser.APPROVE_OPTION) {
				// mostra o caminho onde vai ser salvo o arquivo
				this.caminhodiretorio = escolhaDiretorio.getSelectedFile().getAbsolutePath();
				//File arquivo2 = new File(escolhaDiretorio.getSelectedFile().getPath());
				//System.out.println(arquivo2.getName());
					if (escolhaDiretorio.getSelectedFile().exists()) {
						this.integer = JOptionPane.showConfirmDialog(null, "Deseja substituir esse arquivo ?");
								
						if (this.integer == 0) {
							//this.caminhodiretorio = escolhaDiretorio.getSelectedFile().getAbsolutePath();
							arquivo.delete();
							//System.out.println(aux);
							arquivo.createNewFile();
						
						//System.out.println(this.caminhodiretorio);
						}
					}
				}
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e, "Erro", 0);
		}
		
		
	}
	
	
	
}
