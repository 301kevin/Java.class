import java.util.Scanner;

public class Practice11_1 {
   static int menu() {
      Scanner sc = new Scanner(System.in);
      int num = 0;
      System.out.println("**************");
       System.out.println("1. 입고");
       System.out.println("2. 출고");
       System.out.println("3. 목록");
       System.out.println("4. 종료");
       System.out.println("**************");
       System.out.printf("메뉴 : ");
       num = sc.nextInt();
      return num;
   }

   static int in_goods(int goods_cnt, String[] name, int[] gaesu, int[] price) {
      Scanner sc = new Scanner(System.in);
       if(goods_cnt < 5) {
         System.out.print("품명 : ");
          name[goods_cnt] = sc.next();
          System.out.print("수량 : ");
          gaesu[goods_cnt] = sc.nextInt();
          System.out.print("단가 : ");
          price[goods_cnt] = sc.nextInt();
          System.out.println();
          goods_cnt++;
          System.out.println("입고 되었습니다.");
       } else {
          System.out.println("더 이상 입고 시킬수가 없습니다.");
       }
       return goods_cnt;
   }

   static void out_goods(int goods_cnt, String[] name, int[] gaesu) {
      Scanner sc = new Scanner(System.in);
       System.out.print("품명 : ");
       String str = sc.next();
       System.out.print("수량 : ");
       int num_temp = sc.nextInt();
       int flag = -1;   // -1 : 품명 없음, 1: 품명 있음, 양수 : 긍정, 0 : 중립, 음수 : 부정
       
       for(int i=0; i<goods_cnt; i++) {
          if(name[i].equals(str)) {      // 품명이 같을 경우
             flag = 1;  // 품명 있음으로 상태값을 바꿔서 저장
             if(gaesu[i] >= num_temp) {  // 재고가 충분한지 검사
                gaesu[i] -= num_temp;
                System.out.println("출고 되었습니다.");
             } else {
                System.out.println("재고가 부족합니다. => 현재 재고 : " + gaesu[i]);
             }
             break; // for문 탈출
          }
       }
       
       if(flag == -1) System.out.println(str + " 품명이 없습니다.");       
   }

   static void compute(int goods_cnt, int[] gaesu, int[] price, int[] tot) {
      for(int i=0; i<goods_cnt; i++) {
         tot[i] = gaesu[i] * price[i];
      }
   }

   static void output_list(int goods_cnt, String[] name, int[] gaesu, 
                     int[] price, int[]tot) {      
      // \n : 줄넘김 문자, \t : 탭문자
      System.out.printf("%s\t %s\t %s\t %s\t\n", "품명", "수량", "단가(원)", 
                                       "총액(원)");
      for(int i=0; i<goods_cnt; i++) {
            System.out.printf("%s\t %s\t %s\t %s\t\n", name[i], gaesu[i], 
                                             price[i], tot[i]);
       }
   }

   public static void main(String[] args) {
      // 선언
      String[] name = new String[5];   // 품명
       int[] gaesu = new int[5];      // 수량
       int[] price = new int[5];      // 단가
       int[] tot = new int[5];         // 총액
       int goods_cnt=0;   // 품목 갯수 저장
       int menu_num=0;      // 메뉴번호

      while(true) {
         menu_num = menu();
         System.out.println();

         switch(menu_num) {
         case 1 : // 입고
            goods_cnt = in_goods(goods_cnt, name, gaesu, price);
            break;
         case 2 : // 출고
            out_goods(goods_cnt, name, gaesu);
            break;
         case 3 : // 목록보기
            // 총액 구하기
            compute(goods_cnt, gaesu, price, tot);
            output_list(goods_cnt, name, gaesu, price, tot);
            break;
         case 4 : // 종료
            System.out.println("프로그램 종료");
            System.exit(0);
         }
         System.out.println();
		}
	}
}