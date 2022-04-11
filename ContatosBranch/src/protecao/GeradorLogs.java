package protecao;

import java.io.PrintStream;

public interface GeradorLogs {

	public PrintStream EjetaException(Exception e);
	
}
