package ua.com.javarush.gnew;

import ua.com.javarush.gnew.crypto.Cipher;
import ua.com.javarush.gnew.crypto.Decrypt;
import ua.com.javarush.gnew.crypto.Encrypt;
import ua.com.javarush.gnew.crypto.KeyManager;
import ua.com.javarush.gnew.file.FileManager;
import ua.com.javarush.gnew.runner.ArgumentsParser;
import ua.com.javarush.gnew.runner.Command;
import ua.com.javarush.gnew.runner.RunOptions;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Encrypt encrypt = new Encrypt();
        Cipher cipher = new Cipher();
        KeyManager keyManager = new KeyManager();
        FileManager fileManager = new FileManager();
        ArgumentsParser argumentsParser = new ArgumentsParser();
        RunOptions runOptions = argumentsParser.parse(args);


        try {
            if (runOptions.getCommand() == Command.ENCRYPT) {
                String content = fileManager.read(runOptions.getFilePath());
                int k = keyManager.key(runOptions);
                char [] inputChar = cipher.inputChars(content);
                String encryptedContent = encrypt.encrypt();
                String fileName = runOptions.getFilePath().getFileName().toString();
                String newFileName = fileName.substring(0, fileName.length() - 4) + " [ENCRYPTED].txt";

                Path newFilePath = runOptions.getFilePath().resolveSibling(newFileName);
                fileManager.write(newFilePath, encryptedContent);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}