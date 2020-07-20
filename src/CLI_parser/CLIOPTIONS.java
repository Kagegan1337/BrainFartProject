package CLI_parser;

public enum CLIOPTIONS {
    TEST("command test"),
    NAME("command name"),
    FUN("command fun"),
    JOKE("command joke");

    String text;

    CLIOPTIONS(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
