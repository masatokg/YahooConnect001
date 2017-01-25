package jp.ac.asojuku.yahooconnect001;

import jp.co.yahoo.android.maps.GeoPoint;
import jp.co.yahoo.android.maps.MapController;
import jp.co.yahoo.android.maps.MapView;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	// 20170125 コメント追記	
@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// 地図表示用のYahooライブラリview部品を用意
        MapView mapView = new MapView(this,"dj0zaiZpPXlMUmxLZEVaWXA0SiZzPWNvbnN1bWVyc2VjcmV0Jng9N2Q-");
        // ズームボタンを画面にON
        mapView.setBuiltInZoomControls(true);
        // 地図縮尺バーを画面にON
        mapView.setScalebar(true);
        // 地図本体を生成
        MapController c = mapView.getMapController();
        // 渋谷駅の緯度経度のGeoPointを手書きで設定
        double lat = 35.658516;
        double lon = 139.701773;
        GeoPoint gp = new GeoPoint((int)(lat * 1000000), (int)(lon * 1000000));
        // 地図本体にGeoPointoを設定
        c.setCenter(gp);
        // 地図本体のズームを３に設定
        c.setZoom(3);
        // 地図本体を画面にセット
        setContentView(mapView);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
