package pubsubtest.brandingbrand.com;

import rx.Observable;
import rx.subjects.PublishSubject;
import rx.subjects.SerializedSubject;
import rx.subjects.Subject;

/**
 * Created by danielclayton on 4/21/15.
 */
public class RxBus {
    private final Subject<Object, Object> mSubject = new SerializedSubject<>(PublishSubject.create());
    private static RxBus instance;

    public void send(Object o) {
        mSubject.onNext(o);
    }

    public Observable<Object> toObserverable() {
        return mSubject;
    }

    public static synchronized RxBus getInstance() {
        if (instance == null) {
            instance = new RxBus();
        }

        return instance;
    }
}
