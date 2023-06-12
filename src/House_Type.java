public enum House_Type {
    HOUSE_WITH_GARDEN("kertesház"),
    FLAT("lakás");

    private String magyarNev;

    House_Type(String magyarNev) {
        this.magyarNev = magyarNev;
    }

    public String getMagyarNev() {
        return this.magyarNev;
    }

}
