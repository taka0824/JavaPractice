
public class Practice5_4 {
	public static void main(String[] args) {
		int bottom = 7;
		int height = 10;
		double triangleArea = calcTriangleArea(bottom, height);
		System.out.println("底辺が" + bottom + ",高さが" + height + "の三角形の面積は" + triangleArea + "です");		
		
		int radius = 8;
		System.out.println("半径が" + radius + "の円の面積は" + calcCircleArea(radius) + "です");
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}
	
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}
}
