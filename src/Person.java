public class Person {
    private String name;
    private Gender gender;
    private EyeColor eyeColor = EyeColor.BLUE;

    private House_Type houseType;

    public Person(){}

    public Person(String name, Gender gender, EyeColor eyeColor, House_Type houseType) {
        this.name = name;
        this.gender = gender;
        this.eyeColor = eyeColor;
        this.houseType = houseType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(EyeColor eyeColor) {
        this.eyeColor = eyeColor;
    }

    public House_Type getHouseType() {
        return houseType;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + getGender().getMagyarNev() + '\'' +
                ", eyeColor=" + eyeColor + ", houseType=" + getHouseType().getMagyarNev() +
                '}';
    }
}
