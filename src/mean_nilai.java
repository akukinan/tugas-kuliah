import java.util.Scanner;

public class mean_nilai {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Deklarasi variabel
        int nilaiMtk, nilaiAlg, bobotMtk, bobotAlg, SKS, totalNilai;
        double meanNilai;
        bobotMtk = 2;
        bobotAlg = 3;

        //Input User
        System.out.println("Nilai Matematika = ");
        nilaiMtk = scan.nextInt();

        System.out.println("Nilai Algoritma = ");
        nilaiAlg = scan.nextInt();

        //HITUNG RATA-RATA
        totalNilai = bobotMtk * nilaiMtk + bobotAlg * nilaiAlg;
        SKS = bobotMtk + bobotAlg;
        meanNilai = totalNilai / SKS;
        System.out.println("Rata-rata nilai anda adalah = " + meanNilai);

    }
}
//tugas milik Kinantan