package pc;

public class PcRoomVO {
	
	private String pw;
	private String name;
	private String birth;
	private String tel;
	private String email;

	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("이름: %3s  생년월일: %10s  전화번호: %13s  이메일: %13s", name, birth, tel, email);
	}
	
	

}
