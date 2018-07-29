package assesmentTest;

import java.time.Duration;
import java.time.Period;

public class Days {

	public static void main(String[] args) {
		String d = Duration.ofDays(1).toString();
		String p = Period.ofDays(1).toString();
		
		boolean b1 = d == p;
		boolean b2 = d.equals(p);
		System.out.println(b1 + " " + b2);
		System.out.println(d + " " + p);
	}
}

//This code prints "false false". d is "PT24H" and p is "P1D".
//Duration uses hours/minutes/seconds, and Period uses years/months/days for measures.
