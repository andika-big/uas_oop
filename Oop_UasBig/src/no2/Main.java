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
public class Main {
    public static void main (String[] args) {
        bangundatar bd = new bangundatar();
        bd.HitungLuas();
        bd.HitungKeliling();
        
        System.out.println("NIM SAYA 201969040030");
        System.out.println("======================");
        System.out.println("===> LUAS DAN KELILING SEGITIGA <===");
        
        segitiga st = new segitiga ();
        st.HitungLuas();
        System.out.println("==================");
        st.HitungKeliling();
        
        System.out.println("===============");
        System.out.println("===============");
        System.out.println("===============");
        
        System.out.println("LUAS DAN KELILING PERSEGI");
        persegi kotak = new persegi ();
        kotak.HitungLuas();
        System.out.println("===================");
        kotak.HitungKeliling();
        
        System.out.println("==================");
        System.out.println("==================");
        System.out.println("==================");
        
        System.out.println("LUAS DAN KELILING LINGKARAN");
        lingkaran bundar = new lingkaran ();
        bundar.HitungLuas();
        System.out.println("================");
        bundar.HitungKeliling();        
    }
}
