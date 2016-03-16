# tubespbo-kelompok7
Kumpulan source code tubes mata kuliah PBO
// orang.java
package kelompok7;

public abstract class Orang {
    String nama;
	private String alamat;
	
	public void setNama(String nama){
		this.nama=nama;
	}
	
	public String getNama(){
		return nama;
	}
	
	public void setAlamat(String alamat){
		this.alamat=alamat;
	}
	
	public String getAlamat(){
		return alamat;
	}
}
// mahasiswa.java

package kelompok7;

public class Mahasiswa extends Orang{
	private long nim;
	private String kelas;
	private int nilai;
	
	public Mahasiswa(String nama, long nim, String kelas, int nilai){
		this.nama=nama;
		this.nim=nim;
		this.kelas=kelas;
		this.nilai=nilai;
	}
	
	public void setNim(long nim){
		this.nim=nim;
	}
	
	public long setNim(){
		return nim;
	}
	
	public void setKelas(String kelas){
		this.kelas=kelas;
	}
	
	public String getKelas(){
		return kelas;
	}
	
	public void setNilai(int nilai){
		this.nilai=nilai;
	}
	
	public int getNilai(){
		return nilai;
	}
	
	public void displayInfo(){
		System.out.println("Nama :"+getNama());
		
	}
	
}
// kelompok.java

package kelompok7;

public class Kelompok {
	private Mahasiswa[] anggota;
	private String jurusan;
	private int noKelp;
	private int maxAnggota=5;
	private int nAnggota=0;
        private Kelompok[] k;
        private Pembimbing pembimbing;
        
        public Kelompok(int noKelp, String Jurusan){
            this.noKelp=noKelp;
        }
        
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	
	public String getJurusan() {
		return jurusan;
	}
	
	public void setNoKelp(int noKelp) {
		this.noKelp = noKelp;
	}
	
	public int getNoKelp() {
		return noKelp;
	}
        
        public void setPembimbing(int nip, String nama)
	{
		Pembimbing p=new Pembimbing(nip,nama);
                
	}

        public Pembimbing getPembimbing() {
            return pembimbing;
        }
        
	
	public void addAnggota(Mahasiswa m) {
		if (nAnggota<maxAnggota){
			this.anggota[nAnggota] = m;
			nAnggota++;
		}else{
                    System.out.println("Mahasiswa Sudah Penuh");
                }
	}
	
	public void removeAnggota(Mahasiswa m){
               for(int i=0;i<=nAnggota;i++){
                   if(anggota[i]==m){
                       nAnggota--;
                   }
               }
	}
        
        
	
	
}
// pembimbing.java

package kelompok7;

public class Pembimbing extends Orang{
    private int nip;
    private String jabatan;

    public Pembimbing(int nip, String jabatan) {
        this.nip = nip;
        this.jabatan = jabatan;
    }
    
    
    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    
}
// lokasi.java

package kelompok7;
import kelompok7.Pembimbing;
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
// kelompok7.java as a main class

package kelompok7;

public class Kelompok7 {
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

