package Java88StreamsMap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinExample1 {
	public static void main(String[] args) {
		List<Integer>n1=Arrays.asList(1,2,34,6);
	Optional<Integer>s1=	n1.stream().min((n2,n3)->{
			return n2.compareTo(n3);
		});
	System.out.println(s1.get());
		
	
	
	Optional<Integer>s2=n1.stream().max((n2,n3)->{
		return n2.compareTo(n3);
	});
System.out.println(s2.get());
	
	

}
}
