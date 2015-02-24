
public class Driver {
public static void main(String[] args){
	IndividualStream test = new IndividualStream(10);
	for(int i = 0; i<10; ++i)
	{
	test.startRecord();
	try{
		Thread.sleep(1000);
	}
	catch(InterruptedException ex){
		Thread.currentThread().interrupt();
	}
	test.finishRecord();
	}
}
}
