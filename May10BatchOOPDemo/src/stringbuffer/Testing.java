package stringbuffer;
class Bucket{
	private String data;
	private int counter;
	private int value;
	public Bucket() {
		
	}
	public Bucket(String data, int counter, int value) {
		super();
		this.data = data;
		this.counter = counter;
		this.value = value;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}

public class Testing {
	public static int transfer(String str,Bucket bkt) {
		int number=Integer.parseInt(str);
		bkt.setValue(number);
		return number;
	}
	public static int countChars(String str,char c,Bucket bkt) {
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) 
				count++;
		}
		bkt.setCounter(count);
		//System.out.println(bkt.getCounter());
		return count;
	}
	public static String reverse(String str) {
		StringBuffer sb=new StringBuffer(str);
		String str1=sb.reverse().toString();
		return str1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="123456";
		Bucket b=new Bucket();
		b.setData(str);
		//System.out.println(str);
		int number=Testing.transfer(str, b);
		System.out.println(number);
		Testing.countChars(str,'H',b);
		System.out.println(b.getCounter());
		String rstr=Testing.reverse(str);
		System.out.println(rstr);
		
		
	}
	

}
