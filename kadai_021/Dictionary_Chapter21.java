package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	//辞書として機能する
	public HashMap<String, String> dictionary = new HashMap<String, String>();{
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawbetty", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}

	public void seachWord(String[] words) {
		//調べる英単語が辞書に追加されているか判定
		for (String word : words) {
			if (dictionary.containsKey(word)) {
				System.out.println(word + "の意味は" + dictionary.get(word));
			} else {
				System.out.println(word + "は辞書に存在しません");
			}
			
		}
	}
}
