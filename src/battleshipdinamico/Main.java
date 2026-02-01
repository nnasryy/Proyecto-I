/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package battleshipdinamico;

import javax.swing.SwingUtilities;
import ui.mainMenu;

/**
 *
 * @author nasry
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SwingUtilities.invokeLater(() ->{
    mainMenu menu = new mainMenu();
    menu.setLocationRelativeTo(null);
    menu.setVisible(true);
    });
        
        
    }
    
}
