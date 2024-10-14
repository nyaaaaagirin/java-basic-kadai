package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// Dictionary_Chapter21のインスタンスを作成
		Dictionary_Chapter21 meaning = new Dictionary_Chapter21();

		//調べる英単語を配列にセット
		String[] word = {"apple", "banana", "grape", "orange"};

		//辞書を調べる
		meaning.seachWord(word);
	}
}
