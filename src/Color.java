public class Color {
//    this class colorizes the terminal
    public final String TEXT_RED = "\u001B[31m";
    public final String TEXT_RESET = "\u001B[0m";
    public final String TEXT_GREEN = "\u001b[32m";
    public final String TEXT_BLUE = "\u001b[34m";

    final String TEXT_PURPLE = "\u001B[35m";


    final String TEXT_CYAN = "\u001B[36m";
    final String redBG = "\u001B[41m";
    final String TEXT_BLACK = "\u001B[30m";
    final String bg_white = "\u001B[47m";
    final String bg_yellow = "\u001B[43m";


    public String getTEXT_BLACK() {
        return TEXT_BLACK;
    }

    public String getTEXT_BLUE() {
        return TEXT_BLUE;
    }

    public String getTEXT_CYAN() {
        return TEXT_CYAN;
    }

    public String getTEXT_GREEN() {
        return TEXT_GREEN;
    }

    public String getTEXT_PURPLE() {
        return TEXT_PURPLE;
    }

    public String getTEXT_RED() {
        return TEXT_RED;
    }

    public String getTEXT_RESET() {
        return TEXT_RESET;
    }

    public String getBg_white() {
        return bg_white;
    }

    public String getBg_yellow() {
        return bg_yellow;
    }

    public String getRedBG() {
        return redBG;
    }

}
