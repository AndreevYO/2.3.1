package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
//    Car car1 = new Car("car1",01,"111");
//    Car car2 = new Car("car2",02,"222");
//    Car car3 = new Car("car3",03,"333");
//    Car car4 = new Car("car4",04,"444");
//    Car car5 = new Car("car5",05,"555");
    @GetMapping(value="/cars")
    public String getCar (@RequestParam(value = "count", required = false, defaultValue = "5") int count, ModelMap modelMap){

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("car1",01,"111"));
        cars.add(new Car("car2",02,"222"));
        cars.add(new Car("car3",03,"333"));
        cars.add(new Car("car4",04,"444"));
        cars.add(new Car("car5",05,"555"));
        if (count>cars.size()){
            count=cars.size();
        }

        modelMap.addAttribute("car", cars.subList(0,count));
        return "carReturned";
    }
}
