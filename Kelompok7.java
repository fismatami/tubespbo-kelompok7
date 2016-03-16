/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok7;

/**
 *
 * @author udev
 */
public class Kelompok7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lokasi l=new Lokasi();
        
        l.createKelompok(1,"Teknik Informatika");
        l.createKelompok(2, "MBTI");
        
        Mahasiswa m1=new Mahasiswa("Hanif", 1301144153, "IF-38-03", 4);
        Mahasiswa m2=new Mahasiswa("Melati", 1301144363, "IF-38-03", 4);
        
        //l.getKelompok(1).setPembimbing(1100, "Pak Kur");
        //l.getKelompok(2).setPembimbing(1200, "Pak Mahmud");
        
        l.getKelompok(1).addAnggota(m1);
        l.getKelompok(2).addAnggota(m2);
        
        l.displayInfo();


        
    }
    
}
