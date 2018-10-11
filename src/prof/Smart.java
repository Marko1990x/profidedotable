package prof;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;



public class Smart {

	
	private ArrayList<Objekat> listaobjekata;
	
	public Smart() {
		this.listaobjekata = new ArrayList<Objekat>();
	}

	public ArrayList<Objekat> getListaobjekata() {
		return listaobjekata;
	}

	public void setListaobjekata(ArrayList<Objekat> listaobjekata) {
		this.listaobjekata = listaobjekata;
	}

	@Override
	public String toString() {
		return "Smart [listaobjekata=" + listaobjekata + "]";
	}
	
	
	
	
	public static void lstprofesora() {
		
		System.out.printf("%20s %25s, %2s, %20s \n", "Ime", "Trenutna Lokacija", "Broj", "Kako se profa oseca");		
		
		
	}
	
	
	/*
	public boolean dodavanjeTermina (TerminiOrd termin) {

		for (int i = 0; i < listaTermina.size(); i++) {
			TerminiOrd korisnikLista = this.listaTermina.get(i);
			if (korisnikLista.getID() == termin.getID()) {
				return false;
			}
		}

		this.listaTermina.add(termin);
		saveTermini("termini.txt");
		return true;

	}*/
	
	
	public boolean dodavanjeProfesora(Objekat prof) {
		
		for (int i = 0; i < this.listaobjekata.size(); i++) {
			Objekat profalista = this.listaobjekata.get(i);
			if(profalista.getName().equalsIgnoreCase(prof.getName())) {
				return false;
			}
		}
		this.listaobjekata.add(prof);
		return true;
	}
	
	
	
	
	
	public void saveProf(String path) {
		
		ArrayList<String>lines = new ArrayList<String>();
		for(int i = 0; i< this.listaobjekata.size(); i++) {
			Objekat objekat = this.listaobjekata.get(i);
			String Name = objekat.getName();
			String Location = objekat.getLokacija();
			int number = objekat.getNumberlocation();
			String profOsecaj = objekat.getProfaOsecaj();
			
			String line = Name +"/"+ Location +"/"+ number +"/"+ profOsecaj;
			lines.add(line);
			
			try {
				Files.write(Paths.get(path), lines, Charset.defaultCharset(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
			} catch (java.io.IOException e) {
				System.out.println("Datoteka " + path + " nije pronadjena.");
			}
			
		}
		
	}
	
	public void loadProf(String path) {
		this.listaobjekata = new ArrayList<Objekat>();
		List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get(path), Charset.defaultCharset());
			for (String line: lines) {
				String[] attributes = line.split("/");
				String Name = attributes[0];
				String Location = attributes[1];
				int number = Integer.parseInt(attributes[2]);
				String profOsecaj = attributes[3];
				
				Objekat objekat = new Objekat(Name, Location, number, profOsecaj);
				this.listaobjekata.add(objekat);
			
			}
			
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		}
	}
	
	
}
