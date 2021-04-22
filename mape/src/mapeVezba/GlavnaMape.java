package mapeVezba;

import model.Osoba;

public class GlavnaMape {

	public static void main(String[] args) {
		
		
		String adresa = "Knez Mihailov 5";
		
		char poslednjiKarakter = adresa.charAt(adresa.length()-1);
		boolean daLiJeposlednjikarakter = Character.isDigit(poslednjiKarakter);
		
		if(daLiJeposlednjikarakter ){
				System.out.println("Jeste cifra");
			}else {
				System.out.println("nije cifra");
			}
	
		System.out.println("Hellouuuuu"); 
	
	
	Osoba osoba = new Osoba ();
	 osoba.setIma("Nenad");
	 osoba.setPrezime("Cvijanovic");
	 osoba.setJmbg("11111111111111");
	 
	 Osoba osoba2= new Osoba ("Danilo", "Jevtovic","3101992910005");
		
	 System.out.println(osoba2.getIma());
	 System.out.println(osoba.getPrezime());
	}
	
}
