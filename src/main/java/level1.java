import java.util.Scanner;

public class level1 {
    public static Scanner reader = new Scanner(System.in);

    public static void exe2B(Node <Integer> head) {
        if (head == null){
            return;
        }
        exe2B(head.getNext());
        System.out.println(head.getValue());
    }
    
    public static void exe4(Node <Integer> head) {
        if (head == null)
        {
            return;
        }
        if (head.getValue() != null)
        {
            int value = head.getValue();
            if (value % 2 == 0) {
                System.out.println(value);
            }
        }
        exe4(head.getNext());
    }


    public static Node<Integer> exe3() {
        //dummy node:
        Node<Integer> list = new Node<Integer>(null);
        Node<Integer> p = list;
        System.out.println("Enter number or -1 to end:");
        int num = reader.nextInt();
        Node<Integer> x;
        while (num != -1) {
            x = new Node<Integer>(num);
            p.setNext(x);
            p = x;
            System.out.println("Enter number or -1 to end:");
            num = reader.nextInt();
        }
        return list.getNext();
    }

    public static boolean exe5B(Node <Integer> head, Object target) {
        if (head == null) {
            return false;
        }
        if (head.getValue().equals(target))
        {
            return true;
        }
        return exe5B(head.getNext(), target);
    }

    public static Node<Integer> exe1(int []a)
    {
        Node<Integer>p=new Node<Integer>(a[0]);
        Node<Integer> first=p;
        Node<Integer>x;
        for(int i=1; i<a.length; i++)
        {
            x=new Node<Integer>(a[i]);
            p.setNext(x);
            p=x;
        }
        return first;
    }

    public static void exe2A(Node<Integer>x)
    {
        while(x!=null)
        {
            System.out.println(x.getValue());
            x=x.getNext();
        }
    }

    public static void exe2C(Node<Integer>x)
    {
        if(x==null)
        {
            return;
        }
        exe2B(x.getNext());
        System.out.println(x.getValue());
    }
    public static boolean exe5A(Node <Integer>p,int x)
    {
        while(p!=null)
        {
            if(p.getValue()==x)
            {
                return true;
            }
            p=p.getNext();
        }
        return false;
    }
    public static void main(String[] args) {

        // Test exe1: Create a linked list from an array
        int[] array = {10, 15, 20, 25, 30};
        Node<Integer> listFromArray = level1.exe1(array);
        System.out.println("List created from array (exe1):");
        level1.exe2A(listFromArray); // Iteratively print the list

        // Test exe2B: Print list from end to start (recursively)
        System.out.println("\nList from end to start (exe2B):");
        level1.exe2B(listFromArray);

        // Test exe2A: Iteratively print the list
        System.out.println("\nIterative print (exe2A):");
        level1.exe2A(listFromArray);

        // Test exe4: Print even numbers in the list
        System.out.println("\nEven numbers in the list (exe4):");
        level1.exe4(listFromArray);

        // Test exe3: Create a list by user input
        System.out.println("\nEnter values to create a list (exe3):");
        Node<Integer> userInputList = level1.exe3();
        System.out.println("List created from user input:");
        level1.exe2A(userInputList);

        // Test exe5B: Recursively check if a value exists in the list
        System.out.println("\nEnter a number to check if it's in the list (exe5B):");
        int target = reader.nextInt();
        boolean foundRecursive = level1.exe5B(listFromArray, target);
        System.out.println("Is the number in the list? " + foundRecursive);

        // Test exe5A: Iteratively check if a value exists in the list
        System.out.println("\nEnter a number to check if it's in the list (exe5A):");
        target = reader.nextInt();
        boolean foundIterative = level1.exe5A(listFromArray, target);
        System.out.println("Is the number in the list? " + foundIterative);

    }
}





