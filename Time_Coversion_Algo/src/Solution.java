import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Solution {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat date = new SimpleDateFormat("HH:mm:ss a");
		SimpleDateFormat parseDate = new SimpleDateFormat("HH:mm:ss");
		
		String str = scan.nextLine();
		
		Date date1 = (Date) parseDate.parse(str);
		
		System.out.println(date.format(date1));
		
	}

}
