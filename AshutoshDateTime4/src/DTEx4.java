import java.util.Date;
import java.text.SimpleDateFormat;

public class DTEx4 {
	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat fr=new SimpleDateFormat("MM/dd/yyyy");
		String dt=fr.format(date);
		System.out.println(dt);
		
		
	}

	

}
