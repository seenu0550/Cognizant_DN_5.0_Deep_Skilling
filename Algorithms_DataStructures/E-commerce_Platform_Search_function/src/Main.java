
public class Main {

    public static void main(String[] args){
        Product[] products={
            new Product(1,"Biscuit","Snacks"),
            new Product(2,"Milk","Liquid"),
            new Product(3,"Idly","Break Fast"),
            new Product(4,"Biryani","Rice"),
            new Product(5,"Chocolate","Dessert")
        };
        System.out.println("Linear serach: ");
        Product result1=SearchFunctions.linearSearch(products, "Dessert");
        if(result1!=null){
            result1.displayProduct();
        }else{
            System.out.println("Not found");
        }

        System.out.println("Binary Search: ");

        Product result2=SearchFunctions.binarySearch(products, "Snacks");
        if(result2!=null){
            result2.displayProduct();
        }else{
            System.out.println("Not found");
        }

    }
}