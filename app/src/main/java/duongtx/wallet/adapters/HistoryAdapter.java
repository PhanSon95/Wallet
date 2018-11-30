package duongtx.wallet.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import duongtx.wallet.R;
import duongtx.wallet.models.History;


public class HistoryAdapter extends BaseAdapter {
    private List<History> mListHistory;

    private int mLayout;

    private Context mContext;

    public HistoryAdapter(List<History> mListHistory, int mLayout, Context mContext) {
        this.mListHistory = mListHistory;
        this.mLayout = mLayout;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mListHistory.size();
    }

    @Override
    public Object getItem(int i) {
        return mListHistory.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(mLayout, null);
        TextView txtContent = (TextView) view.findViewById(R.id.txtContent);

        //Get transation at position on list transation
        History history = mListHistory.get(i);
        txtContent.setText(history.getContent());
        return view;
    }
}
