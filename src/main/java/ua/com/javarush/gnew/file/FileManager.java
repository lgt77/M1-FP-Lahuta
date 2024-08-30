package ua.com.javarush.gnew.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {
    public String read(Path filePath)  {
      try {
          return Files.readString(filePath);
      }catch (IOException e){
          throw new RuntimeException("File path not found." + e);
      }
    }

    public void write(Path filePath, String content) throws IOException {
      try {
          Files.writeString(filePath, content);
      }catch (IOException e) {
          throw new IOException("The file cloud not be saved " + e);
      }
    }
}
