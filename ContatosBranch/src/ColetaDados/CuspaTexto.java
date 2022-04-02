package ColetaDados;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class CuspaTexto {
	
	public int imprimeDados (ArrayList<Dados> lista, String diretorio, String[] aux) throws IOException {
		
		
		FileOutputStream arquivo = new FileOutputStream(diretorio);
		PrintStream printStreamArquivo = new PrintStream(arquivo);
		printStreamArquivo.println("Relatorio de clientes a sofrerem alterações");
		printStreamArquivo.println("OBS - Os clientes que possuirem N/A em sua declaração, não possuem registros");
		printStreamArquivo.println("Este relatório é da semana: "+aux[0]+" ao "+aux[1]);
		printStreamArquivo.println();
		Dados.setId(1);
		for(Dados x: lista) {
			printStreamArquivo.println(x.toString());
		}	
		
		return 1;
	}
	
	
	
}
