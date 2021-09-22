package task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author b1 = new Author("Anton", "antonuniverse7@gmail.com", 'M');
        System.out.println(b1);
        b1.setEmail("antonuniverse8@gmail.com");
        System.out.println(b1);
    }
}
