package id.sch.smktelkom_mlg.project2.xirpl40810132129.malang.model;

import java.io.Serializable;

/**
 * Created by rongrong on 24/03/2017.
 */

public class pasar implements Serializable {
    public String judul;

    public String foto;

    public pasar(String s, String judul, String foto) {
        this.judul = judul;
        this.foto = foto;
    }
}
