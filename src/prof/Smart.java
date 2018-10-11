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
	
	
	
	
	public  void lstprofesora() {
		loadProf("listaprofesora.txt");
		System.out.printf("%20s %25s, %2s, %20s \n", "Name Profesora", "Current Location", "Br.", "Fellings");		
		for (int i = 0; i <this.listaobjekata.size(); i++) {
			Objekat objekat = this.listaobjekata.get(i);
			System.out.println(objekat);
		}
		
	}
	
	
	
	
	public boolean dodavanjeProfesora(Objekat prof) {
		
		for (int i = 0; i < this.listaobjekata.size(); i++) {
			Objekat profalista = this.listaobjekata.get(i);
			if(profalista.getName().equalsIgnoreCase(prof.getName())) {
				return false;
			}
		}
		this.listaobjekata.add(prof);
		saveProf("listaprofesora.txt");
		return true;
	}
	
	
	public Objekat izmenaProfesora(Objekat objekat) {
		for (int i = 0; i < this.listaobjekata.size(); i++) {
			Objekat objekat2 = this.listaobjekata.get(i);
			String Name = objekat2.getName();
			if (Name.equalsIgnoreCase(objekat.getName())) {
				Objekat kojisemenja = this.listaobjekata.set(i, objekat);
				saveProf("listaprofesora.txt");
				return kojisemenja;
			}
		}
		return null;
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
	
	public Objekat profBrisanjeIme(Objekat idX) {

		int index = -1;
		for (int i = 0; i < this.listaobjekata.size(); i++) {
			if (this.listaobjekata.get(i).getName().equalsIgnoreCase(idX.getName())) {
				index = i;
			}
		}
		if (index != -1) {
			Objekat profesor = this.listaobjekata.remove(index);
			System.out.println("Brisanje po imenu je uspesnu uradjeno");
			saveProf("listaprofesora.txt");
			return profesor;
		}
		return null;
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
