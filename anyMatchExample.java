package Java88StreamsMap;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

//anymatch()
//allmatch()
//nonematch()
public class anyMatchExample {
	public static void main(String[] args) {
		Set<String>fruits=new HashSet<String>();
		fruits.add("one apple");
		fruits.add("one mango");
		fruits.add("two apples");
		fruits.add("more apple");
		fruits.add("two guva");
	//anymatch	
//	boolean result=	fruits.stream().anyMatch(value->{ return value.startsWith("one");});
//	System.out.println(result);
	//allmatch
//		boolean result=	fruits.stream().allMatch(value->{ return value.startsWith("one");});
//		System.out.println(result);
		//nonematch
//		boolean result=	fruits.stream().noneMatch(value->{ return value.startsWith("one");});
//		System.out.println(result);
		
		//findany
//	Optional<String>s1=	fruits.stream().findAny();
//	System.out.println(s1.get());
		
//	findfirst
		Optional<String>s1=	fruits.stream().findFirst();
		System.out.println(s1.get());
			
		
	}

}
