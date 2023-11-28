package Java88StreamsMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class concatinateExample {
	public static void main(String[] args) {
		List<String >animallist=Arrays.asList("pig","dog","cat","lion");
		List<String>birdslist=Arrays.asList("peacock","pingvin","dgsf");
		Stream<String >s1=	animallist.stream();
		Stream<String >s2=		birdslist.stream();
		List<String >s3=	Stream.concat(s1, s2).collect(Collectors.toList());
		System.out.println(s3);
//		for(String i:s3) {
//			System.out.println(i);
		}
		
	}


