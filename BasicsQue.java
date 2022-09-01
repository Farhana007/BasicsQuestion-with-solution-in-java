   
//   //  Beginners practise question and answere
 
 
//  import java.util.*;


// public class BasicsQue{
//   public static void main(String args[]){


//    Scanner sc = new Scanner(System.in);


//      /*SUM OF A AND B FROM USER

//       int a = sc.nextInt();
//       int b = sc.nextInt();

//       int sum = a+b;

//       int product = a*b;

//       int division = a/b;

//       System.out.println(sum);

//       System.out.println(product);

//       System.out.println(division);*/


//       /*Area of a circle 

//       float r = 24.55f;
//       double area = (3.14*r*r);

//       System.out.print(area);*/ 



//       /*  Average of  3 numbers


//       int a = 13;
//       int b = 32;
//       float c = 21.3f;

//       float av = (a+b+c)/3f;


//       System.out.println(av);*/


//       /*  take output from user and calculate prize of pen, note & pencil with 18% gst


//       int pen = sc.nextInt();
//       int pencil = sc.nextInt();
//       float note = sc.nextFloat();

//       double sum = pen+pencil+note;
//       double gst = sum*18/100;

//       System.out.println(sum+gst);*/


//     /*  ifelse;Print the largest of 2 number

//     int a = 7;
//     int b = 4;

//     if(a>b){
//       System.out.println("a ");
//     }
//     else{
//       System.out.print("b");
//     }*/


//     // print if the number is odd or even


//       // int number = sc.nextInt();

//       // if(number%2==0){
//       //   System.out.print("Given number is even");
//       // }
//       // else{
//       //   System.out.print("Given number is Odd");
//       // }

//     //  Income tax calculator

//     // int income = sc.nextInt();

//     // int tax; 

//     // if(income<=50000){
//     //   tax = 0;
//     // }
//     // else if( income>=50000 && income<100000){

//     //   tax = (int) (0.2*income);
//     // }
//     // else{
//     //   tax = (int) (0.3*income);
//     // }

//     // System.out.print("your tax is:" + tax);


//     // find the greatest of 3 number


//     // int a = 6;
//     // int b = 9;
//     // int c = 65;

//     // if (a>b && a>c){
//     //   System.out.println("a ia the greatest");
//     // }
//     // else if(b>c){
//     //   System.out.println("b is the gratest");
//     // }
//     // else{
//     //   System.out.println("c is the gretest");
//     // }




//     // check if a student will pass or fail using ternery operator

//     // int marks = sc.nextInt();

//     // String result = (marks >= 33)?"Pass":"Fail";
//     // System.out.print(result);


//     // calculator using switch


//     // int a = sc.nextInt();
//     // int b = sc.nextInt();

//     // char operator = sc.next().charAt(0);

//     // switch(operator){
//     //   case '+' : System.out.println(a+b);
//     //   break;
//     //   case '-' : System.out.println(a-b);
//     //   break;
//     //   case '*' : System.out.println(a*b);
//     //   break;
//     //   case '/' : System.out.println(a/b);
//     //   break;
//     //   case '%' : System.out.println(a%b);
//     //   break;

//     //   default : System.out.println("error");
//     // }


   
//   //  check whether the year is a leap year or not


//   // int year = sc.nextInt();

//   // if( ( year % 4 == 0 && year%100 != 0) || year % 400 ==0 ){
//   //   System.out.println("year is a leap year");
//   // }
//   // else{
//   //   System.out.println("year is not a leap year");
//   // }




//     //  print number from 1- 10 using while,for,do while loop

//     //   int i = 0;
//     // while (i <=10){
//     //   System.out.print( i + "");
//     //   i++;
//     // }

//     // for(int i = 1; i <=10; i++){
//     //   System.out.print(i);
//     // }

//     // String convo = sc.nextLine();

//     // switch (convo) {
//     //  case "hi": System.out.println("HEllo");
//     //           break;

//     // case "i need some help": System.out.println("tell me how can i help you");
//     //           break;
//     // case "do you have a pen": System.out.println("yes we do ");
//     //           break;
//     //  default: System.out.println("welcome");
//     //           break;
//     // }



//     // int i = 1;

    
      
//     // do{
//     //   System.out.println(i);
//     //   i++;
//     // }while(i<=10);


    
//     // Sum of first N natural number(take n from user)


//     // int n = sc.nextInt();
//     // int i = 1;
//     // int sum = 0;

//     // while(i<=n){
//     //   sum += i;
//     //   i++;
//     // }
//     // System.out.println(sum);


//     // print A Square Pattern in FOR Loop;

//     // for(int line = 1; line<=4;line++){
//     //   System.out.println("****");
//     // }


//     // Print reverse of a Number

//         // int n = 1087769;

//         // while(n>0){
//         //   int lastDigit = n % 10;
//         //   System.out.print(lastDigit + "");

//         //   n = n/10;
//         // }


        
//         // another way of reverse the given number

//         // int n = 10899;
//         // int rev = 0;

//         // while(n>0){
//         //   int lastDigit = n % 10;
//         //   rev = (rev*10)+lastDigit;
//         //   n = n/10;
//         // }
//         // System.out.println(rev);



//         // Question on Break:Keep showing numbers until users enter multiple of 10;;

//         // while(true){
//         //   System.out.println("enter your number");
//         //   int n = sc.nextInt();
//         //   if(n%10==0){
//         //     break;
//         //   }
//         //   System.out.println(n);
//         // }

        


//         // Question related to Continue keywords: display all the number but skip the number multiple of 10;

             
//         // while(true){
//         //   System.out.println("enter your number");
//         //   int n = sc.nextInt();

//         //   if(n % 10==0){
//         //     continue;
//         //   }
//         //   System.out.println(n);
//         // }


    

//         // check whether a number is prime or not


//         // int n = sc.nextInt();

//         // boolean isPrime = true;

//         // for(int i = 2; i<= n-1 ; i++){
//         //    if(n % i ==0){

//         //    isPrime = false;
//               //  break
//         //    }
          
//         // }

//         // if(isPrime == true){
//         //   System.out.println("N IS A PRIME NUMBER");
//         // }
//         // else{
//         //   System.out.println("Not Prime ");
//         // }

      







//   }
// }