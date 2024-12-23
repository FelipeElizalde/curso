/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans.action;

import org.apache.logging.log4j.*;

/**
 *
 * @author JESUS
 */
public class SaludarAction {
    
    Logger log = LogManager.getLogger(SaludarAction.class);
    
    private String saludosAtr;
    
    public String execute(){
        log.info("Ejecutando método excecute desde struts2");
        //this.saludosAtr = "Saludos desde Struts2"; Cualquiera de las dos formas funciona
        this.setSaludosAtr("Saludos desde Struts2 con convenciones");
        return "éxito";
    }

    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }
    
    
    
}
