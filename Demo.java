//10.22.20
public class Demo {
  public static void main (String[] args) {
    if (args.length == 0) { //checks to see if there's a parameter
      System.out.print(printLoop(5));
    } else {
      System.out.print(printLoop(Integer.parseInt(args[0]))); //takes input
    }

    /*
    //Test Cases
    int[] a = {1, 2, 3,4};
    int[] b = {1, 2};
    int[] c = {1, 2, 3, 4, 5, 6};
    int[] d = {1, 2, 3, 4};
    int[] e = {1, 2, 3, 4, 5, 6, 7};

    System.out.println("------------arrToString------------");
    System.out.println(arrToString(a));
    System.out.println(arrToString(b));
    System.out.println(arrToString(c));
    System.out.println(arrToString(d));
    System.out.println(arrToString(e));

    System.out.println("------------arrayDeepToString------------");
    int[][] f = {{1, 2, 3}, {}, {8, 2, 3, 1}, {1}};
    System.out.println(f.length);
    System.out.println(arrayDeepToString(f));
    System.out.println(arrayDeepToString(f).replace("}, ","},\n"));

    System.out.println("------------create2DArray------------");
    System.out.println(arrayDeepToString(create2DArray(5, 4, 4)));
    System.out.println(arrayDeepToString(create2DArray(6, 4, 10)));
    System.out.println(arrayDeepToString(create2DArray(6, 2, 3)));

    System.out.println("------------create2DArrayRandomized------------");
    System.out.println(arrayDeepToString(create2DArrayRandomized(4, 10, 100)));
    */
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

  public static String arrToString(int[] arr){

  String str = "{"; //begins string with {
  for (int i = 0; i < arr.length; i++) {
    str += arr[i]; //adds all elements to string
    if (i != arr.length - 1) { //unless it's the last element,
     str += ", "; //add ", " after each element
    }
  }
  return str + "}";
}

  public static String arrayDeepToString(int[][] arr) {
    String str = "";
    for (int i = 0; i < arr.length; i++) { //goes through each array/row
      str += arrToString(arr[i]); //converts each array into a string
      if (i != arr.length - 1) {
        str += ", "; //adds ", " in between each array
      }
    }
    return str;
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][] arr = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        arr[i][j] = (int) (Math.random() * (maxValue + 1)); //randomizes elements
      }
    }
    return arr;
  }


  public static int[][] create2DArrayRandomized (int rows, int cols, int maxValue) {
    int[][] arr = new int[rows][];
    for (int i = 0; i < rows; i++) {
      int randCols = (int) (Math.random() * (cols + 1)); //random num of columns for each row
      arr[i] = new int[randCols]; //initializes new array for each row
      for (int j = 0; j < randCols; j++) {
        arr[i][j] = (int) (Math.random() * (maxValue + 1)); //randomized elements
      }
    }
    return arr;
  }
}
