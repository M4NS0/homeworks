package Principal;

import java.io.BufferedReader;
import java.io.IOException;



public class LerCabecalho {

	protected BufferedReader br;

	public LerCabecalho() {

	}

	public LerCabecalho(BufferedReader b) {
		br = b;
	}

	public BufferedReader getBr() {
		return br;
	}

	public void setBr(BufferedReader br) {
		this.br = br;
	}

	@Override
	public String toString() {
		
		try {
			
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	
	
	}

}
