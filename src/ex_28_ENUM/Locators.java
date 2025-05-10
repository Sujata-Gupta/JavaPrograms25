package ex_28_ENUM;

public enum Locators {

    button("asas"),
    click("asd");

    String locate;

    Locators(String locate) {
        this.locate = locate;
    }

    String getLocate() {
        return this.locate;
    }
}
