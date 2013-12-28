package areeb.sherlock.sampletabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockFragment;

public class TabFragment2 extends SherlockFragment {
	
	//For comments, see TabFragment1
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle savedInstanceState){
		return inflater.inflate(R.layout.tab2, group, false);
		
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		
		Toast.makeText(getActivity(), "This is Tab 2", Toast.LENGTH_SHORT).show();
		
	}
	
	

}
