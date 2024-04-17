package Persistencia;
import java.io.*;
import java.util.ArrayList;

public class users_persistence {
	
	
	public static ArrayList<String> read_info () {
		
		ArrayList<String> datos = new ArrayList<>();
		
		File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
 
        String linea = null;
 
        try {

            archivo = new File("users.csv");

            fr = new FileReader(archivo);
  
            br = new BufferedReader(fr);
 
            while ((linea = br.readLine()) != null) {
            	
            	String[] strings = linea.split(";");
            	
            	
            	for (int i = 0; i < strings.length; i++) {
            		datos.add(strings[i]);
				}
 
            }
            
            return datos;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
		return null; 
	}
	
	
	public static String formatter(String nombre, String apellido, String cedula, String usuario, String contrasena, String contacto, int ingresos, String rol, String UltimaActualizacion) {

	    String ingresosStr = Integer.toString(ingresos);

	    String line = nombre + "," + apellido + "," + cedula + "," + usuario + "," + contrasena + "," + contacto + "," + ingresosStr + "," + rol + "," + UltimaActualizacion + ";";

	    return line;
	}
	
    public static void add_info(String data) {
    	
    	
    	BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            File file = new File("users.csv");
            
            if (!file.exists()) {
                file.createNewFile();
            }
           
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(data);
            System.out.println("información agregada!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                   
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    	

	}
}


