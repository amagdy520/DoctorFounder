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
    String key;
    String[] mName;
    String[] mPhone;
    String[] mAddress;
    TextView mScreenTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_doctors);
        key = getIntent().getExtras().getString("type");
        mScreenTitle = (TextView) findViewById(R.id.titleOfList);
        switch (key){
            case "surgary":
                mName = getResources().getStringArray(R.array.surgery_doctor);
                mPhone =getResources().getStringArray(R.array.surgery_doctor_phone);
                mAddress = getResources().getStringArray(R.array.surgery_doctor_address);
                mScreenTitle.setText("أطباء الجراحة");
                mRecyclerView = (RecyclerView) findViewById(R.id.ListOfData);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
                mAdapter = new QuoteAdapter(mName,mPhone,mAddress);
                mRecyclerView.setAdapter(mAdapter);
                break;
            case "eye":
                mName = getResources().getStringArray(R.array.eye_doctor);
                mPhone =getResources().getStringArray(R.array.eye_doctor_phone);
                mAddress = getResources().getStringArray(R.array.eye_doctor_address);
                mScreenTitle.setText("أطباء العيون");
                mRecyclerView = (RecyclerView) findViewById(R.id.ListOfData);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
                mAdapter = new QuoteAdapter(mName,mPhone,mAddress);
                mRecyclerView.setAdapter(mAdapter);
                break;
            case "bone":
                mName = getResources().getStringArray(R.array.bone_doctor);
                mPhone =getResources().getStringArray(R.array.bone_doctor_phone);
                mAddress = getResources().getStringArray(R.array.bone_doctor_address);
                mScreenTitle.setText("أطباء العظام");
                mRecyclerView = (RecyclerView) findViewById(R.id.ListOfData);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
                mAdapter = new QuoteAdapter(mName,mPhone,mAddress);
                mRecyclerView.setAdapter(mAdapter);
                break;
            case "brain":
                mName = getResources().getStringArray(R.array.brain_doctor);
                mPhone =getResources().getStringArray(R.array.brain_doctor_phone);
                mAddress = getResources().getStringArray(R.array.brain_doctor_address);
                mScreenTitle.setText("أطباء المخ والأعصاب");
                mRecyclerView = (RecyclerView) findViewById(R.id.ListOfData);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
                mAdapter = new QuoteAdapter(mName,mPhone,mAddress);
                mRecyclerView.setAdapter(mAdapter);
                break;
            case "heart":
                mName = getResources().getStringArray(R.array.heart_doctor);
                mPhone =getResources().getStringArray(R.array.heart_doctor_phone);
                mAddress = getResources().getStringArray(R.array.heart_doctor_address);
                mScreenTitle.setText("أطباء القلب");
                mRecyclerView = (RecyclerView) findViewById(R.id.ListOfData);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
                mAdapter = new QuoteAdapter(mName,mPhone,mAddress);
                mRecyclerView.setAdapter(mAdapter);
                break;
            case "stomach":
                mName = getResources().getStringArray(R.array.stomach_doctor);
                mPhone =getResources().getStringArray(R.array.stomach_doctor_phone);
                mAddress = getResources().getStringArray(R.array.stomach_doctor_address);
                mScreenTitle.setText("أطباء الباطنة");
                mRecyclerView = (RecyclerView) findViewById(R.id.ListOfData);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
                mAdapter = new QuoteAdapter(mName,mPhone,mAddress);
                mRecyclerView.setAdapter(mAdapter);
                break;
            case "nose":
                mName = getResources().getStringArray(R.array.nose_doctor);
                mPhone =getResources().getStringArray(R.array.nose_doctor_phone);
                mAddress = getResources().getStringArray(R.array.nose_doctor_address);
                mScreenTitle.setText("أطباء الأنف");
                mRecyclerView = (RecyclerView) findViewById(R.id.ListOfData);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
                mAdapter = new QuoteAdapter(mName,mPhone,mAddress);
                mRecyclerView.setAdapter(mAdapter);
                break;
            case "tooth":
                mName = getResources().getStringArray(R.array.tooth_doctor);
                mPhone =getResources().getStringArray(R.array.tooth_doctor_phone);
                mAddress = getResources().getStringArray(R.array.tooth_doctor_address);
                mScreenTitle.setText("أطباء الأسنان");
                mRecyclerView = (RecyclerView) findViewById(R.id.ListOfData);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
                mAdapter = new QuoteAdapter(mName,mPhone,mAddress);
                mRecyclerView.setAdapter(mAdapter);
                break;
            case "radiology":
                mName = getResources().getStringArray(R.array.radiology_doctor);
                mPhone =getResources().getStringArray(R.array.radiology_doctor_phone);
                mAddress = getResources().getStringArray(R.array.radiology_doctor_address);
                mScreenTitle.setText("أطباء الأشعة");
                mRecyclerView = (RecyclerView) findViewById(R.id.ListOfData);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
                mAdapter = new QuoteAdapter(mName,mPhone,mAddress);
                mRecyclerView.setAdapter(mAdapter);
                break;
        }
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

