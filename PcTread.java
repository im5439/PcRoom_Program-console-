package pc;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PcTread extends Thread {

	private boolean stop;
	private int cash; // ���ݾ�

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
//		System.out.println("������!");

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
		//------------------------------------ ���ð� �и��ʸ� �ú��ʷ� ��ȯ
		long useTime2 = lastTime - startTime; 
		String pattern = "mm�� ss��";
		SimpleDateFormat fo = new SimpleDateFormat(pattern);
		String date = (String) fo.format(new Timestamp(useTime2));
		System.out.println("���ð�: " + date);
		//------------------------------------ ���ð� �и��ʸ� �ú��ʷ� ��ȯ
//		System.out.println("���ð� " + (useTime / 1000) + "��");
		int cash = (useTime / 1000) * 100;
//		System.out.println("���: " + cash + "��");
		cash(cash);

	}

	public void stopCom(boolean stop) {
		this.stop = stop;
	}

}
