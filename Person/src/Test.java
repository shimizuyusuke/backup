/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="000-0000-0000";
		taro.address="東京";
		taro.talk();
		taro.walk();
		taro.run();
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="111-1111-1111";
		jiro.address="埼玉";
		jiro.talk();
		jiro.walk();
		jiro.run();
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="222-2222-2222";
		hanako.address="千葉";
		hanako.talk();
		hanako.walk();
		hanako.run();
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);

		Person yusuke=new Person();
		yusuke.name="清水佑介";
		yusuke.age=28;
		yusuke.phoneNumber="333-3333-3333";
		yusuke.address="東京";
		yusuke.talk();
		yusuke.walk();
		yusuke.run();
		System.out.println(yusuke.name);
		System.out.println(yusuke.age);
		System.out.println(yusuke.phoneNumber);
		System.out.println(yusuke.address);

		Robot aibo=new Robot();
		aibo.name="aibo";
        aibo.talk();
        aibo.walk();
        aibo.run();




	}

}
