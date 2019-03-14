public class WrapperClass{
	Integer i;
	int j;

	public static void main(String[] args){
		WrapperClass wc = new WrapperClass();
		wc.go();
	}

	public void go(){
		j = i;
		System.out.println(j);
		System.out.println(i);
	}
}