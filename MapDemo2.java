package Java88StreamsMap;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
	public static void main(String[] args) {
		List<String>lis=Arrays.asList("car","fhsh","hsgdhg","gsdgsdha");
		lis.stream().map(s->s.length()).forEach(s->System.out.println(s));
		
	}

}
