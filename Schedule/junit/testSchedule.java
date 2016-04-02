import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class testSchedule {
	
	//private List<Work> work;
	//private Work work1 =  

	@SuppressWarnings("unchecked")
	@Test
	public void test() {
		List<Work> works = new ArrayList<Work>();
		Work work1 = new Work("n1",0,3);
		Work work2 = new Work("n2",1,2);
		Work work3 = new Work("n3",2,1);
		works.add(work1);
		works.add(work2);
		works.add(work3);
		List<Double> array = new ArrayList<Double>();
		//List<Double> array2 = new ArrayList<Double>();
		
		Schedule sch = new Schedule();
		array = sch.FCFS(works);
		assertEquals((double)11/3,array.get(0),0.0);
		assertEquals((double)7/3,array.get(1),0.0);
		
		//Schedule sch2 = new Schedule();
		array = sch.SJF(works);
		assertEquals((double)10/3,array.get(0),0.0);
		assertEquals((double)5.5/3,array.get(1),0.0);
		
		
	}

}
