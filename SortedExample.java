package Java88StreamsMap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SortedExample {// it is also possible for strings
	public static void main(String[] args) {
		List<Integer>lis=Arrays.asList(1,2,45,6,9,4,7);
		//lis.stream().sorted().forEach(s->System.out.println(s));
//		lis.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
		
//		Optional<Integer> findFirst = lis.stream().sorted().findFirst();
//		System.out.println(findFirst.get());
//		
		
		//lis.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
		Optional<Integer> highestElement = lis.stream()
		        .max(Comparator.naturalOrder());

		highestElement.ifPresent(System.out::println);
		
		
	}

}
