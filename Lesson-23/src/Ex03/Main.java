package Ex03;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		
		Supplier<Integer> menu = ()-> {
			System.out.println("�������� 1, ��� ������ ����� �����");
			System.out.println("�������� 2, ��� �������� �����");
			System.out.println("�������� 3, ��� ������� �����");
			System.out.println("�������� 4, ��� ��������� ����� �� ������");
			System.out.println("�������� 5, ��� ��������� ����� �� ��������");
			System.out.println("�������� 6, ��� ��������� ����� �� �������");
			System.out.println("�������� 7, ��� �������� ����� �� �����");
			System.out.println("�������� 8, ��� ������� ����� �� ���������� �������");
			System.out.println("�������� 9, ��� ����� � ��������");
			
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
				System.out.println("���� ������ ��������, ������ ����� �� 1 �� 9");
				break;
			}
		}

	}
}
