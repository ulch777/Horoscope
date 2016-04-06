package fm.ua.ulch.horoscope;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyFragment extends Fragment {

    public static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";
    private int sign;


    public static MyFragment newInstance(String sign) {

        MyFragment pageFragment = new MyFragment();
        Bundle arguments = new Bundle();
        arguments.putInt(ARGUMENT_PAGE_NUMBER, Integer.parseInt(sign));
        pageFragment.setArguments(arguments);

        return pageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sign = getArguments().getInt(ARGUMENT_PAGE_NUMBER);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int[] mResources = {
                R.drawable.nol,
                R.drawable.one,
                R.drawable.two,
                R.drawable.three,
                R.drawable.four,
                R.drawable.five,
                R.drawable.six,
                R.drawable.seven,
                R.drawable.eight,
                R.drawable.nine,
                R.drawable.ten,
                R.drawable.eleven
        };

        int[] mDescr = {
                R.string.Capricorn,
                R.string.Aquarius,
                R.string.Piscean,
                R.string.Aries,
                R.string.Taurus,
                R.string.Gemini,
                R.string.Cancer,
                R.string.Leo,
                R.string.Virgo,
                R.string.Libra,
                R.string.Scorpio,
                R.string.Sagittarius,
        };

        View view = inflater.inflate(R.layout.fragment, container, false);

        TextView textView = (TextView) view.findViewById(R.id.textViewSign);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);

        imageView.setImageDrawable(getResources().getDrawable(mResources[sign]));
        textView.setText(getResources().getString(mDescr[sign]));

        return view;

    }
}
