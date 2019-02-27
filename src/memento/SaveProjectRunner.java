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
public class SaveProjectRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo github = new GithubRepo();
        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");
        
        System.out.println(project);
        
        System.out.println("Saving current version to github...");
        github.setSave(project.save());
        
        System.out.println("Updating project version to 1.1");
        System.out.println("Writing poor code...");
        
        Thread.sleep(5000);
        
        project.setVersionAndDate("Version 1.1");
        
        System.out.println(project);
        
        System.out.println("Something went wrong...");
        
        System.out.println("Rolling back to version 1.0");
        project.load(github.getSave());
        
        System.out.println("Project after rollback...");
        System.out.println(project);
        
    }
    
}
