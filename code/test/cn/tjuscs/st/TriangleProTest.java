package cn.tjuscs.st;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleProTest {
	
	@Test
	public void testMain(){
		TrianglePro.main(null);
	}

	@Test
	public void testTriangle() {
		TrianglePro.triangle(-1, 2, 3);
		TrianglePro.triangle(1, -1, 1);
		TrianglePro.triangle(1,1,-1);
		
		TrianglePro.triangle(1,2,3);
		TrianglePro.triangle(2,1,3);
		TrianglePro.triangle(3,2,1);
		
		TrianglePro.triangle(1,1,1);
		
		TrianglePro.triangle(2,2,3);
		TrianglePro.triangle(1,3,3);
		TrianglePro.triangle(2,3,2);
		
		TrianglePro.triangle(2,3,4);
		TrianglePro.triangle(3,4,5);
	}

}
