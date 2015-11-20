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
			alan1.setText("Acep bu benim caným, azat ola mý ya Rab"+
"Yoksa yedi Tamu'da yana kala mý ya Rab"+

"Acep bu benim halim, yer altýnda ahvalim"+
"Varýp yatacak yerim, akrep dola mý ya Rab"+

"Can hulkuma geldikte, Azrail'i gördükte"+
"Ya canýmý aldýkta, asan ola mý ya Rab"+

"Dar oldu bana düzler, gice ile gündüzler"+
"Dünyaya bakan gözler, didar göre mi ya Rab"+
"Allah olucak Kadý, bizden ola mý razý"+
"Görüp Habib'in bizi, þef'i ola mý ya Rab"+

"Yunus kabre vardýkta, Münker Nekir geldikte"+
"Bize sual ettikte, dilim döne mi ya Rab");
			baslik.setText("ACEP BU BENÝM HALÝM");
			break;
			
		case 1:
			alan1.setText("Bir korku düþtü canýma, acep n'ola benim halim Derman olmaz ise bana, acep n'ola benim halim Caným tenimden üzüle, gitmek yararý düzüle Bu suret nakþý bozula, acep n'ola benim halim Dünya donlarýn soyucak, yuyucu tenim yuyucak Ýletip kabre koyucak, acep n'ola benim halim Eller gidip ben kalýcak, sinde yalnýz olucak Münkerle Nekir gelicek, acep n'ola benim halim Ne ayak tuta, ne elim, ne aklým kala, ne bilim Cevap vermez ise dilim, acep n'ola benim halim Mezardan duru gelicek, hak terazi kurulacak Amelimiz görülecek, acep n'ola benim halim Miskin Yunus eydür sözü, kan yaþ ile dolu gözü Dergahýna tutar yüzü, acep n'ola benim halim");
			baslik.setText("ACEP N'OLA BENÝM HALÝM");
			break;
			
		case 2:
			alan1.setText("Aþkýn odu ciðerimi, yaka geldi, yaka gider Garip baþým bu sevdayý, çeke geldi çeke gider Kar etti firak canýma, aþýk oldum ol Sultana Aþk zencirin dost boynuna, taka geldi, taka gider adýklar durur sözüne, gayrý görünmez gözüne Bu gözlerim Dost yüzüne, baka geldi, baka gider Arada olmasýn naþý, onulmaz baðrýmýn baþý Gözlerimin kanlý yaþý, aka geldi, aka gider Bülbül eder ah ü figan, hasretle yandý bu can Benim gönülcüðüm ey can, çýka geldi, çýka gider Yunus söyler bu sözleri, efgan eder bülbülleri Dost baðçesinde gülleri, koka geldi, koka gider");
			baslik.setText("ALLAH");
			break;
		
		case 3:
			alan1.setText("Sensin kerim, sensin rahim, Allah sana sundum elimSenden artýk yoktur emin, Allah sana sundum elim Ecel geldi vade erdi, bu ömrüm kadehi doldKimdir ki içmeden kaldý, Allah sana sundum elimGözlerim göðe süzüldü, caným göðüsten üzüldü Dilim tetiði bozuldu, Allah sana sundum elim Üþ biçildi kefen donum, Hazret'e yönelttim yönüm Acep nice ola halim, Allah sana sundum elim Urdular suyum ýlýdý, kavim kardeþ cümle geldi Esen kalsýn kavim kardeþ, Allah sana sundum elim Geldi salacam sarýlýr, dört yana sala verilir El namazýma derilir, Allah sana sundum elim Salacamý getirdiler, makberime yetirdiler Halka olup oturdular, Allah sana sundum elim Çün cenazeden þeþtiler, üstüme toprak saçtýlar Hep koyubeni kaçtýlar, Allah sana sundum elim Yedi Tamu, sekiz Uçmak, her birinin vardýr yolu Her bir yolda yüzbin çarþý, Allah sana sundum elim Geldi Münker ile Nekir, her birisi sordu bir dil Ýlahi Sen cevap vergil, Allah sana sundum elim Görün acep oldu zaman, gönülden eyleniz figan Ölür çün anadan doðan, Allah sana sundum elim Yunus tap uzat bu sözü, Allahýna dutgýl yüzü Didardan ayýrma bizi, Allah sana sundum elim");		
			baslik.setText("ALLAH SANA SUNDUM ELÝM");
			break;
		case 4:
			alan1.setText("Cümle alem terkin uram, ben Dost terkin urýmazam Andan ayrý buçuk saat, ben ansýzýn durumazam Andan ayrý dirliðim, dirlik deðildir benim Koyam ol dirgüre beni, bu ölü dirgürimezem Huri gelip eydür ise, gönlün bana vergil deyu Dost'tan artýk kimseye, ben gönlümü verimezem Dost deyu geçti ömrüm, baþarmadým Dost kulluðun Koyam ol baþara beni, ben hiç iþ baþarýmazam Bir gezden ol oldum, dahi benden ümit yoktur bana Ben ol isem pes ol kani, bu sýrra erimezem Deðmeler eydür Yunus'a, katlan bu gün yarýn deyu Ceht edüben bu günümü, yarýna irgürimezem ");
			baslik.setText("ANDAN AYRI BUÇUK SAAT");
			break;
		}
	}
}
			


