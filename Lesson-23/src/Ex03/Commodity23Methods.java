package Ex03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Commodity23Methods {

	ArrayList<Commodity23> commodityArray = new ArrayList<Commodity23>();

	Supplier<Commodity23> getCommodity = () -> {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� ������: ");
		String name = sc.next();
		System.out.println("������ ���� ������ � ��: ");
		int weight = sc.nextInt();
		System.out.println("������ ������� ������ � ��: ");
		int length = sc.nextInt();
		System.out.println("������ ������ ������ � ��: ");
		int width = sc.nextInt();

		return new Commodity23(name, weight, length, width);

	};

	Optional<Commodity23> find() {
		Commodity23 commodity23 = getCommodity.get();

		Predicate<Commodity23> IsExist = commodity -> commodity.getName().equalsIgnoreCase(commodity23.getName())
				&& commodity.getWeight() == commodity23.getWeight() && commodity.getLength() == commodity23.getLength()
				&& commodity.getWidth() == commodity23.getWidth();

		Optional<Commodity23> commodityIsExist = commodityArray.stream().filter(IsExist).findFirst();

		return commodityIsExist;
	}

	public void addCommodity() {
		Commodity23 commodity23 = getCommodity.get();

		commodityArray.add(commodity23);
		System.out.println(commodity23.toString() + " �������");
	}

	public void removeCommodity() {
		Optional<Commodity23> comOptional = find();

		if (comOptional.isPresent()) {
			commodityArray.remove(comOptional.get());
			System.out.println(comOptional.toString() + " ��������");
		} else {
			System.out.println("������ ����");

		}

	}

	public void changeCommodity() {
		System.out.println("������ ����� �� �������  �����:");
		Optional<Commodity23> comOptional = find();
		

		if (comOptional.isPresent()) {
			commodityArray.remove(comOptional.get());
			System.out.println(comOptional.toString() + " ������� ��: ");
			addCommodity();

		} else {
			System.out.println("������ ����");

		}

	}
	public void sortByName() {
		System.out.println("�� ����������: ");
		commodityArray.forEach(System.out::print);
		System.out.println();
		System.out.println("ϳ��� ����������: ");
		
		commodityArray.stream().sorted(Comparator.comparing(Commodity23::getName)).forEach(System.out::print);
	}
	
	public void sortByLength() {
		System.out.println("�� ����������: ");
		commodityArray.forEach(System.out::print);
		System.out.println();
		System.out.println("ϳ��� ����������: ");
		
		commodityArray.stream().sorted(Comparator.comparing(Commodity23::getLength)).forEach(System.out::print);
	}
	
	public void sortByWidth() {
		System.out.println("�� ����������: ");
		commodityArray.forEach(System.out::print);
		System.out.println();
		System.out.println("ϳ��� ����������: ");
		
		commodityArray.stream().sorted(Comparator.comparing(Commodity23::getWidth)).forEach(System.out::print);
	}
	public void sortByWeight() {
		System.out.println("�� ����������: ");
		commodityArray.forEach(System.out::print);
		System.out.println();
		System.out.println("ϳ��� ����������: ");
		
		commodityArray.stream().sorted(Comparator.comparing(Commodity23::getWeight)).forEach(System.out::print);
	}
	public void viewByIndex() {
		System.out.println("������ ������ ������:");
		int i;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		System.out.println(commodityArray.get(i).toString());
	}
	

}
