/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Soaint
 */

public class UtilLog {

	final static Logger logger = LoggerFactory.getLogger(UtilLog.class);

	public static void log(String mensaje) {
		
		System.out.println("EJECUTANDO LOGGER");
		
		try {
			
			System.out.println("ANTES DEL LOGGER");

			//logger.debug(mensaje);
			
			logger.debug("HELLO VIVIANA");
			
			System.out.println("DESPUES DEL LOGGER");
			
		} catch (Exception e) {
			
			System.out.println("ERROR EN LOG");
			
		}
	}
}