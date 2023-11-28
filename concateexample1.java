package Java88StreamsMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class concateexample1 {
	public static void main(String[] args) {
		List<String>lis1=Arrays.asList("mounika","vani");
		List<String>lis2=Arrays.asList("moun","vaniii");
		List<String>lis3=Arrays.asList("mouni","van");
		List<String>lis4=Arrays.asList("mounik","vanii");
		List<String>lis5=Arrays.asList("mounik","vanii","apple");
		
	Stream<String>s1=	lis1.stream();
	Stream<String>s2=lis2.stream();
	Stream<String>s3=lis3.stream();
	Stream<String>s4=lis4.stream();
List<String>s8=	Stream.concat(s1, s2).collect(Collectors.toList());

List<String>s9=	Stream.concat(s3, s4).collect(Collectors.toList());

Stream<String>s11=s8.stream();
Stream<String>s12=s9.stream();
List<String>s15=	Stream.concat(s11, s12).collect(Collectors.toList());
System.out.println(s15);




	
		
		
	}

}
