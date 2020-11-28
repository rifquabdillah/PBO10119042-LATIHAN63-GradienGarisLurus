/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan63;

/**
 *
 * @author Muhammad Rifqu Abdillah
 * NIM  : 10119042
 * Kelas:IF-1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat ko1 = new Koordinat(2,10,5,7);
        int gradien1 = ko1.hitungGradien();
        System.out.println("Garis yang melalui titik (" + ko1.getX1() + "," + ko1.getY1() + ") dan (" + ko1.getX2() + "," + ko1.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + gradien1);
        
        Koordinat ko2 = new Koordinat(5,1,3,12);
        int gradien2 = ko2.hitungGradien();
        System.out.println("Garis yang melalui titik (" + ko2.getX1() + "," + ko2.getY1() + ") dan (" + ko2.getX2() + "," + ko2.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + gradien2);
        
    }
    
}
