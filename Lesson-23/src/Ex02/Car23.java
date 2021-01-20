package Ex02;

public class Car23 implements Comparable<Car23>{

	public String modelCar;
	public int yearCar;
	
	public Car23(String modelCar, int yearCar) {
		super();
		this.modelCar = modelCar;
		this.yearCar = yearCar;
	}

	public String getModelCar() {
		return modelCar;
	}

	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}

	public int getYearCar() {
		return yearCar;
	}

	public void setYearCar(int yearCar) {
		this.yearCar = yearCar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((modelCar == null) ? 0 : modelCar.hashCode());
		result = prime * result + yearCar;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car23 other = (Car23) obj;
		if (modelCar == null) {
			if (other.modelCar != null)
				return false;
		} else if (!modelCar.equals(other.modelCar))
			return false;
		if (yearCar != other.yearCar)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car23 [modelCar=" + modelCar + ", yearCar=" + yearCar + "]";
	}

	@Override
	public int compareTo(Car23 o) {
		
		return this.modelCar.compareTo(o.getModelCar());
	}
	
	

}
