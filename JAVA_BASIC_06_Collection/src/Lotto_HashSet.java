import java.util.Set;
import java.util.TreeSet;

public class Lotto_HashSet {

	public static void main(String[] args) {
		Set<Integer> lotto = new TreeSet<>();
		for (int i = 0; lotto.size() < 6; i++) {
			int num = (int)(Math.random()*45+1);
			lotto.add(num);
			System.out.println("num : " + num);
		}
		System.out.println(lotto.toString());
		
	}

}
