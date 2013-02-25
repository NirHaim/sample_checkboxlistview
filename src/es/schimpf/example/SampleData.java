package es.schimpf.example;

/**
 * Container to hold same sample data.
 * 
 * You can find more information in my <a href="http://schimpf.es">blog</a>.
 * 
 * @see <a href="http://schimpf.es">Blog</a>
 * @author Gerrit Schimpf
 * 
 */
public class SampleData {

	private String name;
	
	private boolean selected;
	
	public SampleData(String name, boolean selected) {
		super();
		this.name = name;
		this.selected = selected;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
}
