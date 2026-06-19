import java.util.Arrays;

public class SearchFunctions {

    public static Product linearSearch(Product[] products,String target_category) {
        for(Product p1:products){
            if(p1.category==target_category){
                return p1;
            }
        }
        return null;
    }
    

    public static Product binarySearch(Product[] products,String target_category){
        Arrays.sort(products,(p1,p2)->p1.category.compareTo(p2.category));
        int low=0,high=products.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int comp=products[mid].category.compareTo(target_category);
            if(comp==0){
                return products[mid];
            }
            else if(comp<0){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return null;

    }
    
}