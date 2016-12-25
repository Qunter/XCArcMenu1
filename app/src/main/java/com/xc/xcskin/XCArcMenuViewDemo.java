package com.xc.xcskin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.xc.xcskin.view.XCArcMenuView;
import com.xc.xcskin.view.XCArcMenuView.OnMenuItemClickListener;

/**
 * 改名什么的就不用我说了，反正一下就可以改好的，我也不知道你要改成什么名字，你就自己动手吧
 * 两个类文件，一个是XCArcMenuView，这个是用来计算那些button的位置和让他们摆放好的函数
 * 另外一个是MenuItem，是定义菜单按钮和Item的样式的类文件
 * 只是使用的话，宽高你可以在dimens里设置，我打了备注，因为菜单和Item都是一样的宽高，所以到那里设置一次就行
 * 然后在布局里你可以设置菜单的position，这是个枚举，四种情况，左上右上左下右下，我现在设置的是左下
 * 还有一个是radius，半径，这个不用说了
 * 至于Item的布局，可以修改的是文字，图标，tag
 * 最后，使用的时候
 * 1，布局文件里定义
 * 2，findID
 * 3，加监听，用tag判断点到的是哪个，然后丢你的触发事件(当然你要加ID的话也随你便，这是我设想的方法)
 */
public class XCArcMenuViewDemo extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xc_arcmenu_view_demo);
        XCArcMenuView view = (XCArcMenuView) findViewById(R.id.menu);
        view.setOnMenuItemClickListener(new OnMenuItemClickListener() {
            @Override
            public void onClick(View view, int pos) {
                // TODO Auto-generated method stub
                String tag = (String) view.getTag();
                Toast.makeText(XCArcMenuViewDemo.this, tag, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
