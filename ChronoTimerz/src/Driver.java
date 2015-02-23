
public class Driver {
public static void main(String[] args){
	TimingRecord test = new TimingRecord();
	test.start();
	try{
		Thread.sleep(10000);
	}
	catch(InterruptedException ex){
		Thread.currentThread().interrupt();
	}
	test.finish();
	System.out.println(test.toString());
}
}
