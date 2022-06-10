import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class MainSortMap {

	public static void main(String[] args) {

		HashMap<String, String> cityList = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);



		for (int index = 1; index <= 4; index++) {
		SortMap s = new SortMap();
		System.out.println("enter city and capital");
		String city = sc.nextLine();
		String capital = sc.nextLine();



		cityList.put(city, capital);



		}
		ArrayList<String> capi = new ArrayList<String>();



		for (String key : cityList.keySet()) {
		capi.add(cityList.get(key));
		}
		Collections.sort(capi);
		for (String values : capi) {
		System.out.println(values);
		}
		}


	}


