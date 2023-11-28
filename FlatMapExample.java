package Java88StreamsMap;

import java.util.Arrays;
import java.util.List;

//flat map return stream of objects
//map returns single element
public class FlatMapExample {
	public static void main(String[] args) {
		
		List<Integer>lis1=Arrays.asList(1,2);
		List<Integer>lis2=Arrays.asList(3,4);
		List<Integer>lis3=Arrays.asList(5,6);
		List<List<Integer>>finallist=Arrays.asList(lis1,lis2,lis3);
		finallist.stream().flatMap(s->s.stream()).forEach(n->System.out.println(n));
		
	}

}
