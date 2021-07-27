package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceIml;

@Controller
public class CarController {
    private CarServiceIml carServiceIml;

    public CarController(CarServiceIml carServiceIml) {
        this.carServiceIml = carServiceIml;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) int count, Model model) {
        model.addAttribute("cars", carServiceIml.getListCar(count));
        return "cars";
    }
}
