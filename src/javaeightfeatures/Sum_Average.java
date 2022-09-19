package javaeightfeatures;

import java.util.ArrayList;
import java.util.OptionalDouble;
public class Sum_Average  {
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<Integer>();
        li.add(8);
        li.add(6);
        li.add(4);
        li.add(3);
        li.add(30);
        OptionalDouble avg = li.stream().mapToInt(n->n*n).filter(n->n>100).average();
        if(avg.isPresent())
            System.out.println(avg.getAsDouble());
}
}
	


