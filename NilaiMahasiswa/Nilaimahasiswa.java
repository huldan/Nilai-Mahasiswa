/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa;

/**
 *
 * Nama     : randi putra utama
 * Kelas    : Pbo-11
 * NIm      : 10116498
 */
public class Nilaimahasiswa {

    private double quis, uts, uas, na;
    private String nama, nim;

    void getIndex(double na) {
        if (na >= 80) {
            System.out.println("index = A");
            System.out.println("keterangan = sangat baik");
        } else
            if (na >= 68) {
            System.out.println("index = B");
            System.out.println("keterangan = baik");
        } else
            if (na >= 56) {
            System.out.println("index = C");
            System.out.println("keterangan = cukup");
        } else 
            if (na >= 45) {
            System.out.println("index = D ");
            System.out.println("keterangan = kurang");
        } else 
            if (na >= 0) {
            System.out.println("index = E");
            System.out.println("keterangan = sangat kurang");
        }

    }

    double getNa() {
        return na = (0.2 * quis) + (0.3 * uts) + (0.5 * uas);
    }

     public static void main(String[] args) {
        // TODO code application logic here
        Nilaimahasiswa oNa = new Nilaimahasiswa();
        oNa.nama = "rizki adam kurniawan";
        oNa.nim = "7.51.15.036";

        for (int i = 1; i <= 4; i++) {
            System.out.println("nama ke-" + i + "\t" + oNa.nama);
        }

        for (int j = 8; j >= 1; j--) {
            System.out.println("nim ke-" + j + "\t" + oNa.nim + "." + j);
        }
        oNa.quis = 75;
        oNa.uts = 45;
        oNa.uas = 34;
        
        double nilai = oNa.getNa();
        System.out.println("hasil \t" + nilai);

        oNa.getIndex(nilai);

    }

}
