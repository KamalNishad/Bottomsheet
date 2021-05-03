package chips.in.bottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    private Button showsheet;
    private BottomSheetDialog bottomSheetDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showsheet = findViewById(R.id.bottom_sheet_display);
        showsheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bottomSheetDialog = new BottomSheetDialog(MainActivity.this,R.style.BottomsheetThem);

                View sheetView = LayoutInflater.from(getApplicationContext()).
                        inflate(R.layout.bottom_sheet_background,(ViewGroup)findViewById(R.id.bottom_sheet));

                bottomSheetDialog.setContentView(sheetView);
                bottomSheetDialog.show();
                // sheetView.findViewById()
            }
        });
    }
}
