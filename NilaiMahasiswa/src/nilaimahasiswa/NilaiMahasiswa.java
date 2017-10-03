package nilaimahasiswa;

/**
 *
 * @author HLDN
 * Nama     : Selly Huldan
 * Kelas    : PBO-11
 * NIm      : 10116487
 */
public class NilaiMahasiswa {

    private double quiz, uts, uas, na;
    private String nama, nim;

    void getIndexKeseluruhanNilai(double na) {
        if (na >= 80) {
            System.out.println("index = A");
            System.out.println("keterangan = sangat baik");
        } else if (na >= 68) {
            System.out.println("index = B");
            System.out.println("keterangan = baik");
        } else if (na >= 56) {
            System.out.println("index = C");
            System.out.println("keterangan = cukup");
        } else if (na >= 45) {
            System.out.println("index = D ");
            System.out.println("keterangan = kurang");
        } else if (na >= 0) {
            System.out.println("index = E");
            System.out.println("keterangan = sangat kurang");
        }

    }

    double getNilaiTerakhir() {
        return na = (0.2 * quiz) + (0.3 * uts) + (0.5 * uas);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiMahasiswa mah = new NilaiMahasiswa();
        mah.nama = "Huldan";
        mah.nim = "1.0.1.1.6.4.8";

        for (int i = 1; i <= 4; i++) {
            System.out.println("nama ke" + i + "\t" + mah.nama);
        }

        for (int j = 8; j >= 1; j--) {
            System.out.println("nim ke" + j + "\t" + mah.nim + "." + j);
        }
        mah.quiz = 80;
        mah.uts = 70;
        mah.uas = 90;
        double nilai = mah.getNilaiTerakhir();
        System.out.println("hasil \t" + nilai);

        mah.getIndexKeseluruhanNilai(nilai);

    }

}