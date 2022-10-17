/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorfisme;

/**
 *
 * @author ACER
 */
public class Tempat extends Hewan{
    public String Tempat_Hidup;

    public Tempat(String Tempat_Hidup, String nama_hewan) {
        super(nama_hewan);
        this.Tempat_Hidup = Tempat_Hidup;
    }

    @Override
    public void PanggilHewan() {
        System.out.println("Nama Hewan: " + super.nama_hewan);
        System.out.println("Tempat Hidup: " + Tempat_Hidup);
    }

    
    }