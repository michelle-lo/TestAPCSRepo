//10.19.20
public class Demo {
  public static void main (String[] args) {
    if (args.length == 0) { //checks to see if there's a parameter
      System.out.print(printLoop(5));
    } else {
      System.out.print(printLoop(Integer.parseInt(args[0]))); //takes input
    }
  }
  public static String printLoop (int n) {
    String str = "";
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j <= n - i; j++) { //length of each row decreases as rows increase
        str += i;
      }
      str += "\n"; //new line after each row
    }
    return str;
  }
}
