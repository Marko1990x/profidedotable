package prof;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import pacOrg.TerminiOrd;

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
	
	/*
	 * public void saveTermini(String path) {
		
		ArrayList<String>lines = new ArrayList<String>();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		
		for(int i = 0; i < this.listaTermina.size(); i++) {
			
			TerminiOrd ord = this.listaTermina.get(i);
			
			int id = ord.getID();
			String ime = ord.getIme();
			String prezime = ord.getPrezime();
			int VremePocetno = ord.getVremePocetno();
			int VremeKrajnje = ord.getVremeKrajnje();
			String datum = ord.getDatum();
			
			String line = id +"/"+ ime +"/"+ prezime +"/"+ VremePocetno +"/"+ VremeKrajnje
					+"/"+ datum;
			lines.add(line);
		}
		
		try {
			Files.write(Paths.get(path), lines, Charset.defaultCharset(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronadjena.");
		}
	}
	
	/*
	 * 
	0	private int ID;
	1	private String ime;
	2	private String prezime;
	3	private int vremePocetno;
	4	private int vremeKrajnje;
	5	private LocalDate datum;
	 
	
	public void loadTermini(String path) {
		
		this.listaTermina = new ArrayList<TerminiOrd>();
		List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get(path), Charset.defaultCharset());
			for (String line: lines) {
				String[] attributes = line.split("/");
				int id = Integer.parseInt(attributes[0]);
				String ime = attributes[1];
				String prezime = attributes[2];
				int vremePocetno = Integer.parseInt(attributes[3]);
				int vremeKranje = Integer.parseInt(attributes[4]);
				String datum = attributes[5];
				
				TerminiOrd ord = new TerminiOrd(id, ime, prezime, vremePocetno,
						vremeKranje, datum);
				this.listaTermina.add(ord);
			}
			
		} catch (java.io.IOException e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		}
		
		
	}
	 * 
	 */
	
}
