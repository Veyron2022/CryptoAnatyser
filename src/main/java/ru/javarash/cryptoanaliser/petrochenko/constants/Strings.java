package ru.javarash.cryptoanaliser.petrochenko.constants;

public class Strings {
    private static final String rus = "йцукенгшщзхъфывапролджэячсмитьбю";
    private static final String eng = "qwertyuiopasdfghjklzxcvbnm";
    private static final String cyphers = "1234567890";
    private static final String symbols = ",./@'!_-=+`;][{}";

    public String ALPHABET = rus + rus.toUpperCase() + eng + eng.toUpperCase() + cyphers + symbols;
}
