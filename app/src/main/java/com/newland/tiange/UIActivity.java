package com.newland.tiange;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.newland.tiange.fragment.ContainerActivity;
import com.newland.tiange.jump.AActivity;
import com.newland.tiange.recyclerview.RecyclerViewActivity;

public class UIActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEdit;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mRV;
    private Button mBtnWebView;
    private Button mBtnToast;
    private Button mBtnDialog;
    private Button mBtnProgress;
    private Button mBtnCustomDialog;
    private Button mBtnPopupWindow;
    private Button mBtnLifeCycle;
    private Button mBtnJump;
    private Button mBtnFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);

        //textview 点击跳转演示
        mBtnTextView = (Button) findViewById(R.id.btn_textview);

        //button 点击跳转演示
        mBtnButton = (Button) findViewById(R.id.btn_button);

        //Editbutton 演示
        mBtnEdit = (Button) findViewById(R.id.btn_edittext);

        //RadioButton演示
        mBtnRadioButton = (Button) findViewById(R.id.btn_radiobutton);

        mBtnCheckBox = (Button) findViewById(R.id.btn_checkbox);

        mBtnImageView = (Button) findViewById(R.id.btn_imageview);

        mRV = (Button) findViewById(R.id.btn_recyclerview);

        mBtnWebView = (Button) findViewById(R.id.btn_webview);

        mBtnToast = (Button) findViewById(R.id.btn_toast);

        mBtnDialog = (Button) findViewById(R.id.btn_dialog);

        mBtnProgress = (Button)findViewById(R.id.btn_progress);

        mBtnCustomDialog = (Button) findViewById(R.id.btn_custom_dialog);

        mBtnPopupWindow = (Button) findViewById(R.id.btn_popup_window);

        mBtnLifeCycle = (Button) findViewById(R.id.btn_lifecycle);

        mBtnJump = (Button) findViewById(R.id.btn_jump);

        mBtnFragment = (Button) findViewById(R.id.btn_fragment);

        setListeners();

    }

    private void setListeners() {
        Onclick onclick = new Onclick();
        mBtnRadioButton.setOnClickListener(onclick);
        mBtnTextView.setOnClickListener(onclick);
        mBtnEdit.setOnClickListener(onclick);
        mBtnButton.setOnClickListener(onclick);
        mBtnCheckBox.setOnClickListener(onclick);
        mBtnImageView.setOnClickListener(onclick);
        mRV.setOnClickListener(onclick);
        mBtnWebView.setOnClickListener(onclick);
        mBtnToast.setOnClickListener(onclick);
        mBtnDialog.setOnClickListener(onclick);
        mBtnProgress.setOnClickListener(onclick);
        mBtnCustomDialog.setOnClickListener(onclick);
        mBtnPopupWindow.setOnClickListener(onclick);
        mBtnLifeCycle.setOnClickListener(onclick);
        mBtnJump.setOnClickListener(onclick);
        mBtnFragment.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()) {
                case R.id.btn_textview:
                    intent = new Intent(UIActivity.this, TextViewActivity.class);
                    break;

                case R.id.btn_button:
                    intent = new Intent(UIActivity.this, ButtonActivity.class);
                    break;

                case R.id.btn_edittext:
                    intent = new Intent(UIActivity.this, EditTextActivity.class);
                    break;

                case R.id.btn_radiobutton:
                    intent = new Intent(UIActivity.this, RadioButtonActivity.class);
                    break;

                case R.id.btn_checkbox:
                    intent = new Intent(UIActivity.this, CheckboxActivity.class);
                    break;

                case R.id.btn_imageview:
                    intent = new Intent(UIActivity.this, ImageViewActivity.class);
                    break;

                case R.id.btn_recyclerview:
                    intent = new Intent(UIActivity.this, RecyclerViewActivity.class);
                    break;
                case R.id.btn_webview:
                    intent = new Intent(UIActivity.this, WebViewActivity.class);
                    break;

                case R.id.btn_toast:
                    intent = new Intent(UIActivity.this, ToastActivity.class);
                    break;

                case R.id.btn_dialog:
                    intent = new Intent(UIActivity.this, DialogActivity.class);
                    break;

                case R.id.btn_progress:
                    intent = new Intent(UIActivity.this, ProgressActivity.class);
                    break;
                case R.id.btn_custom_dialog:
                    intent = new Intent(UIActivity.this, CustomDialogActivity.class);
                    break;
                case R.id.btn_popup_window:
                    intent = new Intent(UIActivity.this, PopupWindowActivity.class);
                    break;

                case R.id.btn_jump:
                    intent = new Intent(UIActivity.this, AActivity.class);
                    break;

                case R.id.btn_lifecycle:
                    intent = new Intent(UIActivity.this, LifeActivity.class);
                    break;

                case R.id.btn_fragment:
                    intent = new Intent(UIActivity.this, ContainerActivity.class);
                    break;

            }
            startActivity(intent);

        }
    }

}
