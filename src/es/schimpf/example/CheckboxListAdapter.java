package es.schimpf.example;

import java.util.ArrayList;
import java.util.List;

import es.schimpf.example.checkboxlist.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Baseadapter implementation which will inflate the layout "element_example".
 * 
 * You can find more information in my <a href="http://schimpf.es">blog</a>.
 * 
 * @see <a href="http://schimpf.es">Blog</a>
 * @author Gerrit Schimpf
 * 
 */
public class CheckboxListAdapter extends BaseAdapter {

	/** The inflator used to inflate the xml layout */
	private LayoutInflater inflator;

	/** A list containin some sample data to show. */
	private List<SampleData> dataList;

	public CheckboxListAdapter(LayoutInflater inflator) {
		super();
		this.inflator = inflator;

		dataList = new ArrayList<SampleData>();

		dataList.add(new SampleData("Peter", false));
		dataList.add(new SampleData("Peter", false));
		dataList.add(new SampleData("Sara", true));
		dataList.add(new SampleData("Peter", false));
		dataList.add(new SampleData("Peter", false));
		dataList.add(new SampleData("Peter", false));
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
		}

		SampleData data = (SampleData) getItem(position);

		// Set the example text and the state of the checkbox
		CheckBox cb = (CheckBox) view.findViewById(R.id.checkBox1);
		cb.setChecked(data.isSelected());

		TextView tv = (TextView) view.findViewById(R.id.textView1);
		tv.setText(data.getName());

		return view;
	}

}
