import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        Double num[] = new Double [10000];
        int j;


        Double answer;
        int i;
        Scanner input = new Scanner(System.in);

        System.out.println("how many operations want");
        j=input.nextInt();
        for(i=0;i<j;i++) {

            System.out.println("Choose an operator: +, -, *, or /");
            operator = input.next().charAt(0);

            System.out.println(" number1");
            num[i] = input.nextDouble();

            System.out.println(" number2");
            num[i + 1] = input.nextDouble();


            switch (operator) {


                case '+':

                    answer = num[i] + num[i + 1];

                    System.out.println(num[i] + " + " + num[i + 1] + " = " + answer);
                    break;


                case '-':
                    answer = num[i] - num[i+1];
                    System.out.println(num[i] + " - " + num[i+1] + " = " + answer);
                    break;


                case '*':
                    answer = num[i] * num[i+1];
                    System.out.println(num[i] + " * " + num[i+1] + " = " + answer);
                    break;


                case '/':
                    answer = num[i] / num[i+1];
                    System.out.println(num[i] + " / " + num[i+1] + " = " + answer);
                    break;

                default:
                    System.out.println("Invalid operator!");
                    break;


            }

        }


        input.close();
    }
}

