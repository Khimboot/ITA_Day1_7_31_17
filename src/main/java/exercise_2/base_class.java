package exercise_2;

public class base_class{
	
	public static void main (String[] args) {
		classA axe = new classB();
		axe.method1();
		
	}

}
class classA {
	public void method1() {
		method2();
	
	}
	
	public void method2() {
		String text = "Ni jiao shen me mingzi?";
		System.out.println(text);
	}
}

class classB extends classA{
	@Override
	public void method2() {
	
		System.out.println("Wo de mingzi Khim :)");
	}
	
}


