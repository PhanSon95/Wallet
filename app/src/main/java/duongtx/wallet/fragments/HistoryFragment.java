package duongtx.wallet.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import duongtx.wallet.R;
import duongtx.wallet.adapters.HistoryAdapter;
import duongtx.wallet.models.History;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryFragment extends Fragment {

    private List<History> mListHistory;

    private ListView mListViewExchange;

    private HistoryAdapter mAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_history, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        this.initControl(view);
        this.fetchingHistoryData();
        this.setAdapter();
    }

    /**
     * Init control from layout
     *
     * @param view
     */
    private void initControl(View view) {
        mListHistory = new ArrayList<>();
        mListViewExchange = (ListView) view.findViewById(R.id.listViewHistory);
    }

    /**
     * Receive data from server
     */
    private void fetchingHistoryData() {
        for (int i = 1; i <= 2000; i++) {
            mListHistory.add(new History("ITEM" + i));
        }
    }

    private void setAdapter() {
        mAdapter = new HistoryAdapter(mListHistory, R.layout.list_item, getContext());
        mListViewExchange.setAdapter(mAdapter);
    }
}
