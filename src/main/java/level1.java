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

    public static Node<Integer>exe6(int num, Node<Integer>L)
	{
		Node <Integer> p=L;
		if(p.getValue()==num)
		{
			return p.getNext();
		}
		while(p.hasNext())
		{
			if(p.getNext().getValue()==num)
			{
				p.setNext(p.getNext().getNext());
				return L;
			}
		}
		return L;
	}
	
	 public static Node<Integer> exe7(int x,Node<Integer> head) {
	        

	        if (x == 1) {
	        	return head.getNext();
	        }

	        Node<Integer> current = head;
	        for (int i = 1; current.getNext() != null && i < x - 1; i++) {
	            current = current.getNext();
	        }

	        if (current.getNext() != null) {
	            current.setNext(current.getNext().getNext());  // קישור לחוליה שאחריה
	        }

	        return head;
	    }
    
}





