package Ex01;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Fraction {

	String nameFraction;

	public Fraction(String nameFraction) {
		super();
		this.nameFraction = nameFraction;
	}

	public String getNameFraction() {
		return nameFraction;
	}

	public void setNameFraction(String nameFraction) {
		this.nameFraction = nameFraction;
	}

	@Override
	public String toString() {
		return "Fraction [nameFraction=" + nameFraction + "]";
	}

	List<Deputat> deputatList = new ArrayList<>();

	Supplier<Deputat> createDeputat = () -> {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������� ��������:");
		String lastName = sc.next();
		System.out.println("������ ��'� ��������:");
		String firstName = sc.next();
		System.out.println("������ ���� ��������");
		int height = sc.nextInt();
		System.out.println("������ ���� ��������");
		int weigh = sc.nextInt();
		System.out.println("������ �� ���� ������� �����: True ��� False ");
		boolean bribe = sc.nextBoolean();

		return new Deputat(lastName, firstName, height, weigh, bribe);
	};
	Supplier<Deputat> getDeputat = () -> {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������� ��������:");
		String lastName = sc.next();
		System.out.println("������ ��'� ��������:");
		String firstName = sc.next();
		int height = 0;
		int weigh = 0;
		
		return new Deputat(lastName, firstName, height, weigh);
	};

	public void addDeputat() {
		Deputat deputat = createDeputat.get();

		deputat.giveBribe();

		deputatList.add(deputat);

		System.out.println("������ ������ ��������: " + deputat);

	}

	public void removeDeputat() {
		
		Deputat deputatLastFirstName = getDeputat.get();
		
		Predicate<Deputat> lastFirst = deputat -> deputat.getLastName().equalsIgnoreCase(deputatLastFirstName.getLastName())&& deputat.getFirstName().equalsIgnoreCase(deputatLastFirstName.getFirstName());
		Optional<Deputat> isExistDeputat = deputatList.stream().filter(lastFirst).findFirst();
		
		if (isExistDeputat.isPresent()) {
			deputatList.remove(isExistDeputat.get());
			System.out.println(isExistDeputat.get().toString()+ " ���������");
		} else {
			System.out.println("������ �������� �� ��������!");

		}
	}
	
	public void viewBribers() {
		List<Deputat> bribers = deputatList.stream().filter(Deputat::isBribe).collect(Collectors.toList());
		bribers.forEach(System.out::println);
	}
	
//	public void bigestBriber() {
//		
//		Comparator<Deputat> bribersComparator = (deputat1, deputat2) -> ();
//		List<Deputat> bribers = deputatList.stream().filter(Deputat::isBribe).collect(Collectors.toList());
//		bribers.stream().max(Deputat::getSumBribe);
//	}
	
	public void viewAllDeputat() {
		System.out.println("�������� ���� �������:");
		deputatList.forEach(System.out::println);
	}
	
	public void clearFraction() {
		deputatList.clear();
		System.out.println("� ��� ������� �������� ��� ����");
	}
	
	

}
