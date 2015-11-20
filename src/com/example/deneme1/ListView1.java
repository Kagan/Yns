package com.example.deneme1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;


public class ListView1 extends ListActivity{
	String stringarray[]={"ACEP BU BENÝM HALÝM","ACEP N'OLA BENÝM HALÝM","ALLAH","ALLAH SANA SUNDUM ELÝM","ANDAN AYRI BUÇUK SAAT","ANLAMADAN EYLEDÝK",
			"AYRUK GERÝ GELMEYESÝN","AÞK BEZÝRGANI","AÞK GELÝCEK CÜMLE EKSÝKLER BÝTER","AÞKIN ÝLE MEST OLALI","AÞKINA DÜÞEN KÝÞÝ","AÞKINA MUHAMMED'ÝN",
			"AÞIK CANI ÖLMEYE","AÞIK KÝÞÝ","AÞIMA ZEHR-Ý KATÝL KATMIÞIM BEN","BANA BU TEN GEREKMEZ","BANA SENÝ GEREK SENÝ","BAÞTAN AYAÐA YAREYÝM",
			"BE DEDÝRMEÐÝL BANA","BEN GELMEDÝM DAVA ÝÇÝN","BENCÝLEYÝN GÜLMEDÝK BAÞ","BENÝ ÝRÞAT EDEN","BESLERDÝM BU NAZÝK TENÝ","BÝLDÝKLERÝM UNUTMUÞUM",
			"BÝR BEN VARDIR BENDE","BÝR DEM GELÝR","BÝR GÜN","BÝR KEZ GÖNÜL YIKTIN ÝSE","BÝR SAKÝDEN ÝÇTÝM ÞARAP","BÝR ÝLE BÝR OL","BÝR ÞARAPTAN ÝÇMEK GEREK",
			"BU BIRAKTIÐIN IRAK NEDÝR","BU BIRAKTIÐIN IRAK NEDÝR","BU NE ACAYÝP UÐRU","BUNCA VARLIK VAR ÝKEN","BIRAK ÝKÝLÝÐÝ","CANA KIYAN GELSÝN",
			"CANLAR CANINI BULDUM","CANLAR FEDA","CANI YAÐMAYA VERDÝK","CENNETTEN ÝLERÝ","ÇIKTIM ERÝK DALINA","ÇIRAÐIMA KASTEDENÝN","DAÐLAR ÝLE TAÞLAR ÝLE",
			"DEÐÝLÝM KAL Ü KIYLEDE","DERTLÝLER BULUCAÐAZ","DOLAP","DOST ELÝNDEN ÖLÜRSEM","DÜNYAYA ÇOK GELÝP GÝTTÝM","EBEDÝ PADÝÞAH","ECEL ERE ÖLEM BÝR GÜN",
			"EÐER YARLIÐAMAZSAN","ELHAMDÜ-LÝLLAH","ELÝF'TEN BE'YÝ BÝLMEYEN","ETEÐÝN AT EDÝNÝP","EVLÝYALAR ALAN DÜNYASIN","GAYRÝ YÜZE NÝCE BAKAR","GEÇER BU EYYAMLAR",
			"GEL GÖR BENÝ AÞK NEYLEDÝ","GELEN GEÇER, KONAN GÖÇER","GELMEZ ÝSE","GER TAÞ ÝSEN ERÝYESÝN","GERÇEK ERÝN HALÝNÝ","GÜNDÜZLER OLMUÞ GECE",
			"GÜZEL KABETULLAH","GÖRDÜ GÖZÜM","GÖRDÜÐÜM SENÝ SANAYIM","GÖZ AÇIP YUMMUÞ GÝBÝ","GÖZÜM SENÝ GÖRMEK ÝÇÝN","HAKÝKATÝN KAFÝRÝ",
			"HER DEM YENÝ DÝRLÝKTEDÝR","HER KAÇAN ANARSAM SENÝ","HEY BENÝM ÖMRÜM KUÞU","HÝÇ GÖNLÜNE GELE MÝ","HURÝ ÝLE GILMANI","KABRE VARDIÐIM GECE",
			"KAÇAN SUNA AZRAÝL EL","KAN YAÞ AKITIR AKTAN KARADAN","KANÝ ARMAÐANIN","KAPIDA KALDI ÞERÝAT","KARA TOPRAÐIN ALTINDA","KORKTUÐUMLA YAR OLDUM",
			"KÖRDÜR MÜNKÝRÝN GÖZÜ","MEDET","MUHAMMED","NE GÜLMEN GÜLMEKTÝR","NE OLDU","NE SÖYLERLER, NE BÝR HABER VERÝRLER","NE VERÝR ÝSEN ELÝN ÝLE",
			"NÝDEYÝM GÖNLÜMÜ","OL SAHÝB-Ý KUR'AN BENEM","SAKINGIL","SEN DERVÝÞ OLAMAZSIN","SEN VÝRAN OLMAYINCA","SENÝ HAKTAN YIÐANI","SENÝN KOKUN DUYDU CANIM",
			"SENSÝN BÝZE BÝZDEN YAKIN","SON UCU","SORARLAR BÝR EYYAM GELÝR","SUÇUMU ÖRTER HIRKAM","SÖYLER ÝSEM SENSÝN SÖZÜM","VAY ANA KÝM","YALVAR",
			"YETMÝÞ ÝKÝ MÝLLETTE","ÝLMÝNDE GARK OLALI","ÝNCÝL ÝLE KUR'ANI","YUSUF BULUNUR KEN'AN BULUNMAZ","YÜZ BÝN PEYGAMBER","ÝZÝNÝN TOZUNA SÜRSEM YÜZÜMÜ",
			"ÝÞÝDÝRDÝM SÖZÜNÜ","ÞEKERÝ AYRUÐA SUNUP","ÞOL BENÝM ÞEYHÝMÝ","ÞOL CENNET'ÝN IRMAKLARI","ÞOL GÖZ KÝ SENÝ GÖRDÜ","ÞOL KAHR ÝLE KAZANDIÐIN",
			"ÞÖYLE GARÝP BENCÝLEYEN","ÞÖYLE SANIRLAR BENÝ"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,stringarray));
	}
	
	
	@Override
	protected void onListItemClick(android.widget.ListView l, View v,
			int position, long id) {
		// TODO Auto-generated method stub
		
			int resID = getResources().getIdentifier("siir" + String.valueOf(position), "string", getPackageName());
			String strTest = getResources().getString(resID);
		
			
			Bundle bundle = new Bundle();
			bundle.putString("siir", strTest);
			Intent intent = new Intent(getApplicationContext(),siirler.class);
			intent.putExtras(bundle);
			startActivity(intent);
	

		super.onListItemClick(l, v, position, id);
	}


	
	
	
	
	

}



