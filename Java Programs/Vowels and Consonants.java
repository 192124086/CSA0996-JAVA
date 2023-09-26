import java.util.Scanner;
public class vowcon{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char[] arr=st.toCharArray();
		String con= "";
         String vow="";
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
		vow+=arr[i];
	}
	else{
		con+=arr[i];
	}
}
		System.out.println("Vowels:"+vow);
		System.out.println("Consonants:"+con);
}
}
