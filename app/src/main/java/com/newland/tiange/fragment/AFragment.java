package com.newland.tiange.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.newland.tiange.R;

public class AFragment extends Fragment {

    private TextView mTvTitle;
    private Activity mActivity;

    public static AFragment newInstance(String title){
        AFragment aFragment = new AFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title",title);
        aFragment.setArguments(bundle);
        return aFragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // 相当于setContentView
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //todo:建议如下，避免内存泄露
        mTvTitle = (TextView) view.findViewById(R.id.tv_titile);


//        if(getActivity()!= null){
//            mTvTitle.setText(getArguments().getString("title"));
//        }else{
//
//        }
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        //todo :不建议下面写法
        mActivity = (Activity) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        //todo 取消异步

    }



}
