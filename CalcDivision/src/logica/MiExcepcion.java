package logica;

public class MiExcepcion extends Exception{
	private  String message;
	
	MiExcepcion(String message){
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
	
	
}
