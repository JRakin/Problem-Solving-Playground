
public class BubbleSort {
	public void sorting(char[] ch) {
		char temp;
		
		for(int I=0;I<ch.length;I++) {
			for(int K=1;K<ch.length;K++) {
				if(ch[K-1]>ch[K]) {
					temp=ch[K-1];
					ch[K-1]=ch[K];
					ch[K]=temp;
				}
			}
		}
	}
}

