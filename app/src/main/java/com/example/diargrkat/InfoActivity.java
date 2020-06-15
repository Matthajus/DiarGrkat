package com.example.diargrkat;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class InfoActivity extends AppCompatActivity {

    private ListView listView;
    private List<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        listView = findViewById(R.id.listView);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.info_line, arrayList);
        listView.setAdapter(adapter);

        arrayList.add("1.       Pôstnu disciplínu uvádzame presne podľa dekrétu Posvätnej kongregácie pre východné cirkvi číslo 379/65 z 21. februára 1969, ktorá je pre nás záväzná, a podľa výkladu tejto disciplíny, ako ho prijala Rada hierarchov našej cirkvi v októbri 2009.");
        arrayList.add("2.       Farby bohoslužobných rúch uvádzame presne podľa dekrétu vladyku Milana Chautura z obežníka číslo 1/2006, ktorý je pre Košickú eparchiu záväzný.");
        arrayList.add("3.       Ak uvádzame rúcha, ktoré daný chrám nevlastní, alebo ich pri spoločnom slávení viacerými kňazmi nevlastní v dostatočnom počte, treba ich nahradiť rúchami rovnakého odtieňu, to znamená buď inými svetlými alebo inými tmavými. Napríklad rúcha svetločervené treba nahradiť inými svetlými rúchami, trebárs zlatými, nie rúchami tmavými, teda bordovými.");
        arrayList.add("4.       Tmavé rúcha (plachty) na prestole, žertveníku a analojoch treba mať počas všetkých štyroch pôstnych období, teda nielen počas Veľkého pôstu, ale aj počas petrovky, uspenského pôstu a filipovky.");
        arrayList.add("5.       Vo všedné dni od pondelka do piatku, na ktoré Diár gréckokatolíka 2020 uvádza menlivé časti iba z bežného dňa týždňa, napríklad z pondelka alebo utorka, je správne, a teda dovolené, brať menlivé časti aj zo spoločnej služby svätcovi alebo svätcom dňa.");
        arrayList.add("6.       Myrovanie môže byť nielen vo veľké sviatky, ako to uvádzame na príslušných miestach Diára gréckokatolíka 2020, ale podľa uváženia kňaza v každý sviatok, ku ktorému sa slávi na večierni lítia. Sú to všetky polyelejné sviatky s bdením a viaceré polyelejné sviatky bez bdenia.");
        arrayList.add("7.       Liturgie vopred posvätených darov sa za určitých okolností môžu sláviť aj k polyelejným sviatkom a v samotné dni polyelejných sviatkov, ako aj vo štvrtok piateho týždňa Veľkého pôstu.");
        arrayList.add("8.       Ak sa pri zostave tropárov a kondakov uvádza „podľa predpisu“, tak to spravidla znamená, že v chrámoch zasvätených Kristovi alebo Bohorodičke sa spieva kondak chrámového sviatku, zatiaľ čo v chrámoch zasvätených svätcovi sa spieva kondak 6. hlasu Nezahanbiteľná zástankyňa kresťanov (150).");
        arrayList.add("9.       Streda je zasvätená nielen presvätej Bohorodičke, ale aj ctihodnému Krížu. Ak sa teda uvádzajú menlivé časti zo stredy, má sa spievať tropár a kondak Krížu (akoby z piatku), ale prokimen, verše na Aleluja a pričasten Bohorodičke (napísané pri strede).");
        arrayList.add("10.      Ak sa uvádzajú menlivé časti zo štvrtka, majú sa spievať obidva tropáre a obidva kondaky, ale prokimen, verše na Aleluja a pričasten iba svätým apoštolom, čiže tie, ktoré sa nachádzajú na prvom mieste.");
        arrayList.add("11.      Podľa usmernení bohoslužobných kníh sa začalá od Lukáša majú vždy začínať v pondelok po Nedeli po Povýšení svätého Kríža. V tomto období sa takisto mení systém katiziem a na nedeľnej utierni sa spieva polyjelej. Z uvedených hľadísk sa totiž začína nový, zimný polrok. Aby nedochádzalo k nejasnostiam, pri nedeliach uvádzame najprv ich skutočné poradové číslo po Päťdesiatnici a v zátvorke ich poradové číslo z hľadiska čítaní.");
        arrayList.add("12.      Podľa želania vladyku Milana treba v prvé piatky mesiaca brať menlivé časti, avšak okrem antifón, zo sviatku Milujúceho ľudí (258).");

    }

}