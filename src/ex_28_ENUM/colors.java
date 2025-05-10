package ex_28_ENUM;

public enum colors {
    Red("#123"),
    Yellow("#542"),
        pink("#235");
private String col;
    colors(String col)
    {
        this.col=col;
    }
    String getcol()
    {
        return this.col;
    }
}
