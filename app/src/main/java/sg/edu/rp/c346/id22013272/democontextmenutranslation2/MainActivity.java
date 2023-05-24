package sg.edu.rp.c346.id22013272.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;
    String wordClicked="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText=findViewById(R.id.textviewTranslatedText);

        registerForContextMenu(tvTranslatedText);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        //…
        menu.add(0, 0, 0, "English");
        menu.add(0, 1, 1, "Italian");
        getMenuInflater().inflate(R.menu.menu_main, menu);
        if (v == tvTranslatedText) {
            wordClicked = "hello";
        }
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        // …
        if (item.getItemId() == 0) { //check whether the selected menu item ID is 0
            //code for action
            tvTranslatedText.setText("Hello");
            //Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();

            return true; //menu item successfully handled
        } else if (item.getItemId() == 1) { //check if the selected menu item ID is 1
            //code for action
            tvTranslatedText.setText("Ciao");
            //Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();

            return true;  //menu item successfully handled
        }
        return super.onContextItemSelected(item);
    }
}