package assignmenttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import assignment.biggestelem;

public class testlargestTest {
	biggestelem big;
@Before
public void t()
{ big= new biggestelem();

	System.out.println("hi");
}
	@Test
	public void test() {
	//	biggestelem big= new biggestelem();
		
		int arr[]={10,67,54,76,100,86,56};;
		int result=big.Search(arr);
		assertEquals(100,result);
		
	}
	@Test
	public void test2() {
	//	biggestelem big= new biggestelem();
		
		int arr[]={10,67,-54,-76,-100,-86,56};
		int result=big.Search(arr);
		assertEquals(67,result);
	}
	@Test
	public void test1() {
	//	biggestelem big= new biggestelem();
		
		int arr[]={-10,-67,-54,-76,-100,-86,-56};
		int result=big.Search(arr);
		assertEquals(-10,result);
	}
	
	@Test
	public void test3() {
	//	biggestelem big= new biggestelem();
		
		int arr[]={8};
		int result=big.Search(arr);
		assertEquals(8,result);
	}
	@After
	public void test4()
	{
		System.out.println("bye");
	}
	}

