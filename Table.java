import java.util.*;
public class Table {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number you want the multiplication table of: ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+(n*i));
        }
    }
}
