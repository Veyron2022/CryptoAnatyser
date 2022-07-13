package ru.javarash.cryptoanaliser.petrochenko;

import ru.javarash.cryptoanaliser.petrochenko.toplevel.Application;
import ru.javarash.cryptoanaliser.petrochenko.controller.MainController;
import ru.javarash.cryptoanaliser.petrochenko.entity.Result;

public class Runner {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        //encode text.txt encoded.txt 45
        Application application = new Application(mainController);
        Result result = application.run(args);
        System.out.println(result);

    }
}
