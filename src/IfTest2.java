//IfTest2 xが7,8,9ながbignumber
//xが4,5,6ならmiddle number
//xが1,2,3ならsmall numberを表示するプログラムを書け


public class IfTest2 {
	public static void main(String[] args) { 
		int x=Integer.parseInt(args[0]);
		if(x>=7){
			System.out.println(x+" is Big Number");
		}else if (x>=4&&x<7) {
			System.out.println(x+" is Middle Number");
		}else if (x>=1&&x<3) {
			System.out.println(x+" is Small Number");
		}
	/*ここにelse if文を追加する。**/
	

	}//main end
}//class end

