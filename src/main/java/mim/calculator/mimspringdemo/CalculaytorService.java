package mim.calculator.mimspringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculaytorService implements CalculaytorServiceInterface {

    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus() {
        return "5 + 5 = ";
    }

    public String minus() {
        return "5 - 5 = ";
    }
    public String multiply() {
        return "5 * 5 = ";
    }
    public String divide() {
        return "5 / 5 = ";
    }


}
