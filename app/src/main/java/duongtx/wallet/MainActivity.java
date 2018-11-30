package duongtx.wallet;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import duongtx.wallet.adapters.PagerAdapter;
import duongtx.wallet.fragments.HistoryFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager mPager;

    private PagerAdapter mPagerAdapter;

    private TabLayout mTabLayout;

    private Toolbar mTopToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initControl();
    }

    private void initControl() {

        mPager = (ViewPager) findViewById(R.id.viewPager);
        initTab(mPager);

        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mPager);
        setupTabIcons();
    }

    /**
     * Setup view pager with tabs
     *
     * @param viewPager
     */
    private void initTab(ViewPager viewPager) {
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HistoryFragment(), "Tab1");
        adapter.addFragment(new HistoryFragment(), "Tab2");
        viewPager.setAdapter(adapter);
    }

    /**
     * Setup tab with icons
     */
    private void setupTabIcons() {
        mTabLayout.getTabAt(0);
        mTabLayout.getTabAt(1);
    }
}
