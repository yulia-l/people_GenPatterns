public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Мария")
                .setSurname("Петрова")
                .setAge(31)
                .setAddress("Москва")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Андрей")
                .build();
        System.out.println("У человека " + mom + " \n =>есть сын, " + son);

        try {
            // Не хватает обязательных полей
            new PersonBuilder()
                    .setName("Петр") //Есть имя но нет фамилии
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder()
                    .setAge(-100)
                    .build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
