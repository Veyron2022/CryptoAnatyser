package ru.javarash.cryptoanaliser.petrochenko.constants;

public class Strings {
 //   public static final char[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е','ё', 'ж', 'з', 'и','к', 'л', 'м', 'н', 'о', 'п', 'р',
 //           'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э','ю', 'я', '.', ',',
 //           '«', '»', '"', '\'', ':', '!', '?', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    private static final String rus = "йцукенгшщзхъфывапролджэячсмитьбю";
   // private static final String eng = "qwertyuiopasdfghjklzxcvbnm";
    private static final String cyphers = "1234567890";
    private static final String symbols = ",./@'!_-=+`;][{} ";

    public static String ALPHABET = rus + cyphers + symbols;
}
