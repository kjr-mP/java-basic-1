// C言語では、#include に相当する
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowOldAreYou {

	public static void main(String[] args) { 

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			// BufferedReader というのは、データ読み込みのクラス(型)
			// クラスの変数を作るには、new を使う。

			// readLine() は、入出力エラーの可能性がある。エラー処理がないとコンパイルできない。
			//  Java では、 try{ XXXXXXXX }  catch(エラーの型 変数) { XXXXXXXXXXXXXXXXXX} と書く
		while (true){
			try {
			System.out.print("現在の年齢を入力してください (qまたはeで終了): ");
			String line = reader.readLine();
			if(line.equals("q")||line.equals("e")){break;}
			int age = Integer.parseInt(line);
			if(age>=120||age<0){continue;}
			int birth = 2024-age;
			String era="";
			int month=0;
			if(birth>=2019){
				era="令和";
				month=birth-2019;
			}else if(birth>=1989){
				era="平成";
				month=birth-1989;
			}else if(birth>=1928){
				era="昭和";
				month=birth-1928;
			}else if(birth>=1912){
				era="大正";
				month=birth-1912;
			}else if(birth>=1868){
				era="明治";
				month=birth-1868;
			}
			System.out.println("あなたは" + age + "歳ですね。");
			System.out.println("あなたは2030年では" + (age+30-24) + "歳ですね。");
			System.out.println("あなたは" + era + month + "年生まれですね。");
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
		
	}
}

//  課題    キーボードから数字を打ち込む
//  その結果、 あなたは、???歳ですね、と画面に表示させる。
//  その後、あなたは10年後、????歳ですね、と画面に表示させる。

