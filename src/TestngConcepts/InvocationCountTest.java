package TestngConcepts;

import org.testng.annotations.Test;

public class InvocationCountTest {



		
		@Test(invocationCount=10)
		//Invocation count - will execute 10 times
		public void reverseString(){
			String p = "Java";
				String Rev= "";
			for(int i =p.length()-1;i>=0;i--){
				Rev = Rev+ " "+p.charAt(i);
				
			}
			System.out.println("Reversed: "+Rev);
		}
	@Test (invocationCount=5)
	public void reversewithStringbuffer(){
		String l ="Pokemon";
		StringBuffer obj= new StringBuffer(l);
			System.out.println("Reversing"+obj.reverse());
	}
	

}
