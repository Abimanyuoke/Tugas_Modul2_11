package Tugas_Bu_Aul_11;

public class Pointb_11_Ujibus {
    public static void main(String[] args) {

        Pointb_11_Latihan2 busMini = new Pointb_11_Latihan2();
        busMini.penumpang = 5;
        busMini.maxpenumpang = 5;
        busMini.cetak();

        busMini.penumpang = busMini.penumpang + 5;
        busMini.cetak();

        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();

        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }

}
