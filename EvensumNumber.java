package player;
import java.util.Scanner;
public class EvensumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("Enter the ArrayElement");
Scanner s=new Scanner(System.in);
int sum=0;
int []a=new int [10];
for(int i=0;i<10;i++){
	a[i]=s.nextInt();
	if(a[i]%2==0){
		System.out.println(a[i]);
	sum=sum+a[i];
	}
	//System.out.println(sum);
}
System.out.println(sum);
	}

}
