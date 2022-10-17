/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorfisme;

/**
 *
 * @author ACER
 */
public class Polymorfisme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Hewan hewan;
         Tempat tempat = new Tempat("Darat dan Air" , "Katak");
         Jenis jenis = new Jenis("Amfibi", "Katak");
         
         hewan = tempat;
         System.out.println("");
         hewan.PanggilHewan();
         
         System.out.println("");
         hewan = jenis;
         hewan.PanggilHewan();
         
    }
    
}
