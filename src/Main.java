public class Main {
    public static void main(String[] args) {
        //TODO HOME WORK #12
//        Country, City, Address жана Person деген класс түзүп,
//        Алардын поляларын ойлоп табыңыз
//        Геттер сеттерлерди маани берүү жана алуу үчүн колдонуу керек
//        Ар бир класска 3-4 төн объект түзүп жана аларга маанилерин бериңиз
//        Ар бир класстын объектилерин өз-өзүнчө массивке салып, аларды консольго чыгарыңыз
        Person person = new Person();
        person.setName("Имя: Эльдан \n");
        person.setLastname("Фамилия: Тургунбаев \n");
        person.setAge(18);

        Person person1 = new Person();
        person1.setName(" Имя: Келдибек\n ");
        person1.setLastname("Фамилия: Мамытов\n ");
        person1.setAge(18);
        Person[] people = {person,person1};
        for (Person V:people) {
            System.out.println(V.getName()+V.getLastname()+V.getAge());
        }

        Address address = new Address();
        address.setName("Адрес: Микр. Джал ");

        Address address1 = new Address();
        address1.setName("Адрес: Микр. Тунгуч ");

        Address[] addresses = {address,address1};
        for (Address W:addresses) {
            System.out.println(W.getName());
        }
        City city = new City();
        city.setName("Место жительства: БИШКЕК");

        City city1 = new City();
        city1.setName("Место жительства: ОШ");

        City[] cities = {city,city1};
        for (City E: cities) {
            System.out.println(E.getName());

        }
        Country country = new Country();
        country.setName("Страна: Кыргызстан  ");

        Country country1 = new Country();
        country1.setName("Страна: USA ");
        Country[] countries = {country,country1};
        for (Country A:countries) {
            System.out.println(A.getName());
        }
    }
}