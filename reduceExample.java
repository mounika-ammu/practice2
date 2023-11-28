package Java88StreamsMap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class reduceExample {
public static void main(String[] args) {
	List<String>r=Arrays.asList("A","b","c");
Optional<String>s1=	r.stream().reduce((val,combinedval)->{
		return combinedval+val;
	});
	System.out.println(s1.get());
	
}
}
