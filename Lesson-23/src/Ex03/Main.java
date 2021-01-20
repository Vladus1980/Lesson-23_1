package Ex03;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		
		Supplier<Integer> menu = ()-> {
			System.out.println("Натисніть 1, щоб додати новий товар");
			System.out.println("Натисніть 2, щоб видалити товар");
			System.out.println("Натисніть 3, щоб замінити товар");
			System.out.println("Натисніть 4, щоб сортувати товар за назвою");
			System.out.println("Натисніть 5, щоб сортувати товар за довжиною");
			System.out.println("Натисніть 6, щоб сортувати товар за шириною");
			System.out.println("Натисніть 7, щоб сотувати товар за вагою");
			System.out.println("Натисніть 8, щоб вивести товар за порядковим номером");
			System.out.println("Натисніть 9, щоб вийти з програми");
			
			Scanner sc = new Scanner(System.in);
			int menuInt = sc.nextInt();
			
			return menuInt;
			
		};
		
		Commodity23Methods commodity23Methods = new Commodity23Methods();
		while(true) {
			switch (menu.get()) {
			case 1:{
				commodity23Methods.addCommodity();
				
				break;
			}
			case 2:{
				commodity23Methods.removeCommodity();
				
				break;
			}
			case 3:{
				commodity23Methods.changeCommodity();
				
				break;
			}
			case 4:{
				commodity23Methods.sortByName();
				
				break;
			}
			case 5:{
				commodity23Methods.sortByLength();
				
				break;
			}
			case 6:{
				commodity23Methods.sortByWidth();
				break;
			}
			case 7:{
				commodity23Methods.sortByWeight();
				
				break;
			}
			case 8:{
				commodity23Methods.viewByIndex();
				break;
			}
			case 9:{
				System.exit(0);
				break;
			}

			default:
				System.out.println("Немає такого значення, введіть число від 1 до 9");
				break;
			}
		}

	}
}
