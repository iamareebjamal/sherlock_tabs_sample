package areeb.sherlock.sampletabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.widget.Button;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockFragment;

public class TabFragment3 extends SherlockFragment {
	
	//For comment on other items, see TabFragment1
	
	//How to add a button and make it do some work:
	//(Uncommented code)
	
	
	
	//Button b1; //*//Here we are defining that b1 is a button 
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle savedInstanceState){
		return inflater.inflate(R.layout.tab3, group, false);
		
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		
		Toast.makeText(getActivity(), "This is Tab 3", Toast.LENGTH_SHORT).show();
		
	//	b1 = (Button) getActivity().findViewById(R.id.button); //*//Here we have defined b1 to be a button with id = button
	//	//Add a button with id=button in the layout tab3
	//	b1.setOnClickListener(new View.OnClickListener() { 
	//		
	//		@Override
	//		public void onClick(View arg0) {
	//			// TODO Auto-generated method stub
	//			
	//			//
	//			//*//Add code of what you want to do when a button is clicked here
	//			//
	//			
	//		}
	//	});
		
		
	}
	
	

}
