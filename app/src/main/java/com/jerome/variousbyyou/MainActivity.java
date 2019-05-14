package com.jerome.variousbyyou;

import android.support.annotation.LayoutRes;
import android.support.annotation.StringRes;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager pager;
    List<PageModel> pageModels = new ArrayList<>();

    {
        pageModels.add(new PageModel(R.string.title_jike, R.layout.layout_01jike));
        pageModels.add(new PageModel(R.string.title_bohejiankang, R.layout.layout_02bohe));
        pageModels.add(new PageModel(R.string.title_xiaomiyundong, R.layout.layout_03xiaomi));
        pageModels.add(new PageModel(R.string.title_flipboard, R.layout.layout_04flipboard));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = findViewById(R.id.pager);
        tabLayout = findViewById(R.id.tabLayout);

        pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {

            @Override
            public Fragment getItem(int position) {
                PageModel pageModel = pageModels.get(position);
                return PageFragment.newInstance(pageModel.layoutRes);
            }

            @Override
            public int getCount() {
                return pageModels.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return getString(pageModels.get(position).titleRes);
            }
        });


        tabLayout.setupWithViewPager(pager);
    }

    private class PageModel {
        @StringRes
        int titleRes;
        @LayoutRes
        int layoutRes;

        PageModel(@StringRes int titleRes, @LayoutRes int layoutRes) {
            this.titleRes = titleRes;
            this.layoutRes = layoutRes;
        }
    }
}
