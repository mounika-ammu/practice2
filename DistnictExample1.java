package Java88StreamsMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class DistnictExample1 {
	public static void main(String[] args) {
		List<String>lis=Arrays.asList("car","bike","honda","lorry","car","bus");
		lis.stream().distinct().forEach(s->System.out.println(s));
		long count1=lis.stream().count();
		System.out.println(count1);
		List<String>lis2 =lis.stream().limit(3).collect(Collectors.toList());
		System.out.println(lis2);
		
	}

}
