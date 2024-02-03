/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trmateum.cs4project;

/**
 *
 * @author Kane
 */
public class TrMateumCS4Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // i plan for main method to include a Scanner system, but was rushed into this more simplified version
        User lazy = new User("Martin");
        Task csprop = new Task("CS Proposal", "PASS ASAP", 4, 5);
        Pet blue = new Pet("Blue :3");
        
        csprop.accomplish(false);
    }
    
}
