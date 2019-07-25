public class Bubbles {

    public static void main(String[] args) {
        String[] color = {"red", "green", "yellow", "black"};
        int n = (int) (Math.random() * color.length);
        System.out.println("Цвет пузырика: " + n);
    }
}