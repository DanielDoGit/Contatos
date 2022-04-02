package ColetaDados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.commons.codec.binary.Base64OutputStream;

public class EntradaDeDadosForBase64 {

	private String diretorioEntrada, diretorioSaida;
	
	public String getDiretorioSaida() {
		return diretorioSaida;
	}

	public void setDiretorioSaida(String diretorioSaida) {
		this.diretorioSaida = diretorioSaida;
	}

	public String getDiretorioEntrada() {
		return diretorioEntrada;
	}

	public void setDiretorioEntrada(String diretorioEntrada) {
		this.diretorioEntrada = diretorioEntrada;
	}

	public EntradaDeDadosForBase64() throws Exception{
		
		FileInputStream entradaDeDados = new FileInputStream(this.diretorioEntrada);
		OutputStream base64OutputStream =  new Base64OutputStream(new FileOutputStream(this.diretorioSaida));
		entradaDeDados.transferTo(base64OutputStream);
		
	}
	
}
