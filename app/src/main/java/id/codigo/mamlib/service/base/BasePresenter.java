package id.codigo.mamlib.service.base;

public abstract class BasePresenter<V extends BaseView> {

    private V mvpView;

    /**
     * Getter mvpView variable
     */
    public V getMvpView() {
        return mvpView;
    }

    /**
     * Setter mvpView variable
     */
    public void setMvpView(V mvpView) {
        this.mvpView = mvpView;
    }
}
