package com.bulbulhossen.toolbarhelperview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;


//public class CustomAdapter extends ArrayAdapter<String> {
//	String[] str;
//	Context mContext;
//	LayoutInflater inflater;
//
//	public CustomAdapter(Context context, int textViewResourceId, String[] objects) {
//		super(context, textViewResourceId, objects);
//		str = objects;
//		mContext = context;
//		inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//	}
//
//	public View getView(int position, View convertView, ViewGroup parent) {
//		View row = inflater.inflate(R.layout.townlistview, parent, false);
//
//		TextView textView = (TextView) row.findViewById(R.id.textView);
//		textView.setText(str[position]);
//
//		textView.setAnimation(AnimationUtils.loadAnimation(mContext, R.anim.listview_anim));
//
//		return row;
//	}
//}






public class CustomAdapter extends BaseAdapter {


	String[] i;
	Context ctx;
	//int[] img;



	public CustomAdapter(Context ctx, int text1, String[] i)//, int[] img
	{
		super();
		this.i = i;
		this.ctx = ctx;
	//	this.img=img;
	}


	static class ViewHolder{
		TextView tv1;
		//ImageView iv1;
	}


	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return i.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return i[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

		convertView= LayoutInflater.from(ctx).inflate(R.layout.townlistview, parent, false);

		ViewHolder Holder=new ViewHolder();

		Holder.tv1=(TextView) convertView.findViewById(R.id.bulbul);
		Holder.tv1.setText(i[position]);
//		Holder.iv1= (ImageView) convertView.findViewById(R.id.imageView1);
//		Holder.iv1.setImageResource(img[position]);
//
		return convertView;
	}




}
