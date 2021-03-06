package co.conversion.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.conversion.Formula.KtocFormula;

@Service("ktocService")
public class KtocService {

	@Autowired
	KtocFormula ktocFormula;

	public String togetKelvin(String celcius) {
		return ktocFormula.convertKelvinFormula(celcius);// KtocFormula.jkk()
		// return celcius;
	}

	public String togetCelsius(String kelvin) {
		return ktocFormula.convertCelsiusFormula(kelvin);
		
	}
	
	public Double toGetInkmeters(String miles) {
		// TODO Auto-generated method stub
		return ktocFormula.convertKmFormula(miles);
	}

	public Double toGetInMiles(String kilometeres) {
		return ktocFormula.convertMileFormula(kilometeres);

	}

	
}
