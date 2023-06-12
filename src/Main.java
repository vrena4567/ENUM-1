public class Main {
    public static void main(String[] args) {
        Person person = new Person("Reni", Gender.WOMAN, EyeColor.BLUE, House_Type.FLAT);
        System.out.println(person.toString());
        System.out.println(person.getGender().getMagyarNev());
    }
}
