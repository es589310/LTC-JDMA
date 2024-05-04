package Lesson19.Mentor.Exercises;

public enum InputCategory {
    NUMBER("rəqəm"),
    TEXT("mətn"),
    SPECIAL_CHARACTER("işarə");
    private final String categoryPerson;

    InputCategory(String categoryPerson) {
        this.categoryPerson = categoryPerson;
    }

    public String getCategoryPerson() {
        return categoryPerson;
    }

    public String getCategory() {
        return categoryPerson;
    }
}
