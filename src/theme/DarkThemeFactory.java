package theme;

import interfaces.Button;
import interfaces.Checkbox;
import interfaces.ThemeFactory;

public class DarkThemeFactory implements ThemeFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();

    }
}