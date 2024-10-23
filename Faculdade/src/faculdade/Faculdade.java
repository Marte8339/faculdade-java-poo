/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faculdade;

/**
 *
 * @author Talvez
 */
public class Faculdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Professor prof = new Professor("Vania", 1988, "xxx.xxx.xxx-xx", 'f', true);
        
        prof.calcSal(20);
        prof.verifLeciona("Matematica");
        prof.verifLeciona("Fisica");
        prof.verifLeciona("Artes");
        prof.mostrar();
        
        System.out.println("\n--------------------------\n");
        
        Aluno alu = new Aluno("Caique", 2004, "ooo.ooo.ooo-oo", 'm', true);
        
        alu.verifAprovado(1, 10, 10, 11);
        alu.mostrar();
    }
    
}
