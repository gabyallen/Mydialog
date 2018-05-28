package dialog.rytong.com.myappdailog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MyselfDialog selfDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.txt_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selfDialog = new MyselfDialog(MainActivity.this);
                selfDialog.setTitle("提示");
                selfDialog.setMessage("确定退出应用?");
                selfDialog.setYesOnclickListener("确定", new MyselfDialog.onYesOnclickListener() {
                    @Override
                    public void onYesClick() {
                        Toast.makeText(MainActivity.this,"点击了--确定--按钮",Toast.LENGTH_LONG).show();
                        selfDialog.dismiss();
                    }
                });
                selfDialog.setNoOnclickListener("取消", new MyselfDialog.onNoOnclickListener() {
                    @Override
                    public void onNoClick() {
                        Toast.makeText(MainActivity.this,"点击了--取消--按钮",Toast.LENGTH_LONG).show();
                        selfDialog.dismiss();
                    }
                });
                selfDialog.show();
            }
        });
    }
}
