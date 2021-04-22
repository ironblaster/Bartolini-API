package customPojo.shipmentPojo.common;

import java.io.Serializable;
import java.util.Arrays;

public class Labels implements Serializable{
	
	Label[] label;

	public Label[] getLabel() {
		return label;
	}

	public void setLabel(Label[] label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "Labels [label=" + Arrays.toString(label) + "]";
	}
	
	

}
