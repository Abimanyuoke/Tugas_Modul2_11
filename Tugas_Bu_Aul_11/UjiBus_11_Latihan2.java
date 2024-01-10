package Tugas_Bu_Aul_11;

public class UjiBus_11_Latihan2 {
    public static void main(String[] args) {
        Bus_11_Latihan2 BusMini = new Bus_11_Latihan2(10);
        BusMini.cetak();

        BusMini.pluspenumpang(3);
        BusMini.cetak();

        BusMini.pluspenumpang(1);
        BusMini.cetak();

        BusMini.pluspenumpang(1);
        BusMini.cetak();
    }
}
