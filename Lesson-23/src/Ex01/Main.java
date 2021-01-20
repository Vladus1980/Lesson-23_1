package Ex01;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		Supplier<Integer> menu = () ->{
			System.out.println("������ 1 ��� ������ �������");
			System.out.println("������ 2 ��� �������� ��������� �������");
			System.out.println("������ 3 ��� ������� ��  �������");
			System.out.println("������ 4 ��� �������� ��������� �������");
			System.out.println("������ 5 ��� ������� ��������� �������");
			System.out.println("������ 6 ��� ������ �������� � �������");
			System.out.println("������ 7 ��� �������� �������� � �������");
			System.out.println("������ 8 ��� ������� ������ ���������");
			System.out.println("������ 9 ��� ������� ���������� ���������");
			
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
				System.out.println("�� ����� ������ ��������");
				break;
			}
		}
	
	}

}
