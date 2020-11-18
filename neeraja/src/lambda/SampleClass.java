package lambda;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleInterface sample = new SampleInterface() {
			@Override
			public void hello() {
				System.out.println("sample interface");
			}
			
			
		};
		sample.hello();
		//using lambda
		SampleInterface lambda = ()->{
			System.out.println("using lamba");
		};
		lambda.hello();

	}

}
