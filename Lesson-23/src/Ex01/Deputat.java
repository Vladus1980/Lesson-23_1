package Ex01;

import java.util.Scanner;
import java.util.function.Supplier;

public class Deputat extends Human{
	
	private String lastName;
	private String firstName;
	private boolean bribe;
	private int sumBribe;
	
	
	
	public Deputat(String lastName, String firstName, int height, int weigh) {
		super(height, weigh);
		this.lastName = lastName;
		this.firstName = firstName;
	}




	public Deputat(String lastName, String firstName, int height, int weigh, boolean bribe) {
		super(height, weigh);
		this.lastName = lastName;
		this.firstName = firstName;
		this.bribe = bribe;
		
	}
	
	
	

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public boolean isBribe() {
		return bribe;
	}

	public void setBribe(boolean bribe) {
		this.bribe = bribe;
	}

	public int getSumBribe() {
		return sumBribe;
	}

	public void setSumBribe(int sumBribe) {
		this.sumBribe = sumBribe;
	}

	@Override
	public String toString() {
		return "Прізвище: " + lastName + ", Ім'я: " + firstName + ", Хабарник: " + bribe  ;
	}
	
	
	
	
	Supplier<Integer> getBribeSum = () -> {
		Scanner sc = new Scanner(System.in);
		int sumBribe = sc.nextInt();
		
		return sumBribe;

		
	};
	public void giveBribe() {
		if (bribe== false) {
			System.out.println("Цей депутат не бере хабарів!");
		} else {
			System.out.println("Введіть суму хабаря:");
			sumBribe = getBribeSum.get();

			if(sumBribe > 5000) {
				System.out.println("Поліція ув'язнить депутата!");
			}else {
				System.out.println("Цей депутат взяв хабар: "+sumBribe);
			}
		}
	
	}
}
