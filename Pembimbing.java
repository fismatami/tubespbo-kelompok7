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
