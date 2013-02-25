package es.schimpf.example;

import es.schimpf.example.checkboxlist.R;
import android.app.ListActivity;
import android.os.Bundle;

/**
 * Activity demonstrating the use of checkboxes inside a ListView.
 * 
 * You can find more information about this code in my <a
 * href="http://schimpf.es">blog</a>.
 * 
 * @see <a href="http://schimpf.es">Blog</a>
 * @author Gerrit Schimpf
 * 
 */
public class CheckboxListActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_checkbox);

		CheckboxListAdapter adapter = new CheckboxListAdapter(
				getLayoutInflater());

		getListView().setAdapter(adapter);
	}

}
