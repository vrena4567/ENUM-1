public enum EyeColor {
    BLUE("Kék"),
    GREEN("Zöld"),
    BROWN("Barna"),
    BLACK("Fekete"),
    GREY("Szürke"),
    RED("Piros"),
    OTHER("Egyéb");

    private String magyarNev;

    private EyeColor(String magyarNev) {
        this.magyarNev = magyarNev;
    }

    public String getMagyarNev() {
        return magyarNev;
    }

    @Override
    public String toString() {
        return magyarNev;
    }
}
