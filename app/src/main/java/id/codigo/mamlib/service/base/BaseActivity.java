package id.codigo.mamlib.service.base;

import android.os.Bundle;

public abstract class BaseActivity <V extends BaseView, P extends BasePresenter<V>> implements RootDelegate<V, P>, BaseView{
    private P mvpPresenter;

    public BaseActivity() {
    }

    @Override
    public V getMvpView() {
        return (V) this;
    }

    @Override
    public P getMvpPresenter() {
        if (mvpPresenter == null) {
            mvpPresenter = createPresenter();
            mvpPresenter.setMvpView(getMvpView());
        }

        return this.mvpPresenter;
    }
}
