package id.codigo.mamlib.service.connection;

public interface SessionManager{
    void clear();
    void storeAuth(String auth);
    String getAuth();
}

