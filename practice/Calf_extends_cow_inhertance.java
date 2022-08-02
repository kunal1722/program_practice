package practice;


public class Calf_extends_cow_inhertance extends cow_inheriatnce {

			public void eat() {
				System.out.println("cow milk");
			}
		

		public static void main (String[] args) {
			Calf_extends_cow_inhertance c = new Calf_extends_cow_inhertance();
			c.eat();
			cow_inheriatnce b = new cow_inheriatnce();
			b.eat();
			cow_inheriatnce g = new Calf_extends_cow_inhertance();
			g.eat();

		}
		













}

