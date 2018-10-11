package prof;

import java.util.Scanner;


public class Test {
	
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static boolean isNumber(String string) {

		try {
			Long.parseLong(string);
			return true;
		} catch (Exception e) {
			return false;
		}

	}
	
	
	public static void unosProfa (Smart smart) {
		String Name = null;
		System.out.println("Unesite ime profesora.");
		Name = scanner.nextLine();
		String Location = null; 
		System.out.println("unesite lokaciju profesora.");
		Location = scanner.nextLine();
		String number = null;
		do {
			System.out.println("Unesite broj lokacije.");
			number = scanner.nextLine();
		} while (!isNumber(number));
		int numberx = Integer.parseInt(number);
		String OsecajProfesora = null;
		System.out.println("Unesite kako se profesor oseca.");
		OsecajProfesora = scanner.nextLine();
		
		Objekat objekat = new Objekat(Name, Location, numberx, OsecajProfesora);
		
		boolean provera = smart.dodavanjeProfesora(objekat);
		
		if (provera) {
			System.out.println("Profesor je uspesno unet u listu.");
		}else {
			System.out.println("Profesor nije uspesno unet u listu proverite podatke.");
		}
		
	}
	
	public static void izmenaProfa (Smart smart) {
		String Name = null;
		System.out.println("Unesite ime profesora.");
		Name = scanner.nextLine();
		String Location = null; 
		System.out.println("unesite lokaciju profesora.");
		Location = scanner.nextLine();
		String number = null;
		do {
			System.out.println("Unesite broj lokacije.");
			number = scanner.nextLine();
		} while (!isNumber(number));
		int numberx = Integer.parseInt(number);
		String OsecajProfesora = null;
		System.out.println("Unesite kako se profesor oseca.");
		OsecajProfesora = scanner.nextLine();
		
		Objekat objekat = new Objekat(Name, Location, numberx, OsecajProfesora);

		Objekat userClass2 = smart.izmenaProfesora(objekat);

		if (userClass2 != null) {
			System.out.println("Izmena profesora je uspesno izvrsena.");
		}else {
			System.out.println("Izmena profesora je neuspesno izvrsena.");
		}
		
	}
	
	public static void brisanjePoBroju(Smart smart) {
		String idX = null;
		System.out.println("Unesite ime profesora za brisanje");
		idX = scanner.nextLine();
		
		Objekat objekat = new Objekat(idX);
		
		Objekat provera = smart.profBrisanjeIme(objekat);
		if (provera == null) {
			System.out.println("Zadato ime ne postoji u listi.");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Smart smart = new Smart();
		//Objekat objekat = new Objekat();
		
		
		smart.loadProf("listaprofesora.txt");
	//	System.out.println(smart);
		
		String answer = null;
		
		do {
			
			System.out.println("--------------------Menu-------------------- \n");
			System.out.println("Opcija 1 - Lista objekata");
			System.out.println("Opcija 2 - Dodavanje Objekata");
			System.out.println("Opcija 3 - Izmena Objekata");
			System.out.println("Opcija 4 - Brisanje Objekata:");
			System.out.println("---------------Kraj-Opcija--------------------- \n");
			
			answer = scanner.nextLine();
			
			switch (answer) {
			case "1":
				smart.lstprofesora();
				break;
				
			case "2":
				unosProfa(smart);
				smart.saveProf("listaprofesora.txt");
			
				break;
				
			case "3":
				izmenaProfa(smart);
				smart.saveProf("listaprofesora.txt");
				
				break;
				
			case "4":
				
				brisanjePoBroju(smart);
				smart.saveProf("listaprofesora.txt");
				
				break;
				
			case "5":
				
				break;
				
			case "6":
				
				break;
				
			case "7":
				
				break;
				
			case "8":
				
				break;
				
			case "9":
				
				break;
				

			default:
				break;
			}
			
		} while (!answer.equals("x"));
		
		smart.saveProf("listaprofesora.txt");
		
		scanner.close();
		

	}

}
