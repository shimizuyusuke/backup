
public class Test {

	public static void main(String[] args) {
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phonenumber="090-1111-1111";
		taro.address="東京";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phonenumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phonenumber="080-2222-2222";
		jiro.address="埼玉";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phonenumber);
		System.out.println(jiro.address);

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=	16;
		hanako.phonenumber="03-3333-3333";
		hanako.address="神奈川";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phonenumber);
		System.out.println(hanako.address);

		Person yusuke=new Person();
		yusuke.name="清水佑介";
		yusuke.age=28;
		yusuke.phonenumber="080-4444-4444";
		yusuke.address="東京";
		System.out.println(yusuke.name);
		System.out.println(yusuke.age);
		System.out.println(yusuke.phonenumber);
		System.out.println(yusuke.address);

		Robot aibo=new Robot();
		aibo.name="aibo";
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();




	}

}
