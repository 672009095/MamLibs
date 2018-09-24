package id.codigo.mamlib.service.connection;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class MamService {
    private static final String BASE = "http://api.ass.dev.codigo.id:1337/api/";
    public MamService() {

    }
    public static MamAPI create() {
        Header header1 = new Header("Content-Type", "application/json");
        List<Header> headers = new ArrayList();
        headers.add(header1);
        return MamGenarator.create(BASE, MamAPI.class);
    }

    public static MamAPI createWithAuth(List<Header> headers) {
        return MamGenarator.create(headers, BASE, MamAPI.class);
    }

}
