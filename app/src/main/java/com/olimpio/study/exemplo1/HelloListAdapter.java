package com.olimpio.study.exemplo1;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HelloListAdapter extends RecyclerView.Adapter<HelloListAdapter.HelloViewHoder> {

    private final String TAG = HelloListAdapter.class.getSimpleName();

    private final ArrayList<Hello> mHelloList;

    public HelloListAdapter(ArrayList<Hello> mHelloList) {
        this.mHelloList = mHelloList;
    }

    @NonNull
    @Override
    public HelloViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: called");
        final LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        final View itemView = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new HelloViewHoder(itemView);
    }

@Override
    public void onBindViewHolder(@NonNull HelloViewHoder holder, int position) {
        Log.d(TAG, "onBindViewHolder: " + position);
        final Hello currentItem = mHelloList.get(position);
        holder.bind(currentItem);
    }

    @Override
    public int getItemCount() {
        return mHelloList.size();
    }

    public static class HelloViewHoder extends RecyclerView.ViewHolder {
        private static final String TAG = "HelloViewHoder";

        private final TextView mItemText;

        public HelloViewHoder(@NonNull View itemView) {
            super(itemView);
            mItemText = itemView.findViewById(R.id.textView_list_item);
        }

        public void bind(final Hello hello) {
            Log.d(TAG, "bind: " + hello.toString());
            mItemText.setText(hello.toString());
        }
    }
}
