import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/** 
* Sum Tester. 
* 
* @author <Authors name> 
* @since <pre>2ÔÂ 13, 2022</pre> 
* @version 1.0 
*/ 
public class SumTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sum(int x, int y) 
* 
*/ 
@Test
public void testSum() throws Exception { 
//TODO: Test goes here...
    Sum sum = new Sum();
    assertEquals(2, sum.sum(1,1));
    assertEquals(16, sum.sum(8, 9));
} 


} 
