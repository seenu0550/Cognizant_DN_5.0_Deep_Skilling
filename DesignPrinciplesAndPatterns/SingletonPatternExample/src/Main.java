public class Main{
    public static void main(String []args){
        Logger l1=Logger.getInstance();
        Logger l2=Logger.getInstance();
        l1.log("This is first Log");
        l2.log("This is second Log");
        if(l1==l2){
            System.out.println("Same Instance");
        }
        else{
            System.out.println("Multiple instance created");
        }
    }
}