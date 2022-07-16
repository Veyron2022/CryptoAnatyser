package ru.javarash.cryptoanaliser.petrochenko.commands;

import ru.javarash.cryptoanaliser.petrochenko.entity.Result;
import ru.javarash.cryptoanaliser.petrochenko.entity.ResultCode;
import ru.javarash.cryptoanaliser.petrochenko.exception.ApplicationException;
import ru.javarash.cryptoanaliser.petrochenko.util.PathFinder;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static ru.javarash.cryptoanaliser.petrochenko.constants.Strings.ALPHABET;

public class Decoder implements Action {
    @Override
    public Result execute(String[] parameters) {
        String txtFile = parameters[2];
        String encryptedFile = parameters[1];
        Path path = Path.of(PathFinder.getRoot() + encryptedFile);
        Path path1 = Path.of(PathFinder.getRoot() + txtFile);
        int key = Integer.parseInt(parameters[3]);
        char[] alphabet = ALPHABET.toCharArray();
        List<String> strings2 = new ArrayList<>();
        if (key > alphabet.length - 1) {
            key = key % alphabet.length;
        }
        try {
            List<String> strings = Files.readAllLines(path);
            for (String string : strings) {
                String txt = string.toLowerCase();
                char[] stringToChar = txt.toCharArray();
                for (int i = 0; i < stringToChar.length; i++) {
                    for (int j = 0; j < alphabet.length; j++) {
                        if (stringToChar[i] == alphabet[j]) {
                            if ((j - key) >= 0) {
                                stringToChar[i] = alphabet[j - key];
                                break;
                            } else {
                                int n = j - key + alphabet.length;
                                stringToChar[i] = alphabet[n];
                                break;
                            }
                        }
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                for (int k = 0; k < stringToChar.length - 1; k++) {
                    stringBuilder.append(stringToChar[k]);
                }
                strings2.add(stringBuilder.toString());
            }
        } catch (IOException e) {
            throw new ApplicationException("IO error", e);
        }


        try (FileWriter writer = new FileWriter(String.valueOf(path1))) {
            for (String s : strings2) {
                writer.write(s +"\n");
            }  } catch (IOException e) {
            throw new ApplicationException("IO error", e);
        }
        //TODO need dev logic decrypt

        return new Result(ResultCode.OK, "read all bytes" + path);
    }
}
