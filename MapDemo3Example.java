package Java88StreamsMap;

import java.util.Arrays;
import java.util.List;

public class MapDemo3Example {
	public static void main(String[] args) {
		List<Integer>lis=Arrays.asList(2,3,4,5,67,8);
		lis.stream().map(n->n*3).forEach(s->System.out.println(s));
		
	}

}
