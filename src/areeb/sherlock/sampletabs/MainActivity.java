package areeb.sherlock.sampletabs;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.view.Menu;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends SherlockFragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//I have uncommented these lines, if you wish to have Action Bar back button enabled, deleted the '//' from the below java code
		//And you will also need to delete the uncommentors from below "onOptionsItemSelected" 
		
		
		//getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		//getSupportActionBar().setHomeButtonEnabled(true);
		
		
		//This sets up the Action Bar for using Tab Navigation Code
		getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		
		
		//Here. we are defining our tabs and adding them in our activity
		
		//First Tab configuration
		ActionBar.Tab tab1 = getSupportActionBar().newTab();
        tab1.setText("Tab 1"); //Tab1 Title Text
        tab1.setTabListener(new TabListenerClass()); //We are telling the Tabs to use the TabListenerClass for any change
        getSupportActionBar().addTab(tab1);
        
        //Second Tab Configuration
        ActionBar.Tab tab2 = getSupportActionBar().newTab();
        tab2.setText("Tab 2"); //Tab2 Title Text
        tab2.setTabListener(new TabListenerClass()); //We are telling the Tabs to use the TabListenerClass for any change
        getSupportActionBar().addTab(tab2);
        
        //Third Tab Configuration
        ActionBar.Tab tab3 = getSupportActionBar().newTab();
        tab3.setText("Tab 3"); //Tab3 Title Text
        tab3.setTabListener(new TabListenerClass()); //We are telling the Tabs to use the TabListenerClass for any change
        getSupportActionBar().addTab(tab3);
        
        //You can add more tabs in same manner
        
        
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//It adds menu items in Action Bar like in Jelly Bean
		getSupportMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	//This is the code which tells the Tabs what to do when they are clicked
	private class TabListenerClass implements ActionBar.TabListener{

		@Override
		public void onTabSelected(Tab tab, FragmentTransaction ft) { //When we change the tabs, we want to change our current view, this can be done without changing specific activities with the help of fragments, and to change fragments, we have called FragmentTransaction
			// TODO Auto-generated method stub
			
			//The code for doing activities when a specific tab is selected
			
			switch(tab.getPosition()) { //Here, we have called to get Position of the Tab
			case 0: //Code to do stuff when Tab 1 has been selected, in Java, counting starts from 0
				TabFragment1 frag = new TabFragment1(); //Here, we are defining a fragment for Tab1
				ft.replace(android.R.id.content, frag); //Here, we have told the system to replace the current view of Activity to the TabFragment1
				break;
			case 1: //Code to do stuff when Tab 2 has been selected
				TabFragment2 frag1 = new TabFragment2(); //Here, we are defining a fragment for Tab2
				ft.replace(android.R.id.content, frag1); //Here, we have told the system to replace the current view of Activity to the TabFragment2
				break;
			case 2: //Code to do stuff when Tab 3 has been selected
				TabFragment3 frag2 = new TabFragment3(); //Here, we are defining a fragment for Tab3
				ft.replace(android.R.id.content, frag2); //Here, we have told the system to replace the current view of Activity to the TabFragment3
				break;
			}
			
			//You can add more tabs in same manner
			
		}

		@Override
		public void onTabUnselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			//We have no intentions right now to do something when a Tab is Unselected, if you do, add the code as you wish in the above same manner
		}

		@Override
		public void onTabReselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			//We have no intentions right now to do something when a Tab is Unselected, if you do, add the code as you wish in the above same manner
		}
		
	
	
	
	
	
         
	
     
	}
	
 
	//Uncommented code for enabling ActionBar Back button
	
	/*@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
        	case android.R.id.home:
        		// app icon in action bar clicked; go home
        		finish();
        		return true;
        	default:
                return super.onOptionsItemSelected(item);
		}
	}
	*/
}
