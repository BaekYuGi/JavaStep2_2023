package Chapter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		DmbCellPhone dmbcellphone = new DmbCellPhone("Java폰", "검정", 10);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델 : "+ dmbcellphone.model);
		System.out.println("색상 : "+ dmbcellphone.color);
		//DmbCellPhone의 필드
		System.out.println("채널 : "+dmbcellphone.channel);
		//CellPhone의 메소드를 사용하여 전화통화 구현
		dmbcellphone.powerOn();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("여보세요");
		dmbcellphone.receiveVoice("안녕!");
		
		//DmbCellPhone의 메소드를 사용하여 채널을 바꾸기
		
		
		
	}

}
