package kr.ac.korea.kucc.study4;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by ffaass on 2017-08-07.
 */

public class CustomViewHolder  extends RecyclerView.ViewHolder {
    public LinearLayout layout;
    public TextView memoView;
    public TextView dateView;
    public CustomViewHolder(View itemView) {
        super(itemView);
        layout = (LinearLayout) itemView;
        memoView = (TextView) itemView.findViewById(R.id.item_memo);
        dateView = (TextView) itemView.findViewById(R.id.item_date);
    }
}
