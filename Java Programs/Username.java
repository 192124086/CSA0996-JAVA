import java.util.Scanner;
public class confirm{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		if(a.equals(b)){
			System.out.println("Both username is same");
		}
		else{
			System.out.println("Both username is not same");
		}
	}
}