public enum Genre {
    CRIME("Crimey Stuff"),
    COMEDY("Funny Stuff"),
    FICTION("Fictional Stuff"),
    EDUCATIONAL("School Stuff"),
    RELIGIOUS("See Fiction");

    private final String value;

    GenreType(String value) { this.value = value;}

    public String getValue() {
        return value;
    }
}
