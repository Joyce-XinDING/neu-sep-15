
import static org.junit.Assert.assertEquals;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyMapTest {

	  @Before
	  public void setUp() throws Exception {
	  }

	  @Test
	  public void testStandardMap() {
	    // Standard Map
	    MyMap map = new MyMap();
	    map.put("Joyce", 1);
	    map.put("Joyce", 2);
	    map.put("Joyce", 1);
	    

	    for (int i = 0; i < 100; i++) {
	      map.put(String.valueOf(i), i);
	    }
	    assertEquals(map.size(), 101);

	   
	    map.keySet();
	    
	  }
		  
		  
		
	}
	 
