package ru.javarash.cryptoanaliser.petrochenko.toplevel;

import ru.javarash.cryptoanaliser.petrochenko.entity.Result;
import ru.javarash.cryptoanaliser.petrochenko.controller.MainController;

import java.util.Arrays;

public class Application {
    private final MainController mainController;

    public Application(MainController mainController) {
        this.mainController = mainController;
    }

    public Result run(String[] args) {

        String command = args[0];//encode
        String[] parameters = Arrays.copyOfRange(args, 1, args.length);//text.txt encoded.txt 45
        return mainController.execute(command, parameters);
    }

}
