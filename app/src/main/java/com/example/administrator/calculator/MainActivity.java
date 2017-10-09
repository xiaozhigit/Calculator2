package com.example.administrator.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.administrator.calculator.R.id.tvResult;

public class MainActivity extends Activity implements View.OnClickListener {
Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
        btnBackspace,btnCE,btnC,btnDiv,btnAdd,btnMul,btnSub,btnEqu;
    TextView tvResult;
    //声明两个参数，接收tvResult前后的值
    double num1,num2,Result;//计算结果
    boolean isClickEqu=false;//判断是否按了“=”按钮
    int op=0;//判断操作数
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //从布局文件中获取控件
        btn0= (Button) findViewById(R.id.btn0);btn5= (Button) findViewById(R.id.btn5);
        btn1= (Button) findViewById(R.id.btn1);btn6= (Button) findViewById(R.id.btn6);
        btn2= (Button) findViewById(R.id.btn2);btn7= (Button) findViewById(R.id.btn7);
        btn3= (Button) findViewById(R.id.btn3);btn8= (Button) findViewById(R.id.btn8);
        btn4= (Button) findViewById(R.id.btn4);btn9= (Button) findViewById(R.id.btn9);
        tvResult= (TextView) findViewById(R.id.tvResult);

        btnBackspace= (Button) findViewById(R.id.btnBackspace);btnCE= (Button) findViewById(R.id.btnCE);
        btnC= (Button) findViewById(R.id.btnC);btnEqu= (Button) findViewById(R.id.btnEqu);
        btnDiv= (Button) findViewById(R.id.btnDiv);btnAdd= (Button) findViewById(R.id.btnAdd);
        btnSub= (Button) findViewById(R.id.btnSub);btnMul= (Button) findViewById(R.id.btnMul);
        //添加监听
        btn0.setOnClickListener(this); btn9.setOnClickListener(this);
        btn1.setOnClickListener(this); btnBackspace.setOnClickListener(this);
        btn2.setOnClickListener(this); btnCE.setOnClickListener(this);
        btn3.setOnClickListener(this); btnC.setOnClickListener(this);
        btn4.setOnClickListener(this); btnDiv.setOnClickListener(this);
        btn5.setOnClickListener(this); btnSub.setOnClickListener(this);
        btn6.setOnClickListener(this); btnMul.setOnClickListener(this);
        btn7.setOnClickListener(this); btnAdd.setOnClickListener(this);
        btn8.setOnClickListener(this); btnEqu.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            //btnBackspace和CE-----------
            case R.id.btnBackspace:
                String myStr=tvResult.getText().toString().trim();
                try{
                    tvResult.setText(myStr.substring(0,myStr.length()-1));
                }catch(Exception e){
                    tvResult.setText("");
                }
                break;
            case R.id.btnCE:
                tvResult.setText(null);break;
            //btn0-9----------------
            case R.id.btn0:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString0=tvResult.getText().toString().trim();
                myString0+="0";
                tvResult.setText(myString0);
                break;
            case R.id.btn1:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString1=tvResult.getText().toString().trim();
                myString1+="1";
                tvResult.setText(myString1);
                break;
            case R.id.btn2:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString2=tvResult.getText().toString().trim();
                myString2+="2";
                tvResult.setText(myString2);
                break;
            case R.id.btn6:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString6=tvResult.getText().toString().trim();
                myString6+="6";
                tvResult.setText(myString6);
                break;
            case R.id.btn7:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString7=tvResult.getText().toString().trim();
                myString7+="7";
                tvResult.setText(myString7);
                break;
            case R.id.btn8:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString8=tvResult.getText().toString().trim();
                myString8+="8";
                tvResult.setText(myString8);
                break;
            case R.id.btn9:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString9=tvResult.getText().toString().trim();
                myString9+="9";
                tvResult.setText(myString9);
                break;
            case R.id.btn3:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString3=tvResult.getText().toString().trim();
                myString3+="3";
                tvResult.setText(myString3);
                break;
            case R.id.btn4:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString4=tvResult.getText().toString().trim();
                myString4+="4";
                tvResult.setText(myString4);
                break; case R.id.btn5:
                if(isClickEqu){
                    tvResult.setText(null);
                    isClickEqu=false;
                }
                String myString5=tvResult.getText().toString().trim();
                myString5+="5";
                tvResult.setText(myString5);
                break;
            //btn+-*/--------------
            case R.id.btnAdd:
                String myStringAdd=tvResult.getText().toString().trim();
                if(myStringAdd.equals(null)){
                    return;
                }
                num1=Double.valueOf(myStringAdd);
                tvResult.setText(null);
                op=1;
                isClickEqu=false;
                break;
            case R.id.btnSub:
                String myStringSub=tvResult.getText().toString().trim();
                if(myStringSub.equals(null)){
                    return;
                }
                num1=Double.valueOf(myStringSub);
                tvResult.setText(null);
                op=2;
                isClickEqu=false;
                break;
            case R.id.btnMul:
                String myStringMul=tvResult.getText().toString().trim();
                if(myStringMul.equals(null)){
                    return;
                }
                num1=Double.valueOf(myStringMul);
                        tvResult.setText(null);
                op=3;
                isClickEqu=false;
                break;
            case R.id.btnDiv:
                String myStringDiv=tvResult.getText().toString().trim();
                if(myStringDiv.equals(null)){
                    return;
                }
                num1=Double.valueOf(myStringDiv);
                tvResult.setText(null);
                op=4;
                isClickEqu=false;
                break;
            case R.id.btnEqu:
                String myStringEqu=tvResult.getText().toString().trim();
                if(myStringEqu.equals(null)){
                    return;
                }
                num2=Double.valueOf(myStringEqu);
                tvResult.setText(null);
                switch(op){
                    case 0:
                    Result=num2;
                    break;
                    case 1:
                        Result=num1+num2;
                        break;
                    case 2:
                        Result=num1-num2;
                        break;
                    case 3:
                        Result=num1*num2;
                        break;
                    case 4:
                        Result=num1/num2;
                        break;
                    default:
                        Result=0;
                        break;
                }
                tvResult.setText(String.valueOf(Result));
                isClickEqu=true;
                break;
            default:break;

        }
    }
}
