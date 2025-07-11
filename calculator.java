 import java.util.Scanner;

 class Calculator {
    public static void main(String args[]){

    double num1,num2,result;
    char operator;
    Scanner S=new Scanner(System.in);

System.out.println("enter your number1");
 num1=S.nextInt();
System.out.println(" select your calculation operator:+, -,*,/,%,");
operator=S.next().charAt(0);
System.out.println("enter calculator number");
 num2=S.nextInt();

System.out.println("now operation will be happen");
    switch(operator){
        case '+':
        result=num1+num2;
        System.out.println("addition"+result);
        break;
        case '-':
        result=num1-num2;
        System.out.println("substraction :"+result);
        break;
        case '*':
        result=num1*num2;
        System.out.println("multiplication:"+result);
        break;
        case '/':
        result=num1/num2;
        System.out.println("division :"+result);
        break;
        case '%':
        result=num1%num2;
        System.out.println("modulus :"+result);
        break;
        case '^':
        result =num1/num2*100;
        System.out.println("power:"+result);
      //  else
        //System.out.println("0 cannot disivisible");

    }
}
}
