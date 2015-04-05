package main.java.math;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		boolean response = true;
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double result;
		
		Calc calc = new Calc();
		
		String choices[] = {"Addition", "Soustraction", "Multiplication", "Division", "Carr�"};
		
		while(response == true) {
			
			boolean isValid = false;
			
			System.out.println("Quelle op�ration souhaitez-vous effectuer?");
			System.out.println("1: "+ choices[0]);
			System.out.println("2: "+ choices[1]);
			System.out.println("3: "+ choices[2]);
			System.out.println("4: "+ choices[3]);
			System.out.println("5: "+ choices[4]);
			
			
			
			try {
				int choice = sc.nextInt();
				sc.nextLine();
				
	
				if(choice != 0 && choice < 6) {
					System.out.println("Vous avez choisi l'op�ration: "+ choices[choice-1]);
					switch(choice) {
						case 1: 
							System.out.println("Saisissez le premier chiffre.");
							a = sc.nextDouble();
							System.out.println("Saisissez le chiffre � ajouter.");
							b = sc.nextDouble();
							result = calc.addition(a, b);
							System.out.println("Le r�sultat de l'addition de "+ a + " et " + b + " est: " + result);
							break;
							
						case 2: 
							System.out.println("Saisissez le premier chiffre.");
							a = sc.nextDouble();
							System.out.println("Saisissez le chiffre � retrancher.");
							b = sc.nextDouble();
							result = calc.substraction(a, b);
							System.out.println("Le r�sultat de la soustraction de "+ a + " par " + b + " est: " + result);
							break;
							
						case 3:
							System.out.println("Saisissez le premier chiffre.");
							a = sc.nextDouble();
							System.out.println("Saisissez le chiffre � multiplier.");
							b = sc.nextDouble();
							result = calc.multiplication(a, b);
							System.out.println("Le r�sultat de la mutliplication de "+ a + " par " + b + " est: " + result);
							break;
							
						case 4:
							try {
								System.out.println("Saisissez le premier chiffre.");
								a = sc.nextDouble();
								System.out.println("Saisissez le diviseur.");
								b = sc.nextDouble();
								result = calc.division(a, b);
								System.out.println("Le r�sultat de la division de "+ a + " par " + b + " est: " + result);
							}catch (ArithmeticException e) {
								System.out.println("Attention, vous essayez de diviser par zero!!");
							}
							
						case 5:
							System.out.println("Saisissez le chiffre dont vous souhaitez conna�tre le carr�.");
							a = sc.nextDouble();
							result = calc.square(a);
							System.out.println("Le carr� de " + a + " est: " + result);
							break;
					}
					sc.nextLine();
					
					while (isValid == false){
						System.out.println("Souhaitez-vous recommencer? (o/n)");
						char response2 = sc.nextLine().charAt(0);
						switch(response2) {
						
							case 'o': 
								isValid = true;
								response = true;
								break;
								
							case 'n':
								isValid = true;
								response = false;
								break;
							
							default:
								System.out.println("Je n'ai pas compris votre r�ponse");
								isValid = false;
								break;
						}
					}					
				}
				else {
					
					System.out.println("d�sol�, votre choix n'est pas compris dans la liste!");
					while (isValid == false){
						System.out.println("Souhaitez-vous recommencer? (o/n)");
						char response2 = sc.nextLine().charAt(0);
	
						switch(response2) {
							case 'o': 
								response = true;
								isValid = true;
								break;
								
							case 'n':
								response = false;
								isValid = true;
								break;
							
							default:
								System.out.println("Je n'ai pas compris votre r�ponse");
								isValid = false;
								break;
						}
					}
				}
			}catch (InputMismatchException e) {
				System.out.println("Je n'ai pas compris votre r�ponse.");
				sc.nextLine();
			}
		}
		sc.close();
		
		System.out.println("A bient�t!");
	}
}


