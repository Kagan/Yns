package com.example.deneme1;



import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.YunusEmre.R;

public class siir extends Activity {
	int a;
	TextView alan1, baslik;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.siiroku);
		alan1 = (TextView) findViewById(R.id.siiralan);
		baslik = (TextView) findViewById(R.id.siiradi);
		Bundle veriler = getIntent().getExtras();
		String siir = veriler.getString("emin");
		a = Integer.valueOf(siir);
		switch (a) {

		case 0:
			alan1.setText("Acep bu benim can�m, azat ola m� ya Rab"+
"Yoksa yedi Tamu'da yana kala m� ya Rab"+

"Acep bu benim halim, yer alt�nda ahvalim"+
"Var�p yatacak yerim, akrep dola m� ya Rab"+

"Can hulkuma geldikte, Azrail'i g�rd�kte"+
"Ya can�m� ald�kta, asan ola m� ya Rab"+

"Dar oldu bana d�zler, gice ile g�nd�zler"+
"D�nyaya bakan g�zler, didar g�re mi ya Rab"+
"Allah olucak Kad�, bizden ola m� raz�"+
"G�r�p Habib'in bizi, �ef'i ola m� ya Rab"+

"Yunus kabre vard�kta, M�nker Nekir geldikte"+
"Bize sual ettikte, dilim d�ne mi ya Rab");
			baslik.setText("ACEP BU BEN�M HAL�M");
			break;
			
		case 1:
			alan1.setText("Bir korku d��t� can�ma, acep n'ola benim halim Derman olmaz ise bana, acep n'ola benim halim Can�m tenimden �z�le, gitmek yarar� d�z�le Bu suret nak�� bozula, acep n'ola benim halim D�nya donlar�n soyucak, yuyucu tenim yuyucak �letip kabre koyucak, acep n'ola benim halim Eller gidip ben kal�cak, sinde yaln�z olucak M�nkerle Nekir gelicek, acep n'ola benim halim Ne ayak tuta, ne elim, ne akl�m kala, ne bilim Cevap vermez ise dilim, acep n'ola benim halim Mezardan duru gelicek, hak terazi kurulacak Amelimiz g�r�lecek, acep n'ola benim halim Miskin Yunus eyd�r s�z�, kan ya� ile dolu g�z� Dergah�na tutar y�z�, acep n'ola benim halim");
			baslik.setText("ACEP N'OLA BEN�M HAL�M");
			break;
			
		case 2:
			alan1.setText("A�k�n odu ci�erimi, yaka geldi, yaka gider Garip ba��m bu sevday�, �eke geldi �eke gider Kar etti firak can�ma, a��k oldum ol Sultana A�k zencirin dost boynuna, taka geldi, taka gider ad�klar durur s�z�ne, gayr� g�r�nmez g�z�ne Bu g�zlerim Dost y�z�ne, baka geldi, baka gider Arada olmas�n na��, onulmaz ba�r�m�n ba�� G�zlerimin kanl� ya��, aka geldi, aka gider B�lb�l eder ah � figan, hasretle yand� bu can Benim g�n�lc���m ey can, ��ka geldi, ��ka gider Yunus s�yler bu s�zleri, efgan eder b�lb�lleri Dost ba��esinde g�lleri, koka geldi, koka gider");
			baslik.setText("ALLAH");
			break;
		
		case 3:
			alan1.setText("Sensin kerim, sensin rahim, Allah sana sundum elimSenden art�k yoktur emin, Allah sana sundum elim Ecel geldi vade erdi, bu �mr�m kadehi doldKimdir ki i�meden kald�, Allah sana sundum elimG�zlerim g��e s�z�ld�, can�m g���sten �z�ld� Dilim teti�i bozuldu, Allah sana sundum elim �� bi�ildi kefen donum, Hazret'e y�nelttim y�n�m Acep nice ola halim, Allah sana sundum elim Urdular suyum �l�d�, kavim karde� c�mle geldi Esen kals�n kavim karde�, Allah sana sundum elim Geldi salacam sar�l�r, d�rt yana sala verilir El namaz�ma derilir, Allah sana sundum elim Salacam� getirdiler, makberime yetirdiler Halka olup oturdular, Allah sana sundum elim ��n cenazeden �e�tiler, �st�me toprak sa�t�lar Hep koyubeni ka�t�lar, Allah sana sundum elim Yedi Tamu, sekiz U�mak, her birinin vard�r yolu Her bir yolda y�zbin �ar��, Allah sana sundum elim Geldi M�nker ile Nekir, her birisi sordu bir dil �lahi Sen cevap vergil, Allah sana sundum elim G�r�n acep oldu zaman, g�n�lden eyleniz figan �l�r ��n anadan do�an, Allah sana sundum elim Yunus tap uzat bu s�z�, Allah�na dutg�l y�z� Didardan ay�rma bizi, Allah sana sundum elim");		
			baslik.setText("ALLAH SANA SUNDUM EL�M");
			break;
		case 4:
			alan1.setText("C�mle alem terkin uram, ben Dost terkin ur�mazam Andan ayr� bu�uk saat, ben ans�z�n durumazam Andan ayr� dirli�im, dirlik de�ildir benim Koyam ol dirg�re beni, bu �l� dirg�rimezem Huri gelip eyd�r ise, g�nl�n bana vergil deyu Dost'tan art�k kimseye, ben g�nl�m� verimezem Dost deyu ge�ti �mr�m, ba�armad�m Dost kullu�un Koyam ol ba�ara beni, ben hi� i� ba�ar�mazam Bir gezden ol oldum, dahi benden �mit yoktur bana Ben ol isem pes ol kani, bu s�rra erimezem De�meler eyd�r Yunus'a, katlan bu g�n yar�n deyu Ceht ed�ben bu g�n�m�, yar�na irg�rimezem ");
			baslik.setText("ANDAN AYRI BU�UK SAAT");
			break;
		}
	}
}
			


