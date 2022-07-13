package ru.javarash.cryptoanaliser.petrochenko.commands;

import ru.javarash.cryptoanaliser.petrochenko.entity.Result;

public interface Action {
    Result execute(String[]parameters);
}
