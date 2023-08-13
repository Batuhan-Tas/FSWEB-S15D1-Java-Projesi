package com.workintech.grocery.main;
import com.workintech.grocery.model.MobilePhone;
import com.workintech.grocery.model.ShoppingCart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<String> sentList = new ArrayList<String>();
        checkInput(sentList);

        System.out.println("----------------------------------------------");

        MobilePhone phone = new MobilePhone("505525");

        }



    private static String getInput(){
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();
    }

    public static void checkInput(List<String> groceryList){

        Scanner keyboard = new Scanner(System.in);
        while(true) {
            System.out.println("Yapmak istediğiniz işlemi belirtiniz.");
            int userInput = keyboard.nextInt();
            if (userInput < 0 || userInput > 2) {
                System.out.println("Yanlış bir işlem yaptınız.");
            }


            switch (userInput) {
                case 0:
                    System.out.println("Uygulama sonlandırıldı.");
                    System.exit(0);
                    break;

                case 1:
                    System.out.println("Eklenmesini istediginiz elemanları giriniz.");
                    String addInput = getInput();
                    ShoppingCart.addItems(groceryList, addInput);


                    break;
                case 2:
                    System.out.println("Cıkarılmasını istediginiz elemanları giriniz.");
                    String removeInput = getInput();
                    ShoppingCart.removeItems(groceryList, removeInput);

                    break;


            }
        }


    }
}


