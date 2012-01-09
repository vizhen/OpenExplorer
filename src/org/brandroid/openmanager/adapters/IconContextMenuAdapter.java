package org.brandroid.openmanager.adapters;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.view.*;
import android.widget.*;

public class IconContextMenuAdapter extends BaseAdapter {
	private Context context;
    private Menu menu;
    
    public IconContextMenuAdapter(Context context, Menu menu) {
		this.context = context;
		this.menu = menu;
	}

	//@Override
	public int getCount() {
		return menu.size();
	}
	
	//@Override
	public MenuItem getItem(int position) {
		return menu.getItem(position);
	}

	//@Override
	public long getItemId(int position) {
		return getItem(position).getItemId();
	}
    
    //@Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MenuItem item = getItem(position);
        
        TextView res = (TextView) convertView;
        if (res == null) {
        	res = (TextView) LayoutInflater.from(context).inflate(android.R.layout.select_dialog_item, null);
        }
        
        res.setTextColor(context.getResources().getColor(R.color.primary_text_dark));
        res.setWidth(400);

        res.setTag(item);
        res.setText(item.getTitle());
        res.setCompoundDrawablesWithIntrinsicBounds(item.getIcon(), null, null, null);
              
        return res;
    }
}
