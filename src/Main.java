public class Main {

    public static void main(String[] args) {
	// write your code here
        MovePoint movePoint = new MovePoint(3,6);
        MoveablePoint moveablePoint = new MoveablePoint(3,6,5,7);
        System.out.println(moveablePoint.move());
    }
}
