import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

public class pick3Com {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Set<Integer>> combinations = Sets.combinations(ImmutableSet.of( 1, 2, 3,4,5,6,7,8,9,0), 3);
		
		
		for (Set<Integer> comb: combinations)
		{
		//	System.out.println(comb);
			System.out.println("");
			for (Integer in: comb) {
				System.out.print(in);
				System.out.print(",");
			}
			
		}

	}

}
