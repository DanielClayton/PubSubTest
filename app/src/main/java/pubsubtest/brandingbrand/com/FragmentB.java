package pubsubtest.brandingbrand.com;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import rx.functions.Action1;

/**
 * Created by danielclayton on 4/21/15.
 */
public class FragmentB extends Fragment {
    @Override
    public void onStart() {
        super.onStart();
        RxBus.getInstance().toObserverable()
                .subscribe(new Action1<Object>() {
                    @Override
                    public void call(Object event) {
                        if (event instanceof ClickEvent) {
                            Toast.makeText(getActivity(), ((ClickEvent) event).getContent(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b, container, true);
    }
}
