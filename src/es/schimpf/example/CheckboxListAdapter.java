package es.schimpf.example;

import java.util.ArrayList;
import java.util.List;

import es.schimpf.example.checkboxlist.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * BaseAdapter implementation which will inflate the layout "element_example".
 * 
 * You can find more information in my <a href="http://schimpf.es">blog</a>.
 * 
 * @see <a href="http://schimpf.es">Blog</a>
 * @author Gerrit Schimpf
 * 
 */
public class CheckboxListAdapter extends BaseAdapter implements OnClickListener {

	/** The inflator used to inflate the XML layout */
	private LayoutInflater inflator;

	/** A list containing some sample data to show. */
	private List<SampleData> dataList;

	public CheckboxListAdapter(LayoutInflater inflator) {
		super();
		this.inflator = inflator;

		dataList = new ArrayList<SampleData>();

		dataList.add(new SampleData("Peter", false));
		dataList.add(new SampleData("Bob", false));
		dataList.add(new SampleData("Sara", true));
		dataList.add(new SampleData("Mitch", false));
		dataList.add(new SampleData("Tracy", false));
		dataList.add(new SampleData("Joe", false));
		dataList.add(new SampleData("George", false));
		dataList.add(new SampleData("Nancy", false));
		dataList.add(new SampleData("Susi", true));
		dataList.add(new SampleData("Homer", false));
		dataList.add(new SampleData("Lisa", false));
		dataList.add(new SampleData("Jack", false));
	}

	@Override
	public int getCount() {
		return dataList.size();
	}

	@Override
	public Object getItem(int position) {
		return dataList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup viewGroup) {

		// We only create the view if its needed
		if (view == null) {
			view = inflator.inflate(R.layout.element_example, null);

			// Set the click listener for the checkbox
			view.findViewById(R.id.checkBox1).setOnClickListener(this);
		}

		SampleData data = (SampleData) getItem(position);

		// Set the example text and the state of the checkbox
		CheckBox cb = (CheckBox) view.findViewById(R.id.checkBox1);
		cb.setChecked(data.isSelected());
		// We tag the data object to retrieve it on the click listener.
		cb.setTag(data);

		TextView tv = (TextView) view.findViewById(R.id.textView1);
		tv.setText(data.getName());

		return view;
	}

	@Override
	/** Will be called when a checkbox has been clicked. */
	public void onClick(View view) {
		SampleData data = (SampleData) view.getTag();
		data.setSelected(((CheckBox) view).isChecked());
	}

}
