/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person2 p=new Person2();

		Person2 taro=new  Person2();
		taro.name="taro";
		taro.age=18;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person2 jiro=new Person2("jiro",20);
        System.out.println(jiro.name);
        System.out.println(jiro.age);

        Person2 saburo=new Person2("saburo");
        System.out.println(saburo.name);
        System.out.println(saburo.age);

        Person2 namaenashi=new Person2(25);
        System.out.println(namaenashi.name);
        System.out.println(namaenashi.age);

        Person2 hanako=new Person2(17,"hanako");
        System.out.println(hanako.name);
        System.out.println(hanako.age);






	}



}
