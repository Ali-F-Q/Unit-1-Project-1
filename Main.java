import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner rip = new Scanner(System.in);

    //Menu
    System.out.printf("%S%n   %s%n   %s%n   %s%n   %s%n   %s%n   %s%n","Choose what you would like to see", "A. Addition Table(0-110)", "B. Multiplication Table(1-12)", "C. Boolean Logic AND Gate", "D. Boolean Logic OR Gate", "E. Modulus Table", "F. Pascal's Triangle");
    char choice = rip.next().charAt(0);
    char Choice = Character.toUpperCase(choice);

    //Boolean Truth Tables Conditions
    boolean c1[];
    c1 = new boolean[4];
    c1[0] = true;
    c1[1] = true;
    c1[2] = false;
    c1[3] = false;
    boolean c2[];
    c2 = new boolean[4];
    c2[0] = true;
    c2[1] = false;
    c2[2] = true;
    c2[3] = false;

    int[][] multi;
    multi = new int[12][12];
    switch (Choice){
      // Addition Table
      case 'A':
        for(int i = 0;i < 101;i += 10){
          for(int y = 0;y < 11;y++){
            System.out.printf(" %4d",i + y);
          }
          System.out.println();
        }
      break;

      //Multiplication Table
      case 'B':
        for(int i = 1;i < 13;i++){
          for(int y = 1;y < 13;y++){
            int num = i * y;
            System.out.printf("%4d",num);
            multi[i-1][y-1] = num;
          }
          System.out.println();
        }
      break;

      //Boolean Logic AND Gate
      case 'C':

        System.out.println("-------------------------------------------");
        System.out.print("|");
        System.out.printf("%14s%14s%14s%n","Condition 1|", "Condition 2|", "AND|");
        //AND Table
        for(int i=0;i<4;i++){
          System.out.print("|");
          System.out.printf("%13s%s%13s%s%13s%s%n",c1[i],"|",c2[i],"|",c1[i]&&c2[i],"|");
        }
        System.out.println("-------------------------------------------");
      break;

      //Boolean Logic OR Gate
      case 'D':

        System.out.println("-------------------------------------------");
        System.out.print("|");
        System.out.printf("%14s%14s%14s%n","Condition 1|", "Condition 2|", "OR|");
        //OR Table
        for(int i=0;i<4;i++){
          System.out.print("|");
          System.out.printf("%13s%s%13s%s%13s%s%n",c1[i],"|",c2[i],"|",c1[i]||c2[i],"|");
        }
        System.out.println("-------------------------------------------");
      break;

      //Modulus Table
      case 'E':

      System.out.print("  ");
        for(int x = 1;x < 11;x++){
          System.out.printf("%4d",x);
        }
        System.out.println();
        for(int i = 1;i < 11;i++){
          System.out.printf("%2d",i);
          for(int y = 1;y < 11;y++){
            int num = y%i;
            System.out.printf("%4d",num);
          }
          System.out.println();
        }
      break;

      //Pascal's Triangle
      case 'F':

        System.out.print("Number of rows: ");
        int rows = rip.nextInt();
        int i = 0;

        while (i < rows){
          for (int x = rows - i;x > 0;x--){
            System.out.print(" ");
          }
          for(int y = 0;y <= i;y++){
            System.out.print("* ");
          }
          System.out.println();
          i++;
        }
      break;
    }
  }
}