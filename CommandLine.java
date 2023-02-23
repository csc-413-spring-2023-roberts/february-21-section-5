public class CommandLine {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("No arguments provided.");
    }

    for (int i = 0; i < args.length; i++) {
      System.out.println(
          String.format("%d: %s", i, args[i]));
    }
  }
}
