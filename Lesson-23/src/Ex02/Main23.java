package Ex02;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;




public class Main23 {

	public static void main(String[] args) {
		
		
		Set<Car23> car1 = new HashSet<Car23>();
		Consumer<Car23> addHashSet = hashSetConsumer -> car1.add(hashSetConsumer);
		addHashSet.accept(new Car23("Ford Mustang", 1968));
		addHashSet.accept(new Car23("Ford Taurus", 1996));
		addHashSet.accept(new Car23("Ford Taurus", 1996));
		addHashSet.accept(new Car23("Ford Sierra", 1995));
		addHashSet.accept(new Car23("Ford Fiesta", 2005));
		addHashSet.accept(new Car23("Ford NewDragon", 2020));
		addHashSet.accept(new Car23("Ford SuperC", 2019));
		
		car1.forEach(System.out::print);
		
		System.out.println();
		
		Set<Car23> car2 = new LinkedHashSet<Car23>();
		Consumer<Car23> addLinkedhashSet = linkedHashSetConsumer -> car2.add(linkedHashSetConsumer);
		addLinkedhashSet.accept(new Car23("Ford Mustang", 1968));
		addLinkedhashSet.accept(new Car23("Ford Taurus", 1996));
		addLinkedhashSet.accept(new Car23("Ford Taurus", 1996));
		addLinkedhashSet.accept(new Car23("Ford Sierra", 1995));
		addLinkedhashSet.accept(new Car23("Ford Fiesta", 2005));
		addLinkedhashSet.accept(new Car23("Ford NewDragon", 2020));
		addLinkedhashSet.accept(new Car23("Ford SuperC", 2019));
		
		car2.forEach(System.out::print);
		System.out.println();
		
		Set<Car23> car3 = new TreeSet<Car23>();
		Consumer<Car23> addTreeSet = treeSetConsumer -> car3.add(treeSetConsumer);
		addTreeSet.accept(new Car23("Ford Mustang", 1968));
		addTreeSet.accept(new Car23("Ford Taurus", 1996));
		addTreeSet.accept(new Car23("Ford Taurus", 1996));
		addTreeSet.accept(new Car23("Ford Sierra", 1995));
		addTreeSet.accept(new Car23("Ford Fiesta", 2005));
		addTreeSet.accept(new Car23("Ford NewDragon", 2020));
		addTreeSet.accept(new Car23("Ford SuperC", 2019));
		
		car3.forEach(System.out::print);
		System.out.println();
		car3.stream().sorted(new CarComparator23()).forEach(System.out::print);

	}
	

}
