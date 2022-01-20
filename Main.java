//課�?4
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	//課�?4
        //名前,年齢を�?�力する機�?�を追�?する
        //Scanner scanner = new Scanner(System.in);
    	
    	//課�?2
    	//名前,年齢をPersonクラスのオブジェクト生成に変更する
		Person person = new Person("Kate", "Jones", 20);
        
        //課�?4
        //身長,体重を�?�力する機�?�
        
        //課�?3
    	//身長,体重,BMIをHealthクラスで定義および計算するよ�?に変更する
    	//printDataメソ�?ドを使って名前,年齢,身長,体重,BMIを表示する
        double height = 1.735;
        double weight = 67.0;
        double bmi = weight / height / height;
        
		//課�?4
        //scanner.close();
        
        //課�?1
        //名前,年齢,身長,体重,BMIの表示
        System.out.println("私�?�名前は" + person.name + "で�?");
        System.out.println("年齢は" + person.age + "歳で�?");
        System.out.println("身長は" + height + "mで�?");
        System.out.println("体重は" + weight + "kgで�?");
        System.out.println("BMIは" + bmi + "で�?");
        

    }
    // 課�?3
    /*
	public static void printData(Person person) {
	}
	*/
}