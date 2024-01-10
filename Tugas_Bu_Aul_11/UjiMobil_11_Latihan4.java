package Tugas_Bu_Aul_11;

public class UjiMobil_11_Latihan4 {
    public static void main(String[] args) {
        Mobil_11_Latihan4 busMini= new Mobil_11_Latihan4(10);
        busMini.getPassword(90);
        busMini.getPassword(40);
        busMini.cetak();

        busMini.pluspenumpang(3);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.cetak();
    }
}
