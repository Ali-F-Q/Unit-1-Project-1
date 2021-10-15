import java.util.Scanner;
import java.lang.Math;

class Main {
  //Colours
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_GREEN = "\u001B[32m";

  public static void main(String[] args) {
    Scanner rip = new Scanner(System.in);

    //Declarations
    char Choice = 'A';
    String exit;
    int rows;
    int columns;
    int[][] table;
    //Boolean Truth Tables Conditions
    boolean[] c1 = {true, true, false, false};
    boolean[] c2 = {true, false, true, false};

    while(Choice != 'G'){

      //User Error
      if(Choice != 'A'&&Choice != 'B'&&Choice != 'C'&&Choice != 'D'&&Choice != 'E'&&Choice != 'F'&&Choice != 'G'){
        System.out.printf("%n%S%n","Please choose a valid option");
      }

      //Menu
      System.out.printf("%n%S%n   %s%n   %s%n   %s%n   %s%n   %s%n   %s%n   %s%n","Menu", "A. Addition Table", "B. Multiplication Table", "C. Boolean Logic AND Gate", "D. Boolean Logic OR Gate", "E. Modulus Table", "F. Pascal's Triangle", "G. Exit");
      char choice = rip.next().charAt(0);
      Choice = Character.toUpperCase(choice);

      switch (Choice){

// Addition Table
        case 'A':
          System.out.print("\033[H\033[2J");

          //Input for rows and columns
          System.out.print("How many rows: ");
          rows = rip.nextInt();
          System.out.print("How many columns: ");
          columns = rip.nextInt();
          table = new int[rows][columns];

          //Box
          System.out.printf("%n%s%n","Addition Table");
          System.out.print("|");
          for(int x = 0;x < (columns+1)*5-1;x++){
            System.out.print("-");
          }
          System.out.printf("%s%n%s","|","|");
    
          //Top Row of Table
          for(int y = 0;y < columns+1;y++){
            System.out.printf("%-13s%s",ANSI_BLUE + y + ANSI_RESET,"|");
          }
          System.out.printf("%n%s","|");
          for(int x = 0;x < (columns+1)*5-1;x++){
            System.out.print("-");
          }
          System.out.println("|");

          for(int i = 1;i < rows+1;i++){
            System.out.print("|");

            //First Column
            System.out.printf("%-13s%s",ANSI_BLUE + i + ANSI_RESET,"|");
            //Calculation
            for(int y = 1;y < columns+1;y++){
              table[i-1][y-1] = i + y;
              if(i==y){
                System.out.printf("%-13s%s",ANSI_RED + table[i-1][y-1] + ANSI_RESET,"|");
              }
              else{
                System.out.printf("%-4s%s",table[i-1][y-1],"|");
              }
            }

            //Box
            System.out.printf("%n%s","|");
            for(int x = 0;x < (columns+1)*5-1;x++){
              System.out.print("-");
            }
            System.out.println("|");
          }
        break;

//Multiplication Table
        case 'B':
          System.out.print("\033[H\033[2J");

          //Input for rows and columns
          System.out.print("How many rows: ");
          rows = rip.nextInt();
          System.out.print("How many columns: ");
          columns = rip.nextInt();
          table = new int[rows][columns];
    
          //Box
          System.out.println();
          System.out.println("Multiplication Table");
          System.out.print("|");
          for(int x = 0;x < columns*5-1;x++){
            System.out.print("-");
          }
          System.out.println("|");
    
          for(int i = 1;i < rows+1;i++){
            System.out.print("|");

            //Calculation
            for(int y = 1;y < columns+1;y++){
              table[i-1][y-1] = i * y;
              int sqrt = (int) Math.sqrt(table[i-1][y-1]);

              if(sqrt*sqrt == (int) table[i-1][y-1]){
                System.out.printf("%-13s%s",ANSI_RED + table[i-1][y-1] + ANSI_RESET,"|");
              }
              else if(table[i-1][y-1]/y == table[i-1][y-1]||table[i-1][y-1]/i == table[i-1][y-1]){
                System.out.printf("%-13s%s",ANSI_BLUE + table[i-1][y-1] + ANSI_RESET,"|");
              }
              else{
                System.out.printf("%-4d%s",table[i-1][y-1],"|");
              }
            }

            //Box
            System.out.println();
            System.out.print("|");
            for(int x = 0;x < columns*5-1;x++){
              System.out.print("-");
            }
            System.out.println("|");
          }
        break;

//Boolean Logic AND Gate
        case 'C':
          System.out.print("\033[H\033[2J");

          //Box
          System.out.print("|");
          for(int x=0;x<41;x++){
            System.out.print("-");
          }
          System.out.println("|");
          System.out.printf("%s%22s%s%22s%s%22s%s%n","|", ANSI_BLUE + "Condition 1" + ANSI_RESET,"|", ANSI_BLUE + "Condition 2" + ANSI_RESET,"|", ANSI_BLUE + "AND" + ANSI_RESET,"|");

          //Creating Table
          for(int i=0;i<4;i++){
            System.out.print("|");
            for(int x=0;x<41;x++){
              System.out.print("-");
            }
            System.out.println("|");
            System.out.print("|");

            //Calculations
            System.out.printf("%13s%s%13s%s%22s%s%n",c1[i],"|",c2[i],"|", ANSI_RED + (c1[i]&&c2[i]) + ANSI_RESET,"|");
          }

          //Box
          System.out.print("|");
          for(int x=0;x<41;x++){
            System.out.print("-");
          }
          System.out.println("|");
        break;

//Boolean Logic OR Gate
        case 'D':
          System.out.print("\033[H\033[2J");

          //Box
          System.out.print("|");
          for(int x=0;x<41;x++){
            System.out.print("-");
          }
          System.out.println("|");
          System.out.printf("%s%22s%s%22s%s%22s%s%n","|", ANSI_BLUE + "Condition 1" + ANSI_RESET,"|", ANSI_BLUE + "Condition 2" + ANSI_RESET,"|", ANSI_BLUE + "OR" + ANSI_RESET,"|");

          //Creating Table
          for(int i=0;i<4;i++){
            System.out.print("|");
            for(int x=0;x<41;x++){
              System.out.print("-");
            }
            System.out.println("|");
            System.out.print("|");

            //Calculations
            System.out.printf("%13s%s%13s%s%22s%s%n",c1[i],"|",c2[i],"|", ANSI_RED + (c1[i]||c2[i]) + ANSI_RESET,"|");
          }

          //Box
          System.out.print("|");
          for(int x=0;x<41;x++){
            System.out.print("-");
          }
          System.out.println("|");
        break;

//Modulus Table
        case 'E':
          System.out.print("\033[H\033[2J");

          //Input for rows and columns
          System.out.print("How many rows: ");
          rows = rip.nextInt();
          System.out.print("How many columns: ");
          columns = rip.nextInt();
          table = new int[rows][columns];

          //Box
          System.out.printf("%n%s%n","Modulus Table(Remainder After Division)");
          System.out.print("|");
          for(int x = 0;x < (columns+1)*5-1;x++){
            System.out.print("-");
          }
          System.out.printf("%s%n%s","|","|");
    
          //Top Row of Table
          for(int y = 0;y < columns+1;y++){
            System.out.printf("%-13s%s",ANSI_BLUE + y + ANSI_RESET,"|");
          }
          System.out.printf("%n%s","|");
          for(int x = 0;x < (columns+1)*5-1;x++){
            System.out.print("-");
          }
          System.out.println("|");

          for(int i = 1;i < rows+1;i++){
            System.out.print("|");

            //First Column
            System.out.printf("%-13s%s",ANSI_BLUE + i + ANSI_RESET,"|");
            //Calculation
            for(int y = 1;y < columns+1;y++){
              table[i-1][y-1] = y % i;
              if(y==i||i==1){
                System.out.printf("%-13s%s", ANSI_RED + table[i-1][y-1] + ANSI_RESET,"|");
              }
              else if(table[i-1][y-1] == y){
                System.out.printf("%-13s%s", ANSI_GREEN + table[i-1][y-1] + ANSI_RESET,"|");
              }
              else{
                System.out.printf("%-4s%s",table[i-1][y-1],"|");
              }
            }

            //Box
            System.out.printf("%n%s","|");
            for(int x = 0;x < (columns+1)*5-1;x++){
              System.out.print("-");
            }
            System.out.println("|");
          }
        break;

//Pascal's Triangle
        case 'F':
          System.out.print("\033[H\033[2J");

          //Question
          System.out.print("Number of rows: ");
          rows = rip.nextInt();

          //Declarations
          int i = 0;
          int[] pascal = new int[rows];
          for(int z = 0;z < pascal.length;z++){
            pascal[z] = 1;
          }
          int[] temp = new int[rows];
          for(int z = 0;z < temp.length;z++){
            temp[z] = 1;
          }

          //Creating Triangle
          while (i < rows){
            //Spacing
            for (int x = rows - i;x > 0;x--){
              System.out.print("   ");
            }

            //Calculations
            for(int y = 0;y <= i;y++){
              System.out.printf("%6d",pascal[y]);//%_d has to be twice the number of " "'s' in ^spacing^
              if(i > 0&&y != 0){
                pascal[y] = temp[y-1]+temp[y];
              }
            }
            System.out.println();
            for(int x = 0;x < pascal.length;x++){
              temp[x] = pascal[x];
            }
            i++;
          }
        break;
      }
    }
  }
}