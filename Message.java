package week04_day2_overriding_Car;

public class Message extends Car{
	
	
	@Override
	public void process( ) {
		System.out.println("사용자의 스마트폰이 지정된 시간과 위치로 차량을 호출합니다");
		
}
}


