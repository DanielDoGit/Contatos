package tela;

import java.sql.SQLException;

import CamadaNegocio.Cidade;
import CamadaNegocio.EntradaArquivoDeConfiguracao;
import dao.cidade.DaoCidade;
import dao.cidade.GeradorConexao;

public class TesteBancoDeDados {

	public static void main(String[] args) {
		

		try {
			new TelaContatos();
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
