
public class classeLampada {

	String status;
		

	public classeLampada(boolean s) {

		if (s) 
			status = "Acessa";
		else 
			status = "Apagada";
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}
