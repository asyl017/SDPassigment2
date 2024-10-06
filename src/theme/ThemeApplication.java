package theme;

import interfaces.Button;
import interfaces.Checkbox;
import interfaces.ThemeFactory;

public class ThemeApplication {
    public static void main(String[] args) {
        LightThemeFactory lightTheme = new LightThemeFactory();
        Button lightButton = lightTheme.createButton();
        lightButton.display();
        Checkbox lightCheckbox = lightTheme.createCheckbox();
        lightCheckbox.display();

        ThemeFactory darkTheme = new DarkThemeFactory();
        Button darkButton = darkTheme.createButton();
        darkButton.display();
        Checkbox darkCheckbox = darkTheme.createCheckbox();
        darkCheckbox.display();

    }
}