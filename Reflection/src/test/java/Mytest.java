public class Mytest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class classs = Class.forName("User");
        System.out.println(classs.getName());
        System.out.println(classs.getSimpleName());
        System.out.println(classs);
    }
}
