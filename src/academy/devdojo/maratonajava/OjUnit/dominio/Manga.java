package academy.devdojo.maratonajava.OjUnit.dominio;

import java.util.Objects;

public record Manga(String name, int episodes) {
    public Manga {
        Objects.requireNonNull(name);
    }
}

