package kumpulansuratdandoadoa.kumpulansuratpendekdandoa;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hilma on 1/8/2018.
 */

public class MyAdapter extends ArrayAdapter<String>{

    String[] names;
    int[] gambar;
    Context mContext;

    public MyAdapter(@NonNull Context context, String[] namaDoa, int[] gambarDoa) {
        super(context, R.layout.listview_item);
        this.names = namaDoa;
        this.gambar = gambarDoa;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder= new ViewHolder();
        if(convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.listview_item, parent, false);
            mViewHolder.mGambar = (ImageView) convertView.findViewById(R.id.imageView);
            mViewHolder.mName = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(mViewHolder);
        } else{
            mViewHolder = (ViewHolder)convertView.getTag();
        }

        mViewHolder.mGambar.setImageResource(gambar[position]);
        mViewHolder.mName.setText(names[position]);


        return convertView;
    }

    static class ViewHolder{
        ImageView mGambar;
        TextView mName;
    }
}
