package Chap3;

public class Invoice {
    private String partNumber;
    private String description;
    private int numberOfItemPurchased;
    private double pricePerItem;

    public Invoice(String partNumber, String description,int numberOfItemPurchased, double pricePerItem) {
        this.partNumber = partNumber;
        this.description = description;
        this.numberOfItemPurchased = numberOfItemPurchased;
        this.pricePerItem = pricePerItem;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setNumberOfItemPurchased(int numberOfItemPurchased) {
        if (numberOfItemPurchased < 1){
            numberOfItemPurchased = 0;
        }
        this.numberOfItemPurchased = numberOfItemPurchased;
    }
    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 1){
            pricePerItem = 0.0;
        }
        this.pricePerItem = pricePerItem;
    }
    public String getPartNumber(){
        return partNumber;
    }
    public String getDescription(){
        return description;
    }
    public int getNumberOfItemPurchased(){
        return numberOfItemPurchased;
    }
    public double getPricePerItem(){
        return pricePerItem;
    }
    public double getInvoiceAmount(){
        return numberOfItemPurchased * pricePerItem;
    }
}
