package kadai_026;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	//自分のじゃんけんの手を入力
	 public String getMyChoice () {
	        // Scannerクラスのオブジェクトを生成する
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("自分のじゃんけんの手を入力しましょう");
	            System.out.println("グーはrockのrを入力しましょう");
	            System.out.println("チョキはscissorsのsを入力しましょう");
	            System.out.println("パーはpaperのpを入力しましょう");

	            // 入力した内容を取得
	            String input = scanner.next();

	            // 正しいじゃんけんの手であるか
	            if ((input.equals("r")) || (input.equals("s")) || (input.equals("p"))) {
	                // Scannerクラスのオブジェクトをクローズする
	                scanner.close();
	                return input;
	            } else {
	                System.out.println("正しいじゃんけんの手ではありません");
	            }
	            return getMyChoice ();
	        }   
	}

	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		Random random = new Random();
		//配列にじゃんけんの手をセット
		String[] hands = { "r", "s", "p" };

		//乱数で対戦相手のじゃんけんの手を選ぶ
		int num = random.nextInt(3);

		//じゃんけんクラスを実行するクラスに、対戦相手のじゃんけんの手を返す
		return hands[num];
	}

	//じゃんけんを行う
	public void playGame() {

		//自分と対戦相手のじゃんけんの手を出力
		HashMap<String, String> jyankenMap = new HashMap<String, String>();

		jyankenMap.put("r", "グー");
		jyankenMap.put("s", "チョキ");
		jyankenMap.put("p", "パー");

		//自分の手
		String myChoiceHands = getMyChoice();
		//相手の手
		String opponentChoiceHands = getRandom();

		//自分と対戦相手のじゃんけんの手の比較
		System.out.println("自分の手は" + jyankenMap.get(myChoiceHands) + ",対戦相手の手は" + jyankenMap.get(opponentChoiceHands));

		//じゃんけんの結果を出力
		if (myChoiceHands.equals(opponentChoiceHands)) {
			System.out.println("あいこです");
		} else if ((myChoiceHands.equals("r")) && (opponentChoiceHands.equals("s")) ||
				(myChoiceHands.equals("s")) && (opponentChoiceHands.equals("p")) ||
				(myChoiceHands.equals("p")) && (opponentChoiceHands.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}
