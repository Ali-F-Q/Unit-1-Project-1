import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner rip = new Scanner(System.in);

    //Menu
    System.out.printf("%S%n   %s%n   %s%n   %s%n   %s%n   %s%n   %s%n","Choose what you would like to see", "A. Addition Table(0-110)", "B. Multiplication Table(1-12)", "C. Boolean Logic AND Gate", "D. Boolean Logic OR Gate", "E. Modulus Table", "F. Pascal's Triangle");
    char choice = rip.next().charAt(0);
    char Choice = Character.toUpperCase(choice);

    int[][] multi;
    multi = new int[12][12];
    switch (Choice){
      // Addition Table
      case 'A':
        for(int i = 0;i < 101;i += 10){
          for(int y = 0;y < 11;y++){

            //Formatting
            if(y < 10&&i < 10){
              System.out.print(" ");
            }
            else if(i < 90){
              System.out.print(" ");
            }
            else if(y < 10&&i == 90){
              System.out.print(" ");
            }

            System.out.printf(" %d",i + y);
          }
          System.out.println();
        }
      break;

      //Multiplication Table
      case 'B':
        for(int i = 1;i < 13;i++){
          for(int y = 1;y < 13;y++){

            //Formatting
            if(i < 12&&i > 9&&y == 9){
              System.out.print(" ");
            }
            else if(i < 10&&i > 4&&y < 2){
              System.out.print(" ");
            }
            else if(i < 9&&i > 4&&y > 8){
              System.out.print(" ");
            }
            else if(i == 9&&y < 12&&y > 8){
              System.out.print(" ");
            }
            else if(i < 5&&y < 3){
              System.out.print(" ");
            }
            else if(i < 4&&y < 4){
              System.out.print(" ");
            }
            else if(i < 3&&y < 5){
              System.out.print(" ");
            }
            else if(i < 2&&y < 10){
              System.out.print(" ");
            }
            else if(i == 1&&y == 3){//Does not work
              System.out.print("  ");
            }
            else if(i < 5&&y > 8){
              System.out.print(" ");
            }
            
            int num = i * y;
            System.out.printf(" %d",num);
            multi[i-1][y-1] = num;//2D array doesn't work
          }
          System.out.println();
        }
      break;

      //Boolean Logic AND Gate
      case 'C':
      System.out.println("-------------------------------------------");
      System.out.print("|");
      System.out.printf("%14s%14s%14s%n","Condition 1|", "Condition 2|", "AND|");
      //true OR true = true
      System.out.print("|");
      System.out.printf("%14s%14s","true|", "true|");
      System.out.printf("%13s%s%n",true||true, "|");
      //true OR false = true
      System.out.print("|");
      System.out.printf("%14s%14s","true|", "false|");
      System.out.printf("%13s%s%n",true||false, "|");
      //false OR true = true
      System.out.print("|");
      System.out.printf("%14s%14s","false|", "true|");
      System.out.printf("%13s%s%n",false||true, "|");
      //false OR false = false
      System.out.print("|");
      System.out.printf("%14s%14s","false|", "false|");
      System.out.printf("%13s%s%n",false||false, "|");
      System.out.println("-------------------------------------------");
      break;
      //Boolean Logic OR Gate
      case 'D':
      boolean[] c1 = {true,true,false,false};
      boolean[] c2 = {true,false,true,false};

      System.out.println("-------------------------------------------");
      System.out.print("|");
      System.out.printf("%14s%14s%14s%n","Condition 1|", "Condition 2|", "AND|");
      //true AND true = true
      System.out.print("|");
      System.out.printf("%14s%14s","true|", "true|");
      System.out.printf("%13s%s%n",true&&true, "|");
      //true AND false = false
      System.out.print("|");
      System.out.printf("%14s%14s","true|", "false|");
      System.out.printf("%13s%s%n",true&&false, "|");
      //false AND true = false
      System.out.print("|");
      System.out.printf("%14s%14s","false|", "true|");
      System.out.printf("%13s%s%n",false&&true, "|");
      //false AND false = false
      System.out.print("|");
      System.out.printf("%14s%14s","false|", "false|");
      System.out.printf("%13s%s%n",false&&false, "|");
      System.out.println("-------------------------------------------");
      break;
      case 'E':
      break;
      case 'F':
      break;
    }
  }
}