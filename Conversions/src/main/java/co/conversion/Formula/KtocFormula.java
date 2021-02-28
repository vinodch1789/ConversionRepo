package co.conversion.Formula;

import org.springframework.stereotype.Service;

@Service("ktocFormula")
public class KtocFormula {

	public String convertKelvinFormula(String celcius) {

		float kelvin = Float.parseFloat(String.valueOf(celcius));
		float celsius1 = kelvin - 273.15F;

		String kelvinVal = String.valueOf(celsius1);
		System.out.println("kelvinVal ::" + kelvinVal);
		return kelvinVal;
	}

	public String convertCelsiusFormula(String kelvin) {
		float celsius = Float.parseFloat(String.valueOf(kelvin));
		float kelvinCnvtr = (float) (celsius + 273.15);
		String celsiusVal = String.valueOf(kelvinCnvtr);
		System.out.println("celsiusVal ::" + celsiusVal);

		return celsiusVal;
	}

	
}
