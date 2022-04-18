package camadaNegocio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.SQLException;
import java.util.Properties;

import dao.GeradorConexao;
import protecao.GeradorLogs;

public class EntradaArquivoDeConfiguracao implements GeradorLogs{

	private String url, senhaBanco, usuario;
	private FileInputStream entradaDados;
	private Properties properties;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSenhaBanco() {
		return senhaBanco;
	}

	public void setSenhaBanco(String senhaBanco) {
		this.senhaBanco = senhaBanco;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	public EntradaArquivoDeConfiguracao() {
		try {
		entradaDados = new FileInputStream("./ArquivoConfiguracao.txt");
		properties = new Properties();
		properties.load(entradaDados);
		
		setUrl(properties.getProperty("url"));
		setUsuario(properties.getProperty("usuario"));
		setSenhaBanco(properties.getProperty("senha"));
		//System.out.println("URL:"+getUrl()+"\n usuario: "+getUsuario());
	
		}catch(FileNotFoundException e) {
			this.EjetaException(e);
		}catch (IOException e) {
			// TODO: handle exception
			this.EjetaException(e);
		}
		
	}


	@Override
	public PrintStream EjetaException(Exception e) {
		// TODO Auto-generated method stub
	
		return null;
	}
	
	
}
