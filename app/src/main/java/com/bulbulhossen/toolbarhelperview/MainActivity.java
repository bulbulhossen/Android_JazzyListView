package com.bulbulhossen.toolbarhelperview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.twotoasters.jazzylistview.JazzyListView;
import com.twotoasters.jazzylistview.effects.CardsEffect;
import com.twotoasters.jazzylistview.effects.CurlEffect;
import com.twotoasters.jazzylistview.effects.FadeEffect;
import com.twotoasters.jazzylistview.effects.FlipEffect;
import com.twotoasters.jazzylistview.effects.FlyEffect;
import com.twotoasters.jazzylistview.effects.GrowEffect;
import com.twotoasters.jazzylistview.effects.HelixEffect;
import com.twotoasters.jazzylistview.effects.ReverseFlyEffect;
import com.twotoasters.jazzylistview.effects.SlideInEffect;
import com.twotoasters.jazzylistview.effects.StandardEffect;
import com.twotoasters.jazzylistview.effects.TwirlEffect;
import com.twotoasters.jazzylistview.effects.WaveEffect;
import com.twotoasters.jazzylistview.recyclerview.JazzyRecyclerViewScrollListener;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        JazzyListView listView = (JazzyListView) findViewById(R.id.list);











        String[] str = {"মেঘের পরে মেঘ জমেছে","সোনার তরী","এসো হে বৈশাখ এসো এসো","যাবার দিন","আসমান","খুকির সম্পত্","আমার বাড়","রূপাই","নক্সী কাঁথার মাঠ","পাখির ছানা","এত হাসি কোথায় পেলে","মেঘের পরে মেঘ জমেছে","সোনার তরী","এসো হে বৈশাখ এসো এসো","যাবার দিন","আসমান","খুকির সম্পত্","আমার বাড়","রূপাই","নক্সী কাঁথার মাঠ","পাখির ছানা","এত হাসি কোথায় পেলে"};




//        ListView listView = (ListView)findViewById(R.id.listView);

        JazzyListView listView = (JazzyListView) findViewById(R.id.list);
        listView.setTransitionEffect(new HelixEffect());
        final CustomAdapter adapter = new CustomAdapter(getApplicationContext(), android.R.id.text1, str);

//        final ArrayAdapter adapter = new ArrayAdapter<String>(getApplication(),
//                R.layout.activity_main, treffer);



        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//                Toast.makeText(Robi.this, ""+adapter.getItem(position), Toast.LENGTH_SHORT).show();
//
//                switch (position){
//
//                    case 0:
//                        i = new Intent(Robi.this, Robione.class);
//                    case 1:
//                        i = new Intent(Robi.this, Robione.class);
//                    case 2:
//                        i = new Intent(Robi.this, Robione.class);
//                    case 3:
//                        i = new Intent(Robi.this, Robione.class);
//                    case 4:
//                        i = new Intent(Robi.this, Robione.class);
//                    case 5:
//                        i = new Intent(Robi.this, Robione.class);
//
//                }
//
//                startActivity(i);
//
//
            }
        });


//        String[] data =new String[]{"Dhaka","Khulna","Feni"};
//
//        int image[]={R.drawable.indigo_logo,R.drawable.robi, R.drawable.index};
//
//        ListView townListView=(ListView) findViewById(R.id.firstListView);
//
//        final CustomAdapter ad =new CustomAdapter(this,data);//,image
//        //ArrayAdapter<String> ad=new ArrayAdapter<String>(this,R.layout.townlistview,R.id.textView1, data);
//        townListView.setAdapter(ad);
//
//
//        townListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
//                                    long id) {
//                // TODO Auto-generated method stub
//
//                Toast.makeText(Robi.this, ""+ad.getItem(position), Toast.LENGTH_SHORT).show();
//
//            }
//
//
//
//        });


    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_list__main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}






















//
//
////        listView.setTransitionEffect(new CardsEffect());
////        listView.setTransitionEffect(new GrowEffect());
////        listView.setTransitionEffect(new CurlEffect());
////        Listview animation item
////        listView.setTransitionEffect(new FlyEffect());
////        listView.setTransitionEffect(new FadeEffect());
////        listView.setTransitionEffect(new SlideInEffect());
////    }
////}
//
//
////        Animation help link :
////        https://github.com/twotoasters/JazzyListView
////       animation :  http://lab.hakim.se/scroll-effects/
////
//////       http://stackoverflow.com/questions/15931068/add-animation-to-listview-items
//
//
//// Defined Array values to show in ListView
//        String[] values = new String[]{
//
//                "Android List View",
//                "Adapter implementation",
//                "Simple List View In Android",
//                "Create List View Android",
//                "Android Example",
//                "List View Source Code",
//                "List View Array Adapter",
//                "Android Example List View",
//                "Android List View",
//                "Adapter implementation",
//                "Simple List View In Android",
//                "Create List View Android",
//                "Android Example",
//                "List View Source Code",
//                "List View Array Adapter",
//                "Android Example List View"
//        };
//
//
//        // Define a new Adapter
//        // First parameter - Context
//        // Second parameter - Layout for the row
//        // Third parameter - ID of the TextView to which the data is written
//        // Forth - the Array of data
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1, android.R.id.text1, values);
//
//
//        // Assign adapter to ListView
//        listView.setAdapter(adapter);
//
//        // ListView Item Click Listener
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view,
//                                    int position, long id) {
//
//
////                // ListView Clicked item index
////                int itemPosition     = position;
////
////                // ListView Clicked item value
////                String  itemValue    = (String) listView.getItemAtPosition(position);
////
////                // Show Alert
////                Toast.makeText(getApplicationContext(),
////                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
////                     .show();
//
//            }
//
//        });
//    }
//
//}