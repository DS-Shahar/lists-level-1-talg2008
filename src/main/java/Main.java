package talg;

public class eww {
	
	public static Node<Integer> exe1random(int n,int x,int y)
	{
		Node <Integer> first=new Node <>((int)(Math.random()*(y-x+1))+x);
		Node <Integer> current=first;
		Node <Integer> next;
		for(int i=1; i<n; i++)
		{
			next=new Node <>((int)(Math.random()*(y-x+1))+x);
			current.setNext(next);
			current=next;
			
			

		}
		return first;
	}
	
	public static int exe2find(int x, Node <Integer> h)
	{
		int count=0;
		Node <Integer> current =h;
		while(current!=null)
		{
			if(current.getValue()==x)
			{
				count++;
			}
			current=current.getNext();
		}
		return count;
	}
	
	

	public static void main(String[] args) {
		Node <Integer> x=exe1random(5,1,10);
		System.out.println(x);
		System.out.println(exe2find(4,x));
		

	}

}

