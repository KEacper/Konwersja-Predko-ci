import java.util.*;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Wybierz rodzaj konwersji");
    System.out.println("");
    System.out.println("1) km/h -> m/s");
    System.out.println("2)  m/s -> km/h");

    int s=scan.nextInt();
     
    switch(s){
      case 1:
        System.out.println("Podaj wartość prędkości");
        double v1 = scan.nextDouble();
        double newv1 = v1 / 3.6;
        System.out.println("Twoja prędkość "+v1+"km/h wynosi "+newv1+ "m/s");
        break;

      case 2:
        System.out.println("Podaj wartość prędkości");
        double v2 = scan.nextDouble();
        double newv2 = v2 * 3.6;
        System.out.println("Twoja prędkość "+v2+"m/s wynosi "+newv2+ "km/h");
        break;
    }
  
  
  }
}