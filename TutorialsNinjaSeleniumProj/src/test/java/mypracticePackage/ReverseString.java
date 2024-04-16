package mypracticePackage;

public class ReverseString {

	public static void main(String[] args) {
		int cnt;
		
		
		for(int n=1;n<=20;n++) {
			
			cnt=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				cnt++;
			}
			
		}
		if(cnt==2) {
			System.out.println("prime numbers are"+n+",");
		}
		}
	}

}
