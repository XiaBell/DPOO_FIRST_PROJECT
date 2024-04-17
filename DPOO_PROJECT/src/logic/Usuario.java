package logic;

public abstract class Usuario {
	
	private String Username;
	private String Password;
	private String Rol;
	private String UltimaActualizacion;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String verificarRol() {
		return Rol;

	}
	
}
