/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no2;

/**
 *
 * @author User
 */
public class persegi extends segitiga {
    @Override
    public void HitungLuas(){
        double luas;
        luas = this.sisic * this.sisic;
        System.out.println("Panjang SISI :" + this.sisic + " CM ");
        System.out.println("Luas Persegi Adalah : " +luas+ " CM ");
    }
    
    @Override
    public void HitungKeliling(){
        double keliling ;
        keliling = this.sisic * 2;
        System.out.println("Panjang SISI :" + this.sisic + " CM ");
        System.out.println("luas Persegi Adalah : " +keliling+ " CM ");
    }
    
}
