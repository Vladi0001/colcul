package mim.calculator.mimspringdemo;

import org.springframework.web.bind.annotation.GetMapping;

public interface CalculaytorServiceInterface {

    String calculator();

    int plus(int num1, int num2);

    int minus(int num1, int num2);
    int multiply(int num1, int num2);
    int divide(int num1, int num2);

}
