package kr.hs.emirim.s2019s05.mirimgridviewtest;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    Context context;
    int[] imgRes = {R.drawable.poster1,R.drawable.poster2,R.drawable.poster3,R.drawable.poster4,R.drawable.poster5,R.drawable.poster6,R.drawable.poster7
    ,R.drawable.poster8,R.drawable.poster9,R.drawable.poster10,R.drawable.poster11,R.drawable.poster12,R.drawable.poster13,R.drawable.poster14,R.drawable.poster15,
            R.drawable.poster16};

    String[] imgName = {"삼진그룹영어토익반","소리도 없이","담보","아이랜드","코랠라인","기생충","시동"
            ,"인터스텔라","검은 사제들","사자","늑대소년","너의이름은","컨져링","애나벨","해리포터 마법의돌",
            "해리포터 비밀의방"};
    public GridAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return imgRes.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new GridView.LayoutParams(200,300));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5,5,5,5);
        imgv.setImageResource(imgRes[position]);

        final int pos = position;
        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View dialogView = View.inflate(context,R.layout.dialog,null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(context);
                ImageView imgvPoster = dialogView.findViewById(R.id.img_dialog);
                imgvPoster.setImageResource(imgRes[pos]);
                dlg.setTitle(imgName[pos]);
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기",null);
                dlg.show();
            }
        });
        return imgv;
    }
}
