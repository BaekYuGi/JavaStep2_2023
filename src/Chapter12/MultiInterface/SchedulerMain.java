package Chapter12.MultiInterface;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("R of r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");
			char a = s.next().charAt(0);
			//int b = System.in.read(); 입력받은 문자를 아스키코드값으로 변경
			//문자를 아스키코드로 형변환
			
			Scheduler scheduler = null;
			
			//객체 생성
			if(a=='R'||a=='r') {
				scheduler= new RoundRobin();
			}else if(a=='L'||a=='l') {
				scheduler = new LeastJob();
			}else if(a=='P'||a=='p') {
				scheduler = new PriorityAllocation();
			}else if(a=='S'||a=='s') {
				System.out.println("업무를 종료합니다");
				break;
			}else {
				System.out.println("다시 입력해주세요");
				continue;
			}
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
			
		}
		
	}

}
