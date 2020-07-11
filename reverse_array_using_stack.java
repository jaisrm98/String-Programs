package sorting;
import java.util.Scanner;
import java.util.Stack;
public class reverse_array_using_stack {

	public static void main(String[] args) {
		
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	n=sc.nextInt();
	System.out.println("enter values of array");
	int arr[]=new int [n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	System.out.println("before reverse");
	for(int i=0;i<n;i++) {

	System.out.print(arr[i]+" ");
	}
	System.out.println();
	

	Stack<Integer> st=new Stack<Integer>();
	for(int i=0;i<n;i++) {
	st.push(arr[i]);
	}
	System.out.println("after reverse");
	while(!st.isEmpty())
	{
		for(int i=0;i<n;i++) {
		arr[i]=st.pop();
		System.out.print(arr[i]+" ");
		}
	
	
	}
	
	}

}
