
public class Smaple implements Fun1, Fun2 {

	@Override
	public void print() {
		
		System.out.println("Sample print");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Fun1.super.show();
		System.out.println("Sample");
	}

	
}
