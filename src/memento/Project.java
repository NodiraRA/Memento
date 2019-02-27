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
public class Project {
    private String version;
    private Date date;
    
    public void setVersionAndDate(String version){
        this.version = version;
        this.date = new Date();
    }

    
    public Save save(){
        return new Save(version);
    }

    
    public void load(Save save){
        version = save.getVersion();
        date = save.getDate();
    }
    
    @Override
    public String toString() {
        return "Project\n" + "\nVersion: " + version + ", \nDate=" + date + "\n";
    }
    
    
}




