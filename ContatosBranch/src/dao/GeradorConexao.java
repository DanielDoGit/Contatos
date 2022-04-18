package dao;

import java.io.PrintStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import camadaNegocio.EntradaArquivoDeConfiguracao;
import protecao.GeradorLogs;

public class GeradorConexao {

	private Connection conection;
	private EntradaArquivoDeConfiguracao entrada;
	
	public Connection getConection() {
		return conection;
	}

	public void setConection(Connection conection) {
		this.conection = conection;
	}

	public EntradaArquivoDeConfiguracao getEntrada() {
		return entrada;
	}

	public void setEntrada(EntradaArquivoDeConfiguracao entrada) {
		this.entrada = entrada;
	}

	public Connection getConnection() {
		return this.conection;
	}

	public GeradorConexao(EntradaArquivoDeConfiguracao entrada) throws SQLException {
		this.entrada = entrada;
		this.conection = DriverManager.getConnection(
				this.entrada.getUrl(), 
				this.entrada.getUsuario(),
				this.entrada.getSenhaBanco());
		//System.out.println("Deu certo");
	}
		
}
