package pc;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class PcRoomImpl implements PcRoom {

	Map<String, PcRoomVO> hmap = new HashMap<>(); // 회원목록 리스트
	List<Integer> food = new ArrayList<Integer>(); // 음식값 담을 리스트
	Map<String, String> log = new HashMap<>();
	Map<String, Integer>logcount = new HashMap<>();//로그인 카운트

	Scanner sc = new Scanner(System.in);

	String id;
	private int proceeds; // 매출

	public void setProceeds(int cash) { // PC스레드 끝나고 가져온 금액 + 현재 금액
		this.proceeds = getProceeds() + cash;
	}

	public int getProceeds() {
		return proceeds;
	}

	public PcRoomImpl() { // 초기 회원목록
		PcRoomVO vo = new PcRoomVO();
		vo.setName("임충환");
		vo.setPw("1234");
		vo.setBirth("910511");
		vo.setTel("010-5006-5439");
		vo.setEmail("dlacndghks12@gmail.com");
		hmap.put("gjwoo96", vo);
		log.put("gjwoo96", "log-out");
		logcount.put("gjwoo96", 0);
		
//		PcRoomVO vo1 = new PcRoomVO();
//		vo1.setName("정태양");
//		vo1.setPw("1234");
//		vo1.setBirth("910511");
//		vo1.setTel("010-5006-5439");
//		vo1.setEmail("dlacndghks12@gmail.com");
//		hmap.put("sun", vo1);
//
//		PcRoomVO vo2 = new PcRoomVO();
//		vo2.setName("이건우");
//		vo2.setPw("1234");
//		vo2.setBirth("910511");
//		vo2.setTel("010-5006-5439");
//		vo2.setEmail("dlacndghks12@gmail.com");
//		hmap.put("su", vo2);
	}

	@Override
	public void signUp() { // 회원가입

		System.out.print("ID : ");
		id = sc.next();
		for (int i = 0; i < id.length(); i++) {
			char ch = id.charAt(i);
			if ((ch < 48 || ch > 57) && (ch < 65 || ch > 90) && (ch < 97 || ch > 122)) {
				System.out.println("ID는 영문자, 숫자만 가능");
				return;
			}
		}

		if (id.length() < 3 || id.length() > 16) {
			System.out.println("ID는 4~15자 이내");
			return;
		}

		if (searchid(id)) {
			System.out.println("이미 존재하는 ID입니다.");
			return;
		}

		PcRoomVO vo = new PcRoomVO();

		System.out.print("PW : ");
		vo.setPw(sc.next());
		if (vo.getPw().length() < 3 || vo.getPw().length() > 16) {
			System.out.println("PW는 4~15자 이내");
			return;
		}

		System.out.print("PW확인 : ");
		String pw = sc.next();
		if (!pw.equals(vo.getPw())) {
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		}

		System.out.print("이름 : ");
		vo.setName(sc.next());

		System.out.print("생년월일 : ");
		vo.setBirth(sc.next());

		System.out.print("전화번호 : ");
		vo.setTel(sc.next());

		System.out.print("E-Mail : ");
		vo.setEmail(sc.next());

		hmap.put(id, vo);
		log.put(id, "log-out");
		logcount.put(id, 0);

		System.out.println("\n회원가입 완료!");
		System.out.println();
		System.out.println();
		System.out.println();

	}

	@Override
	public void userInfo() { // 회원목록 출력

		Iterator<String> it = hmap.keySet().iterator();
		
		System.out.println();
		System.out.println("\n\n");
		System.out.println("현재회원수: " + hmap.size() + "명");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println();
		while (it.hasNext()) {
			String id = it.next();
			PcRoomVO vo = hmap.get(id);
			System.out.println("ID: " + id + "  " + vo.toString());
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("\n\n");
		System.out.println();
		System.out.println();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public boolean pcInfo(boolean isAlive) { // pc정보 출력
		if (isAlive) {
			return true;
		}
		return false;
	}

	@Override
	public boolean searchid(String id) { // 아이디 중복확인
		if (hmap.containsKey(id))
			return true;
		return false;
	}

	@Override
	public boolean signIn(String setId) { // 사용자 pc 로그인

		String pw;
		
		if(!hmap.containsKey(setId)) {
			System.out.println("회원가입해주세요");
			return false;
		}
		
		if ((logcount.get(setId)>1)) {
			System.out.println("ID가 이미 로그인 되어있습니다");
			return false;
			
		} else if (logcount.get(setId)==0) {
			
			System.out.print("PW: ");
			pw = sc.next();

			if (!hmap.containsKey(setId) || !pw.equals(hmap.get(setId).getPw())) {
				System.out.println("ID 또는 PW가 잘못되었습니다.");
				return false;
				
			} else if (hmap.containsKey(setId) && pw.equals(hmap.get(setId).getPw())) {
				System.out.println("로그인성공!!");
				log.put(id, "log-in");
			return true;
			}
		}
		return false;
	}

	@Override
	public void deleteId() { // 회원탈퇴

		System.out.println("탈퇴할 ID?");
		System.out.print("> ");
		String id = sc.next().trim();

		if (!hmap.containsKey(id)) {
			System.out.println("회원가입하세요!!");
		} else if (hmap.containsKey(id)) {
			System.out.println("pw? ");
			System.out.print("> ");
			String pw = sc.next().trim();

			if (hmap.get(id).getPw().equals(pw)) {
				hmap.remove(id);
				log.remove(id);
				logcount.remove(id);
				System.out.println("정상적으로 삭제되었습니다.");
			} else
				System.out.println("ID or PW 입력오류");
		}

	}

	@Override
	public void food() { // 음식 판매
		
		System.out.println();
		System.out.println("===================================================================================================================================================================================================================================");
		System.out.println(" <메뉴>");
		System.out.print(
				"         Z999999988z8zzzzzzzzzzzzzzzzzzzzzzzzzzzBBBBBDDDDBBBBBBBBBBBzB          \r\n" + 
				"         ZEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEZZZZZZZZZZZZZZZZZZZZ          \r\n" + 
				"         Zzzzzz889EE988zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzE9          \r\n" + 
				"         Z8zz8885zyBDD8zBBzzzBBBzzBBBzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzZE          \r\n" + 
				"         EZzz8B,Z5  ZzwZE998EEZE89EZEzzzzzzzzzz8zz8z8zzz8zzzzzzzzzz8Z           \r\n" + 
				"          Z9z8DyZZB9ZE ZZ8ZzzBBzzzBBBzzzzzz8899E9EZyZZBE988zzzzzzz8Zy           \r\n" + 
				"          jZ889Dy5DDyy88zzzzzzzzzzzzzzzzzz889zyj 5ZBZZ Bzz99zzzzzzZE            \r\n" + 
				"           EZ8889999988998B998zzzzzzzz8zzz99DwD yy9jDZ Dw5j888zzz9Z               \n" +
				"           EZ8889999988998B998zzzzzzzz8zzz99DwD yy9jDZ Dw5j888zzz9Z               \n" + 
				"            Z9zzzzzzz89Z DB yZEEE98zzzBzz8zWj j 8,ZZZ9     5DEzzzZ                \n" + 
				"            wZzz89988Dj  ZZZ     w898E9Z9BDwB 9,j     5ZZ9wEjzzzzZ                \n" + 
				"            jZz98 WWw8ZZZZZZZZ5ZZZB 59z8z9Z9Z j Zw ZZWWZ9, D,zBz9Z                \n" + 
				"            yZzE ZZZZZZZZZZZZZZZZZZ B8z8zzy W Z9Z5 z5 W  y5ZZZ8zEZ                " +"                                                                                " +"                                          8E                          \r\n" + 
				"            yZzE ZZZZZZEyj,wj  ZE8z Z8zzz885E ,  w wz ZZZZ5Bz88ZZ                 " +"                                                                                " +"                                    wzZZZZZZ,                         \r\n" + 
				"            yZ89z   ZZ B99ZZ5 ZZZ E98zz8zB8D,jB,Zj  5  WB5589B58Z                 " +"                          jB88888888888888888888Dj                              " +"                               yEZZZZZZZEy                            \r\n" +  
				"            5898EZZB Z  WyyW ZZZ 5ZEE99E99ZZZ5w Bwz8B5jDBZWy8B9ZZ                 " +"                      zEEzj,                    wy8ZEB                          " +"                               ZZZZ8W                                 \r\n" + 
				"            ,wZED ,  ZZZ    ZZ5 wz, ,, jjD99Bz5yzjy5ywW  yz98BZZZ                 " +"                   5Z8,    ,,,,,,,,,,,,,,,,,,,,,,    jZZj                       " +"                               ZZZ                                    \r\n" + 
				"            DED 5D  9ZZZZZZZZZZZZEZE9ZZEZWwEZzZZZ8zB9B9ZZZz8z98EZ                 " +"                 yZy   ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,  wBZW                     " +"                               ZZZ                                    \r\n" +  
				"            5Z ZZZZZZZzZZZZZz yWDzZZZZZZZ 8ZZz8B9BEEZ98ZZZ898ZBZZ                 " +"                ZD  ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, ,W8E                    " +"                               8ZZ                                    \r\n" + 
				"            yZ ZZZj    ZZZZZZ ZZZ9W Ww9  DyWWjy zD yBjyjWyWyjW5EZ                 " +"               Z, ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,WyZ                   " +"               ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ                         \r\n" + 
				"             Z zZ  w9Z ,ZZZZj      ,Z558BZZZZZZjZZZZ ZZjBZ58ZZ989                 " +"              Z  ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,WWZ                  " +"               8Zw             BZZ         ZZ                         \r\n" +  
				"            jZzy, ZZZZZZZZZZZZZZZZZw8Z99wDyBBZZ ZZ D ZZZZZ ZzZEE9Z                " +"             Z  ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,wWjZ                 " +"               ,ZZ             ZZZ        EZ5                         \r\n" + 
				"             Z89Zw,ZZ5, ZZZB    wj  98z9BZZW    ZZwEzWw Z DBw5w99Z                " +"            z5 ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, Wwz5                " +"                ZZ             ZZZ        ZZ                          \r\n" + 
				"             Zzz89D,,BZ ZZZDwZE999998zz8W8ZZZZZ8ZZw9889jZZZZEZZZ9Z                " +"            Z ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,j,Z                " +"                ZZ             8ZZ        ZZ                          \r\n" + 
				"            ,Z8888EZZEZ zZZZ Zzzzzzzzzz88zDDBBz ZZW999ZBzBzzzDy99Z                " +"           j8 ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, j,E,               " +"                ZZ, ZZZZZZZZZZBZEZz9ZZZZ  ZZ                          \r\n" + 
				"            ,ZzB8B9WW,Z BZZZ Zzzzzzzzzzzzzzz89ZZ99ZZEzByyjyyB8EZZZ                " +"           8w                                                , 5D               " +"                BZz ZZZZZZZZZZZE99ZZZZZZ WZZ                          \r\n" + 
				"             Zzw5 8yBwZ jZZZ Zzzzzzzzzzzz8EZZEy,WW ,  9 jj,,   BZZ                " +"           EBBzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzBzz8B               " +"                 ZZ ZZ8888888888888888EZ ZZW                          \r\n" + 
				"             Zzz999999Z jZZZ Ezzzzzzzz8EZZ5    j                WZ                " +"          EB ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,j5EB              " +"                 ZZ zZ8888888888888888ZZ ZZ                           \r\n" + 
				"             Z888zzzzzEjwZZ9,E899E9z8ZZD   ZZ,   w59ZZ,5ZZZZZZZZZZ                " +"        wZ, ,wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, ,yBZ             " +"                 ZZ  Z8888888888888888ZW ZZ                           \r\n" +  
				"             Z8zzzzzzz8z ZZZ Z9B  y9Z5  5    DZZ998w ,w,Z     5yZZ                " +"        Z ,www,,,wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww,,,,,w,,yyZ            " +"                 ZZ  Z8888888888888888Z  ZZ                           \r\n" + 
				"             9Ez8999888Z ZZZwZj ZZzZ  Dy   9,  ,BZZZZE  j ZZZZwDZ8                " +"       y8     ,ww,    ,,wwwwwwwwww,  w,  wwwwwwwwwww,    jjjw,   Wj9z           " +"                 5ZE ZE888888888888889Z 5Z9                           \r\n" + 
				"             WZ895  599Z  y ZwjZZZ5z8E  8Z9  ZZZZZZ85Z   wZZZwZZZW                " +"        zBz8BzZDB89998y    ,,w,,   yE89Ej   ,www,    5899By8zZ5zzzzB            " +"                  ZZ ZZ88888888888888EZ ZZw                           \r\n" + 
				"              Z9B ZZz, BZZZ9 8ZZZjjZy yZz   ZZZ8z yZz  zZZZZZ ZZZ                 " +"              9      ,yzzBj,   ,yz8y    58BW    ,yz8zj,  , 5jZ                  " +"                  ZZ yZ88888888888888Z9 ZZ                            \r\n" + 
				"              Z8 ZZZZZZB ,y ZZZZZDZ, 98 jjE9ZZz, B89ZZZD5w58ZZZZZ                 " +"             9Zz888888zzBzEZZZZZZzzz8888zzzZZZZZZ9BBBzz8zBB8zZy                 " +"                  ZZ  Z88888888888888Z, ZZ                            \r\n" + 
				"              Z ZZZZZZZZZZ5ZZZZZyZy j8WZZE99zEEE888ZZZ  59ZZZZ98Z                 " +"            Zw,,wwwwwwwwww,,,,,,,,wwwwwwww,,,,,,,,wwwwwwwww,j5z8                " +"                  ZZW Z88888888888888Z  ZZ                            \r\n" + 
				"             Z ZZZZZZZZZZZZZZZZZw95 ZW 558zzBB8BzzBZ9ZWZZZZZZZEZZZ                " +"            Z wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwW5yZ                " +"                  jZZ ZE8888888888889Z DZz                            \r\n" + 
				"            Z 8ZZZZZZZZZ89ZZZZZZ8ZZ ZEE98zzzz9ZZZZE89DD9ZZZZZZZE8ZZ               " +"            ZD888888888888888888888888888888888888888888888889BZ                " +"                   ZZ ZZ888888888888ZZ ZZ                             \r\n" + 
				"           ZZZZZZZZZZZZZZZZZZZZZEWB,899Z8BZEBZj  B8BwyBD5B9Z9E98D8Z8              " +"            Z                                                , Z                " +"                   ZZ  Z888888888888Z  ZZ                             \r\n" + 
				"          wZZZZZZZZZZZZZZZZZZZZZZZz85 Zwyz88ZZEZZEW  yW ,BEz9DzBBD9Z              " +"            Z  ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,wWwZ                " +"                   8Zy Z988888888888Z  ZZ                             \r\n" + 
				"          ZZZZZZZZZZZZZZZZZZZZZZZZZ955wZZEZy88j8ZZZZEZZZZEZZZD5D899ZZ             " +"            5z ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, WwEW                " +"                   wZZ ZZZZZZZZZZZZZZ 8ZD                             \r\n" + 
				"         zZZZZZZZZZZZZZZZZZZZZZZZZZZZ9z  B998WZZZZZZ ZZ5,EZE9jW98DyDZ,            " +"             Z5  ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, ,wz8                 " +"                    ZZ jDyyyyyyyyyy5B ZZ                              \r\n" +    
				"         9ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZz            " +"              DZy                                         WBZy                  " +"                    ZZ,W            w ZZ                              \r\n" +
				"         8ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZy            " +"                j88999999999999999999999999999999999999988zW                    " +"                    EZZZZZZZZZZZZZZZZZZZ                              \r\n" +  
								"");
						System.out.println("===================================================================================================================================================================================================================================");
						System.out.println("\t\t\t\t 1.신라면                                                                           2.햄버거                                                                  3.음료                             ");
						System.out.println("\t\t\t\t 2000원                                                                              3000원                                                                   1000원                 "); 
						System.out.println(" 4.취소");
						System.out.print("> ");
						String set = sc.next();
						switch(set) {
						case "1":
							food.add(2000);
							System.out.println();
							System.out.println();
							System.out.println("                                           w8ZZZZZZ       ");
							System.out.println("                                                         59ZZZZZZZZZZZZZZ       ");myThread();
							System.out.println("                                                w9ZZZZZZZZZZZZZZZZE5,           ");myThread();
							System.out.println("                                       ,BZZZZZZZZZZZZZD                         ");myThread();
							System.out.println("                               8ZZZZZZZZZZ8                 wy8EZZZZZZZZ        ");myThread();
							System.out.println("                              ZZ  8Zz  ZZD 59ZZZZZZZZZZZZZZZZZZZZZZZZZZZz       ");myThread();
							System.out.println("                             9ZZZZZZZZZZZZZZZZZZZZZE9zBBDD5yyyjW,               ");myThread();
							System.out.println("                              ZZ  jZy  ZZ                                       ");myThread();
							System.out.println("                               ZZw  ZZ  ZZy                                     ");myThread();
							System.out.println("                                ZZ  9Z   ZZ                                     ");myThread();
							System.out.println("                               ZZ  8ZZ  ZZ                                      ");myThread();
							System.out.println("                              ZZ  9Zj  ZZ                                       ");myThread();
							System.out.println("                              ZZ  ZZ   ZZ                                       ");myThread();
					 	    System.out.println("                              9ZZ  ZZ, zZZ                                      ");myThread();
					 	    System.out.println("                                ZZ  ZZ   ZZ                                     ");myThread();
					 	    System.out.println("                                ZZ  8Z   ZZ                                     ");myThread();
					 	    System.out.println("                              WZZ  ZZZ wZZ                                      ");myThread();
					 	    System.out.println("                                                                                ");myThread();
					 	    System.out.println("       ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZz              ");myThread();
					 	    System.out.println("       ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ,              ");myThread();
					 	    System.out.println("       ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ               ");myThread();
					 	    System.out.println("       zZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ               ");myThread();
					 	    System.out.println("        ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ                ");myThread();
					 	    System.out.println("         ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ                ");myThread();
					 	    System.out.println("         ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ                 ");myThread();
					 	    System.out.println("          ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ                  ");myThread();
					 	    System.out.println("           ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ                   ");myThread();
					 	    System.out.println("            ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ                    ");myThread();
					 	    System.out.println("             wZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ                     ");myThread();
					 	    System.out.println("               ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ                       ");myThread();
					 	    System.out.println("                 ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZw                        ");myThread();
					 	    System.out.println("                   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ                           ");myThread();
					 	    System.out.println("                     wZZZZZZZZZZZZZZZZZZZZZZZZZZZZy                             ");myThread();
					 	    System.out.println("                       ZZZZZZZZZZZZZZZZZZZZZZZZZZ                               ");myThread();
					 	    System.out.println("                      jZZZZZZZZZZZZZZZZZZZZZZZZZZZ                              ");myThread();
				System.out.println("------> 음식 나왔습니다.");
				System.out.println("=======================================================================================");
				System.out.println();
				System.out.println();
							try {
							Thread.sleep(1000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							
							break;
						case "2":
							food.add(3000);
							System.out.println();
							System.out.println();
							System.out.println("                            jB88888888888888888888Dj                                ");myThread();
							System.out.println("                        zEEzj,                    wy8ZEB                            ");myThread();	   
							System.out.println("                     5Z8,    ,,,,,,,,,,,,,,,,,,,,,,    jZZj                         ");myThread();	   
							System.out.println("                   yZy   ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,  wBZW                       ");myThread();	   
							System.out.println("                  ZD  ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, ,W8E                      ");myThread();	   
							System.out.println("                 Z, ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,WyZ                     ");myThread();	   
							System.out.println("                Z  ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,WWZ                    ");myThread();	   
							System.out.println("               Z  ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,wWjZ                   ");myThread();	   
							System.out.println("              z5 ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, Wwz5                  ");myThread();	   
							System.out.println("              Z ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,j,Z                  ");myThread();	   
							System.out.println("             j8 ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, j,E,                 ");myThread();
							System.out.println("             8w                                                , 5D                 ");myThread();
							System.out.println("             EBBzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzBzz8B                 ");myThread();
							System.out.println("            EB ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,j5EB                ");myThread();
							System.out.println("          wZ, ,wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, ,yBZ               ");myThread();
							System.out.println("          Z ,www,,,wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww,,,,,w,,yyZ              ");myThread();
							System.out.println("         y8     ,ww,    ,,wwwwwwwwww,  w,  wwwwwwwwwww,    jjjw,   Wj9z             ");myThread();					   
							System.out.println("          zBz8BzZDB89998y    ,,w,,   yE89Ej   ,www,    5899By8zZ5zzzzB              ");myThread();					   
							System.out.println("                9      ,yzzBj,   ,yz8y    58BW    ,yz8zj,  , 5jZ                    ");myThread();					   
							System.out.println("               9Zz888888zzBzEZZZZZZzzz8888zzzZZZZZZ9BBBzz8zBB8zZy                   ");myThread();					   
							System.out.println("              Zw,,wwwwwwwwww,,,,,,,,wwwwwwww,,,,,,,,wwwwwwwww,j5z8                  ");myThread();					   
							System.out.println("              Z wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwW5yZ                  ");myThread();					   
							System.out.println("              ZD888888888888888888888888888888888888888888888889BZ                  ");myThread();					   
							System.out.println("              Z                                                , Z                  ");myThread();					   
							System.out.println("              Z  ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,wWwZ                  ");myThread();					   
							System.out.println("              5z ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, WwEW                  ");myThread();					   
							System.out.println("               Z5  ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,, ,wz8                   ");myThread();					   
							System.out.println("                DZy                                         WBZy                    ");myThread();					   
							System.out.println("                  j88999999999999999999999999999999999999988zW                      ");myThread();	
				System.out.println("------> 음식 나왔습니다");
				System.out.println("=======================================================================================");
				System.out.println();
				System.out.println();
							try {
								Thread.sleep(1000);
							} catch (Exception e) {
								// TODO: handle exception
							}
							break;
						case"3":
						food.add(1000);
						System.out.println();
						System.out.println();
						System.out.println("                                                    8E                              ");myThread();	   	   
						System.out.println("                                              wzZZZZZZ,                             ");myThread();				   
						System.out.println("                                         yEZZZZZZZEy                                ");myThread();				   
						System.out.println("                                         ZZZZ8W                                     ");myThread();				   
						System.out.println("                                         ZZZ                                        ");myThread();				   
						System.out.println("                                         ZZZ                                        ");myThread();				   
						System.out.println("                                         ZZZ                                        ");myThread();				   
						System.out.println("                                         8ZZ                                        ");myThread();				   
						System.out.println("                         ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ                             ");myThread();				   
						System.out.println("                         8Zw             BZZ         ZZ                             ");myThread();				   
						System.out.println("                         ,ZZ             ZZZ        EZ5                             ");myThread();				   
						System.out.println("                          ZZ             ZZZ        ZZ                              ");myThread();				   
						System.out.println("                          ZZ             8ZZ        ZZ                              ");myThread();				   
						System.out.println("                          ZZ, ZZZZZZZZZZBZEZz9ZZZZ  ZZ                              ");myThread();				   
						System.out.println("                          BZz ZZZZZZZZZZZE99ZZZZZZ WZZ                              ");myThread();				   
						System.out.println("                           ZZ ZZ8888888888888888EZ ZZW                              ");myThread();				   
						System.out.println("                           ZZ zZ8888888888888888ZZ ZZ                               ");myThread();				   
						System.out.println("                           ZZ  Z8888888888888888ZW ZZ                               ");myThread();				   
						System.out.println("                           ZZ  Z8888888888888888Z  ZZ                               ");myThread();				   
						System.out.println("                           5ZE ZE888888888888889Z 5Z9                               ");myThread();				   
						System.out.println("                            ZZ ZZ88888888888888EZ ZZw                               ");myThread();				   
						System.out.println("                            ZZ yZ88888888888888Z9 ZZ                                ");myThread();				   
						System.out.println("                            ZZ  Z88888888888888Z, ZZ                                ");myThread();				   
						System.out.println("                            ZZW Z88888888888888Z  ZZ                                ");myThread();				   
						System.out.println("                            jZZ ZE8888888888889Z DZz                                ");myThread();				   
						System.out.println("                             ZZ ZZ888888888888ZZ ZZ                                 ");myThread();				   
						System.out.println("                             ZZ jZ888888888888Z8 ZZ                                 ");myThread();				   
						System.out.println("                             ZZ  Z888888888888Z  ZZ                                 ");myThread();				   
						System.out.println("                             8Zy Z988888888888Z  ZZ                                 ");myThread();				   
						System.out.println("                             wZZ ZZZZZZZZZZZZZZ 8ZD                                 ");myThread();				    
						System.out.println("                              ZZ jDyyyyyyyyyy5B ZZ                                  ");myThread();				   
						System.out.println("                              ZZ,W            w ZZ                                  ");myThread();			    
						System.out.println("                              EZZZZZZZZZZZZZZZZZZZ                                  ");myThread();	
				System.out.println("------> 음료 나왔습니다");
				System.out.println("===================================================================================");
				System.out.println();
				System.out.println();
						try {
							Thread.sleep(1000);
							
						} catch (Exception e) {
							// TODO: handle exception
						}
			break;
		default:
			break;
		}
	}
	
	@Override
	public int foodCash() { // 음식값 합계
		
		Iterator<Integer> it = food.iterator();
		Integer fcash = 0;
		while(it.hasNext()) {
			int f = it.next();
			fcash += f;
		}
		
		return fcash;
		
	}
	
	@Override
	public void listReset() { // 음식값 list 초기화
		food.removeAll(food);
	}
	
	public void myThread() {
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public boolean blockremove(String lid, String lid2) {
		if(!hmap.containsKey(lid)) {
			System.out.println("회원이 아닙니다!!");
			return false;
		}
		
		if(!lid.equals(lid2)) {
			System.out.println("동일한 ID가 아닙니다");
			return false;
		}
		
		if(logcount.get(lid)!=0) {
			System.out.print("PW: ");
			String pw = sc.next().trim();
			if(!hmap.get(lid).getPw().equals(pw)) {
				System.out.println("회원정보가 일치하지 않습니다");
				return false;
			}
			logcount.put(lid, 0);
			return true;
			
		}else if(logcount.get(lid)==0) {
			System.out.println("로그인된 ID가 없습니다");
			return false;
		}
		return false;
	}

	@Override
	public void sound() { // 켜지는 소리
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;

		bgm = new File("d:\\doc\\sound.wav");

		Clip clip;

		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {

		}
	}

	@Override
	public void soundE() { //꺼지는 소리
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;

		bgm = new File("d:\\doc\\sound1.wav");

		Clip clip;

		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {

		}
	}
	

	@Override
	public void logplus(String setId) { 
		logcount.put(setId, 1);
	}

	@Override
	public void soundER() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		
		bgm = new File("d:\\doc\\sound2.wav");
		
		Clip clip;
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}


}
