import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Print_strings_with_executors {
    public static void main(String[] args) {
        String[]str={"Ankita","Deblina","Rakesh"};
        ExecutorService exe= Executors.newSingleThreadExecutor();
        for(String s:str){
            exe.submit(()->
            {
                System.out.println("Hello "+s+" from "+Thread.currentThread().getName());
            });
        }
        exe.shutdown();
    }
}
