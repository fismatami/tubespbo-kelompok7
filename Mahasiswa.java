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
