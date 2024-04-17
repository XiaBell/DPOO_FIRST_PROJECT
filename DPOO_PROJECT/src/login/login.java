package login;

import logic.Usuario;

import java.util.ArrayList;

import Persistencia.users_persistence;

public class login {
	

public static void createuser(String nombre, String apellido, String cedula, String usuario, String contrasena, String contacto, int ingresos, String rol, String UltimaActualizacion) {
	
	String format = users_persistence.formatter(nombre, apellido, cedula, usuario, contrasena, contacto, ingresos, rol, UltimaActualizacion);
	users_persistence.add_info(format);
}




public static boolean verifyUser (String usuario, String contrasena){

    // This function verifies the existence of the user in the persistence

    // If the user exists, it returns true
    // If the user does not exist, it returns false
	
	
	  ArrayList<String> read = new ArrayList<>(); read = users_persistence.read_info();
	
	  boolean bool = false;
	for (int i = 0; i< read.size();i++) {
		
		
		String list = read.get(i);
        String[] strings = list.split(",");
        
        if (strings[3].equals(usuario) && strings[4].equals(contrasena)){
        	
        	bool = true;
        }
        }
	return bool;
        }
	
public void verifyAccess (Usuario usuario, String role){


    if (role == "admin") {
        // If the user is an administrator, it redirects to the administrator page
        
    } else if (role == "comprador"){
        // If the user is a buyer, it redirects to the buyer page

    } else if (role == "operador"){
        // If the user is an operator, it redirects to the operator page

    }else if (role == "cajero"){
        // If the user is a cashier, it redirects to the cashier page

    } else if (role == "propietario"){
        // If the user is an owner, it redirects to the owner page

    } else {
        // If the user does not have a role, it redirects to the login page

    }

} 
    
}
    

