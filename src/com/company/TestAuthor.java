package com.company;

public class TestAuthor {
    public void test() {
        Author author1 = new Author("Xaer Sergeevi4", "dsc.cxc@mail.ru", 'M');
        Author author2 = new Author("Mila Antonovna", "mila.ya@tandex.ru", 'F');

        System.out.println(author1.toString());
        System.out.println(author2.toString());

        author1.setEmail("new.email@gmail.com");

        System.out.println(author1.toString());
    }
}
