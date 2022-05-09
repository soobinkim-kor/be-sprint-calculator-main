package com.codestates.seb.calculator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    System.out.println("===Java Calculator===");

    Scanner input = new Scanner(System.in);
        /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.
            2. 연산자의 종류는 +, -, *, / 입니다.
            3. 소수점 연산을 수행할 수 있어야 합니다.
            4. 연산 결과를 콘솔에 출력합니다.
        */
    // TODO...

    while(true){
      System.out.print("종료하시겠습니까? (q : 종료, 아무 키 : 계속) : ");
      String menu = input.nextLine();
      if(menu.equals("q"))
        break;

      double operand1 = 0;
      double operand2 = 0;

      try{
        System.out.print("첫 번째 인자를 입력하세요 : ");
        operand1  = Double.parseDouble(input.nextLine());
      }catch(Exception e){
        System.out.println("잘못된 입력입니다. 수를 입력해 주세요");
        continue;
      }

      System.out.print("연산자를 입력하세요 : ");
      String operator = input.nextLine();

      try{
        System.out.print("두 번째 인자를 입력하세요 : ");
        operand2 = Double.parseDouble(input.nextLine());
      }catch(Exception e){
        System.out.println("잘못된 입력입니다. 수를 입력해 주세요");
        continue;
      }

      double result;
      switch(operator){
        case "+":
          result = operand1 + operand2;
          System.out.println("연산결과 : " + result);
          break;
        case "-":
          result = operand1 - operand2;
          System.out.println("연산결과 : " + result);
          break;
        case "*":
          result = operand1 * operand2;
          System.out.println("연산결과 : " + result);
          break;
        case "/":
          result = operand1 / operand2;
          System.out.println("연산결과 : " + result);
          break;
        default:
          System.out.print("잘못된 입력입니다. 연산자(+, -. *, /)");
      }
      System.out.println();

    }
    System.out.println("계산기를 종료합니다.");
  }
}
