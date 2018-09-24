package id.codigo.mamlib.service.base;

public interface RootDelegate<V extends BaseView, P extends BasePresenter> {
    /**
     * Function that return new class of mvpPresenter
     */
    P createPresenter();
    /**
     * Getter mvpView variable
     */
    V getMvpView();
    /**
     * Getter mvpPresenter variable
     */
    P getMvpPresenter();
    /**
     * Getter ViewDataBinding variable
     */
}
