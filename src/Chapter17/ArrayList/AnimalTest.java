package Chapter17.ArrayList;

import java.util.ArrayList;
import java.util.List;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람은 두발로 걷습니다");
	}

	public void readBook() {
		System.out.println("사람은 책을 읽습니다");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다");
	}

	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다");
	}

	public void flying() {
		System.out.println("독수리는 날개를 펴고 날아 다닙니다");
	}
}

public class AnimalTest {

	ArrayList<Animal> anilist = new ArrayList<Animal>();

	// addAnimal -> 업캐스팅 메소드

	private void addAnimal() {

		anilist.add(new Human());
		anilist.add(new Tiger());
		anilist.add(new Eagle());
		for (Animal a : anilist) {
			a.move();
		}
	}
	// testCasting ->다운캐스팅 메소드

	public void testCasting() {

		for (int i = 0; i < anilist.size(); i++) {
			Animal a = anilist.get(i); // 부모 ArrayList의 객체를 a객체에 저장

			if (a instanceof Human) {
				Human h = (Human) a;// 다운캐스팅
				h.readBook();
			} else if (a instanceof Tiger) {
				Tiger t = (Tiger) a;
				t.hunting();
			} else if (a instanceof Eagle) {
				Eagle e = (Eagle) a;
				e.flying();
			} else {
				System.out.println("지원되지 않는 타입입니다");
			}

		}

	}

	public static void main(String[] args) {

		AnimalTest animaltest = new AnimalTest();
		System.out.println("====업캐스팅====");
		animaltest.addAnimal();
		System.out.println("====다운캐스팅====");
		animaltest.testCasting();
	}

}
