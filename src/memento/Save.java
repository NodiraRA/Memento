/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.Date;

/**
 *
 * @author nodira
 */
public class Save {
    private final String version;
    private final Date date;

    public Save(String version) {
        this.version = version;
        this.date = new Date();
    }
    

    

    

    

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
    
    
   
    
    
}
