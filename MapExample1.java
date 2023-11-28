package Java88StreamsMap;

import java.util.Arrays;
import java.util.List;

public class MapExample1 {
	public static void main(String[] args) {
		List<String>lis=Arrays.asList("mounka","vani","car","gsfdgsd");
		lis.stream().map(s->s.toUpperCase()).forEach(n->System.out.println(n));
	}

}
