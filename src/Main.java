//
//Program BirthMonth
//class BirthMonth
    //main()
        //num birthMonth =0
        //output “Enter your birth month [1 - 12]: “
        //input birthMonth
        //if(birthMonth == “1”) then
            //output “Your birth month is January“
        //elseif(birthMonth == "2")then
            //output “Your birth month is February“
        //elseif(birthMonth == "3")then
            //output “Your birth month is March“
        //elseif(birthMonth == "4")then
            //output “Your birth month is April“
        //elseif(birthMonth == "5")then
            //output “Your birth month is May“
        //elseif(birthMonth == "6")then
            //output “Your birth month is June“
        //elseif(birthMonth == "7")then
            //output “Your birth month is July“
        //elseif(birthMonth == "8")then
            //output “Your birth month is August“
        //elseif(birthMonth == "9")then
            //output “Your birth month is September“
        //elseif(birthMonth == "10")then
            //output “Your birth month is October“
        //elseif(birthMonth == "11")then
            //output “Your birth month is November“
        //elseif(birthMonth == "12")then
            //output “Your birth month is December“
        //        else
            //output "You entered an incorrect month value: ”+ birthMonth
        //endIf
    //return
//endClass

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;

        System.out.print("Enter your birth month [1-12]: ");
        birthMonth = in.nextInt();

           switch (birthMonth)
           {
                case 1:
                    System.out.println("Your birth month is: January!");
                    break;
                case 2:
                    System.out.println("Your birth month is: February!");
                    break;
                case 3:
                    System.out.println("Your birth month is: March!");
                    break;
                case 4:
                    System.out.println("Your birth month is: April!");
                    break;
                case 5:
                    System.out.println("Your birth month is: May!");
                    break;
                case 6:
                    System.out.println("Your birth month is: June!");
                    break;
                case 7:
                    System.out.println("Your birth month is: July!");
                    break;
                case 8:
                    System.out.println("Your birth month is: August!");
                    break;
                case 9:
                    System.out.println("Your birth month is: September!");
                    break;
                case 10:
                    System.out.println("Your birth month is: October!");
                    break;
                case 11:
                    System.out.println("Your birth month is: November!");
                    break;
                case 12:
                    System.out.println("Your birth month is: December!");
                    break;
                default:
                    System.out.println("You entered an incorrect month value: " + birthMonth);
                    break;
            }
    }
}