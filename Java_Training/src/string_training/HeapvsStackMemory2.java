package stringexample;


// https://www.journaldev.com/3884/java-is-pass-by-value-and-not-pass-by-reference

public class HeapvsStackMemory2 {
    public static void main(String[] args) {
        int i = 10; // primitive locals created in stack memory
        Balloon red = new Balloon("red"); // red Balloon object created in heap. Memory reference 50
        Balloon blue = new Balloon("blue"); // blue Balloon object created in heap.  Memory reference 100
        swap(red, blue); // swap methods created in stack.
        System.out.println("red color=" + red.getColor());
        System.out.println("blue color=" + blue.getColor());

        foo(blue);// foo methods created in stack.
        System.out.println("blue color=" + blue.getColor());

    }

    private static void foo(Balloon balloon) {
        balloon.setColor("Red");
        balloon = new Balloon("Green");
        balloon.setColor("Green");

    }


    private static void swap(Object o1, Object o2) {

        System.out.println("o1 before=" + o1.toString());
        System.out.println("o2 before=" + o2.toString());

        Object temp = o1;
        o1 = o2;
        o2 = temp;
        System.out.println("o1 after=" + o1.toString());
        System.out.println("o2 after=" + o2.toString());
    }

    private static class Balloon {
        private String color;

        public Balloon(){}

        public Balloon(String c){
            this.color=c;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}