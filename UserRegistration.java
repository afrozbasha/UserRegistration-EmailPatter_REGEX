package com.UserRegistration;

import java.util.Scanner;
import java.util.regex.*;


public class UserRegistration {
    Scanner sc = new Scanner(System.in);
    public void firstNameCheck(){
        System.out.print("Enter First Name of User: " );
        String  fName = sc.next();
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", fName);
        if (check)
            System.out.println("Perfect! First #Name");
        else
            System.out.println("Please Enter a Valid First name with Only \"One Starting Capital\" latter");
    }

    public void lastNameCheck(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last Name of User: " );
        String  lName = sc.next();
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", lName);
        if (check)
            System.out.println("Perfect! Last #Name");
        else
            System.out.println("Please Enter a Valid Last Name with Only \"One Starting Capital\" latter");
    }

    public void email(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Email of User: " );
        String  eMail = sc.next();
        boolean check = Pattern.matches("^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*", eMail);
        if (check)
            System.out.println("Perfect! #Email!");
        else
            System.out.println("Please Enter a Valid Email with Only \"example.abc@bl.co.in\" latter");
    }


    public void mobileNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mobile number with country code (91)  : " );
        String mobileNum = sc.nextLine();
        boolean check = Pattern.matches("^91\\s[6789][0-9]{9}", mobileNum);
        if (check)
            System.out.println("Perfect! Mobile #Num");
        else
            System.out.println("Please Enter a Valid Mobile Num ex:- 90 9533182605");
    }

    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserRegistration user = new UserRegistration();

        System.out.println("Welcome to User Registration Program");

        user.firstNameCheck();
        user.lastNameCheck();
        user.email();
        user.mobileNum();
        

    }
}
