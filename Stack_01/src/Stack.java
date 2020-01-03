
public class Stack {
	static final int max=3;
	int top;
	int[] arr=new int[max];
	
	Stack() {
		top=-1;
	}
	boolean isEmpty() {
		if(top<0)
			return true;
		else
			return false;
	}
	boolean push(int x)
    {
		top++;
        if (top >= max)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            arr[top] = x;
            return true;
        }
    }
	int pop() {
		if(top<0) {
			System.out.println("Underflowed");
			return 0;
		}
		else {
			int x=arr[top--];
			return x;
		}
	}

}
