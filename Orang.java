/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok7;

/**
 *
 * @author Haniepong
 */
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
