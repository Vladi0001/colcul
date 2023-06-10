package mim.calculator.mimspringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculaytorController {
    private final CalculaytorServiceInterface calculaytorService;

    public CalculaytorController(CalculaytorServiceInterface calculaytorService) {
        this.calculaytorService = calculaytorService;
    }

    @GetMapping()
    public String calculator() {
        return calculaytorService.calculator();
    }
    @GetMapping(path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        int result = calculaytorService.plus(num1, num2);
        return num1 + " + " + num2  + " = " + result;
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        int result = calculaytorService.minus(num1, num2);
        return num1 + " - " + num2  + " = " + result;
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        int result = calculaytorService.multiply(num1, num2);
        return num1 + " * " + num2  + " = " + result;
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return "На 0 делить нельзя.";
        }
        int result = calculaytorService.divide(num1, num2);
        return num1 + " / " + num2  + " = " + result;
    }


}
