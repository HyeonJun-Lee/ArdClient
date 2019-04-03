package haven.sloth.io;

import haven.Gob;
import haven.DefSettings;
import haven.sloth.gob.Type;

public class ForagableData {
    public static boolean isForagable(final String name, final Gob g) {
        return name.startsWith("gfx/terobjs/herbs/") || (haven.DefSettings.FORAGEANIMALS.get() && g.type == Type.SMALLANIMAL) ||
                (name.equals("gfx/kritter/bat/bat") && g.isDead());
    }
}