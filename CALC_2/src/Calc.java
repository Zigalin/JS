public class Calc {

    double numberA;
    double numberB;

     static void calc (double numeA, double numB, char operation){
        double result = 0.0;

        switch (operation){
            case ('+'):
             result = numeA + numB;
             break;
            case ('-'):
             result = numeA - numB;
             break;
            case ('*'):
             result = numeA * numB;
             break;
            case ('/'):
             result = numeA / numB;
             break;
            default:
             System.out.println("Недопустимый тип операции");
             break;
        }

            System.out.println("Сумма чисел = " + result);

     }
        public static void main(String[] args){
            calc(8, 5, '+');

        }
}

