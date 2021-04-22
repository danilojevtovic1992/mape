package model;

public class Osoba {

	private String ima;
	private String prezime;
	private String jmbg;
	
	public Osoba() {
		
		
	}
	
	
	public Osoba(String ima, String prezime, String jmbg) {
		super();
		this.ima = ima;
		this.prezime = prezime;
		this.jmbg = jmbg;
	}
	public String getIma() {
		return ima;
	}
	public void setIma(String ima) {
		this.ima = ima;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	
	
	
	
}
