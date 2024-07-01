package demo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		Order order1 = new Order(101, new ArrayList(Arrays.asList("Fried Rice", "Pasta", "Tortilla")), true);
		Order order2 = new Order(102, new ArrayList(Arrays.asList("Pizza", "Pasta")), true);
		Order order3 = new Order(103, new ArrayList(Arrays.asList("Burger", "Sandwich", "Pizza")), false);
		System.out.println(Arrays.asList(order1, order2, order3));
	}

}
