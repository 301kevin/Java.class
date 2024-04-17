import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exam1 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
//		System.out.println(calendar);

		// 년,월,일,시,분,초 추출 24시간제
		int yy = calendar.get(Calendar.YEAR);
		int mm = calendar.get(Calendar.MONTH) + 1;
		int dd = calendar.get(Calendar.DAY_OF_MONTH);
		int hh = calendar.get(Calendar.HOUR_OF_DAY);
		int mi = calendar.get(Calendar.MINUTE);
		int ss = calendar.get(Calendar.SECOND);

		System.out.printf("%4d년 %02d월 %02d일 %02d시 %02d분 %02d초\n", yy, mm, dd, hh, mi, ss);

		// 년, 월, 일, 시, 분, 초 추출 12시간제
		hh = calendar.get(Calendar.HOUR);
		int am_pm = calendar.get(Calendar.AM_PM);
		String[] ampm_name = { "오전", "오후" };

		System.out.printf("%4d년 %02d월 %02d일 %s %02d시 %02d분 %02d초\n", yy, mm, dd, ampm_name[am_pm], hh, mi, ss);
		System.out.println("--------------------------------");
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String result = sdf.format(date);
		
		System.out.println(date);
		System.out.println(result);
		
	}
}
