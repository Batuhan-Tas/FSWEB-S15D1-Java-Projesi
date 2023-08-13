package com.workintech.grocery.model;

import java.util.*;

public class ShoppingCart {




    public static void addItems(List<String> groceryList, String addInput){
        if(addInput.contains(",")){
            String[] elements = addInput.split(",");
            for(String element:elements){
                if(element != null && !element.isEmpty()){
                    if(!checkItemsInList(groceryList,element)){
                        groceryList.add(element.trim());

                    }
                }
            }
        } else{
            if(addInput != null && !addInput.isEmpty()){
                groceryList.add(addInput);

            }
        }
        printSorted(groceryList);
    }


    public static void removeItems(List<String> groceryList, String removeInput){
        if(removeInput.contains(",")){
            String[] elements = removeInput.split(",");
            for(String element:elements){
                if(element != null && !element.isEmpty()){
                    if(!checkItemsInList(groceryList,element)){
                        groceryList.remove(element.trim());

                    }
                }
            }
        } else{
            if(removeInput != null && !removeInput.isEmpty()){
                groceryList.remove(removeInput);

            }
        }
        printSorted(groceryList);
    }

    public static boolean checkItemsInList(List<String> products, String product){
        return products.contains(product.trim());
    }

    public static void printSorted(List<String> products){
        Collections.sort(products);
        System.out.println(products);
        for(String product:products){
            System.out.println(product);
        }
    }
}
