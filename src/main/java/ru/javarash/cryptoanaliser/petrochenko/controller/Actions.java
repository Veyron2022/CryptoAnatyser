package ru.javarash.cryptoanaliser.petrochenko.controller;

import ru.javarash.cryptoanaliser.petrochenko.commands.Action;
import ru.javarash.cryptoanaliser.petrochenko.commands.Decoder;
import ru.javarash.cryptoanaliser.petrochenko.commands.Encoder;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder());

    private  final Action action;

    Actions(Action action){
        this.action=action;
    }


    public static Action find(String command) {
      return valueOf(command.toUpperCase()).action;
    }
}
