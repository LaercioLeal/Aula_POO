/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_poo;

import java.util.Scanner;

/**
 *
 * @author Laércio Leal
 */
public class Aula_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tcld = new Scanner(System.in);
        
        System.out.println("Diga ai Mulecão");
        System.out.println("Digite uma mensagem manerona também!!");
        
        String msg = tcld.nextLine();
        
        System.out.println("\nTa aqui sua mensagem manerona: \n");
        System.out.println(msg);
        
        System.out.println("Valeu parcero! Pega visão e segue em frente!!");
    }

    private static String tecladonextline() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
