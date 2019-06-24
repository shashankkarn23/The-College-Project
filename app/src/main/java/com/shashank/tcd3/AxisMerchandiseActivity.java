package com.shashank.tcd3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalPayment;
import com.paypal.android.sdk.payments.PayPalPaymentDetails;
import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.PaymentActivity;
import com.paypal.android.sdk.payments.PaymentConfirmation;
import com.shashank.tcd3.ConfigPaypal.Config;

import org.json.JSONException;

import java.math.BigDecimal;

public class AxisMerchandiseActivity extends AppCompatActivity {

    public static final int PAYPAL_REQUEST_CODE = 7171;
    private static PayPalConfiguration config = new PayPalConfiguration().environment(PayPalConfiguration.ENVIRONMENT_SANDBOX).clientId(Config.PAYPAL_CLIENT_ID);
    TextView editAmount,editAmount3,editAmount2;
    String amount = "";
    ImageView imgTShirt1,imgTShirt2,imgTShirt3;

    @Override
    protected void onDestroy() {
        stopService(new Intent(this, PayPalService.class));
        super.onDestroy();
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_axis_merchandise);


        Intent intent19 = new Intent(this, PayPalService.class);
        intent19.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION, config);
        startService(intent19);

        editAmount = findViewById(R.id.PriceTag1);
        editAmount2 = findViewById(R.id.PriceTag2);
        editAmount3 = findViewById(R.id.PriceTag3);
        imgTShirt1=findViewById(R.id.appLabel2_merchandise);
        imgTShirt2=findViewById(R.id.appLabel3_merchandise);
        imgTShirt3 = findViewById(R.id.appLabel4_merchandise);


        imgTShirt1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int id1=R.id.PriceTag1;
                processPayment(id1);
                return false;
            }
        });
        imgTShirt2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int id2=R.id.PriceTag2;
                processPayment(id2);

                return false;
            }
        });
        imgTShirt3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int id3=R.id.PriceTag3;
                processPayment(id3);
                return false;
            }
        });
    }

    private void processPayment(int id) {
        if(id==R.id.PriceTag1) {
            amount = editAmount.getText().toString();
            PayPalPayment payPalPayment = new PayPalPayment(new BigDecimal(String.valueOf(amount)), "USD",
                    "Pay for Merchandise", PayPalPayment.PAYMENT_INTENT_SALE);

            Intent intent18 = new Intent(this, PaymentActivity.class);
            intent18.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION, config);
            intent18.putExtra(PaymentActivity.EXTRA_PAYMENT, payPalPayment);
            startActivityForResult(intent18, PAYPAL_REQUEST_CODE);
        }else if(id==R.id.PriceTag2) {
            amount = editAmount2.getText().toString();
            PayPalPayment payPalPayment = new PayPalPayment(new BigDecimal(String.valueOf(amount)), "USD",
                    "Pay for Merchandise", PayPalPayment.PAYMENT_INTENT_SALE);

            Intent intent18 = new Intent(this, PaymentActivity.class);
            intent18.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION, config);
            intent18.putExtra(PaymentActivity.EXTRA_PAYMENT, payPalPayment);
            startActivityForResult(intent18, PAYPAL_REQUEST_CODE);
        }else if(id==R.id.PriceTag3) {
            amount = editAmount3.getText().toString();
            PayPalPayment payPalPayment = new PayPalPayment(new BigDecimal(String.valueOf(amount)), "USD",
                    "Pay for Merchandise", PayPalPayment.PAYMENT_INTENT_SALE);

            Intent intent18 = new Intent(this, PaymentActivity.class);
            intent18.putExtra(PayPalService.EXTRA_PAYPAL_CONFIGURATION, config);
            intent18.putExtra(PaymentActivity.EXTRA_PAYMENT, payPalPayment);
            startActivityForResult(intent18, PAYPAL_REQUEST_CODE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == PAYPAL_REQUEST_CODE) {
            if (requestCode == RESULT_OK) {
                PaymentConfirmation confirmation = data.getParcelableExtra(PaymentActivity.EXTRA_RESULT_CONFIRMATION);
                if (confirmation != null) {
                    try {
                        String paymentDetails = confirmation.toJSONObject().toString(4);
                        startActivity(new Intent(this,PaymentDetails.class)
                                .putExtra("paymentDetails", paymentDetails)
                                .putExtra("paymentAmount", amount)

                        );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }
            }
            else if(resultCode== Activity.RESULT_CANCELED){
                Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show();
            }

        }
        else if(resultCode==PaymentActivity.RESULT_EXTRAS_INVALID){
            Toast.makeText(this,"Invalid",Toast.LENGTH_SHORT).show();
        }
    }
}
