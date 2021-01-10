public class EmailApp {
    public static void main(String[] args) {
        //TO-DO auto-generated method stub
        //мы создали объект из этого шаблона
        //we created an object from this template

        Email em1 = new Email("Jhon", "Smith");
        //and then when you pass the constructor some information say Jhon is the first name,
        // and Smith is the second name

//        em1.setAlternateEmail("jx@gmail.com");
//        System.out.println(em1.getAlternateEmail());

        System.out.println(em1.showInfo());


    }
}
