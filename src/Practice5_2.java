
public class Practice5_2 {
	public static void main(String[] args) {
		email("参加の御礼", "abc@gmail.com", "ご参加いただきありがとうございました。");
		System.out.println("==============================");
		email("xyz@gmail.com", "内定おめでとうございます。");
	}
	
	public static void email(String title, String address, String text) {
		System.out.println("「" + address + "」に以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	public static void email(String address, String text) {
		System.out.println("「" + address + "」に以下のメールを送信しました。");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
}
