package com.example.deneme1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;


public class ListView1 extends ListActivity{
	String stringarray[]={"ACEP BU BEN�M HAL�M","ACEP N'OLA BEN�M HAL�M","ALLAH","ALLAH SANA SUNDUM EL�M","ANDAN AYRI BU�UK SAAT","ANLAMADAN EYLED�K",
			"AYRUK GER� GELMEYES�N","A�K BEZ�RGANI","A�K GEL�CEK C�MLE EKS�KLER B�TER","A�KIN �LE MEST OLALI","A�KINA D��EN K���","A�KINA MUHAMMED'�N",
			"A�IK CANI �LMEYE","A�IK K���","A�IMA ZEHR-� KAT�L KATMI�IM BEN","BANA BU TEN GEREKMEZ","BANA SEN� GEREK SEN�","BA�TAN AYA�A YAREY�M",
			"BE DED�RME��L BANA","BEN GELMED�M DAVA ���N","BENC�LEY�N G�LMED�K BA�","BEN� �R�AT EDEN","BESLERD�M BU NAZ�K TEN�","B�LD�KLER�M UNUTMU�UM",
			"B�R BEN VARDIR BENDE","B�R DEM GEL�R","B�R G�N","B�R KEZ G�N�L YIKTIN �SE","B�R SAK�DEN ��T�M �ARAP","B�R �LE B�R OL","B�R �ARAPTAN ��MEK GEREK",
			"BU BIRAKTI�IN IRAK NED�R","BU BIRAKTI�IN IRAK NED�R","BU NE ACAY�P U�RU","BUNCA VARLIK VAR �KEN","BIRAK �K�L���","CANA KIYAN GELS�N",
			"CANLAR CANINI BULDUM","CANLAR FEDA","CANI YA�MAYA VERD�K","CENNETTEN �LER�","�IKTIM ER�K DALINA","�IRA�IMA KASTEDEN�N","DA�LAR �LE TA�LAR �LE",
			"DE��L�M KAL � KIYLEDE","DERTL�LER BULUCA�AZ","DOLAP","DOST EL�NDEN �L�RSEM","D�NYAYA �OK GEL�P G�TT�M","EBED� PAD��AH","ECEL ERE �LEM B�R G�N",
			"E�ER YARLI�AMAZSAN","ELHAMD�-L�LLAH","EL�F'TEN BE'Y� B�LMEYEN","ETE��N AT ED�N�P","EVL�YALAR ALAN D�NYASIN","GAYR� Y�ZE N�CE BAKAR","GE�ER BU EYYAMLAR",
			"GEL G�R BEN� A�K NEYLED�","GELEN GE�ER, KONAN G��ER","GELMEZ �SE","GER TA� �SEN ER�YES�N","GER�EK ER�N HAL�N�","G�ND�ZLER OLMU� GECE",
			"G�ZEL KABETULLAH","G�RD� G�Z�M","G�RD���M SEN� SANAYIM","G�Z A�IP YUMMU� G�B�","G�Z�M SEN� G�RMEK ���N","HAK�KAT�N KAF�R�",
			"HER DEM YEN� D�RL�KTED�R","HER KA�AN ANARSAM SEN�","HEY BEN�M �MR�M KU�U","H�� G�NL�NE GELE M�","HUR� �LE GILMANI","KABRE VARDI�IM GECE",
			"KA�AN SUNA AZRA�L EL","KAN YA� AKITIR AKTAN KARADAN","KAN� ARMA�ANIN","KAPIDA KALDI �ER�AT","KARA TOPRA�IN ALTINDA","KORKTU�UMLA YAR OLDUM",
			"K�RD�R M�NK�R�N G�Z�","MEDET","MUHAMMED","NE G�LMEN G�LMEKT�R","NE OLDU","NE S�YLERLER, NE B�R HABER VER�RLER","NE VER�R �SEN EL�N �LE",
			"N�DEY�M G�NL�M�","OL SAH�B-� KUR'AN BENEM","SAKINGIL","SEN DERV�� OLAMAZSIN","SEN V�RAN OLMAYINCA","SEN� HAKTAN YI�ANI","SEN�N KOKUN DUYDU CANIM",
			"SENS�N B�ZE B�ZDEN YAKIN","SON UCU","SORARLAR B�R EYYAM GEL�R","SU�UMU �RTER HIRKAM","S�YLER �SEM SENS�N S�Z�M","VAY ANA K�M","YALVAR",
			"YETM�� �K� M�LLETTE","�LM�NDE GARK OLALI","�NC�L �LE KUR'ANI","YUSUF BULUNUR KEN'AN BULUNMAZ","Y�Z B�N PEYGAMBER","�Z�N�N TOZUNA S�RSEM Y�Z�M�",
			"���D�RD�M S�Z�N�","�EKER� AYRU�A SUNUP","�OL BEN�M �EYH�M�","�OL CENNET'�N IRMAKLARI","�OL G�Z K� SEN� G�RD�","�OL KAHR �LE KAZANDI�IN",
			"��YLE GAR�P BENC�LEYEN","��YLE SANIRLAR BEN�"};

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



