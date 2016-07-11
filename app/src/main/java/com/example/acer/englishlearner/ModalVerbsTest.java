package com.example.acer.englishlearner;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ModalVerbsTest extends AppCompatActivity {
    RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4, radioGroup5;
    RadioButton btn, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modal_verbs_test);
        radioGroup1 = (RadioGroup) findViewById(R.id.radio_modal_verbs1);
        radioGroup2 = (RadioGroup) findViewById(R.id.radio_modal_verbs2);
        radioGroup3 = (RadioGroup) findViewById(R.id.radio_modal_verbs3);
        radioGroup4 = (RadioGroup) findViewById(R.id.radio_modal_verbs4);
        radioGroup5 = (RadioGroup) findViewById(R.id.radio_modal_verbs5);

        btn = (RadioButton) findViewById(R.id.radio_answear1_verbs7);
        btn2 = (RadioButton) findViewById(R.id.radio_answear1_verbs2);
        btn3 = (RadioButton) findViewById(R.id.radio_answear2_verbs3);
        btn4 = (RadioButton) findViewById(R.id.radio_answear1_verbs4);
        btn5 = (RadioButton) findViewById(R.id.radio_answear1_verbs5);
    }

//        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (checkedId == R.id.radio_answear1_verbs7) {
//                    btn.setBackgroundColor(Color.GREEN);
//                }
//            }
//        });
//        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (checkedId == R.id.radio_answear1_verbs2) {
//                    btn2.setBackgroundColor(Color.GREEN);
//                }
//            }
//        });
//        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (checkedId == R.id.radio_answear2_verbs3) {
//                    btn3.setBackgroundColor(Color.GREEN);
//                }
//            }
//        });
//        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (checkedId == R.id.radio_answear1_verbs4) {
//                    btn4.setBackgroundColor(Color.GREEN);
//                }
//            }
//        });
//        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (checkedId == R.id.radio_answear1_verbs5) {
//                    btn5.setBackgroundColor(Color.GREEN);
//                }
//            }
//        });

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_answear1_verbs7:
                if (checked) {
                    btn.setBackgroundColor(Color.GREEN);
                } else {
                    btn.setBackgroundColor(Color.GREEN);
                }
                break;
                    case R.id.radio_answear1_verbs2:
                        if (checked) {
                            btn2.setBackgroundColor(Color.GREEN);

                        } else {
                            btn2.setBackgroundColor(Color.GREEN);

                        }
                        break;
                    case R.id.radio_answear2_verbs3:
                        if (checked) {
                            btn3.setBackgroundColor(Color.GREEN);

                        } else {
                            btn3.setBackgroundColor(Color.GREEN);
                        }
                        break;
                    case R.id.radio_answear1_verbs4:
                        if (checked) {
                            btn4.setBackgroundColor(Color.GREEN);
                        } else {
                            btn4.setBackgroundColor(Color.GREEN);
                        }
                        break;
                    case R.id.radio_answear1_verbs5:
                        if (checked) {
                            btn5.setBackgroundColor(Color.GREEN);
                        } else {
                            btn5.setBackgroundColor(Color.GREEN);
                        }
                        break;
                }
        }
    }


