package mim.calculator.mimspringdemo;

import org.springframework.web.bind.annotation.GetMapping;

public interface CalculaytorServiceInterface {

    String calculator();
    String plus();
    String minus();
    String multiply();
    String divide();

}
