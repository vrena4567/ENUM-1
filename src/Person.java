public class Person {
    private String name;
    private String gender;
    private EyeColor eyeColor = EyeColor.BLUE;

    public Person(){}

    public Person(String name, String gender, EyeColor eyeColor) {
        this.name = name;
        this.gender = gender;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(EyeColor eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", eyeColor=" + eyeColor +
                '}';
    }
}
