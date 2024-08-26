package ua.com.javarush.gnew;

import ua.com.javarush.gnew.crypto.Decrypt;
import ua.com.javarush.gnew.crypto.Encrypt;
import ua.com.javarush.gnew.file.FileManager;
import ua.com.javarush.gnew.runner.ArgumentsParser;
import ua.com.javarush.gnew.runner.Command;
import ua.com.javarush.gnew.runner.RunOptions;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Encrypt cipher = new Encrypt();
        System.out.println(cipher.encrypt("Abc abC", 0));
        Decrypt encripted = new Decrypt();
        System.out.println(encripted.decrypt("Hij hiJ", 0));
//        Encrypt cypher = new Encrypt();
//        FileManager fileManager = new FileManager();
//        ArgumentsParser argumentsParser = new ArgumentsParser();
//        RunOptions runOptions = argumentsParser.parse(args);
//
//        try {
//            if (runOptions.getCommand() == Command.ENCRYPT) {
//                String content = fileManager.read(runOptions.getFilePath());
//                String encryptedContent = cypher.encrypt(content, runOptions.getKey());
//                String fileName = runOptions.getFilePath().getFileName().toString();
//                String newFileName = fileName.substring(0, fileName.length() - 4) + " [ENCRYPTED].txt";
//
//                Path newFilePath = runOptions.getFilePath().resolveSibling(newFileName);
//                fileManager.write(newFilePath, encryptedContent);
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

    }
}