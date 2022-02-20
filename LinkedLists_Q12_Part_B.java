import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedLists_Q12_Part_B {

    public static void main(String[] args){

        LinkedList<String> ll  = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the linked list : ");
        int n = sc.nextInt();
        String item;
        for (int i = 0; i<n ;i++)
        {
            System.out.print("Enter : ");
            item = sc.next();
            ll.add(item);
        }
        System.out.println("Displaying elements with length less than 5 using an Iterator");
        Iterator<String> it = ll.iterator();
        while(it.hasNext()){
            item = it.next();
            if(item.length()<5){
                System.out.println(item);
            }
        }
    }
}
