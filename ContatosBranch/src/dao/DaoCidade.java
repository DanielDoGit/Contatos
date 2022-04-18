package dao;

import java.io.PrintStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import camadaNegocio.Cidade;
import protecao.GeradorLogs;


public class DaoCidade{

	private Connection con;
	private PreparedStatement std;
	private String url, usuario, senha, nomeDoBanco;
	private ArrayList<Cidade> listaCidades;
	private ResultSet resultado;
	
	public void setConnection(Connection con) {
		this.con = con;
	}
	
	public void ExecutaTransacaoInsert(Cidade cidade) throws Exception{
		
		String expressao = "insert into cidade values ((select idcontador from contadorcidade),?,?);"
						  +"update contadorcidade set idcontador = idcontador + 1";
		std = con.prepareStatement(expressao);
		std.setString(1, cidade.getNomeCidade());
		std.setString(2, cidade.getUfCidade());
		std.executeUpdate();

	}
	
	public void ExecutaTransacaoUpdatePorCidadeUF(Cidade cidadeNova, Cidade cidadeVelha) throws SQLException{
		
		String expressao = "update cidade set nomecidade=?, ufcidade=? where (nomecidade = ? and ufcidade = ?);";
		std = con.prepareStatement(expressao);
		std.setString(1, cidadeNova.getNomeCidade());
		std.setString(2, cidadeNova.getUfCidade());
		std.setString(3, cidadeVelha.getNomeCidade());
		std.setString(4, cidadeVelha.getUfCidade());
		std.executeUpdate();

	}
	
public void ExecutaTransacaoUpdatePoridCidade(Cidade cidadeNova, Cidade cidadeVelha) throws SQLException{
		
		String expressao = "update cidade set nomecidade=?, ufcidade=? where (idcidade = ?);";
		std = con.prepareStatement(expressao);
		std.setString(1, cidadeNova.getNomeCidade());
		std.setString(2, cidadeNova.getUfCidade());
		std.setInt(3, cidadeVelha.getIdCidade());
		std.executeUpdate();

	}
	
	public void ExecutaTransacaoDeletePorCidade(Cidade cidade) throws Exception{
		
		String expressao = "delete cidade where (nomecidade = ?)";
		std = con.prepareStatement(expressao);
		std.setString(1, cidade.getNomeCidade());
		std.executeUpdate();

	}
	public void ExecutaTransacaoDeletePorID(Cidade cidade) throws Exception{
		
		String expressao = "delete cidade where (idcidade = ?)";
		std = con.prepareStatement(expressao);
		std.setInt(1, cidade.getIdCidade());
		std.executeUpdate();

	}
	
	public ArrayList<Cidade> ExecutaConsultaForUpdate (Cidade cidade) throws SQLException{
		this.listaCidades = new ArrayList<Cidade>();
		String expressao = "select * from cidade where (idcidade = ? or nomecidade = ? or ufcidade = ?);";
		std = con.prepareStatement(expressao);
		std.setInt(1, cidade.getIdCidade());
		std.setString(2, cidade.getNomeCidade());
		std.setString(2, cidade.getUfCidade());
		resultado = std.executeQuery();
		
		while (resultado.next()) {
			cidade = new Cidade();
			cidade.setIdCidade(resultado.getInt("idcidade"));
			cidade.setNomeCidade(resultado.getString("nomecidadade"));
			cidade.setUfCidade(resultado.getString("ufcidade"));
			this.listaCidades.add(cidade);
		}
		
		return this.listaCidades;
		
	}
	
	public ArrayList<Cidade> ExecutaConsultaTodos (Cidade cidade) throws SQLException{
		this.listaCidades = new ArrayList<Cidade>();
		String expressao = "select * from cidade order by nomecidade;";
		std = con.prepareStatement(expressao);
		resultado = std.executeQuery();
		
		while (resultado.next()) {
			cidade = new Cidade();
			cidade.setIdCidade(resultado.getInt("idcidade"));
			cidade.setNomeCidade(resultado.getString("nomecidade"));
			cidade.setUfCidade(resultado.getString("ufcidade"));
			this.listaCidades.add(cidade);
		}
		
		return this.listaCidades;
		
	}
	

}
	
	


