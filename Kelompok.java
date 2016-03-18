package kelompok7;

public class Kelompok {
	private Mahasiswa[] anggota;
	private String jurusan;
	private int noKelp;
	private final int maxAnggota;
        private Pembimbing pembimbing;
	private int nAnggota=0;
        private Kelompok[] k;
        
        
        public Kelompok(int noKelp, String jur, Pembimbing pemb){
        this.maxAnggota = 5;
        this.anggota= new Mahasiswa[maxAnggota];
        this.noKelp=noKelp;
        this.pembimbing=pemb;
        this.jurusan=jur;
        }

        public Pembimbing getPembimbing() {
        return pembimbing;
        }

        public void setPembimbing(Pembimbing pembimbing) {
        this.pembimbing = pembimbing;
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
	
	public void addAnggota(Mahasiswa m) {
		if (nAnggota<maxAnggota){
                    this.anggota[nAnggota] = m;
                }else{
                    System.out.println("Mahasiswa Sudah Penuh");
                }
                nAnggota++;
	}
	
	public void removeAnggota(Mahasiswa m){
            boolean found = false;
               for(int i=0;i<=nAnggota;i++){
                   if(anggota[i].getNim().equals(m.getNim())){
                       found = true;
                       anggota[i]=anggota[nAnggota-1];
                       nAnggota--;
                       break;
                   }
               }
	}
        public void displayKelompok(){
            //System.out.println("Anggota:\n");
           // for(int i=0; i < maxAnggota; i++){
            System.out.println(" "+(0+1)+". "+anggota[0].getNim());
         //}
        }	
}
