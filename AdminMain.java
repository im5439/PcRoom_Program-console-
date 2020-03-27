package pc;

import java.lang.Thread.State;
import java.util.Scanner;


public class AdminMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PcRoom pc = new PcRoomImpl();
		PcRoom pc2 = new PcRoomImpl();
		PcRoom pc3 = new PcRoomImpl();

		PcTread t = new PcTread();
		PcTread t2 = new PcTread();
		PcTread t3 = new PcTread();
		
		String set;
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t      ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ                             ");lodingThread();
		System.out.println("\t\t\t\t     ZZ                                                            yZZ                             ");lodingThread();
		System.out.println("\t\t\t\t     ZZ                                                            DZZ     zWWWWWWWWWWWWWWWWWWWWWDW");lodingThread();                           
		System.out.println("\t\t\t\t     ZZ                                                            zZZ    WZZZZZZZZZZZZZZZZZZZZZZZZ");lodingThread();                                     
		System.out.println("\t\t\t\t     ZZ                                                            zZZ     ZZ                   ZZz");lodingThread();
		System.out.println("\t\t\t\t     ZZ                              EZZ                           zZZ     ZZ                   ZZz");lodingThread();
		System.out.println("\t\t\t\t     ZZ                             ZZZ                            zZZ     ZZ, ,,,,,,,,,,,,,,,, ZZz");lodingThread();
		System.out.println("\t\t\t\t     ZZ                        Wz9y W  D9j                         zZZ     ZZZZZZZZZZZZZZZZZZZZZZZz");lodingThread();
		System.out.println("\t\t\t\t     ZZ                      ZZZZZZZZZZZZZZj                       zZZ     ZZw WWWWWWWWWWWWWWWW ZZz");lodingThread();
		System.out.println("\t\t\t\t     ZZ                     8ZZEEEEEEEEEZZ                         zZZ     ZZ                   ZZz");lodingThread();
		System.out.println("\t\t\t\t     ZZ                     ZZEEEEEEEEEEZW                         zZZ     ZZ                   ZZz");lodingThread();
		System.out.println("\t\t\t\t     ZZ                     ZZEEEEEEEEEEZZ                         zZZ     ZZZZZZZZZZZZZZZZZZZZZZZz");lodingThread();
		System.out.println("\t\t\t\t     ZZ                      ZZEEEEEEEEEZZZj                       zZZ     ZZZZZZZZZZZZZZZZZZZZZZZz");lodingThread();
		System.out.println("\t\t\t\t     ZZ                      ZZZEEEEEEEEEZZZ                       zZZ     ZZZZZZZZZZZZZZZZZZZZZZZz");lodingThread();
		System.out.println("\t\t\t\t     ZZ                       ZZZZZZZZZZZZZ                        zZZ     ZZZZZZZZZZ   ZZZZZZZZZZz");lodingThread();
		System.out.println("\t\t\t\t     ZZ                         ZZZ   ZZZ                          zZZ     ZZZZZZZZZZ8 jZZZZZZZZZZz");lodingThread();
		System.out.println("\t\t\t\t     ZZ                                                            zZZ     ZZZZZZZZZZZZZZZZZZZZZZZz");lodingThread();
		System.out.println("\t\t\t\t     ZZ                                                            zZZ     ZZZZZZZZZZZZZZZZZZZZZZZz");lodingThread();
		System.out.println("\t\t\t\t     ZZ                                                            zZZ     ZE,jjjjjjjwZyWjjjjjjWDZz");lodingThread();
		System.out.println("\t\t\t\t     ZZ                                                            jZZ     ZZ5EEEEEE95Zz8EEEEEEz9Zz");lodingThread();
		System.out.println("\t\t\t\t     ZZ BzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzWZZZ     Zz         Z          Zz");lodingThread();
		System.out.println("\t\t\t\t     ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ     ZZZZZZZZZZZZZZZZZZZZZZZz");lodingThread();
		System.out.println("\t\t\t\t     w                                                               ,     ZZZZZZZZZZZZZZZZZZZZZZZz");lodingThread();
		System.out.println("\t\t\t\t     8jyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy5D     ZZZZZZZZZZj  ZZZZZZZZZZz");lodingThread();
		System.out.println("\t\t\t\t      888888888888888888888888ByWWWWWWWWWWyD888888888888888888888888E      ZZZZZZZZZ, ZD ZZZZZZZZZz");lodingThread();
		System.out.println("\t\t\t\t                               9DDDDDDDDDD8                                ZZZZZZZZZZ   EZZZZZZZZZz");lodingThread();
		System.out.println("\t\t\t\t                               95555555555z                                ZZZZZZZZZZZZZZZZZZZZZZZz");lodingThread();
		System.out.println("\t\t\t\t                            ZEz5jjjjjjjjjj5BEZz                            ZZZZZZZZZZZZZZZZZZZZZZZz");lodingThread();
		System.out.println("\t\t\t\t                           jZZ9888888888888zZZZ                            ZZZZZZZZZZZZZZZZZZZZZZZE");lodingThread();
		System.out.println("\t\t\t\t                            ZEZZZZZZZZZZZZZZEZz                           WZZZZZZZZZZZZZZZZZZZZZZZE");lodingThread();
		System.out.println("\t\t\t\t                                                                                                    ");lodingThread();
		System.out.println("\t\t\t\t                                                                                                    ");lodingThread();
		System.out.println("\t\t\t\t  jZ,   ZZ   ZZ       WZ5                                      ZZZZ8    zZZZZ           ZZ ZZ wZZ   ");lodingThread();
		System.out.println("\t\t\t\t   ZZ  ZZZ   Z,        Z                                       ZZ wZZ ,ZZD yE              ZZ  Zy   ");lodingThread();
		System.out.println("\t\t\t\t   ZZ  Z ZZ ZZ  ZZZZZ  Z  BZZZZ 8ZZZZZ  ZZZZZZZZZw  ZZZZj      Z   ZZ ZZ     zZj ZZz ZZ ZZ ZZ  Zj   ");lodingThread();
		System.out.println("\t\t\t\t    ZwWZ 8Z ZD ZZzDZZj Z  Zy    Zz   Z, Zy  Z8  ZZ ZZjBZZ      ZZZZZ  ZZ      ZZ ZBZ Z  ZZ ZZ  Zj   ");lodingThread();
		System.out.println("\t\t\t\t    ZZZ8  ZZZ  ZZ      Z  Z8    ZZ   Z  ZB  Z9  ZZ ZZ          Zw     ZZB     WZzZ Z Z  ZZ ZZ  Z5   ");lodingThread();
		System.out.println("\t\t\t\t    WZZ   ZZZ   ZZZZZ wZW jZZZZ jZZZZ8  ZZ  ZZ  ZZ  ZZZZ9      ZZ      BZZZZZ  ZZ  ZZ8  ZZ ZZ ,Z9   ");lodingThread();
		System.out.println("                                                                                                    ");
		System.out.println("                                                                                                    ");
		System.out.println("\n\n\n\n\n\n\n\n\n");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		while (true) {
			// PC 실행중인지 대기중인지 체크
			if(!((PcRoomImpl) pc).pcInfo(t.isAlive()) && !((PcRoomImpl) pc).pcInfo(t2.isAlive()) && !((PcRoomImpl) pc).pcInfo(t3.isAlive())) { // 1,2,3 off
				System.out.println(
						"                                                       " + "                                                      " + "                                                    \r\n" + 
						"   lZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ   " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"   lZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ8    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ8   " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ8 \r\n" + 
						"   lZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ9    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ9   " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ9 \r\n" + 
						"   lZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZE    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZE   " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZE \r\n" + 
						"   lZZZZZZZ        ZZZZZZ        ZZZZZW  ZZZZZZZZZZ    " + "   ZZZZZZZZ        ZZZZZZ        ZZw      ZZZZZZZZZ   " + "   ZZZZZZZZ        ZZZZZB        ZZ       ZZZZZZZZZ \r\n" +
						"   lZZZZZZZ  ZZZZZ  ZZZ  ,ZZZZZZZZZZ     ZZZZZZZZZZ    " + "   ZZZZZZZZ  ZZZZW  ZZZ   ZZZZZZZZZ ZZZZZ  ZZZZZZZZ   " + "   ZZZZZZZZ  ZZZZ, DZZZ   ZZZZZZZZZZZZZZZ  ZZZZZZZZ \r\n" + 
						"   lZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZZZ8 ZZZZZZZZ   " + "   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZZZ  ZZZZZZZZ \r\n" + 
						"   lZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZZZ  ZZZZZZZZ   " + "   ZZZZZZZZ  ZZZZz BZZ  ZZZZZZZZZZZZjDD, jZZZZZZZZZ \r\n" +
						"   lZZZZZZZ        ZZZ  ZZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   ZZZZZZZZ        ZZZ  ZZZZZZZZZZZZZZZ   ZZZZZZZZZ   " + "   ZZZZZZZZ        ZZ8  ZZZZZZZZZZZZ      ZZZZZZZZZ \r\n" + 
						"   lZZZZZZZ  Z5zZZZZZZ  ZZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   ZZZZZZZZ  8wyZZZZZZ  ZZZZZZZZZZZZZ   ZZZZZZZZZZZ   " + "   ZZZZZZZZ  ZD9ZZZZZZ  ZZZZZZZZZZZZZZZZZ  ZZZZZZZZ \r\n" + 
						"   lZZZZZZZ  ZZZZZZZZZ  WZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   ZZZZZZZZ  ZZZZZZZZZ  ZZZZZZZZZZZB  ZZZZZZZZZZZZZ   " + "   ZZZZZZZZ  ZZZZZZZZZ  ZZZZZZZZZZZZZZZZZz ZZZZZZZZ \r\n" + 
						"   lZZZZZZZ  ZZZZZZZZZZ    ZZZE  ZZZZZZ  ZZZZZZZZZZ    " + "   ZZZZZZZZ  ZZZZZZZZZZ   DZZZZw,ZZ  ZZZZZE8ZZZZZZZ   " + "   ZZZZZZZZ  ZZZZZZZZZZ   yZZZ8 wZ8 ZZZZ   ZZZZZZZZ \r\n" + 
						"   lZZZZZZZ  ZZZZZZZZZZZZD      5ZZZZZZ  ZZZZZZZZZZ    " + "   ZZZZZZZZ  ZZZZZZZZZZZZ,      DZZ         ZZZZZZZ   " + "   ZZZZZZZZ  ZZZZZZZZZZZZ       EZZ      ZZZZZZZZZZ \r\n" + 
						"   lZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ   " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"   lZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ   " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"   lZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ   " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \n" + 
						"   lZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ   " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ,   " + "  ,ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ,  " + "  ,ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ,\n" + 
						"                      ZZZZZZZZZZ                       " + "                      ZZZZZZZZZZ                      " + "                      ZZZZZZZZZZ                    \n" + 
						"                     DZ88888888Z5                      " + "                     DZ88888888Z5                     " + "                     DZ88888888Z5                   \n" + 
						"                     ZZEEEEEEEEZZ                      " + "                     ZZEEEEEEEEZZ                     " + "                     ZZEEEEEEEEZZ                   \n" + 
						"                    ZZZEEEEEEEEZZZ                     " + "                    ZZZEEEEEEEEZZZ                    " + "                    ZZZEEEEEEEEZZZ                  \n" + 
						"          ,,,wwWjjW9jzzzzzzzzzzzzj8WjjWww,,,           " + "          ,,,wwWjjW9jzzzzzzzzzzzzj8WjjWww,,,          " + "          ,,,wwWjjW9jzzzzzzzzzzzzj8WjjWww,,,   ");
			} else if(((PcRoomImpl) pc).pcInfo(t.isAlive()) && !((PcRoomImpl) pc).pcInfo(t2.isAlive()) && !((PcRoomImpl) pc).pcInfo(t3.isAlive())) { // 1on 2,3off
				System.out.println(
						"                                                      " +  "                                                      " + "                                                    \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZEZZZZZZZZZZZZZZZZZZZZEE    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ   " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ8   " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ8 \r\n" + 
						"   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ9   " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ9 \r\n" + 
						"   Z                       wDDW         9         Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZE   " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZE \r\n" + 
						"   Z       ZZZZZZZ9     ZZZZZZZZZ    zZZZ         Z    " + "   ZZZZZZZZ        ZZZZZZ        ZZw      ZZZZZZZZZ   " + "   ZZZZZZZZ        ZZZZZB        ZZ       ZZZZZZZZZ \r\n" +
						"   Z       Z     ,Z9   ZZ           ZZ EZ         Z    " + "   ZZZZZZZZ  ZZZZW  ZZZ   ZZZZZZZZZ ZZZZZ  ZZZZZZZZ   " + "   ZZZZZZZZ  ZZZZ, DZZZ   ZZZZZZZZZZZZZZZ  ZZZZZZZZ \r\n" + 
						"   Z       Zj     ZZ  ZZ               ZZ         Z    " + "   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZZZ8 ZZZZZZZZ   " + "   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZZZ  ZZZZZZZZ \r\n" + 
						"   Z       Z     ZZ,  Z                ZZ         Z    " + "   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZZZ8 ZZZZZZZZ   " + "   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZZZ  ZZZZZZZZ \r\n" + 
						"   Z       ZZZZZZZ   WZ                ZZ         Z    " + "   ZZZZZZZZ        ZZZ  ZZZZZZZZZZZZZZZ   ZZZZZZZZZ   " + "   ZZZZZZZZ        ZZ8  ZZZZZZZZZZZZ      ZZZZZZZZZ \r\n" +
						"   Z       ZW         ZZ               ZZ         Z    " + "   ZZZZZZZZ  8wyZZZZZZ  ZZZZZZZZZZZZZ   ZZZZZZZZZZZ   " + "   ZZZZZZZZ  ZD9ZZZZZZ  ZZZZZZZZZZZZZZZZZ  ZZZZZZZZ \r\n" + 
						"   Z       Zw         ZZD              ZZ         Z    " + "   ZZZZZZZZ  ZZZZZZZZZ  ZZZZZZZZZZZB  ZZZZZZZZZZZZZ   " + "   ZZZZZZZZ  ZZZZZZZZZ  ZZZZZZZZZZZZZZZZZz ZZZZZZZZ \r\n" + 
						"   Z       Z8          8ZZZzyDZZZ      ZZ         Z    " + "   ZZZZZZZZ  ZZZZZZZZZZ   DZZZZw,ZZ  ZZZZZE8ZZZZZZZ   " + "   ZZZZZZZZ  ZZZZZZZZZZ   yZZZ8 wZ8 ZZZZ   ZZZZZZZZ \r\n" + 
						"   Z       Z,            ,ZZZZZ8       BZ         Z    " + "   ZZZZZZZZ  ZZZZZZZZZZZZ,      DZZ         ZZZZZZZ   " + "   ZZZZZZZZ  ZZZZZZZZZZZZ       EZZ      ZZZZZZZZZZ \r\n" + 
						"   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ   " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ   " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ   " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ   " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ,  " + "   ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ \n" + 
						"                      ZZZZZZZZZZ                       " + "                      ZZZZZZZZZZ                      " + "                      ZZZZZZZZZZ                    \n" + 
						"                     DZ88888888Z5                      " + "                     DZ88888888Z5                     " + "                     DZ88888888Z5                   \n" + 
						"                     ZZEEEEEEEEZZ                      " + "                     ZZEEEEEEEEZZ                     " + "                     ZZEEEEEEEEZZ                   \n" + 
						"                    ZZZEEEEEEEEZZZ                     " + "                    ZZZEEEEEEEEZZZ                    " + "                    ZZZEEEEEEEEZZZ                  \n" + 
						"          ,,,wwWjjW9jzzzzzzzzzzzzj8WjjWww,,,           " + "          ,,,wwWjjW9zzzzzzzzzzzzzj8WjjWww,,,          " + "          ,,,wwWjjW9jzzzzzzzzzzzzj8WjjWww,,,   ");
			} else if(!((PcRoomImpl) pc).pcInfo(t.isAlive()) && ((PcRoomImpl) pc).pcInfo(t2.isAlive()) && !((PcRoomImpl) pc).pcInfo(t3.isAlive())) {// 2on 1,3off
				System.out.println(
						"                                                       " + "                                                       " + "                                                    \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ8    " + "   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ8 \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ9    " + "   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ9 \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZE    " + "   Z                       ,w        ww           Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZE \r\n" + 
						"   ZZZZZZZZ        ZZZZZZ        ZZZZZW  ZZZZZZZZZZ    " + "   Z      ZZZZZZZZ     wZZZZZZZZ  EZZZZZZZ        Z    " + "   ZZZZZZZZ       9ZZZZZB        ZZ       ZZZZZZZZZ \r\n" +
						"   ZZZZZZZZ  ZZZZZ  ZZZ  ,ZZZZZZZZZZ     ZZZZZZZZZZ    " + "   Z      ZZ     ZZ   ZZz         B     DZ,       Z    " + "   ZZZZZZZZ  ZZZZ, DZZZ   ZZZZZZZZZZZZZZZ  ZZZZZZZZ \r\n" + 
						"   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   Z      ZZ     ZZ  ZZ                  Zw       Z    " + "   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZZZ  ZZZZZZZZ \r\n" + 
						"   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   Z      ZZ     ZZ  ZZ                 ZZ        Z    " + "   ZZZZZZZZ  ZZZZz BZZ  ZZZZZZZZZZZZjDD, jZZZZZZZZZ \r\n" +
						"   ZZZZZZZZ        ZZZ  ZZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   Z      ZZZZZZZZ   Zz               ZZZ         Z    " + "   ZZZZZZZZ       DZZ8  ZZZZZZZZZZZZ      ZZZZZZZZZ \r\n" + 
						"   ZZZZZZZZ  Z5zZZZZZZ  ZZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   Z      ZZ         ZZ             ZZZ           Z    " + "   ZZZZZZZZ  ZD9ZZZZZZ  ZZZZZZZZZZZZZZZZZ  ZZZZZZZZ \r\n" + 
						"   ZZZZZZZZ  ZZZZZZZZZ  WZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   Z      ZZ         5ZZ          yZ              Z    " + "   ZZZZZZZZ  ZZZZZZZZZ  ZZZZZZZZZZZZZZZZZz ZZZZZZZZ \r\n" + 
						"   ZZZZZZZZ  ZZZZZZZZZZ    ZZZE  ZZZZZZ  ZZZZZZZZZZ    " + "   Z      ZZ          5ZZZy ,5ZZ  ZZ 5zzzzZ       Z    " + "   ZZZZZZZZ  ZZZZZZZZZZ   yZZZ8 wZ8 ZZZZ   ZZZZZZZZ \r\n" + 
						"   ZZZZZZZZ  ZZZZZZZZZZZZD      5ZZZZZZ  ZZZZZZZZZZ    " + "   Z      Z9             ZZZZZZy  ZZZZZZZZZ       Z    " + "   ZZZZZZZZ  ZZZZZZZZZZZZ       EZZ      ZZZZZZZZZZ \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \n" + 
						"  ,ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ,   " + "  ,ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ,   " + "  ,ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ \n" + 
						"                      ZZZZZZZZZZ                       " + "                      ZZZZZZZZZZ                       " + "                      ZZZZZZZZZZ                    \n" + 
						"                     DZ88888888Z5                      " + "                     DZ88888888Z5                      " + "                     DZ88888888Z5                   \n" + 
						"                     ZZEEEEEEEEZZ                      " + "                     ZZEEEEEEEEZZ                      " + "                     ZZEEEEEEEEZZ                   \n" + 
						"                    ZZZEEEEEEEEZZZ                     " + "                    ZZZEEEEEEEEZZZ                     " + "                    ZZZEEEEEEEEZZZ                  \n" + 
						"          ,,,wwWjjW9jzzzzzzzzzzzzj8WjjWww,,,           " + "          ,,,wwWjjW9zzzzzzzzzzzzzj8WjjWww,,,           " + "          ,,,wwWjjW9zzzzzzzzzzzzzj8WjjWww,,,   ");
			} else if(!((PcRoomImpl) pc).pcInfo(t.isAlive()) && !((PcRoomImpl) pc).pcInfo(t2.isAlive()) && ((PcRoomImpl) pc).pcInfo(t3.isAlive())) {// 3on 1,2off
				System.out.println(
						"                                                       " + "                                                       " + "                                                     \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ8    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ8    " + "   Z                                              Z \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ9    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ9    " + "   Z                                              Z \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZE    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZE    " + "   Z                      W8E8j     BZEW          Z \r\n" + 
						"   ZZZZZZZZ        ZZZZZZ        ZZZZZW  ZZZZZZZZZZ    " + "   ZZZZZZZZ        ZZZZZZ        ZZw      ZZZZZZZZZ    " + "   Z      ZZZZZZZZ     DZZZZZZZZ  9ZZZZZZZ        Z \r\n" +
						"   ZZZZZZZZ  ZZZZZ  ZZZ  ,ZZZZZZZZZZ     ZZZZZZZZZZ    " + "   ZZZZZZZZ  ZZZZW  ZZZ   ZZZZZZZZZ ZZZZZ  ZZZZZZZZ    " + "   Z      ZZ     ZZ   ZZW               ZZ        Z \r\n" + 
						"   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZZZ8 ZZZZZZZZ    " + "   Z      ZZ     ZZ  ZZ                 ZZ        Z \r\n" + 
						"   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZZZ  ZZZZZZZZ    " + "   Z      ZZ     ZZ  ZZ            jZZZZw         Z \r\n" + 
						"   ZZZZZZZZ        ZZZ  ZZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   ZZZZZZZZ        ZZZ  ZZZZZZZZZZZZZZZ   ZZZZZZZZZ    " + "   Z      ZZZZZZZ8   ZZ             EDzZZZ        Z \r\n" + 
						"   ZZZZZZZZ  Z5zZZZZZZ  ZZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   ZZZZZZZZ  8wyZZZZZZ  ZZZZZZZZZZZZZ   ZZZZZZZZZZZ    " + "   Z      ZZ         ZZ                  ZZ       Z \r\n" + 
						"   ZZZZZZZZ  ZZZZZZZZZ  WZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   ZZZZZZZZ  ZZZZZZZZZ  ZZZZZZZZZZZB  ZZZZZZZZZZZZZ    " + "   Z      ZZ          ZZ                 ZZ       Z \r\n" + 
						"   ZZZZZZZZ  ZZZZZZZZZZ    ZZZE  ZZZZZZ  ZZZZZZZZZZ    " + "   ZZZZZZZZ  ZZZZZZZZZZ   DZZZZw,ZZ  ZZZZZE8ZZZZZZZ    " + "   Z      ZZ           ZZZZ88ZZZ  ZZz5zZZZ        Z \r\n" + 
						"   ZZZZZZZZ  ZZZZZZZZZZZZD      5ZZZZZZ  ZZZZZZZZZZ    " + "   ZZZZZZZZ  ZZZZZZZZZZZZ       DZZ         ZZZZZZZ    " + "   Z      zz             yZZZZD   ,EZZZB          Z \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   Z                                              Z \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   Z                                              Z \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   Z                                              Z \n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   Z                                              Z \n" + 
						"  ,ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ,   " + "  ,ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ,   " + "  ,ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ \n" + 
						"                      ZZZZZZZZZZ                       " + "                      ZZZZZZZZZZ                       " + "                      ZZZZZZZZZZ                    \n" + 
						"                     DZ88888888Z5                      " + "                     DZ88888888Z5                      " + "                     DZ88888888Z5                   \n" + 
						"                     ZZEEEEEEEEZZ                      " + "                     ZZEEEEEEEEZZ                      " + "                     ZZEEEEEEEEZZ                   \n" + 
						"                    ZZZEEEEEEEEZZZ                     " + "                    ZZZEEEEEEEEZZZ                     " + "                    ZZZEEEEEEEEZZZ                  \n" + 
						"          ,,,wwWjjW9jZZZZZZZZZZZZj8WjjWww,,,           " + "          ,,,wwWjjW9jZZZZZZZZZZZZj8WjjWww,,,           " + "          ,,,wwWjjW9jZZZZZZZZZZZZj8WjjWww,,,   ");
			} else if(((PcRoomImpl) pc).pcInfo(t.isAlive()) && ((PcRoomImpl) pc).pcInfo(t2.isAlive()) && !((PcRoomImpl) pc).pcInfo(t3.isAlive())) {// 1,2on 3off
				System.out.println(
						"                                                      " +  "                                                       " + "                                                    \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"   Z                                              Z    " + "   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ8 \r\n" + 
						"   Z                                              Z    " + "   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ9 \r\n" + 
						"   Z                       wDDW         9         Z    " + "   Z                       ,w        ww           Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZE \r\n" + 
						"   Z       ZZZZZZZ9     ZZZZZZZZZ    zZZZ         Z    " + "   Z      ZZZZZZZZ     wZZZZZZZZ  EZZZZZZZ        Z    " + "   ZZZZZZZZ        ZZZZZ         ZZ       ZZZZZZZZZ \r\n" +
						"   Z       Z     ,Z9   ZZ           ZZ EZ         Z    " + "   Z      ZZ     ZZ   ZZz         B     DZ,       Z    " + "   ZZZZZZZZ  ZZZZ, DZZZ  8ZZZZZZZZZZZZZZZ  ZZZZZZZZ \r\n" + 
						"   Z       Zj     ZZ  ZZ               ZZ         Z    " + "   Z      ZZ     ZZ  ZZ                  Zw       Z    " + "   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZZZ  ZZZZZZZZ \r\n" + 
						"   Z       Z     ZZ,  Z                ZZ         Z    " + "   Z      ZZ     ZZ  ZZ                 ZZ        Z    " + "   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZZZ  ZZZZZZZZ \r\n" + 
						"   Z       ZZZZZZZ   WZ                ZZ         Z    " + "   Z      ZZZZZZZZ   Zz               ZZZ         Z    " + "   ZZZZZZZZ        ZZ8  ZZZZZZZZZZZZ      ZZZZZZZZZ \r\n" +
						"   Z       ZW         ZZ               ZZ         Z    " + "   Z      ZZ         ZZ             ZZZ           Z    " + "   ZZZZZZZZ  ZD9ZZZZZZ  ZZZZZZZZZZZZZZZZZ  ZZZZZZZZ \r\n" + 
						"   Z       Zw         ZZD              ZZ         Z    " + "   Z      ZZ         5ZZ          yZ              Z    " + "   ZZZZZZZZ  ZZZZZZZZZ  ZZZZZZZZZZZZZZZZZ  ZZZZZZZZ \r\n" + 
						"   Z       Z8          8ZZZzyDZZZ      ZZ         Z    " + "   Z      ZZ          5ZZZy ,5ZZ  ZZ 5zzzzZ       Z    " + "   ZZZZZZZZ  ZZZZZZZZZZ   yZZZ8 wZ8 ZZZZ   ZZZZZZZZ \r\n" + 
						"   Z       ZW            ,ZZZZZ8       BZ         Z    " + "   Z      Z9             ZZZZZZy  ZZZZZZZZZ       Z    " + "   ZZZZZZZZ  ZZZZZZZZZZZZ       EZZ      ZZZZZZZZZZ \r\n" + 
						"   Z                                              Z    " + "   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"   Z                                              Z    " + "   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"   Z                                              Z    " + "   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"   Z                                              Z    " + "   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"  wZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZw   " + "  ,ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ,   " + "  ,ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ \n" + 
						"                      ZZZZZZZZZZ                       " + "                      ZZZZZZZZZZ                       " + "                      ZZZZZZZZZZ                    \n" + 
						"                     DZ88888888Z5                      " + "                     DZ88888888Z5                      " + "                     DZ88888888Z5                   \n" + 
						"                     ZZEEEEEEEEZZ                      " + "                     ZZEEEEEEEEZZ                      " + "                     ZZEEEEEEEEZZ                   \n" + 
						"                    ZZZEEEEEEEEZZZ                     " + "                    ZZZEEEEEEEEZZZ                     " + "                    ZZZEEEEEEEEZZZ                  \n" + 
						"          ,,,wwWjjW9jZZZZZZZZZZZZj8WjjWww,,,           " + "          ,,,wwWjjW9jZZZZZZZZZZZZj8WjjWww,,,           " + "          ,,,wwWjjW9jZZZZZZZZZZZZj8WjjWww,,,   ");
			} else if(((PcRoomImpl) pc).pcInfo(t.isAlive()) && !((PcRoomImpl) pc).pcInfo(t2.isAlive()) && ((PcRoomImpl) pc).pcInfo(t3.isAlive())) {// 1,3on 2off
				System.out.println(
						"                                                      " +  "                                                       " + "                                                     \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ   " + "    ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ  \r\n" + 
						"   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ8   " + "    Z                                              Z  \r\n" + 
						"   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ9   " + "    Z                                              Z  \r\n" + 
						"   Z                       wDDW         9         Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZE   " + "    Z                      W8E8j     BZEW          Z  \r\n" + 
						"   Z       ZZZZZZZ9     ZZZZZZZZZ    zZZZ         Z    " + "   ZZZZZZZZ        ZZZZZZ        ZZw      ZZZZZZZZZ   " + "    Z      ZZZZZZZZ     DZZZZZZZZ  9ZZZZZZZ        Z  \r\n" +
						"   Z       Zj    ,Z9   ZZ           ZZ EZ         Z    " + "   ZZZZZZZZ  ZZZZW wZZZ   ZZZZZZZZZ ZZZZZ  ZZZZZZZZ   " + "    Z      ZZ     ZZ   ZZW               ZZ        Z  \r\n" + 
						"   Z       Zj     ZZ  ZZ               ZZ         Z    " + "   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZZZ8 ZZZZZZZZ   " + "    Z      ZZ     ZZ  ZZ                 ZZ        Z  \r\n" + 
						"   Z       Zj    ZZ,  Z                ZZ         Z    " + "   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZZZ8 ZZZZZZZZ   " + "    Z      ZZ     ZZ  ZZ            jZZZZw         Z  \r\n" + 
						"   Z       ZZZZZZZ   WZ                ZZ         Z    " + "   ZZZZZZZZ        ZZZ  ZZZZZZZZZZZZZZZ   ZZZZZZZZZ   " + "    Z      ZZZZZZZ8   ZZ             EDzZZZ        Z  \r\n" +
						"   Z       ZW         ZZ               ZZ         Z    " + "   ZZZZZZZZ  8wyZZZZZZ  ZZZZZZZZZZZZZ   ZZZZZZZZZZZ   " + "    Z      ZZ         ZZ                  ZZ       Z  \r\n" + 
						"   Z       Zw         ZZD              ZZ         Z    " + "   ZZZZZZZZ  ZZZZZZZZZ  ZZZZZZZZZZZB  ZZZZZZZZZZZZZ   " + "    Z      ZZ          ZZ                 ZZ       Z  \r\n" + 
						"   Z       Z8          8ZZZzyDZZZ      ZZ         Z    " + "   ZZZZZZZZ  ZZZZZZZZZZ   DZZZZw,ZZ  ZZZZZE8ZZZZZZZ   " + "    Z      ZZ           ZZZZ88ZZZ  ZZz5zZZZ        Z  \r\n" + 
						"   Z       ZW            ,ZZZZZ8       BZ         Z    " + "   ZZZZZZZZ  ZZZZZZZZZZZZ       DZZ         ZZZZZZZ   " + "    Z      zz             yZZZZD   ,EZZZB          Z  \r\n" + 
						"   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ   " + "    Z                                              Z  \r\n" + 
						"   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ   " + "    Z                                              Z \r\n" + 
						"   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ   " + "    Z                                              Z \r\n" + 
						"   Z                                              Z    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ   " + "    Z                                              Z \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "  ,ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ,  " + "   ,ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ \n" + 
						"                      ZZZZZZZZZZ                       " + "                      ZZZZZZZZZZ                      " + "                       ZZZZZZZZZZ                    \n" + 
						"                     DZ88888888Z5                      " + "                     DZ88888888Z5                     " + "                      DZ88888888Z5                   \n" + 
						"                     ZZEEEEEEEEZZ                      " + "                     ZZEEEEEEEEZZ                     " + "                      ZZEEEEEEEEZZ                   \n" + 
						"                    ZZZEEEEEEEEZZZ                     " + "                    ZZZEEEEEEEEZZZ                    " + "                     ZZZEEEEEEEEZZZ                  \n" + 
						"          ,,,wwWjjW9jZZZZZZZZZZZZj8WjjWww,,,           " + "          ,,,wwWjjW9ZZZZZZZZZZZZZj8WjjWww,,,          " + "           ,,,wwWjjW9ZZZZZZZZZZZZZj8WjjWww,,,   ");
			} else if(!((PcRoomImpl) pc).pcInfo(t.isAlive()) && ((PcRoomImpl) pc).pcInfo(t2.isAlive()) && ((PcRoomImpl) pc).pcInfo(t3.isAlive())) {// 2,3on 1off
				System.out.println(
						"                                                       " + "                                                       " + "                                                    \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ8    " + "   Z                                              Z    " + "   Z                                              Z \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ9    " + "   Z                                              Z    " + "   Z                                              Z \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZE    " + "   Z                       ,w        ww           Z    " + "   Z                      W8E8j     BZEW          Z \r\n" + 
						"   ZZZZZZZZ        ZZZZZZ        ZZZZZW  ZZZZZZZZZZ    " + "   Z      ZZZZZZZZ     wZZZZZZZZ  EZZZZZZZ        Z    " + "   Z      ZZZZZZZZ     DZZZZZZZZ  9ZZZZZZZ        Z \r\n" +
						"   ZZZZZZZZ  ZZZZZ  ZZZ  ,ZZZZZZZZZZ     ZZZZZZZZZZ    " + "   Z      ZZ     ZZ   ZZz         B     DZ,       Z    " + "   Z      ZZ     ZZ   ZZW               ZZ        Z \r\n" + 
						"   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   Z      ZZ     ZZ  ZZ                  Zw       Z    " + "   Z      ZZ     ZZ  ZZ                 ZZ        Z \r\n" + 
						"   ZZZZZZZZ  ZZZZZ  ZZ  ZZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   Z      ZZ     ZZ  ZZ                 ZZ        Z    " + "   Z      ZZ     ZZ  ZZ            jZZZZw         Z \r\n" + 
						"   ZZZZZZZZ        ZZZ  ZZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   Z      ZZZZZZZZ   Zz               ZZZ         Z    " + "   Z      ZZZZZZZ8   ZZ             EDzZZZ        Z \r\n" + 
						"   ZZZZZZZZ  Z5zZZZZZZ  ZZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   Z      ZZ         ZZ             ZZZ           Z    " + "   Z      ZZ         ZZ                  ZZ       Z \r\n" + 
						"   ZZZZZZZZ  ZZZZZZZZZ  WZZZZZZZZZZZZZZ  ZZZZZZZZZZ    " + "   Z      ZZ         5ZZ          yZ              Z    " + "   Z      ZZ          ZZ                 ZZ       Z \r\n" + 
						"   ZZZZZZZZ  ZZZZZZZZZZ    ZZZE  ZZZZZZ  ZZZZZZZZZZ    " + "   Z      ZZ          5ZZZy ,5ZZ  ZZ 5zzzzZ       Z    " + "   Z      ZZ           ZZZZ88ZZZ  ZZz5zZZZ        Z \r\n" + 
						"   ZZZZZZZZ  ZZZZZZZZZZZZD      5ZZZZZZ  ZZZZZZZZZZ    " + "   Z      Z9             ZZZZZZy  ZZZZZZZZZ       Z    " + "   Z      zz             yZZZZD   ,EZZZB          Z \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   Z                                              Z    " + "   Z                                              Z \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   Z                                              Z    " + "   Z                                              Z  \r\n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   Z                                              Z    " + "   Z                                              Z   \n" + 
						"   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   Z                                              Z    " + "   Z                                              Z   \n" + 
						"  ,ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ,   " + "   ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ,   " + "  ,ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ,   \n" + 
						"                      ZZZZZZZZZZ                       " + "                      ZZZZZZZZZZ                       " + "                      ZZZZZZZZZZ                       \n" + 
						"                     DZ88888888Z5                      " + "                     DZ88888888Z5                      " + "                     DZ88888888Z5                      \n" + 
						"                     ZZEEEEEEEEZZ                      " + "                     ZZEEEEEEEEZZ                      " + "                     ZZEEEEEEEEZZ                      \n" + 
						"                    ZZZEEEEEEEEZZZ                     " + "                    ZZZEEEEEEEEZZZ                     " + "                    ZZZEEEEEEEEZZZ                     \n" + 
						"          ,,,wwWjjW9jZZZZZZZZZZZZj8WjjWww,,,           " + "          ,,,wwWjjW9jZZZZZZZZZZZZj8WjjWww,,,           " + "          ,,,wwWjjW9ZZZZZZZZZZZZZj8WjjWww,,,   ");
			} else if(((PcRoomImpl) pc).pcInfo(t.isAlive()) && ((PcRoomImpl) pc).pcInfo(t2.isAlive()) && ((PcRoomImpl) pc).pcInfo(t3.isAlive())) { // 1,2,3on
				System.out.println(
						"                                                        " + "                                                       " + "                                                    \r\n" + 
						"    ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \r\n" + 
						"    Z                                              Z    " + "   Z                                              Z    " + "   Z                                              Z \r\n" + 
						"    Z                                              Z    " + "   Z                                              Z    " + "   Z                                              Z \r\n" + 
						"    Z                       wDDW         9         Z    " + "   Z                       ,w        ww           Z    " + "   Z                       8E8      BZEW          Z \r\n" + 
						"    Z       ZZZZZZZ9     ZZZZZZZZZ    zZZZ         Z    " + "   Z      ZZZZZZZZ     wZZZZZZZZ  EZZZZZZZ        Z    " + "   Z      ZZZZZZZZ     DZZZZZZZZ  9ZZZZZZZ        Z \r\n" +
						"    Z       Zj    ,Z9   ZZ           ZZ EZ         Z    " + "   Z      ZZ     ZZ   ZZz         B     DZ,       Z    " + "   Z      ZZ     ZZ   ZZW               ZZ        Z \r\n" + 
						"    Z       Zj     ZZ  ZZ               ZZ         Z    " + "   Z      ZZ     ZZ  ZZ                  Zw       Z    " + "   Z      ZZ     ZZ  ZZ                 ZZ        Z \r\n" + 
						"    Z       Zj    ZZ,  Z                ZZ         Z    " + "   Z      ZZ     ZZ  ZZ                 ZZ        Z    " + "   Z      ZZ     ZZ  ZZ            jZZZZw         Z \r\n" + 
						"    Z       ZZZZZZZ   WZ                ZZ         Z    " + "   Z      ZZZZZZZZ   Zz               ZZZ         Z    " + "   Z      ZZZZZZZ8   ZZ             EDzZZZ        Z \r\n" + 
						"    Z       ZW         ZZ               ZZ         Z    " + "   Z      ZZ         ZZ             ZZZ           Z    " + "   Z      ZZ         ZZ                  ZZ       Z \r\n" + 
						"    Z       Zw         ZZD              ZZ         Z    " + "   Z      ZZ         5ZZ          yZ              Z    " + "   Z      ZZ          ZZ                 ZZ       Z \r\n" + 
						"    Z       Z8          8ZZZzyDZZZ      ZZ         Z    " + "   Z      ZZ          5ZZZy ,5ZZ  ZZ 5zzzzZ       Z    " + "   Z      ZZ           ZZZZ88ZZZ  ZZz5zZZZ        Z \r\n" + 
						"    Z       Z9            ,ZZZZZ8       BZ         Z    " + "   Z      Z9             ZZZZZZy  ZZZZZZZZZ       Z    " + "   Z      zz             yZZZZD   ,EZZZB          Z \r\n" + 
						"    Z                                              Z    " + "   Z                                              Z    " + "   Z                                              Z \r\n" + 
						"    Z                                              Z    " + "   Z                                              Z    " + "   Z                                              Z \r\n" + 
						"    Z                                              Z    " + "   Z                                              Z    " + "   Z                                              Z \n" + 
						"    Z                                              Z    " + "   Z                                              Z    " + "   Z                                              Z \n" + 
						"   ,ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ    " + "  ,ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ    " + "   ZZZZZZZZZZZZZZZZZZZZZZZ99ZZZZZZZZZZZZZZZZZZZZZZZ \n" + 
						"                       ZZZZZZZZZZ                       " + "                      ZZZZZZZZZZ                       " + "                      ZZZZZZZZZZ                    \n" + 
						"                      DZ88888888Z5                      " + "                     DZ88888888Z5                      " + "                     DZ88888888Z5                   \n" + 
						"                      ZZEEEEEEEEZZ                      " + "                     ZZEEEEEEEEZZ                      " + "                     ZZEEEEEEEEZZ                   \n" + 
						"                     ZZZEEEEEEEEZZZ                     " + "                    ZZZEEEEEEEEZZZ                     " + "                    ZZZEEEEEEEEZZZ                  \n" + 
						"           ,,,wwWjjW9ZZZZZZZZZZZZZj8WjjWww,,,           " + "          ,,,wwWjjW9jZZZZZZZZZZZZj8WjjWww,,,           " + "          ,,,wwWjjW9jZZZZZZZZZZZZZZWjjWww,,,   ");
			}
			
			if (((PcRoomImpl) pc).pcInfo(t.isAlive())) {
				System.out.println();
				System.out.print("\t\t      PC1실행중");
			} else if (!((PcRoomImpl) pc).pcInfo(t.isAlive())) {
				System.out.println();
				System.out.print("\t\t      PC1대기중");
			}
			if (((PcRoomImpl) pc).pcInfo(t2.isAlive())) {
				System.out.print("\t\t\t\t\t\t     PC2실행중");
			} else if (!((PcRoomImpl) pc).pcInfo(t2.isAlive())) {
				System.out.print("\t\t\t\t\t\t     PC2대기중");
			}
			if (((PcRoomImpl) pc).pcInfo(t3.isAlive())) {
				System.out.print("\t\t\t\t\t\t    PC3실행중");
			} else if (!((PcRoomImpl) pc).pcInfo(t3.isAlive())) {
				System.out.print("\t\t\t\t\t\t    PC3대기중");
			} // pc 실행체크 끝
			System.out.println();
			System.out.println();
			
			System.out.println("\t\t\t\t\t\t======================================================================");
			System.out.println("\t\t\t\t\t\t|                             MAIN MENU                              |");
			System.out.println("\t\t\t\t\t\t|                                                                    |");
			System.out.println("\t\t\t\t\t\t|    1.PC선택  2.회원가입  3.매출  4.회원정보  5.회원탈퇴  6.종료    |");
			System.out.println("\t\t\t\t\t\t|                                                                    |");
			System.out.println("\t\t\t\t\t\t|                                                                    |");
			System.out.println("\t\t\t\t\t\t======================================================================");
			System.out.print("\t\t\t\t\t\t> ");
			set = sc.next();

			
			
			switch (set) {
			case "1": // pc선택
				System.out.println();
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("     PC를 선택하세요. (요금: 초당 100원)");
				System.out.println();
				System.out.print("   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZ     ZZZZZZZZZZZZZ   " + "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZ     ZZZZZZZZZZZZZ   " +  "   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZ     ZZZZZZZZZZZZZ \r\n" + 
						"   ZZ                        ZZ     Zw         zZ   " + "   ZZ                        ZZ     Zw         zZ   " + "   ZZ                        ZZ     Zw         zZ \r\n" + 
						"   ZZ           11           ZZ     ZD ZZZZZZZ ZZ   " + "   ZZ        222222          ZZ     ZD ZZZZZZZ ZZ   " + "   ZZ        333333          ZZ     ZD ZZZZZZZ ZZ \r\n" + 
						"   ZZ         1111           ZZ     Z5 zWWWWWz ZZ   " + "   ZZ       22   222         ZZ     Z5 zWWWWWz ZZ   " + "   ZZ       33    33         ZZ     Z5 zWWWWWz ZZ \r\n" + 
						"   ZZ           11           ZZ     Z5 zwwwww8 ZZ   " + "   ZZ            22          ZZ     Z5 zwwwww8 ZZ   " + "   ZZ             333        ZZ     Z5 zwwwww8 ZZ \r\n" + 
						"   ZZ           11           ZZ     Zy ZZZZZZZ ZZ   " + "   ZZ           22           ZZ     Zy ZZZZZZZ ZZ   " + "   ZZ         333333         ZZ     Zy ZZZZZZZ ZZ \r\n" + 
						"   ZZ           11           ZZ     Z5 ZZZZZZZ ZZ   " + "   ZZ          22            ZZ     Z5 ZZZZZZZ ZZ   " + "   ZZ             333        ZZ     Z5 ZZZZZZZ ZZ \r\n" + 
						"   ZZ           11           ZZ     ZB         ZZ   " + "   ZZ        222             ZZ     ZB         ZZ   " + "   ZZ       33    33         ZZ     ZB         ZZ \r\n" + 
						"   ZZ         111111         ZZ     Zz         ZZ   " + "   ZZ       222222222        ZZ     Zz         ZZ   " + "   ZZ        333333          ZZ     Zz         ZZ \r\n" + 
						"   ZZ                        9Z     Zz  zZZZ5  ZZ   " + "   ZZ                        9Z     Zz  zZZZ5  ZZ   " + "   ZZ                        9Z     Zz  zZZZ5  ZZ \r\n" + 
						"   ZZZZZZZZZZZZZy5ZZZZZZZZZZZZZ     Zz   ZZZ   ZZ   " + "   ZZZZZZZZZZZZZy5ZZZZZZZZZZZZZ     Zz   ZZZ   ZZ   " +"   ZZZZZZZZZZZZZy5ZZZZZZZZZZZZZ     Zz   ZZZ   ZZ \r\n" +
						"               ZZZZ                 Zz         ZZ   " + "               ZZZZ                 Zz         ZZ   " +"               ZZZZ                 Zz         ZZ \r\n" +
						"           E99yZZZZj99Z             Zz   5Zj   ZZ   " + "           E99yZZZZj99Z             Zz   5Zj   ZZ   " +"           E99yZZZZj99Z             Zz   5Zj   ZZ \r\n" +
						"                                    Zz    D    ZZ   " + "                                    Zz    D    ZZ   " +"                                    Zz    D    ZZ \r\n" +
						"   zz9B9B95Bj5j5y5yyjW5D9B9B98w     Z5 j,   ,y ZZ   " + "   zz9B9B95Bj5j5y5yyjW5D9B9B98w     Z5 j,   ,y ZZ   " + "   zz9B9B95Bj5j5y5yyjW5D9B9B98w     Z5 j,   ,y ZZ \r\n" + 
						"  ZZ Z Z Z Z Z E Dy,ZBZ Z Z Z ZD    ZwwZZZ5Z8Z zZ   " + "  ZZ Z Z Z Z Z E Dy,ZBZ Z Z Z ZD    ZwwZZZ5Z8Z zZ   " +"  ZZ Z Z Z Z Z E Dy,ZBZ Z Z Z ZD    ZwwZZZ5Z8Z zZ \r\n" +
						" ZZ ZWZwjZ ZwZyZ9ZZ5Z,Z Z BZ Z ZZ   ZZW5WjWjW5WZZ   " + " ZZ ZWZwjZ ZwZyZ9ZZ5Z,Z Z BZ Z ZZ   ZZW5WjWjW5WZZ   " + " ZZ ZWZwjZ ZwZyZ9ZZ5Z,Z Z BZ Z ZZ   ZZW5WjWjW5WZZ \r\n" + 
						" ZEB9B889988DzBzBBzBzD98E889zEBZZW  jEZZZZZZZZZEW   " + " ZEB9B889988DzBzBBzBzD98E889zEBZZW  jEZZZZZZZZZEW   " + " ZEB9B889988DzBzBBzBzD98E889zEBZZW  jEZZZZZZZZZEW \n");
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("|                    1.PC1                      |                       2.PC2                        |                       3.PC3                       |                   4.취소                    |");
				System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.print("> ");
				set = sc.next();
				
				
				
				switch (set) {
				case "1":
					// pc1 ------------------------------------------------------------------------------------------------
					System.out.println();
					System.out.print("ID: ");
					String setId = sc.next().trim();
					if (t.isAlive()) { // 스레드가 죽었는지 살았는지
						pc.signIn(setId);
						System.out.println("\t\t사용중인PC");
					} else if (!pc.signIn(setId)) {
						System.out.println("사용불가!!");
						continue;
					} else if (t.getState() == State.TERMINATED) {
						t = new PcTread();
					} else if (!t.isAlive()) {
						System.out.println("\t\t대기중인PC");
					}
					System.out.println("============================================");
					System.out.println("|               PC1 MENU                   |");
					System.out.println("|    1.PC시작  2.PC종료  3.음식  4.취소    |");
					System.out.println("|                                          |");
					System.out.println("============================================");
					System.out.print("> ");

					set = sc.next();
					switch (set) {
					case "1":
						if (t.isAlive()) {
							System.out.println("이미실행중");
							continue;
						}
						System.out.println();
						System.out.print("PC1 실행중");
						zumThread();
						System.out.println();
						System.out.println();
						System.out.println("PC1 시작!!");
						System.out.println();
						System.out.println();
						pc.sound();
						pc.logplus(setId);
						t.start();
						try {
							Thread.sleep(2000);
						} catch (Exception e) {
							// TODO: handle exception
						}
						continue;
					case "2":
						System.out.print("logout id? ");
						String setId_1 = sc.next().trim();
						boolean b1 = pc.blockremove(setId_1, setId);
							if(b1) {
								System.out.println("-------------------------------------------------");
								System.out.println("\t\t<<PC1 종료>>");
								System.out.println();
								pc.soundE();
								t.stopCom(true);
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								((PcRoomImpl) pc).setProceeds(t.getCash() + ((PcRoomImpl) pc).foodCash()); // PcRoomImpl의 매출값 누적
								int cash = t.getCash(); // 스레드 끝나고 가져온 시간당 금액
								System.out.println();
								System.out.println("   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZ     ZZZZZZZZZZZZZ   " ); lodingThread();
								System.out.println("   ZZ                        ZZ     Zw         zZ   " ); lodingThread(); 
								System.out.println("   ZZ        <영수증>        ZZ     ZD ZZZZZZZ ZZ   " ); lodingThread();
								System.out.println("   ZZ                        ZZ     Z5 zWWWWWz ZZ   " ); lodingThread();
								System.out.printf("   ZZ   PC요금:   %5d   원 ZZ     Z5 zwwwww8 ZZ   \n" , cash); lodingThread();
								System.out.println("   ZZ                        ZZ     Zy ZZZZZZZ ZZ   " ); lodingThread();
								System.out.printf("   ZZ   Food요금: %5d   원 ZZ     Z5 ZZZZZZZ ZZ   \n" , ((PcRoomImpl) pc).foodCash()); lodingThread();
								System.out.println("   ZZ                        ZZ     ZB         ZZ   " ); lodingThread();
								System.out.printf("   ZZ   사용요금: %5d   원 ZZ     Zz         ZZ   \n" , (cash + ((PcRoomImpl) pc).foodCash())); lodingThread();
								System.out.println("   ZZ                        9Z     Zz  zZZZ5  ZZ   " ); lodingThread();
								System.out.println("   ZZZZZZZZZZZZZy5ZZZZZZZZZZZZZ     Zz   ZZZ   ZZ   " ); lodingThread();
								System.out.println("               ZZZZ                 Zz         ZZ   " ); lodingThread();
								System.out.println("           E99yZZZZj99Z             Zz   5Zj   ZZ   " ); lodingThread();
								System.out.println("                                    Zz    D    ZZ   " ); lodingThread();
								System.out.println("   zz9B9B95Bj5j5y5yyjW5D9B9B98w     Z5 j,   ,y ZZ   " ); lodingThread();
								System.out.println("  ZZ Z Z Z Z Z E Dy,ZBZ Z Z Z ZD    ZwwZZZ5Z8Z zZ   " ); lodingThread();
								System.out.println(" ZZ ZWZwjZ ZwZyZ9ZZ5Z,Z Z BZ Z ZZ   ZZW5WjWjW5WZZ   " ); lodingThread();
								System.out.println(" ZEB9B889988DzBzBBzBzD98E889zEBZZW  jEZZZZZZZZZEW   "); lodingThread();
								System.out.println("------------------------------------------------");
								System.out.println();
								System.out.println();
									try {
										Thread.sleep(5000);
									} catch (Exception e) {
										// TODO: handle exception
									}
								((PcRoomImpl) pc).listReset(); // 음식값 list 초기화
								}
						continue;
					case "3":
						if(!t.isAlive()) {
							System.out.println("PC가 꺼져있습니다.");
							continue;
						}
						pc.food();
						continue;
					default:
						continue;

					} // pc1...end----------------------------------------------------------------------------------------

				case "2":
					// pc2 -----------------------------------------------------------------------------------------------
					System.out.println();
					System.out.print("ID: ");
					String setId2 = sc.next().trim();
					if (t2.isAlive()) {
						pc.signIn(setId2);
						System.out.println("\t\t사용중인PC");
					} else if (!pc.signIn(setId2)) {
						System.out.println("사용불가!!");
						continue;
					} else if (t2.getState() == State.TERMINATED) {
						t2 = new PcTread();
					} else if (!t2.isAlive()) {
						System.out.println("\t\t대기중인PC");
					}
					System.out.println("============================================");
					System.out.println("|               PC2 MENU                   |");
					System.out.println("|    1.PC시작  2.PC종료  3.음식  4.취소    |");
					System.out.println("|                                          |");
					System.out.println("============================================");
					System.out.print("> ");

					set = sc.next();

					switch (set) {
					case "1":
						if (t2.isAlive()) {
							System.out.println("이미실행중");
							continue;
						}
						System.out.println();
						System.out.print("PC2 실행중");
						zumThread();
						System.out.println();
						System.out.println();
						System.out.println("PC2 시작!!");
						System.out.println();
						System.out.println();
						pc.sound();
						pc.logplus(setId2);
						t2.start();
						try {
							Thread.sleep(200);
						} catch (Exception e) {
							// TODO: handle exception
						}
						continue;
					case "2":
						System.out.print("logout id? ");
						String setId_1 = sc.next().trim();
						boolean b1 = pc.blockremove(setId_1, setId2);
							if(b1) {
								System.out.println("-------------------------------------------------");
								System.out.println("\t\t<<PC2 종료>>");
								System.out.println();
								pc.soundE();
								t2.stopCom(true);
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								((PcRoomImpl) pc).setProceeds(t2.getCash() + ((PcRoomImpl) pc2).foodCash()); // PcRoomImpl의 매출값 누적
								int cash = t2.getCash(); // 스레드 끝나고 가져온 시간당 금액
								System.out.println();
								System.out.println("   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZ     ZZZZZZZZZZZZZ   " ); lodingThread();
								System.out.println("   ZZ                        ZZ     Zw         zZ   " ); lodingThread(); 
								System.out.println("   ZZ        <영수증>        ZZ     ZD ZZZZZZZ ZZ   " ); lodingThread();
								System.out.println("   ZZ                        ZZ     Z5 zWWWWWz ZZ   " ); lodingThread();
								System.out.printf("   ZZ   PC요금:   %5d   원 ZZ     Z5 zwwwww8 ZZ   \n" , cash); lodingThread();
								System.out.println("   ZZ                        ZZ     Zy ZZZZZZZ ZZ   " ); lodingThread();
								System.out.printf("   ZZ   Food요금: %5d   원 ZZ     Z5 ZZZZZZZ ZZ   \n" , ((PcRoomImpl) pc2).foodCash()); lodingThread();
								System.out.println("   ZZ                        ZZ     ZB         ZZ   " ); lodingThread();
								System.out.printf("   ZZ   사용요금: %5d   원 ZZ     Zz         ZZ   \n" , (cash + ((PcRoomImpl) pc2).foodCash())); lodingThread();
								System.out.println("   ZZ                        9Z     Zz  zZZZ5  ZZ   " ); lodingThread();
								System.out.println("   ZZZZZZZZZZZZZy5ZZZZZZZZZZZZZ     Zz   ZZZ   ZZ   " ); lodingThread();
								System.out.println("               ZZZZ                 Zz         ZZ   " ); lodingThread();
								System.out.println("           E99yZZZZj99Z             Zz   5Zj   ZZ   " ); lodingThread();
								System.out.println("                                    Zz    D    ZZ   " ); lodingThread();
								System.out.println("   zz9B9B95Bj5j5y5yyjW5D9B9B98w     Z5 j,   ,y ZZ   " ); lodingThread();
								System.out.println("  ZZ Z Z Z Z Z E Dy,ZBZ Z Z Z ZD    ZwwZZZ5Z8Z zZ   " ); lodingThread();
								System.out.println(" ZZ ZWZwjZ ZwZyZ9ZZ5Z,Z Z BZ Z ZZ   ZZW5WjWjW5WZZ   " ); lodingThread();
								System.out.println(" ZEB9B889988DzBzBBzBzD98E889zEBZZW  jEZZZZZZZZZEW   "); lodingThread();
								System.out.println("------------------------------------------------");
								System.out.println();
								System.out.println();
								try {
									Thread.sleep(5000);
								} catch (Exception e) {
									// TODO: handle exception
								}
							((PcRoomImpl) pc2).listReset(); // 음식값 list 초기화
							}
						continue;
					case "3":
						if(!t2.isAlive()) {
							System.out.println("PC가 꺼져있습니다.");
							continue;
						}
						pc2.food();
						continue;
					default:
						continue;
					} // pc2...end ----------------------------------------------------------------------------------------

				case "3":
					// pc3-------------------------------------------------------------------------------------------------
					System.out.println();
					System.out.print("ID: ");
					String setId3 = sc.next().trim();
					if (t3.isAlive()) {
						pc.signIn(setId3);
						System.out.println("\t\t사용중인PC");
					} else if (!pc.signIn(setId3)) {
						System.out.println("사용불가!!");
						continue;
					} else if (t3.getState() == State.TERMINATED) {
						t3 = new PcTread();
					} else if (!t3.isAlive()) {
						System.out.println("\t\t대기중인PC");
					}
					System.out.println("============================================");
					System.out.println("|               PC3 MENU                   |");
					System.out.println("|    1.PC시작  2.PC종료  3.음식  4.취소    |");
					System.out.println("|                                          |");
					System.out.println("============================================");
					System.out.print("> ");

					set = sc.next();

					switch (set) {
					case "1":
						if (t3.isAlive()) {
							System.out.println("이미실행중");
							continue;
						}
						System.out.println();
						System.out.print("PC3 실행중");
						zumThread();
						System.out.println();
						System.out.println();
						System.out.println("PC3 시작!!");
						System.out.println();
						System.out.println();
						pc.sound();
						pc.logplus(setId3);
						t3.start();
						try {
							Thread.sleep(200);
						} catch (Exception e) {
							// TODO: handle exception
						}
						continue;
					case "2":
						System.out.print("logout id? ");
						String setId_1 = sc.next().trim();
						boolean b1 = pc.blockremove(setId_1, setId3);
							if(b1) {
								System.out.println("-------------------------------------------------");
								System.out.println("\t\t<<PC3 종료>>");
								System.out.println();
								pc.soundE();
								t3.stopCom(true);
								try {
									Thread.sleep(200);
								} catch (Exception e) {
									// TODO: handle exception
								}
								((PcRoomImpl) pc).setProceeds(t3.getCash() + ((PcRoomImpl) pc3).foodCash()); // PcRoomImpl의 매출값 누적
								int cash = t3.getCash(); // 스레드 끝나고 가져온 시간당 금액
								System.out.println();
								System.out.println("   ZZZZZZZZZZZZZZZZZZZZZZZZZZZZ     ZZZZZZZZZZZZZ   " ); lodingThread();
								System.out.println("   ZZ                        ZZ     Zw         zZ   " ); lodingThread(); 
								System.out.println("   ZZ        <영수증>        ZZ     ZD ZZZZZZZ ZZ   " ); lodingThread();
								System.out.println("   ZZ                        ZZ     Z5 zWWWWWz ZZ   " ); lodingThread();
								System.out.printf("   ZZ   PC요금:   %5d   원 ZZ     Z5 zwwwww8 ZZ   \n" , cash); lodingThread();
								System.out.println("   ZZ                        ZZ     Zy ZZZZZZZ ZZ   " ); lodingThread();
								System.out.printf("   ZZ   Food요금: %5d   원 ZZ     Z5 ZZZZZZZ ZZ   \n" , ((PcRoomImpl) pc3).foodCash()); lodingThread();
								System.out.println("   ZZ                        ZZ     ZB         ZZ   " ); lodingThread();
								System.out.printf("   ZZ   사용요금: %5d   원 ZZ     Zz         ZZ   \n" , (cash + ((PcRoomImpl) pc3).foodCash())); lodingThread();
								System.out.println("   ZZ                        9Z     Zz  zZZZ5  ZZ   " ); lodingThread();
								System.out.println("   ZZZZZZZZZZZZZy5ZZZZZZZZZZZZZ     Zz   ZZZ   ZZ   " ); lodingThread();
								System.out.println("               ZZZZ                 Zz         ZZ   " ); lodingThread();
								System.out.println("           E99yZZZZj99Z             Zz   5Zj   ZZ   " ); lodingThread();
								System.out.println("                                    Zz    D    ZZ   " ); lodingThread();
								System.out.println("   zz9B9B95Bj5j5y5yyjW5D9B9B98w     Z5 j,   ,y ZZ   " ); lodingThread();
								System.out.println("  ZZ Z Z Z Z Z E Dy,ZBZ Z Z Z ZD    ZwwZZZ5Z8Z zZ   " ); lodingThread();
								System.out.println(" ZZ ZWZwjZ ZwZyZ9ZZ5Z,Z Z BZ Z ZZ   ZZW5WjWjW5WZZ   " ); lodingThread();
								System.out.println(" ZEB9B889988DzBzBBzBzD98E889zEBZZW  jEZZZZZZZZZEW   "); lodingThread();
								System.out.println("------------------------------------------------");
								System.out.println();
								System.out.println();
								try {
									Thread.sleep(5000);
								} catch (Exception e) {
									// TODO: handle exception
								}
							((PcRoomImpl) pc3).listReset(); // 음식값 list 초기화
							}
						continue;
					case "3":
						if(!t3.isAlive()) {
							System.out.println("PC가 꺼져있습니다.");
							continue;
						}
						pc3.food();
						continue;
					default:
						continue;
					} // pc3...end---------------------------------------------------------------------------------------------

				default:
					System.out.println("메인으로...");
					continue;
				} // pc선택...end----------------------------------------------------------------------------------------------

			case "2":
				pc.signUp();
				break;
			case "3":
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("                     ,j5y5W,         \r\n" + 
						"              zZZZZZZZZZZZZZZZZZZZj               \r\n" + 
						"           ZZZZZZZZZZZZZZZZZZZZZZZZZZB            \r\n" + 
						"        ,ZZZZZZZZw             5ZZZZZZZ9          \r\n" + 
						"       ZZZZZZ5                     ZZZZZZZ        \r\n" + 
						"     ZZZZZZw                         DZZZZZ,      \r\n" + 
						"    ZZZZZw             ZZZ             ZZZZZB     \r\n" + 
						"   ZZZZZ               ZZE               ZZZZZ    \r\n" + 
						"  ZZZZZ             yZZZZZZZz             ZZZZ8   \r\n" + 
						" ZZZZZ            ZZZZZZZZZZZZZE           ZZZZ   \r\n" + 
						" ZZZZ            8ZZZZ8WWW5ZZZW            8ZZZZ  \r\n" + 
						",ZZZ5            ZZZZB                      ZZZZ  \r\n" + 
						"BZZZ             ZZZZZZ8                    ZZZZE \r\n" + 
						"EZZZ             jZZZZZZZZZZ9               jZZZZ \r\n" + 
						"ZZZZ               DZZZZZZZZZZZZ             ZZZZ     " + "[ 총매출액: " + ((PcRoomImpl) pc).getProceeds() + "원 ]\n" +
						"ZZZZ                   5ZZZZZZZZZ           wZZZZ \r\n" + 
						"BZZZ                        ZZZZZ           ZZZZZ \r\n" + 
						"wZZZW                       ZZZZZ           ZZZZ  \r\n" + 
						" ZZZZ            5ZZZ9     5ZZZZW          5ZZZZ  \r\n" + 
						" ZZZZZ          8ZZZZZZZZZZZZZZj           ZZZZW  \r\n" + 
						"  ZZZZ9            EZZZZZZZZZ             ZZZZZ   \r\n" + 
						"   ZZZZZ               ZZE               ZZZZZ    \r\n" + 
						"    ZZZZZ              ZZZ             zZZZZZ     \r\n" + 
						"     ZZZZZZ                           ZZZZZD      \r\n" + 
						"      yZZZZZZ                      jZZZZZZ        \r\n" + 
						"        EZZZZZZZw               zZZZZZZZW         \r\n" + 
						"          ,ZZZZZZZZZZZE888ZZZZZZZZZZZZ            \r\n" + 
						"             5ZZZZZZZZZZZZZZZZZZZZZ               \r\n" + 
						"                  5ZZZZZZZZZZ8W          ");
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();

				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			case "4":
				pc.userInfo();
				break;
			case "5":
				pc.deleteId();
				break;
			case "6":
				if(t.isAlive() || t2.isAlive() || t3.isAlive()) {
					pc.soundER();
					System.out.println("\n\n"+
							"\t\t\t\t\t\t\t                        wW,                       \r\n" + 
							"\t\t\t\t\t\t\t                      ,jjjjW                      \r\n" + 
							"\t\t\t\t\t\t\t                     ,WjjjjjW                     \r\n" + 
							"\t\t\t\t\t\t\t                     WjjjjjjjW                    \r\n" + 
							"\t\t\t\t\t\t\t                    WjjjjjjjjjW                   \r\n" + 
							"\t\t\t\t\t\t\t                   WjjjjjjjjjjjW                  \r\n" + 
							"\t\t\t\t\t\t\t                  wjjjjjjjjjjjjjW                 \r\n" + 
							"\t\t\t\t\t\t\t                 wWjjW      WjjjWw                \r\n" + 
							"\t\t\t\t\t\t\t                ,WWWW  ZZZZ  WWWWjw               \r\n" + 
							"\t\t\t\t\t\t\t                WjjWW ZZZZZZ WWjjWW               \r\n" + 
							"\t\t\t\t\t\t\t               WWWjjW ZZZZZZ jjWWWWW              \r\n" + 
							"\t\t\t\t\t\t\t              WWWWWWW 8ZZZZZ WWWWWWjW             \r\n" + 
							"\t\t\t\t\t\t\t             wWWWWWWW  ZZZZy WWWWWWWWw            \r\n" + 
							"\t\t\t\t\t\t\t            wWWWWWWWWw ZZZZ  WWWWWWWWWw           \r\n" + 
							"\t\t\t\t\t\t\t           wWWWWWWWWWW ZZZZ WWWWWWWWWWW,          \r\n" + 
							"\t\t\t\t\t\t\t          ,WWWWWWWWWWW 5ZZ9 WWWWWWWWWWWW          \r\n" + 
							"\t\t\t\t\t\t\t          WWWWWWWWWWWW  ZZ  WWWWWWWWWWWWW         \r\n" + 
							"\t\t\t\t\t\t\t         WWWWWWWWWWWWWw ZZ ,WWWWWWWWWWWWWw        \r\n" + 
							"\t\t\t\t\t\t\t        WWWWWWWWWWWWWWW ZZ WWWWWWWWWWWWWWW,       \r\n" + 
							"\t\t\t\t\t\t\t       wWWWWWWWWWWWWWw      wWWWWWWWWWWWWWW,      \r\n" + 
							"\t\t\t\t\t\t\t      wWWWWWWWWWWWWWW  ZZZZ, WWWWWWWWWWWWWWW      \r\n" + 
							"\t\t\t\t\t\t\t     ,WWWWWWWWWWWWWWW ZZZZZZ WWWWWWWWWWWWWWWW     \r\n" + 
							"\t\t\t\t\t\t\t    ,WWWWWWWWWWWWWWWW  ZZZZ  WWWWWWWWWWWWWWWWw    \r\n" + 
							"\t\t\t\t\t\t\t   ,WWWWWWWWWWWWWWWWWW      wWWWWWWWWWWWWWWWWWw   \r\n" + 
							"\t\t\t\t\t\t\t   WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW,  \r\n" + 
							"\t\t\t\t\t\t\t  wwWwWwWwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwWwWwWWw  \r\n" + 
							"\t\t\t\t\t\t\t zjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjy \r\n" );
					System.out.println("\t\t\t\t\t\t\t\t\t        <경고>");
					System.out.println("\t\t\t\t\t\t\t\t\tPC가 켜져있습니다.");
					System.out.println("\t\t\t\t\t\t\t\t\tPC를끄고 종료해주세요.\n\n\n\n\n");
					try {
						Thread.sleep(5000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					continue;
				}
				System.out.println("프로그램 종료");
				System.exit(0);
			default:
				System.out.println("잘못입력되었습니다.");
				continue;

			} // switch...end

		}

	}

	public static void lodingThread() {
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void zumThread() {
		for(int i = 0; i < 10; i++) {
			System.out.print(".");
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
