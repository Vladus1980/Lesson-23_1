package Ex02;

import java.util.Comparator;

public class CarComparator23 implements Comparator<Car23>{

	@Override
	public int compare(Car23 o1, Car23 o2) {
		if( o1.getYearCar() > o2.getYearCar() ) {
			return 1;
		}else if (o1.getYearCar() < o2.getYearCar()) {
			return -1;
		}else {
		return 0;
		}
	}

}
