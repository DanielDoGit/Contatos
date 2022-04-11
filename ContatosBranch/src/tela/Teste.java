package tela;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.cidade.DaoCidade;

public class Teste {

	public static void main(String[] args) throws MalformedURLException {
		
	
		
		try {
	
			
			Process processo = Runtime.getRuntime().exec("java -jar /home/limalinux/arquivos/h2-2022-01-17/h2/bin/h2-2.1.210.jar");
			URL link = new URL("http://127.0.1.1:8082/login.do?jsessionid=74bbee6a51a298ef0ce9352ad524477d");
			BufferedReader leituraDoSite = new BufferedReader(new InputStreamReader(link.openStream()));
			ArrayList<String> lista = new ArrayList<String>();
			
			String aux = null;
			while ((aux = leituraDoSite.readLine()) != null) {
				lista.add(aux);
			}
			
			for(String a : lista) {
				System.out.println(a);
			}
			
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	
	
}
