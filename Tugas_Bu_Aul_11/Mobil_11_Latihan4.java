package Tugas_Bu_Aul_11;

public class Mobil_11_Latihan4 {
        private int penumpang,maxpenumpang;
        
        // konstruktor
        public Mobil_11_Latihan4(int maxpenumpang){
            this.maxpenumpang=maxpenumpang;
            penumpang = 0;
        }
        
        //method mutator 
        public void pluspenumpang(int penumpang){
            int temp;
            temp=this.penumpang+penumpang;
            if (temp>=maxpenumpang){
                System.out.println("Overload penumpang");
            }
            else {
                this.penumpang=temp;
            }  
        }
public void getPassword(int password){
    if (password==90){
        System.out.println("Password benar");
    }
    else{
        System.out.println("Password salah");
    }
}
public void cetak(){
    System.out.println("Penumpang sekarang = "+ penumpang);
    System.out.println("Penumpang seharusnya adalah ="+ maxpenumpang);
        }
    }

