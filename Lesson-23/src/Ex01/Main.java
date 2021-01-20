package Ex01;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		Supplier<Integer> menu = () ->{
			System.out.println("Введіть 1 щоб додати фракцію");
			System.out.println("Введіть 2 щоб видалити конкретну фракцію");
			System.out.println("Введіть 3 щоб вивести усі  фракції");
			System.out.println("Введіть 4 щоб очистити конкретну фракцію");
			System.out.println("Введіть 5 щоб вивести конкретну фракцію");
			System.out.println("Введіть 6 щоб додати депутата в фракцію");
			System.out.println("Введіть 7 щоб видалити депутата з фракції");
			System.out.println("Введіть 8 щоб вивести список хабарників");
			System.out.println("Введіть 9 щоб вивести найбільшого хабарника");
			
			Scanner sc = new Scanner(System.in);
			int menuInt = sc.nextInt();
			
			return menuInt;
			
		};
		
		while(true) {
			switch (menu.get()) {
			case 1:{
				
			Parlament.getParlament().addFraction();
				
				break;
			}
			case 2:{
				
				Parlament.getParlament().removeFraction();
					
					break;
				}
			case 3:{
				
				Parlament.getParlament().viewAllFractions();
					
					break;
				}
			case 4:{
				
				Parlament.getParlament().removeDeputatFromFraction();
					
					break;
				}
			case 5:{
				
				Parlament.getParlament().viewOneFraction();
					
					break;
				}
			case 6:{
				
				Parlament.getParlament().addDeputatToFraction();
					
					break;
				}
			case 7:{
				
				Parlament.getParlament().removeDeputatFromFraction();
					
					break;
				}
			case 8:{
				
				Parlament.getParlament().viewAllBriberFromFraction();
					
					break;
				}

			default:
				System.out.println("Ви ввели невірне значення");
				break;
			}
		}
	
	}

}
