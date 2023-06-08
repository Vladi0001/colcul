package mim.calculator.mimspringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculaytorController {
    private final CalculaytorServiceInterface calculaytorService;

    public CalculaytorController(CalculaytorServiceInterface calculaytorService) {
        this.calculaytorService = calculaytorService;
    }

    @GetMapping(path = "/calculator")
    public String calculator() {
        return calculaytorService.calculator();
    }
    @GetMapping(path = "/calculator/plus?num1=5&num2=5")
    public int plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int plus1 = num1+num2;
        return plus1;
    }

    @GetMapping(path = "/calculator/minus?num1=5&num2=5")
    public int minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int minus1 = num1-num2;
        return minus1;
    }
    @GetMapping(path = "/calculator/multiply?num1=5&num2=5")
    public int multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int multiply1 = num1 * num2;
        return multiply1;
    }
    @GetMapping(path = "/calculator/divide?num1=5&num2=5")
    public int divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int divide1 = num1 / num2;
        return divide1;
    }


}
