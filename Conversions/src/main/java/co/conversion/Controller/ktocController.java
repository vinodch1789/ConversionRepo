package co.conversion.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.conversion.Service.KtocService;

@RestController
@RequestMapping("conversion")
public class ktocController {

    @Autowired
    KtocService ktocService;

    @GetMapping(path = "/kelvinconvert/{celcius}")
    public String toConvertkelvin(@PathVariable String celcius) {
        return ktocService.togetKelvin(celcius);

    }
    
    @GetMapping(path = "/celsiusConvert/{kelvin}")
    public String toConvertCelsius(@PathVariable String kelvin) {
        return ktocService.togetCelsius(kelvin);

    }
    
    @GetMapping(path = "/kilometerConvert/{miles}")
    public Double toConvertKilometeres(@PathVariable String miles) {
        return ktocService.toGetInkmeters(miles);

    }
    

    @GetMapping(path = "/milesConvert/{kilometeres}")
    public Double toConvertMiles(@PathVariable String kilometeres) {
        return ktocService.toGetInMiles(kilometeres);

    }

    
}