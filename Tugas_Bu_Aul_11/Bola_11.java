package Tugas_Bu_Aul_11;

public class Bola_11 {
    private double jariJari;

    public Bola_11() {
    }

    public void setJarijari(double jariJari) {
        if (jariJari > 0){
            this.jariJari = jariJari;
        } else {
            System.out.println("Jari - Jari harus lebih dari 0.");
        }
    }

    public double showDiameter() {
        return 2 * jariJari;
    }

    public double showLuasPermukaan() {
        return 4 * Math.PI * Math.pow (jariJari, 2);
    }

    public double showVolume() {
        return (4/3) * Math.PI * Math.pow (jariJari, 3);
    }

    public static void main(String[] args) {
        // Membuat variable Jarijari
        double jariJariVariable = 5.0;

        // Menciptakan objek bola 
        Bola_11 bolaObjek = new Bola_11();

        // Memanggil method
        System.out.println("Diameter : " + bolaObjek.showDiameter());
        System.out.println("Luas Permuakaan : " + bolaObjek.showLuasPermukaan());
        System.out.println("Volume : " + bolaObjek.showVolume());

        // Memanipulasi objek dengan memanggil method setJarijari() 
        bolaObjek.setJarijari(jariJariVariable);

        // Menampilkan
         System.out.println("\n Setelah Manippulasi");
        System.out.println("Diameter : " + bolaObjek.showDiameter());
        System.out.println("Luas Permuakaan : " + bolaObjek.showLuasPermukaan());
        System.out.println("Volume : " + bolaObjek.showVolume());


    }
}
