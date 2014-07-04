package listPadding.devcorner.aw.it;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListActivity extends Activity {

    private static final int MAX_NUMBER_OF_ELEMS = 300;
    private String[] elements = new String[MAX_NUMBER_OF_ELEMS];
    private ArrayAdapter adapter;
    private ListView elementsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        for (int i = MAX_NUMBER_OF_ELEMS - 1; i >= 0; i--) {
            elements[i] = String.format("Elemento %d", i);
        }

        adapter = new ArrayAdapter(this, R.layout.element, R.id.txtElement, elements);

        elementsList = (ListView) findViewById(R.id.listView);
        elementsList.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
