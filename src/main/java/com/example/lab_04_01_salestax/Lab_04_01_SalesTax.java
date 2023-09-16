package com.example.lab_04_01_salestax;

public class Lab_04_01_SalesTax {

        public static void main(String[] args) {

            double purchasePrice = 100.00;
            double salesTaxRate = 0.05;
            double salesTax = purchasePrice * salesTaxRate;
            double totalPrice = purchasePrice + salesTax;

                    System.out.println("Purchase Price: $" + purchasePrice);
                    System.out.println("Sales Tax (5%): $" + salesTax);
                    System.out.println("Total Price: $" + totalPrice);
        }


}
