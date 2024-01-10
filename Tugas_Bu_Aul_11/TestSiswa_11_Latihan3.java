package Tugas_Bu_Aul_11;

public class TestSiswa_11_Latihan3 {
    public static void main(String[] args) {
        EncapSiswa_11_Latihan3 siswa = new EncapSiswa_11_Latihan3();
        siswa.setName("Agus");
        siswa.setAge(20);
        siswa.setAddress("Malang");

        System.out.println("Nama : " + siswa.getName() + "\n" + "Alamat : " + siswa.getAddress() + "\n" + "Berumur : " + siswa.getAge() + "Tahun");
    }
}
