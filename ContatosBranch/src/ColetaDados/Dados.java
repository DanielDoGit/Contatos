package ColetaDados;


public class Dados {

	private static int id;
	private String nomeEmpresa;
	private String contato;
	private String contatoInativo;
	private String endereco;
	private String numeroEndereco;
	private String cidade;
	
	public static int aumentaId() {
		return Dados.id++;
	}
	
	public static int getId() {
		return Dados.id;
	}


	public static void setId(int id) {
		Dados.id = id;
	}

	
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}


	public String getContato() {
		return contato;
	}


	public void setContato(String contato) {
		this.contato = contato;
	}


	public String getContatoInativo() {
		return contatoInativo;
	}


	public void setContatoInativo(String contatoInativo) {
		this.contatoInativo = contatoInativo;
	}

	
	@Override
	  public String toString() {
	    return 
	    "ID Empresa: " + this.aumentaId() + "\n" +		
	    "Nome da empresa: " + this.nomeEmpresa + "\n"+
	    "Contatos novos: " + this.contato + "\n" +
	    "Contatos inativos: " + this.contatoInativo + "\n"+ 
	    "Cidade: " + this.cidade + "\n" + 
	    "Endereço: " + this.endereco + "\n" +
	    "Nº: "+ this.numeroEndereco + "\n\n";
	  }

	
	public Dados (String nomeEmpresa, 
				  String contato, String contatoInativo, boolean a, boolean b,
				  String endereco, String numeroEndereco, boolean testaEnderecoNumeroECidade,
				  String cidade) {
		this.id = 1;
		this.nomeEmpresa = nomeEmpresa;
		
		if(a == false) {
			this.contato = contato;
		}else {
			this.contato = "N/A";
		}
		
		if(b == false) {
			this.contatoInativo = contatoInativo;
		}else {
			this.contatoInativo = "N/A";
		}
		
		if(testaEnderecoNumeroECidade == false) {
			this.endereco = endereco;
			this.numeroEndereco = numeroEndereco;
			this.cidade = cidade;
		}else {
			this.endereco = "N/A";
			this.numeroEndereco = "N/A";
			this.cidade = "N/A";
		}
		
	}
		
}
