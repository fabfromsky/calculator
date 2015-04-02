package main.java.math;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		boolean response;
		response = true;
		
		while(response) {
			System.out.println("Quelle op�ration souhaitez vous r�aliser?");
			System.out.println("1: addition");
			System.out.println("2: soustraction");
			System.out.println("3: multiplication");
			System.out.println("4: division");
			System.out.println("5: carr�");
			

			Calc calc = new Calc();
					
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			int a;
			int b;
			float result;
			
			switch (choice){
				case 1:
					System.out.println("Saisissez le premier chiffre");
					a = sc.nextInt();
					System.out.println("Saisissez le chiffre � ajouter");
					b = sc.nextInt();
					result = calc.addition(a, b);
					System.out.println("Le r�sultat de l'addition de " + a + " et " + b + " est: " + result);
					break;
			
				case 2:
					System.out.println("Saisissez le premier chiffre");
					a = sc.nextInt();
					System.out.println("Saisissez le chiffre � retrancher");
					b = sc.nextInt();
					result = calc.substraction(a, b);
					System.out.println("Le r�sultat de la soustraction de " + a + " par " + b + " est: " + result);
					break;
					
				case 3:
					System.out.println("Saisissez le premier chiffre");
					a = sc.nextInt();
					System.out.println("Saisissez le multiplicateur");
					b = sc.nextInt();
					result = calc.multiplication(a, b);
					System.out.println("Le r�sultat de la multiplication de " + a + " par " + b + " est: " + result);
					break;
				
				case 4:
					System.out.println("Saisissez le premier chiffre");
					a = sc.nextInt();
					System.out.println("Saisissez le diviseur");
					b = sc.nextInt();
					if(b != 0) {
						result = calc.multiplication(a, b);
						System.out.println("Le r�sultat de la multiplication de " + a + " par " + b + " est: " + result);
					}
					else {
						System.out.println("Attention, vous essayez de diviser par zero!!!");
					}
					break;
					
				case 5:
					System.out.println("Saisissez le chiffre dont vous voulez calculer le carr�");
					a = sc.nextInt();
					result = calc.square(a);
					System.out.println(a + " au carr� est �gal �: " + result);
					break;
					
				default:
					System.out.println("Je n'ai pas saisi votre requ�te.");
			}
			boolean choice2IsValid = false;
			while (choice2IsValid == false){
				System.out.println("Souhaitez-vous faire un nouveau calcul? Oui/Non");
				String replayChoice = sc.nextLine();
				
				if(replayChoice == "Non") {
					response = false;
					choice2IsValid = true;
				}
				else if(replayChoice == "Oui") {
					choice2IsValid = true;
				}
				
				else {
					System.out.println("Je ne comprend pas votre r�ponse!");
				}
			}
			sc.close();
		}
		System.out.println("A bien�t!");
	}
}


