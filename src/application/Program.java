package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat x = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat y = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat z = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		z.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date a = new Date();
		Date b = new Date(System.currentTimeMillis());
		Date c = new Date(0L);
		Date d = new Date(1000L * 60L * 60L * 5L);
		
		Date x1 = x.parse("23/06/2021");
		Date y1 = y.parse("25/06/2021 15:42:07");
		Date y3 = Date.from(Instant.parse("2021-11-27T13:39:10Z"));
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("x1: " + y1);
		System.out.println("y1: " + y1);
		System.out.println("y3: " + y3);
		System.out.println("-------------------------------------");
		System.out.println("a: " + y.format(a));
		System.out.println("b: " + y.format(b));
		System.out.println("c: " + y.format(c));
		System.out.println("d: " + y.format(d));
		System.out.println("x1: " + y.format(y1));
		System.out.println("y1: " + y.format(y1));
		System.out.println("y3: " + y.format(y3));
		System.out.println("-------------------------------------");
		System.out.println("a: " + z.format(a));
		System.out.println("b: " + z.format(b));
		System.out.println("c: " + z.format(c));
		System.out.println("d: " + z.format(d));
		System.out.println("x1: " + z.format(y1));
		System.out.println("y1: " + z.format(y1));
		System.out.println("y3: " + z.format(y3));
	}

}
