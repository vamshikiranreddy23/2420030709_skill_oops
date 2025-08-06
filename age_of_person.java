package string_builder;
import java.time.*;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class age_of_person {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		
		int Year=s.nextInt();
		int Month=s.nextInt();
		int date=s.nextInt();
		LocalDate current_date = LocalDate.now();
		LocalDate DOB=LocalDate.of(Year, Month, Month);
		Period p=Period.between(current_date, DOB);
		System.out.println(p);
		
			Period P=Period.between(current_date, DOB);
		  System.out.print("your are " +p.getYears()+"years");
		  System.out.print(p.getMonths()+"months");
		  System.out.print(p.getDays()+"days old");
	}
	

}
