import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
  public static void main(String[] args) throws IOException {
    FileReader reader = new FileReader("sample.txt");

    System.out.println("Reading char by char (int by int):");

    int c;
    while ((c = reader.read()) != -1) {
      System.out.print((char) c);
    }

    reader.close();
    reader = new FileReader("sample.txt");

    System.out.println("\n\nReading char buffer by char buffer:");

    int charactersRead;
    char[] buffer = new char[20];

    while ((charactersRead = reader.read(buffer)) != -1 && charactersRead != 0) {
      System.out.println(
          "Characters read: " + charactersRead + "\n" + new String(buffer));
    }

    reader.close();
  }
}
