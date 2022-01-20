class Person {
    public String name;
    public int age;
    //課�?3
    //メンバ変数にHealthを追�?する
    //public final Health health;

    //課�?2
    //firstName,lastName,ageを引数としたコンストラクタ
    Person(String firstName, String lastName, int age) {
        this.name = firstName + " " + lastName;
		this.age = age;
    }

    //課�?3
    //healthを使って身長・体重の�?ータを更新する
    //void updateHealth(double height, double weight) {
    //
    //}

}