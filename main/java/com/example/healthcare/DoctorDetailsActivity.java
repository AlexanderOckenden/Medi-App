package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailsActivity extends AppCompatActivity {
    private String[][] doctor_details1 =
            {
                    {"Doctor Name : John Arthur", "Hospital Address : brighton", "Exp : 5yrs", "Mobile No:9898989898", "60"},
                    {"Doctor Name : Shaun Birks", "Hospital Address : brighton", "Exp : 15yrs", "Mobile No:7898989898", "90" },
                    {"Doctor Name : Swapnil Kale", "Hospital Address : brighton", "Exp : 8yrs", "Mobile No:8898989898", "30"},
                    {"Doctor Name : Stephen Butler", "Hospital Address : brighton", "Exp : 6yrs", "Mobile No:9898000000", "50"},
                    {"Doctor Name : William Fleetwood", "Hospital Address : brighton", "Exp : 7yrs", "Mobile No:7798989898", "80"}
            };
    private String[][] doctor_details2 =
            {
                    {"Doctor Name : Peter Midgley", "Hospital Address : brighton", "Exp : 5yrs", "Mobile No:9898989898", "60"},
                    {"Doctor Name : Susan McCann", "Hospital Address : brighton", "Exp : 15yrs", "Mobile No:7898989898", "90"},
                    {"Doctor Name : Joseph Morgan", "Hospital Address : brighton", "Exp : 8yrs", "Mobile No:8898989898", "30"},
                    {"Doctor Name : Peter Midgley", "Hospital Address : brighton", "Exp : 6yrs", "Mobile No:9898000000", "50"},
                    {"Doctor Name : Kenneth Smith", "Hospital Address : brighton", "Exp : 7yrs", "Mobile No:7798989898", "80"}
            };
    private String[][] doctor_details3 =
            {
                    {"Doctor Name : Peter Midgley", "Hospital Address : brighton", "Exp : 5yrs", "Mobile No:9898989898", "60"},
                    {"Doctor Name : Susan McCann", "Hospital Address : brighton", "Exp : 15yrs", "Mobile No:7898989898", "90"},
                    {"Doctor Name : Joseph Morgan", "Hospital Address : brighton", "Exp : 8yrs", "Mobile No:8898989898", "30"},
                    {"Doctor Name : Peter Midgley", "Hospital Address : brighton", "Exp : 6yrs", "Mobile No:9898000000", "50"},
                    {"Doctor Name : Kenneth Smith", "Hospital Address : brighton", "Exp : 7yrs", "Mobile No:7798989898", "80"}
            };
    private String[][] doctor_details4 =
            {
                    {"Doctor Name : Lynda Hogan", "Hospital Address : brighton", "Exp : 5yrs", "Mobile No:9898989898", "60"},
                    {"Doctor Name : Prasad Pawar", "Hospital Address : brighton", "Exp : 15yrs", "Mobile No:7898989898", "90"},
                    {"Doctor Name : Lascelle Hutchinson", "Hospital Address : brighton", "Exp : 8yrs", "Mobile No:8898989898", "30"},
                    {"Doctor Name : Jawad Sharif", "Hospital Address : brighton", "Exp : 6yrs", "Mobile No:9898000000", "50"},
                    {"Doctor Name : Timothy Hill", "Hospital Address : brighton", "Exp : 7yrs", "Mobile No:7798989898", "80"}
            };
    private String[][] doctor_details5 =
            {
                    {"Doctor Name : Helen Jenkins", "Hospital Address : brighton", "Exp : 5yrs", "Mobile No:9898989898", "160"},
                    {"Doctor Name : Richard Cooper", "Hospital Address : brighton", "Exp : 15yrs", "Mobile No:7898989898", "190"},
                    {"Doctor Name : Barry Gardiner", "Hospital Address : brighton", "Exp : 8yrs", "Mobile No:8898989898", "130"},
                    {"Doctor Name : Susan McCann", "Hospital Address : brighton", "Exp : 6yrs", "Mobile No:9898000000", "150"},
                    {"Doctor Name : Kenneth Graham", "Hospital Address : brighton", "Exp : 7yrs", "Mobile No:7798989898", "180"}
            };
    TextView tv;
    Button btn;
    String[][] doctor_details = {};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        tv = findViewById(R.id.textViewDDTitle);
        btn = findViewById(R.id.buttonBMCartBack);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if(title.compareTo("Family Physicians")==0)
            doctor_details = doctor_details1;
        else
        if(title.compareTo("Dietician")==0)
            doctor_details = doctor_details2;
        else
        if(title.compareTo("Dentist")==0)
            doctor_details = doctor_details3;
        else
        if(title.compareTo("Surgeon")==0)
            doctor_details = doctor_details4;
        else
            doctor_details = doctor_details5;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DoctorDetailsActivity.this,FindDoctorActivity.class));
            }
        });

        list = new ArrayList();
        for(int i=0;i<doctor_details.length;i++){
            item = new HashMap<String,String>();
            item.put( "line1", doctor_details[i][0]);
            item.put( "line2", doctor_details[i][1]);
            item.put( "line3", doctor_details[i][2]);
            item.put( "line4", doctor_details[i][3]);
            item.put( "line5", "Cons Fees:"+" £ "+doctor_details[i][4]);
            list.add( item );
        }
        sa = new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e}
                );
        ListView lst = findViewById(R.id.listViewBMCart);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(DoctorDetailsActivity.this,BookAppointmentActivity.class);
                it.putExtra("text1",title);
                it.putExtra("text2",doctor_details[i][0]);
                it.putExtra("text3",doctor_details[i][1]);
                it.putExtra("text4",doctor_details[i][3]);
                it.putExtra("text5",doctor_details[i][4]);
                startActivity(it);
            }
        });
    }
}