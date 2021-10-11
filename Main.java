import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner rip = new Scanner(System.in);

    //Menu
    System.out.printf("%S%n   %s%n   %s%n   %s%n   %s%n   %s%n   %s%n","Choose what you would like to see", "A. Addition Table(0-110)", "B. Multiplication Table(1-12)", "C. Boolean Logic and Gate", "D. Boolean Logic or Gate", "E. Modulus Table", "F. Pascal's Triangle");
    char Choice1 = rip.next().charAt(0);

    //Addition Table
    switch (Choice1){
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
            else if(i == 1&&y == 3){
              System.out.print("  ");
            }
            else if(i < 5&&y > 8){
              System.out.print(" ");
            }
            
            
            System.out.printf(" %d",i * y);
          }
          System.out.println();
        }
      break;
    }
  }
}