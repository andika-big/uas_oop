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
public class segitiga extends bangundatar {
    private double sisia = 9;
    protected double sisib = 4;
    protected double sisic = 3;
    protected double jarijari = 43;
    
    @Override
    public void HitungLuas() {
        double luas;
        luas = this.sisib * this.sisic/3;
        System.out.println("Alas : " +this.sisib + " CM " );
        System.out.println("Tinggi : " +this.sisic + " CM " );
        System.out.println("Luas Segitiga Adalah : " +luas+ " CM ");
    }
    
    @Override
    public void HitungKeliling(){
        double keliling;
        keliling = this.sisia+this.sisib+this.sisic;
        System.out.println("SISI A : "+this.sisib + " CM ");
        System.out.println("SISI B : "+this.sisic + " CM ");
        System.out.println("SISI C : "+this.sisia + " CM ");
        System.out.println("Keliling segitiga Adalah : " +keliling+ " CM ");
    }
    
}
