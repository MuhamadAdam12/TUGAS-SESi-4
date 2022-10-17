/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorfisme;

/**
 *
 * @author ACER
 */
public class Jenis extends Hewan {
    public String Jenis_Hewan;

    public Jenis(String Jenis_Hewan, String nama_hewan) {
        super(nama_hewan);
        this.Jenis_Hewan = Jenis_Hewan;
    }

    @Override
    public void PanggilHewan() {
        System.out.println("Nama Hewan: " + super.nama_hewan);
        System.out.println("Jenis Hewan: " + Jenis_Hewan);
    }

    
    
    }

    
    
    
    

