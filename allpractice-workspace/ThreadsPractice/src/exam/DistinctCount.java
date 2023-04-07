package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DistinctCount {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c", "a", "c", "o", "b", "a");

//		Map<String, Long> map = list.stream()
//		    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//		Map<String, Long> duplicates = map.entrySet().stream()
//		    .filter(entry -> entry.getValue() > 1)
//		    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//
//		System.out.println(duplicates);
		
	}

}
