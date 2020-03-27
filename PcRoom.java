package pc;

public interface PcRoom {
	
public void signUp(); // 회원가입
	
	public void userInfo(); // 회원정보 출력
	
//	public void pcInfo(); // pc정보
	
	public boolean searchid(String id); // id중복검사 
	
	public boolean signIn(String setId); // 로그인
	
	public void deleteId();// 회원탈퇴
	
	public void food(); // 음식 판매
	
	public int foodCash(); // 음식값 합계
	
	public void listReset(); // 음식값 list 초기화
	
	public boolean blockremove(String lid, String lid2);
	
	public void sound();
	
	public void soundE();
	
	public void soundER();
	
	public void logplus(String setId);
	
}
