package week04_day2_overriding_Car;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car message = new Message();
		Car sense = new Sense();
		Car pass = new Pass();
		Car stop = new Stop();
		
		System.out.println("오전 8시, 1층 주차장 출구앞으로");
		message.process();
		System.out.println("\n");
		pass.process();
		System.out.println("\n");
		sense.process();
		System.out.println("\n");
		stop.process();
		
		
//		Car process[] = new Car[4];
//		process[0] = new Message();
//		process[1] = new Pass();
//		process[2] = new Sense();
//		process[3] = new Stop();
//		
//		for(int i=0; i<process.length; i++) {
//		process[i]. process();

	}

}

