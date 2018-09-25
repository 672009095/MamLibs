package id.codigo.mamlib.service.connection;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class MamService {
    private static final String BASE = "http://api.ass.dev.codigo.id:1337/api/";
    public MamService() {

    }
    public static MamAPI create() {
        return MamGenarator.create(BASE, MamAPI.class);
    }

    public static MamAPI createWithHeader(List<Header> headers) {
        return MamGenarator.create(headers, BASE, MamAPI.class);
    }

}
