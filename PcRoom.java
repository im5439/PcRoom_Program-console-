package pc;

public interface PcRoom {
	
public void signUp(); // ȸ������
	
	public void userInfo(); // ȸ������ ���
	
//	public void pcInfo(); // pc����
	
	public boolean searchid(String id); // id�ߺ��˻� 
	
	public boolean signIn(String setId); // �α���
	
	public void deleteId();// ȸ��Ż��
	
	public void food(); // ���� �Ǹ�
	
	public int foodCash(); // ���İ� �հ�
	
	public void listReset(); // ���İ� list �ʱ�ȭ
	
	public boolean blockremove(String lid, String lid2);
	
	public void sound();
	
	public void soundE();
	
	public void soundER();
	
	public void logplus(String setId);
	
}
