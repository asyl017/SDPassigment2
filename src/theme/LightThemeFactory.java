package theme;

import interfaces.Button;
import interfaces.Checkbox;
import interfaces.ThemeFactory;

public class LightThemeFactory  implements ThemeFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();

    }
}
