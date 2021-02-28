package co.conversion.Formula;

import org.springframework.stereotype.Service;

@Service("ktocFormula")
public class KtocFormula {
	
	private static final float convrtVal = 273.15F;

	public String convertKelvinFormula(String celcius) {

		float kelvin = Float.parseFloat(String.valueOf(celcius));
		float celsius1 = kelvin - convrtVal;

		String kelvinVal = String.valueOf(celsius1);
		System.out.println("kelvinVal ::" + kelvinVal);
		return kelvinVal;
	}

	public String convertCelsiusFormula(String kelvin) {
		float celsius = Float.parseFloat(String.valueOf(kelvin));
		float kelvinCnvtr = (float) (celsius + convrtVal);
		String celsiusVal = String.valueOf(kelvinCnvtr);
		System.out.println("celsiusVal ::" + celsiusVal);

		return celsiusVal;
	}
	
	public Double convertKmFormula(String miles) {

		Double km = Double.valueOf(miles);
		double kilometers = km * 1.609344;
		System.out.println(kilometers + " Kilometers");
		return kilometers;
	}

	public Double convertMileFormula(String kilometeres) {
		Double mile = Double.valueOf(kilometeres);
		double miles = mile * 0.621371;
		System.out.println(" miles ::" + miles);
		return miles;
	}

	
}
