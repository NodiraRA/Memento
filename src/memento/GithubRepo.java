/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author nodira
 */
public class GithubRepo {
    private Save save;
    
    public Save getSave(){
        return save;
    }
    
    public void setSave(Save save){
        this.save = save;
    }
}
