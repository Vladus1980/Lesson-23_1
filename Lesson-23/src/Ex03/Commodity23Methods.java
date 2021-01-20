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
		System.out.println("Введіть назву товару: ");
		String name = sc.next();
		System.out.println("Введіть вагу товару у кг: ");
		int weight = sc.nextInt();
		System.out.println("Введіть довжину товару у см: ");
		int length = sc.nextInt();
		System.out.println("Введіть ширину товару у см: ");
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
		System.out.println(commodity23.toString() + " доданий");
	}

	public void removeCommodity() {
		Optional<Commodity23> comOptional = find();

		if (comOptional.isPresent()) {
			commodityArray.remove(comOptional.get());
			System.out.println(comOptional.toString() + " Видалено");
		} else {
			System.out.println("Такого немає");

		}

	}

	public void changeCommodity() {
		System.out.println("Введіть товар що потребує  заміни:");
		Optional<Commodity23> comOptional = find();
		

		if (comOptional.isPresent()) {
			commodityArray.remove(comOptional.get());
			System.out.println(comOptional.toString() + " Замінено на: ");
			addCommodity();

		} else {
			System.out.println("Такого немає");

		}

	}
	public void sortByName() {
		System.out.println("До сортування: ");
		commodityArray.forEach(System.out::print);
		System.out.println();
		System.out.println("Після сортування: ");
		
		commodityArray.stream().sorted(Comparator.comparing(Commodity23::getName)).forEach(System.out::print);
	}
	
	public void sortByLength() {
		System.out.println("До сортування: ");
		commodityArray.forEach(System.out::print);
		System.out.println();
		System.out.println("Після сортування: ");
		
		commodityArray.stream().sorted(Comparator.comparing(Commodity23::getLength)).forEach(System.out::print);
	}
	
	public void sortByWidth() {
		System.out.println("До сортування: ");
		commodityArray.forEach(System.out::print);
		System.out.println();
		System.out.println("Після сортування: ");
		
		commodityArray.stream().sorted(Comparator.comparing(Commodity23::getWidth)).forEach(System.out::print);
	}
	public void sortByWeight() {
		System.out.println("До сортування: ");
		commodityArray.forEach(System.out::print);
		System.out.println();
		System.out.println("Після сортування: ");
		
		commodityArray.stream().sorted(Comparator.comparing(Commodity23::getWeight)).forEach(System.out::print);
	}
	public void viewByIndex() {
		System.out.println("Введіть індекс товару:");
		int i;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		System.out.println(commodityArray.get(i).toString());
	}
	

}
