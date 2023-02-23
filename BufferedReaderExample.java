import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(
        new FileReader("sample.txt"));

    String line;
    while ((line = reader.readLine()) != null) {
      System.out.println(line);
    }

    reader.close();
  }
}
