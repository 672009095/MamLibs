package id.codigo.mamlib.service.connection;

import id.codigo.mamlib.service.base.BaseView;

public interface MamCallback <T> extends BaseView {
    void onSuccess(T response);
    void onFailure(String message);

}
