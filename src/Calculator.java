import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int operand1 = 100, operand2 = 20;

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть арифметичний знак: ");
        String sign = in.next();

        switch(sign){
            case"+":{
             int result1 = operand1+operand2;
             System.out.println(result1);
             break;
            }
            case"-":{
                int result2 = operand1-operand2;
                System.out.println(result2);
                break;}

            case"*":{
                int result3 = operand1*operand2;
                System.out.println(result3);
                break;}
            case"/":{
                double result4 = operand1/operand2;
                if(operand2 == 0){
                    System.out.println("Операція неможлива");
                }
                else {
                    System.out.println(result4);
                    break;
                }

            }
            case"%":{
                double result5 = operand1%operand2;
                System.out.println(result5);
                break;
                }
                default:{
                    System.out.println("Ви ввели неправилний знак, введіть +,-,*,/ або % : ");


                }

            }
        }


    }