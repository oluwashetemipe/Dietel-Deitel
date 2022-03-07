package Chap3;

public class InvoiceTest {
    public static void main(String... args){
        Invoice invoice = new Invoice("09867","drugs", 5, 600);
        Invoice invoice1 = new Invoice("7864", "antibiotics",2,200);

        //get all 4 instances
        System.out.printf("Invoice number: %s%n",invoice.getPartNumber());
        System.out.printf("Description: %s%n",invoice.getDescription());
        System.out.printf("Number of items purchased: %d%n",invoice.getNumberOfItemPurchased());
        System.out.printf("Price per item: %.1f%n",invoice.getPricePerItem());
        //Invoice amount
        System.out.printf("Total amount %.1f%n",invoice.getInvoiceAmount());

        System.out.printf("\nInvoice number: %s%n",invoice1.getPartNumber());
        System.out.printf("Description: %s%n",invoice1.getDescription());
        System.out.printf("Number of items purchased: %d%n",invoice1.getNumberOfItemPurchased());
        System.out.printf("Price per item: %.1f%n",invoice1.getPricePerItem());
        //Invoice amount
        System.out.printf("Total amount %.1f%n",invoice1.getInvoiceAmount());

        //setting capabilities
        invoice.setPricePerItem(-9);
        System.out.printf("\n%.1f",invoice.getPricePerItem());
        invoice.setNumberOfItemPurchased(-2);
        System.out.printf("\n%d",invoice.getNumberOfItemPurchased());
    }
}
