package com.choucair.proyectoPOMLEAN.toolbox;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;

public class Propiedades {

	String strNombreProperties ="";

	/** Inicializz el objeto con el nombre o url del properties que se desea usar
	 * 
	 * @param strNombreProperties ombre y url del archivo properties ejemplo serenity.properties
	 */
	public Propiedades(String strNombreProperties) {
		this.strNombreProperties = strNombreProperties;
	}

	/**Obtiene el valor de una propiedad
	 * 
	 * @param strKey Key o mombre de la propiedad que se desea extraer
	 * @return
	 * @throws IOException
	 */
	public String obtenerPropiedad(String strKey) throws IOException {
		String valorPropiedad;
		Properties propiedades = new Properties();
		FileInputStream archivo = new FileInputStream(new File(strNombreProperties));
		propiedades.load(new InputStreamReader(archivo, Charset.forName("UTF-8")));
		valorPropiedad= propiedades.getProperty(strKey);
		archivo.close();
		return valorPropiedad;
	}

	/** Modifica el valor de una propiedad
	 * 
	 * @param strKey Key o mombre de la propiedad que se desea modificar
	 * @param strValue
	 * @throws IOException
	 */
	public void modificarPropiedad(String strKey, String strValue) throws IOException {
		Properties propiedades = new Properties();
		FileInputStream archivo = new FileInputStream(new File(strNombreProperties));
		propiedades.load(new InputStreamReader(archivo, Charset.forName("UTF-8")));
		propiedades.setProperty(strKey, strValue);
		archivo.close();
	}
	
	/** Obtiene el valor y Modifica este mismo de una propiedad
	 * 
	 * @param strKey Key o mombre de la propiedad que se desea modificar
	 * @param strValue
	 * @throws IOException
	 */
	public String obtenerModificarPropiedad(String strKey, String strValue) throws IOException {
		Properties propiedades = new Properties();
		FileInputStream archivo = new FileInputStream(new File(strNombreProperties));
		propiedades.load(new InputStreamReader(archivo, Charset.forName("UTF-8")));
		String timeout = propiedades.getProperty(strKey);
		propiedades.replace(strKey, strValue);
		archivo.close();
		return timeout;
	}

}
