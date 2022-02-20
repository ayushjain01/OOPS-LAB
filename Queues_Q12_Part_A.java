import java.util.*;

public class Queues_Q12_Part_A {

    public static void enqueue(ArrayList<String> queue,String str){
        queue.add(queue.size(),str);
    }
    public static String dequeue(ArrayList<String> queue) {

        if (queue.isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        else {
            return queue.remove(0);
        }
    }

    public static void display(ArrayList<String> queue){
        if(queue.isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("The Strings in the Queue are:");
        for(int i=0;i<queue.size();i++){
            System.out.print(queue.get(i)+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> queue = new ArrayList<String>();
        while(true){
            System.out.println("""
                    Menu -
                    1. Enqueue
                    2. Dequeue
                    3. Display
                    4. Exit
                    """);
            System.out.println("Enter your choice:\t");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the string to enqueue :");
                    String item = sc.next();
                    enqueue(queue,item);
                    break;
                case 2:
                    item = dequeue(queue);
                    if (item != null)
                    {
                        System.out.println("Dequeued String : "+item);
                    }
                    break;

                case 3:
                    display(queue);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

