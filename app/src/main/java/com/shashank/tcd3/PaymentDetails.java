package com.shashank.tcd3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class PaymentDetails extends AppCompatActivity {

    TextView txtId,txtAmount,txtStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_details);

        txtId=findViewById(R.id.txtId_payment_details);
        txtAmount=findViewById(R.id.txtAmount_payment_details);
        txtId=findViewById(R.id.txtStatus_payment_details);

        Intent inten20= getIntent();
        try{
            JSONObject jsonObject= new JSONObject(inten20.getStringExtra("Payment Details"));
            showDetails(jsonObject.getJSONObject("response"),inten20.getStringArrayExtra("PaymentAmount"));

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    private void showDetails(JSONObject response, String[] paymentAmount) {
        try {
            txtId.setText(response.getString("id"));
            txtStatus.setText(response.getString("state"));
            txtAmount.setText("$%s"+paymentAmount);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
