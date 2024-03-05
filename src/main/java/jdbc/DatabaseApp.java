package jdbc;


import jdbc.repositories.CategoryRepository;

public class DatabaseApp {

    public static void main(String[] args) {

        CategoryRepository categoryRepository = new CategoryRepository();
        categoryRepository.read();


    }

}
