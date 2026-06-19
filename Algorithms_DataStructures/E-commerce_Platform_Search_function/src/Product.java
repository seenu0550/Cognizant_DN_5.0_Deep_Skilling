public class Product{
    int productId;
    String productName;
    String category;
    Product(int productId,String productName,String category){
        this.productId=productId;
        this.productName=productName;
        this.category=category;
    }
    public void displayProduct(){
        System.out.println("Product Found:");
        System.out.println("Product Id: "+productId+" "+"Product Name: "+productName+" "+" Category: "+category);
    }
}