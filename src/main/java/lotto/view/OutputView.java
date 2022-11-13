package lotto.view;

import java.util.List;

public class OutputView {

    public static void writeLottoTickets(List<List<String>> tickets){
        System.out.println(tickets.size()+"개를 구매했습니다.");
        for (List<String> ticket : tickets){
            System.out.println(ticket);
        }
        System.out.println();
    }

    public static void writeWinningResult(List<Integer> numbers){
        System.out.println("당첨 통계");
        System.out.println("---");
        System.out.println("3개 일치 (5,000원) - "+numbers.get(0)+"개");
        System.out.println("4개 일치 (50,000원) - "+numbers.get(1)+"개");
        System.out.println("5개 일치 (1,500,000원) - "+numbers.get(2)+"개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - "+numbers.get(3)+"개");
        System.out.println("6개 일치 (2,000,000,000원) - "+numbers.get(4)+"개");
    }
}
