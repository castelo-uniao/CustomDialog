/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package entradasaida;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author digita
 */
public class EntradaSaida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JOptionPane.showInputDialog(
            null, // Component
            "Lorem ipsum:\n" // Texto
            + "\"lorem...\"",
            "Caixa customizada", // Título
            JOptionPane.WARNING_MESSAGE, // Tipo
            null, // Ícone
            null, // Opções
            "ipsum" // Valor padrão
        ); 
        
        JOptionPane.showMessageDialog(null, 
            "Customizado", // Texto
            "Título customizado", // Título
            JOptionPane.INFORMATION_MESSAGE // Tipo
        );
    }
    
}
