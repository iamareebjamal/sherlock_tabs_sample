package areeb.sherlock.sampletabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockFragment;

public class TabFragment1 extends SherlockFragment {
	//Code defining what the system has to do when Tab 1 is selected
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle savedInstanceState){
		return inflater.inflate(R.layout.tab1, group, false);
		//Here, we told the system that the first thing to be done when Tab 1 is selected is to create a View with a layout
	}
	
	
	//The below code is the fragment code to do something when Tab Activity is created, it is similar to onCreate of Activity
	//Delete the below code if you don't want to do anything except showing a layout
	//Remember, you need to add all code of things you want to do inside OnActivityCreated like Buttons, etc. To do that, define Button publicly and the changeListener inside onCreateActivity. Demonstration is given in third fragment
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		
		Toast.makeText(getActivity(), "This is Tab 1", Toast.LENGTH_SHORT).show(); //Toast of text shown when Tab 1 is selected
		//In Fragments, 'this' is not used, as it is not any activity, instead getActivity() is used to get the parent Activity.
		
	}
	
	

}
