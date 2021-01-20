package Ex01;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public final class Parlament {

	public static Parlament parlament = new Parlament();
	
	public static void Palament() {
		
	}
	
	public static Parlament getParlament() {
		if (parlament == null) {
			parlament = new Parlament();
		}
		return parlament;
	}

	ArrayList<Fraction> parlamentFractionArr = new ArrayList<Fraction>();

	Supplier<Fraction> createFraction = () -> {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����y ������� ����������:");
		String nameFraction = sc.next();

		return new Fraction(nameFraction);
	};

	public Optional<Fraction> isExistFraction() {
		Fraction fractionIs = createFraction.get();

		Predicate<Fraction> isFractionName = fraction -> fraction.nameFraction
				.equalsIgnoreCase(fractionIs.getNameFraction());
		Optional<Fraction> isFractionPresent = parlamentFractionArr.stream().filter(isFractionName).findFirst();

		return isFractionPresent;

	}

	public void addFraction() {
		Fraction fraction = createFraction.get();
		parlamentFractionArr.add(fraction);
		System.out.println("������ ���� �������: " + fraction.toString());
	}

	public void removeFraction() {
		Optional<Fraction> isFractionPresent = isExistFraction();

		if (isFractionPresent.isPresent()) {
			parlamentFractionArr.remove(isFractionPresent.get());
			System.out.println("������� " + isFractionPresent.get().toString() + " �������� � ����������");
		} else {
			System.out.println("���� ���� �������!");
		}
	}

	public void viewAllFractions() {
		System.out.println("������� ����������:");
		parlamentFractionArr.forEach(System.out::print);
	}

	public void viewOneFraction() {
		Optional<Fraction> isFractionPresent = isExistFraction();

		if (isFractionPresent.isPresent()) {
			System.out.println(isFractionPresent.get().toString());
		} else {
			System.out.println("���� ���� �������!");
		}
	}

	public void addDeputatToFraction() {
		Optional<Fraction> isFractionPresent = isExistFraction();

		if (isFractionPresent.isPresent()) {
			isFractionPresent.get().addDeputat();

		} else {
			System.out.println("���� ���� �������!");
		}

	}

	public void removeDeputatFromFraction() {
		Optional<Fraction> isFractionPresent = isExistFraction();

		if (isFractionPresent.isPresent()) {
			isFractionPresent.get().removeDeputat();

		} else {
			System.out.println("���� ���� �������!");
		}

	}

	public void viewAllBriberFromFraction() {
		Optional<Fraction> isFractionPresent = isExistFraction();

		if (isFractionPresent.isPresent()) {
			isFractionPresent.get().viewBribers();

		} else {
			System.out.println("���� ���� �������!");
		}

	}

	public void viewAllDeputatFromFration() {
		Optional<Fraction> isFractionPresent = isExistFraction();

		if (isFractionPresent.isPresent()) {
			isFractionPresent.get().viewAllDeputat();

		} else {
			System.out.println("���� ���� �������!");
		}

	}

}
