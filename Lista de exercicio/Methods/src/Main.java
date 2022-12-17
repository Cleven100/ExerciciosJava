public class Main {

    public void sayHello() {
        System.out.println("hello");
    }

    public void saySomething(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.sayHello();

        main.saySomething("My groovy message");
    }



}