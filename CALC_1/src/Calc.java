public class Calc {

    double numberA;
    double numberB;

  static void calc (double numeA, double numB, char operation) {
      double result = 0.0;

      if (operation == '+') {
          result = numeA + numB;
      } else if (operation == '-') {
          result = numeA - numB;
      } else if (operation == '*') {
          result = numeA * numB;
      } else if (operation == '/') {
          result = numeA / numB;
      } else {
          System.out.println("Указан недопустимый тип омерации");
      }

      System.out.println("Результат = " + result);
  }
  public static void main(String[] args) {
          calc(7.2, 5.5, '+');
  }
}

