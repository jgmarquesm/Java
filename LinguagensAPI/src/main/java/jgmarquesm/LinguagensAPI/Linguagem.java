package jgmarquesm.LinguagensAPI;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="linguagens")
public class Linguagem {

    @Id
    private String id;
    private final String name;
    private final String image;
    private final int rank;

    public Linguagem(String name, String image, int rank) {
        this.name = name;
        this.image = image;
        this.rank = rank;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public int getRank() {
        return rank;
    }
}
