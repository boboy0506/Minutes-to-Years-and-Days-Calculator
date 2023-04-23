public class Main {

  static void printYearsAndDays(long minutes) {
    if (minutes < 1) {
      System.out.println("Invalid");
    } else {
      long XX = minutes;
      long YY = XX / 525600;
      long days = XX % 525600;
      long ZZ = days / 1440;
      System.out.println(XX + " min = " + YY + " y and " + ZZ + " d");
    }
  }

  public static void main(String[] args) {
    printYearsAndDays(1);
  }
}
