public enum Gender {
    MAN("Férfi", "uomo"),
    WOMAN("Nő", "donna");

    private String magyarNev;
    private String olaszNev;

    Gender(String magyarNev, String olaszNev) {
        this.magyarNev = magyarNev;
        this.olaszNev = olaszNev;
    }

    public String getMagyarNev() {
        return this.magyarNev;
    }

    public String getOlaszNev() {
        return this.olaszNev;
    }
}
