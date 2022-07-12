package ru.javarash.cryptoanaliser.petrochenko;

import ru.javarash.cryptoanaliser.petrochenko.app.Application;
import ru.javarash.cryptoanaliser.petrochenko.controller.MainController;

public class Runner {
    public static void main(String[] args) {
        MainController mainController = new MainController();
      Application application =  new Application(mainController);
     Result result = application.run(args);

        System.out.println(result);

    }
}
