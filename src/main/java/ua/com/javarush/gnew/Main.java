package ua.com.javarush.gnew;

import ua.com.javarush.gnew.crypto.Cryptor;
import ua.com.javarush.gnew.crypto.KeyManager;
import ua.com.javarush.gnew.file.FileManager;
import ua.com.javarush.gnew.file.NewFileNamePath;
import ua.com.javarush.gnew.runner.ArgumentsParser;
import ua.com.javarush.gnew.runner.RunOptions;

public class Main {
    public static void main(String[] args) {
        Cryptor cryptor = new Cryptor();
        FileManager fileManager = new FileManager();
        ArgumentsParser argumentsParser = new ArgumentsParser();
        RunOptions runOptions = argumentsParser.parse(args);
        KeyManager keyManager = new KeyManager();

        try {
            String content = fileManager.read(runOptions.getFilePath());
            int key = keyManager.key(runOptions);
            String cryptoContent = cryptor.cypher(content, key);
            NewFileNamePath path = new NewFileNamePath();
            fileManager.write(path.newPath(runOptions) , cryptoContent);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}