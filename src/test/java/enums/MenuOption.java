package enums;

public enum MenuOption {
    HOTELS("Hotels"),
    FLIGHTS("Flights"),
    TOURS("Tours"),
    CARS("Cars"),
    VISA("Visa"),
    BLOGS("Blogs");

    private final String menuOption;

    MenuOption(String menuOption) {
        this.menuOption = menuOption;
    }

    public String getMenuOption() {
        return menuOption;
    }
}
