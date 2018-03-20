package com.find.doctor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ListOfDoctors extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private QuoteAdapter mAdapter;
    String[] mName;
    String[] mPhone;
    String[] mAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_doctors);
        mRecyclerView = (RecyclerView) findViewById(R.id.ListOfData);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mName = getResources().getStringArray(R.array.surgery_doctor);
        mPhone =getResources().getStringArray(R.array.surgery_doctor_phone);
        mAddress = getResources().getStringArray(R.array.surgery_doctor_address);
        mAdapter = new QuoteAdapter(mName,mPhone,mAddress);
        mRecyclerView.setAdapter(mAdapter);
    }
    private class QuoteHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mNameTextView, mPhoneTextView, mAddressTextView;
        private CardView cardView;
        public QuoteHolder(View itemView) {
            super(itemView);
            cardView = (CardView)itemView.findViewById(R.id.container);
            mNameTextView = (TextView) itemView.findViewById(R.id.doc_name);
            mPhoneTextView = (TextView) itemView.findViewById(R.id.doc_phone);
            mAddressTextView = (TextView) itemView.findViewById(R.id.doc_address);
        }
        /**
         * Called when a view has been clicked.
         *
         * @param v The view that was clicked.
         */
        @Override
        public void onClick(View v) {

        }

        /**
         * Called when a view has been clicked.
         *
         * @param v The view that was clicked.
         */
    }

    private class QuoteAdapter extends RecyclerView.Adapter<QuoteHolder>{
        private String[] mNameSource;
        private String[] mPhoneSource;
        private String[] mAddressSource;
        public QuoteAdapter(String[] dataArgs, String[] dataArgs2, String[] dataArgs3){
            mNameSource = dataArgs;
            mPhoneSource = dataArgs2;
            mAddressSource = dataArgs3;

        }
        @Override
        public QuoteHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(ListOfDoctors.this);
            View view = layoutInflater.inflate(R.layout.row_of_data, parent, false);
            return new QuoteHolder(view);
        }



        @Override
        public void onBindViewHolder(QuoteHolder holder, int position) {
            holder.mNameTextView.setText(mNameSource[position]);
            holder.mPhoneTextView.setText(mPhoneSource[position]);
            holder.mAddressTextView.setText(mAddressSource[position]);
        }

        /**
         * Returns the total number of items in the data set hold by the adapter.
         *
         * @return The total number of items in this adapter.
         */
        @Override
        public int getItemCount() {
            return mNameSource.length;
        }
    }
}

