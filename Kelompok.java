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