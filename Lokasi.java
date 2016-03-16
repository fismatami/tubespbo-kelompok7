/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok7;
import kelompok7.Pembimbing;

/**
 *
 * @author udev
 */
import java.util.Scanner;
import java.lang.Math;

public class Lokasi 
{
	private Kelompok[] k=new Kelompok[10];
        private int jumlahKelompok=0;
	
	
	public void createKelompok(int noKelp, String jurusan)
	{
            if(jumlahKelompok<10){
                k[jumlahKelompok]=new Kelompok(noKelp, jurusan);
                jumlahKelompok++;
            }
        }
        
        public Kelompok getKelompok(int i){
            return k[i];
        }
        
        public void displayInfo() {
		System.out.println("DATA KELOMPOK");
                System.out.println();
                for(int i=1; i<10; i++){
                    System.out.println("Kelompok "+"\n[["+getKelompok(i)+"]");
                    System.out.println("Pembimbing\t:"+k[i].getPembimbing().getNama());
                    for(int j=0; j<10; j++){
                        System.out.println("\tAnggota "+(j+1));
                        System.out.println("\t");
                    }
                }
                
	}
        
        
}
