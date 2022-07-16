package ru.javarash.cryptoanaliser.petrochenko.controller;

import ru.javarash.cryptoanaliser.petrochenko.commands.Action;
import ru.javarash.cryptoanaliser.petrochenko.entity.Result;
import ru.javarash.cryptoanaliser.petrochenko.entity.ResultCode;
import ru.javarash.cryptoanaliser.petrochenko.exception.ApplicationException;

public class MainController {

    public Result execute(String command, String[] parameters) {
        try {
            Action action = Actions.find(command);
            return action.execute(parameters);
        } catch (ApplicationException e) {
            //TODO log file for exception
            return new Result(ResultCode.ERROR, e.getMessage());
        }
    }
}
