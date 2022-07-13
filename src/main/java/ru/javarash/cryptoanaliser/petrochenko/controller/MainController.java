package ru.javarash.cryptoanaliser.petrochenko.controller;

import ru.javarash.cryptoanaliser.petrochenko.commands.Action;
import ru.javarash.cryptoanaliser.petrochenko.entity.Result;

public class MainController {

    public Result execute(String command, String[] parameters) {
        Action action = Actions.find(command);
        //throw new UnsupportedOperationException();
        return action.execute(parameters);
    }
}
