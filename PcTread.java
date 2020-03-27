package pc;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PcTread extends Thread {

	private boolean stop;
	private int cash; // 사용금액

	public void cash(int cash) {
		this.cash = cash;
	}

	public int getCash() {
		return cash;
	}

	PcTread() {
		this.stop = false;
	}

	@Override
	public void run() {

		Calendar cal, cal2;

		long startTime;
		long lastTime;
		int useTime;

		cal = Calendar.getInstance();
		startTime = cal.getTimeInMillis();
		try {
			sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
		}
//		System.out.println("사용시작!");

		while (!stop) {
			try {
				sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		cal2 = Calendar.getInstance();
		lastTime = cal2.getTimeInMillis();

		useTime = (int) (lastTime - startTime);
		//------------------------------------ 사용시간 밀리초를 시분초로 변환
		long useTime2 = lastTime - startTime; 
		String pattern = "mm분 ss초";
		SimpleDateFormat fo = new SimpleDateFormat(pattern);
		String date = (String) fo.format(new Timestamp(useTime2));
		System.out.println("사용시간: " + date);
		//------------------------------------ 사용시간 밀리초를 시분초로 변환
//		System.out.println("사용시간 " + (useTime / 1000) + "초");
		int cash = (useTime / 1000) * 100;
//		System.out.println("요금: " + cash + "원");
		cash(cash);

	}

	public void stopCom(boolean stop) {
		this.stop = stop;
	}

}
