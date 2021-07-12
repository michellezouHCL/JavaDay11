package exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WithLambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LambdaInterface lInterface1 = (double a, double b)-> a*b;
		// System.out.println(lInterface1.product(10, 5));

		LambdaInterface lInterface2 = () -> {
			System.out.println("Here is a lambda string");
		};
		lInterface2.sayMessage();

		LambdaInterface li = ArrayList::new;

		// slider.valueProperty().addListener((ObservableValue<?extends Number>ov,
		// Number oldValue, Number newValue)->{System.out.println("The slider's new
		// value is %s%n",newValue);});

		// exercise2
		// The sum() method is available in the primitive int-value stream like
		// IntStream, not Stream<Integer>. We can use mapToInt() to convert a stream
		// integers into a IntStream.
		List<Integer> list = new ArrayList<Integer>();
		// create a stream of integers, filters the stream, then convert the stream to a
		// IntStream, then finds the sum
		int sum = list.stream().filter(value -> value % 2 != 0).mapToInt(value -> value).sum();
		// exercise3
		// create a stream of integers, filters the stream, then reduce the list by
		// finding the sum
		int sum2 = list.stream().filter(value -> value % 2 != 0).reduce(0, Integer::sum);
	}

}
