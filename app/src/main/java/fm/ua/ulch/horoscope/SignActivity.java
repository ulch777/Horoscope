package fm.ua.ulch.horoscope;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class SignActivity extends AppCompatActivity {

    private ViewPager pager;
    private ArrayList<String> signs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);


        Intent intent = getIntent();
        int sign = intent.getIntExtra("sign", 1);

        pager = (ViewPager) findViewById(R.id.pager);

        signs = new ArrayList<>();
        for(int i = 0; i < 12; i++) {
            String num = String.valueOf(i);
            signs.add(num);
        }

        setupViewPager(pager, signs);
        pager.setCurrentItem(sign);
    }

    private void setupViewPager(ViewPager viewPager, ArrayList<String> list) {

        Adapter adapter = new Adapter(getSupportFragmentManager());
        for (int i = 0; i < list.size(); i++) {
            adapter.addFragment(MyFragment.newInstance(list.get(i)), String.valueOf(i));
        }
        viewPager.setAdapter(adapter);

    }

    static class Adapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragments = new ArrayList<>();
        private final List<String> mFragmentTitles = new ArrayList<>();

        public Adapter(FragmentManager fm) {
            super(fm);
        }

        public void addFragment(Fragment fragment, String sign) {
            mFragments.add(fragment);
            mFragmentTitles.add(String.valueOf(sign));
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String[] signsNames = {
                    "Capricorn",
                    "Aquarius",
                    "Piscean",
                    "Aries",
                    "Taurus",
                    "Gemini",
                    "Cancer",
                    "Leo",
                    "Virgo",
                    "Libra",
                    "Scorpio",
                    "Sagittarius"
            };
            return signsNames[position];
        }
    }
}
