package Tratamento;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import Principal.LerCabecalho;


public class IsolaItensCabecalho extends LerCabecalho {
	
	String separaLinha;
	String primeiralinha;
	String separaPor;
	String header;
	ArrayList<String> listaHeaders = new ArrayList<String>();
	
	
	public IsolaItensCabecalho () {
		
	}
	public IsolaItensCabecalho (BufferedReader b) {
		super(b);
	}
	

	public String getSeparaLinha() {
		return separaLinha;
	}


	public void setSeparaLinha(String separaLinha) {
		this.separaLinha = separaLinha;
	}

	
	public String getPrimeiralinha() {
		return primeiralinha;
	}


	public void setPrimeiralinha(String primeiralinha) {
		this.primeiralinha = primeiralinha;
	}

	
	public String getSeparaPor() {
		return separaPor;
	}

	public void setSeparaPor(String separaPor) {
		this.separaPor = separaPor;
	}


	public ArrayList<String> getListaHeaders() {
		return listaHeaders;
	}


	public void setListaHeaders(ArrayList<String> listaHeaders) {
		this.listaHeaders = listaHeaders;
	}


	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	@Override
	public String toString() {
		
		
		try {
			header = br.readLine();
			if (header != null) {
	            //String[] colunas = header.split(",");
				listaHeaders.add(primeiralinha);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	
		return super.toString() + listaHeaders;
	}
	
	

}

