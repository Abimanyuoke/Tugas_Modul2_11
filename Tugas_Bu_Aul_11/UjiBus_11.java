package Tugas_Bu_Aul_11;

public class UjiBus_11 {
    public static void main(String[] args) {
        // TODO code application logic here
        Bus_11 busMini=new Bus_11();
        busMini.penumpang=5;
        busMini.maxpenumpang=5;
        busMini.cetak();
        
        busMini.penumpang=busMini.penumpang+5;
        busMini.cetak();
        
        busMini.penumpang=busMini.penumpang-2;
        busMini.cetak();
        
        
        busMini.penumpang=busMini.penumpang+8;
        busMini.cetak();
        


    }
}
