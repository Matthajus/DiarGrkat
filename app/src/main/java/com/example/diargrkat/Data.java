package com.example.diargrkat;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<Day> loadData(){
        List<Day> listWtihDays = new ArrayList<>();
        Day day1 = new Day();
        day1.setDen("1");
        day1.setMesiac("Jún");
        day1.setMeniny("Žaneta");
        day1.setNazovDna("Pondelok");
        day1.setNedela_sviatok(true);
        day1.setPoznamka("Odporúčaný sviatok");
        day1.setSvaty("Pondelok Svätého Duch. \n" +
                "Poprazdenstvo Päťdesiatnice (do 5.júna vrátane)");
        day1.setCitania("Ap. 229. začalo (Ef 5, 8b-19); Mt 75. začalo (18, 10-20) (Sv.Duchu) \n    " +
                "Lit. rúcho svetlé - svetlozelené \n" +
                "Antifóny: predobrazujúce žalmy a blaženstvá. \n" +
                "Menlivé časti z Pondelka Sv.Ducha(251). Svätý Bože. \n\n" +
                "Sprievod okolo chrámu (Mt.začalo; LK56.začalo; \nJn53.začalo)");
        listWtihDays.add(day1);

        Day day2 = new Day();
        day2.setDen("2");
        day2.setMesiac("Jún");
        day2.setMeniny("Xénia, Oxana");
        day2.setNazovDna("Utorok");
        day2.setNedela_sviatok(false);
        day2.setPoznamka("");
        day2.setSvaty("Náš otec svätý Nikefor Vyznávač, Konštantinopolský patriarcha. \n" +
                "(Svätý apoštol Hermas; svätý mučeník Hermeias - presun z predchádzajúcej nedele.)");
        day2.setCitania("Ap. 79. začalo (Rim 1,1-7.13-17); Mt 10. začalo (4,25-5,13)\n" +
                "   Lit. rúcho svetlé - svetlozelené. \n" +
                "Antifóny: predobrazujúce žalmy a blaženstvá. Vchod: \n" +
                "...Spas nás, Utešiteľ dobrý... Ostatné menlivé časti sú \n" +
                "z nedele Päťdesiatnice (249). Svätý Bože.");
        listWtihDays.add(day2);

        Day day3 = new Day();
        day3.setDen("3");
        day3.setMesiac("Jún");
        day3.setMeniny("Karolína");
        day3.setNazovDna("Streda");
        day3.setNedela_sviatok(false);
        day3.setPoznamka("");
        day3.setSvaty("Svätý mučeník Lucilián a spoločníci. \n" +
                "(Svätý mučeník Justín Filozof a spoločníci - presun z predchádzajúceho pondelka.)");
        day3.setCitania("Ap. 80. začalo (Rim 1,18-27); Mt 12. začalo (5,20-26)\n" +
                "   Lit. rúcho svetlé - svetlozelené. \n" +
                "Antifóny: predobrazujúce žalmy a blaženstvá. Vchod: \n" +
                "...Spas nás, Utešiteľ dobrý... Ostatné menlivé časti sú \n" +
                "z nedele Päťdesiatnice (249). Svätý Bože.");
        listWtihDays.add(day3);

        Day day4 = new Day();
        day4.setDen("4");
        day4.setMesiac("Jún");
        day4.setMeniny("Lenka");
        day4.setNazovDna("Štvrtok");
        day4.setNedela_sviatok(false);
        day4.setPoznamka("");
        day4.setSvaty("Náš otec sätý Métrofanés, konštantínopolský patriarcha.");
        day4.setCitania("Ap. 81. začalo (Rim 1,28-2,9); Mt 13. začalo (5,27-32)\n" +
                "   Lit. rúcho svetlé - svetlozelené. \n" +
                "Antifóny: predobrazujúce žalmy a blaženstvá. Vchod: \n" +
                "...Spas nás, Utešiteľ dobrý... Ostatné menlivé časti sú \n" +
                "z nedele Päťdesiatnice (249). Svätý Bože.");
        listWtihDays.add(day4);

        Day day5 = new Day();
        day5.setDen("5");
        day5.setMesiac("Jún");
        day5.setMeniny("Laura");
        day5.setNazovDna("Piatok");
        day5.setNedela_sviatok(false);
        day5.setPoznamka("Voľnica");
        day5.setSvaty("Svätý hieromučeník Dorotej, týrsky biskup. (Svätý hieromučeník Teodor Ankyrský \n" +
                "- presun z nasledújucej nedele.) [Svätý mučeník Kozma, arménsky presbyter.]");
        day5.setCitania("Ap. 82. začalo (Rim 2,14-29); Mt 14. začalo (5,33-41)\n" +
                "   Lit. rúcho svetlé - svetlozelené. \n" +
                "Antifóny: predobrazujúce žalmy a blaženstvá. Vchod: \n" +
                "...Spas nás, Utešiteľ dobrý... Ostatné menlivé časti sú \n" +
                "z nedele Päťdesiatnice (249). Svätý Bože.");
        listWtihDays.add(day5);

        Day day6 = new Day();
        day6.setDen("6");
        day6.setMesiac("Jún");
        day6.setMeniny("Norbert");
        day6.setNazovDna("Sobota");
        day6.setNedela_sviatok(false);
        day6.setPoznamka("");
        day6.setSvaty("Ukončuje sa sviatok Päťdesiatnice. (Náš prepodobný otec Bessarión Divotvorca. \n" +
                "Prepodobný Hilarión Nový, igumen Dalmanovho kláštora a vyznávač.)");
        day6.setCitania("Ap. 79b. začalo (Rim 1,7b-12); Mt 15. začalo (5,42-48)\n" +
                "   Lit. rúcho svetlé - svetlozelené. \n" +
                "Antifóny: predobrazujúce žalmy a blaženstvá. Vchod: \n" +
                "...Spas nás, Utešiteľ dobrý... Ostatné menlivé časti sú \n" +
                "z nedele Päťdesiatnice (249). Svätý Bože.");
        listWtihDays.add(day6);

        Day day7 = new Day();
        day7.setDen("7");
        day7.setMesiac("Jún");
        day7.setMeniny("Róbert");
        day7.setNazovDna("Nedeľa");
        day7.setNedela_sviatok(true);
        day7.setPoznamka("8.hl., 1.ev.");
        day7.setSvaty("Nedeľa 1.týždňa po Päťdesiatnici - Všetkých svätých.");
        day7.setCitania("Vveč. Iz43,9-14a; Múd3,1-9; Múd5,15(16)-6,3(4)a \n" +
                "Ap. 330. začalo (Hebr 11,33-12,2a); Mt 38. začalo (10,32-33. 37-38; 19,27-30)\n" +
                "   Lit. rúcho svetlé - bielé, zlaté, strieborné. \n" +
                "Antifóny: predobrazujúce žalmy a blaženstvá. \n" +
                "Tropár z 8.hlasu a z nedele Všetkých svätých (253). \n" +
                "Sláva i teraz: kondak z nedele Všetkých svätých. \n" +
                "Prokimen a pričasten z hlasu i všetkých svätých, aleluja svätým. \n" +
                "Myrovanie.");
        listWtihDays.add(day7);

        Day day8 = new Day();
        day8.setDen("8");
        day8.setMesiac("Jún");
        day8.setMeniny("Medard");
        day8.setNazovDna("Pondelok");
        day8.setNedela_sviatok(false);
        day8.setPoznamka("");
        day8.setSvaty("Prenesenie pozostatkov svätého veľkomučeníka Teodora Tiróna. \n" +
                "Začiatok petro-povlovského pôstu");
        day8.setCitania("Ap. 83. začalo (Rim 2,28-3,18); Mt 19. začalo (6,31-34; 7,9-11)\n" +
                "   Lit. rúcho tmavé - bordové. \n" +
                "Antifóny každodenné. \n" +
                "Menlivé časti z pondelka (154).\n" +
                "Všimni si poznámku číslo 4 v informáciach tohoto diára.");
        listWtihDays.add(day8);

        Day day9 = new Day();
        day9.setDen("9");
        day9.setMesiac("Jún");
        day9.setMeniny("Stanislava");
        day9.setNazovDna("Utorok");
        day9.setNedela_sviatok(false);
        day9.setPoznamka("");
        day9.setSvaty("Náš otec svätý Cyril, alexandrijský arcibiskup.");
        day9.setCitania("Ap. 86. začalo (Rim 4,4-12); Mt 22. začalo (7,15-21)\n" +
                "   Lit. rúcho svetlé - bielé, zlaté, strieborné. \n" +
                "Antifóny každodenné. \n" +
                "Menlivé časti z utorka (155).");
        listWtihDays.add(day9);

        Day day10 = new Day();
        day10.setDen("10");
        day10.setMesiac("Jún");
        day10.setMeniny("Margaréta");
        day10.setNazovDna("Streda");
        day10.setNedela_sviatok(false);
        day10.setPoznamka("");
        day10.setSvaty("Svätý hieromučeník Timotej, pruský biskup.");
        day10.setCitania("Ap. 87. začalo (Rim 4,13-25); Mt 23. začalo (7,21-23)(radové)\n" +
                "Ap. 89. začalo (Rim 5,10-16); Mt 27. začalo (8,23-27)(radové z nasled. dňa)\n" +
                "   Lit. rúcho tmavé - bordové. \n" +
                "Antifóny každodenné. \n" +
                "Menlivé časti zo stredy (156).");
        listWtihDays.add(day10);

        Day day11 = new Day();
        day11.setDen("11");
        day11.setMesiac("Jún");
        day11.setMeniny("Dobroslava");
        day11.setNazovDna("Štvrtok");
        day11.setNedela_sviatok(true);
        day11.setPoznamka("Odporúčaný sviatok");
        day11.setSvaty("Slávnostná poklona prečistým tajomstvám tela a krvi \n" +
                "nášho Pána Ježiša Krista. \n" +
                "+ Svätí apoštoli Bartolomej a Barnabáš.");
        day11.setCitania("Ap. 149. začalo (1Kor 11,23-32); Jn 23. začalo (6,48-54)(sviatku)\n" +
                "Ap. 28. začalo (Sk 11,19-30); Lk 51a. začalo (10,16-21)(apoštolom)\n" +
                "   Lit.rúcho svetlé - bielé, zlaté, strieborné. Antifóny a vchod sú zo sviatku(254) Tropár \n" +
                "o Eucharistii(256) a apoštolom(385). Sláva: kondak apoštolom, I teraz: o Eucharistii. Proki-\n" +
                "men aleluja a pričasten o Eucharistii a apoštolom. Namiesto Dôstojné - Zvelebuj a irmos zo \n" +
                "sviatku Eucharistie. Druhé zvelebovanie sa dostalo do knihy omylom, spieva sa vždy len prvé.");
        listWtihDays.add(day11);

        Day day12 = new Day();
        day12.setDen("12");
        day12.setMesiac("Jún");
        day12.setMeniny("Zlatko");
        day12.setNazovDna("Piatok");
        day12.setNedela_sviatok(false);
        day12.setPoznamka("Zdržanlivosť od mäsa");
        day12.setSvaty("Poprazdenstvo Slávnostnej poklony (do 17.júna vrátane) \n" +
                "Náš prepodobný otec Onufrios Veľký; náš prepodobný otec Peter Atoský. \n" +
                "+ Svätí apoštoli Bartolomej a Barnabáš.");
        day12.setCitania("Ap. 90. začalo (Rim 5,17-6,2); Mt 31. začalo (9,14-17)\n" +
                "   Lit.rúcho svetlé - bielé, zlaté, strieborné.\n" +
                "Antifóny: predobrazujúce žalmy a blaženstvá. Vchod: \n" +
                "...ty dávaš za pokrm svoje telo... Tropár, kondak, pro- \n" +
                "kimen, aleluja a pričasten zo sviatku(256).");
        listWtihDays.add(day12);

        Day day13 = new Day();
        day13.setDen("13");
        day13.setMesiac("Jún");
        day13.setMeniny("Anton");
        day13.setNazovDna("Sobota");
        day13.setNedela_sviatok(false);
        day13.setPoznamka("");
        day13.setSvaty("Svätá mučeníca Akvilína: \n" +
                "Svätý Trifylios, biskup cyperskej Leukosie.");
        day13.setCitania("Ap. 84. začalo (Rim 3,19-26); Mt 20. začalo (7,1-8)\n" +
                "   Lit.rúcho svetlé - bielé, zlaté, strieborné.\n" +
                "Antifóny: predobrazujúce žalmy a blaženstvá. Vchod: \n" +
                "...ty dávaš za pokrm svoje telo... Tropár, kondak, pro- \n" +
                "kimen, aleluja a pričasten zo sviatku(256).");
        listWtihDays.add(day13);

        Day day14 = new Day();
        day14.setDen("14");
        day14.setMesiac("Jún");
        day14.setMeniny("Vasiľ");
        day14.setNazovDna("Nedeľa");
        day14.setNedela_sviatok(true);
        day14.setPoznamka("1.hl., 2.ev.");
        day14.setSvaty("Nedeľa 2.týždňa po Päťdesiatnici. \n" +
                "Svätý prorok Elizeus. Náš otec svätý Metod, konštantínoposlkýpatriarcha.");
        day14.setCitania("Ap. 81b. začalo (Rim 2,10-16); Mt 9. začalo (4,18-23)\n" +
                "   Lit.rúcho svetlé - bielé, zlaté, strieborné.\n" +
                "Antifóny: predobrazujúce žalmy a blaženstvá. Vchod: \n" +
                "...ktorý si slávne z mŕtvych... Tropár z 1.hlasu \n" +
                "a o Eucharistii(256). Sláva: kondak z hlasu, I teraz: \n" +
                "o Eucharistii. Prokimen, aleluja a pričasten z hlasu \n" +
                "a o Eucharistii. Namiesto Dôstojne - Zvelebuj a irmos.");
        listWtihDays.add(day14);

        Day day15 = new Day();
        day15.setDen("15");
        day15.setMesiac("Jún");
        day15.setMeniny("Vít");
        day15.setNazovDna("Pondelok");
        day15.setNedela_sviatok(false);
        day15.setPoznamka("");
        day15.setSvaty("Svätý prorok Amos. Prepodobný Hieronym, stridonský presbyter.");
        day15.setCitania("Ap. 94. začalo (Rim 7,1-13); Mt 34. začalo (9,36-10,8)\n" +
                "   Lit.rúcho svetlé - bielé, zlaté, strieborné.\n" +
                "Antifóny: predobrazujúce žalmy a blaženstvá. Vchod: \n" +
                "...ty dávaš za pokrm svoje telo... Tropár, kondak, pro- \n" +
                "kimen, aleluja a pričasten zo sviatku(256).");
        listWtihDays.add(day15);

        Day day16 = new Day();
        day16.setDen("16");
        day16.setMesiac("Jún");
        day16.setMeniny("Blanka, Bianka");
        day16.setNazovDna("Utorok");
        day16.setNedela_sviatok(false);
        day16.setPoznamka("");
        day16.setSvaty("Náš otec svätý Tychón Divotvorca, amatuntský biskup.");
        day16.setCitania("Ap. 95. začalo (Rim 7,14-8,2); Mt 35. začalo (10,9-15)\n" +
                "   Lit.rúcho svetlé - bielé, zlaté, strieborné.\n" +
                "Antifóny: predobrazujúce žalmy a blaženstvá. Vchod: \n" +
                "...ty dávaš za pokrm svoje telo... Tropár, kondak, pro- \n" +
                "kimen, aleluja a pričasten zo sviatku(256).");
        listWtihDays.add(day16);

        Day day17 = new Day();
        day17.setDen("17");
        day17.setMesiac("Jún");
        day17.setMeniny("Adolf");
        day17.setNazovDna("Streda");
        day17.setNedela_sviatok(false);
        day17.setPoznamka("");
        day17.setSvaty("Svätí mučeníci Manuel, Sabel a Izmael.\n" +
                "[Náš prepodobný otec Hypatios, igumen Rufínovho kláštora.]");
        day17.setCitania("Ap. 96. začalo (Rim 8,2-13); Mt 36. začalo (10,16-22)\n" +
                "   Lit.rúcho svetlé - bielé, zlaté, strieborné.\n" +
                "Antifóny: predobrazujúce žalmy a blaženstvá. Vchod: \n" +
                "...ty dávaš za pokrm svoje telo... Tropár, kondak, pro- \n" +
                "kimen, aleluja a pričasten zo sviatku(256).");
        listWtihDays.add(day17);

        Day day18 = new Day();
        day18.setDen("18");
        day18.setMesiac("Jún");
        day18.setMeniny("Vratislav");
        day18.setNazovDna("Štvrtok");
        day18.setNedela_sviatok(false);
        day18.setPoznamka("");
        day18.setSvaty("Ukončuje sa sviatok Slávnostnej poklony.\n" +
                "(Svätý mučeník Loentios.)");
        day18.setCitania("Ap. 98. začalo (Rim 8,22-27); Mt 37. začalo (10,23-31)(radové)\n" +
                "Ap. 101. začalo (Rim 9,6-19); Mt 38. začalo (10,32-36; 11,1)(radové z nasledujúceho dňa)\n" +
                "   Lit.rúcho svetlé - bielé, zlaté, strieborné.\n" +
                "Antifóny: predobrazujúce žalmy a blaženstvá. Vchod: \n" +
                "...ty dávaš za pokrm svoje telo... Tropár, kondak, pro- \n" +
                "kimen, aleluja a pričasten zo sviatku(256).");
        listWtihDays.add(day18);

        Day day19 = new Day();
        day19.setDen("19");
        day19.setMesiac("Jún");
        day19.setMeniny("Alfréd");
        day19.setNazovDna("Piatok");
        day19.setNedela_sviatok(true);
        day19.setPoznamka("Voľnica. Odporúčaný viatok");
        day19.setSvaty("Najsladšieho Pána, Boha a Spasiteľa nášho Ježiša Krista\n" +
                "Milujúceho ľudí.\n" +
                "+ Svätý apoštol Júda, podľa tela Pánov brat.");
        day19.setCitania("Ap. 306. začalo (Hebr 2,11-18); Jn 9. začalo (3,13-17)(sviatku)\n" +
                "Ap. 77. začalo (Júd 1,1-10); Jn 48.. začalo (14,24-24)(apoštolovi)\n" +
                "   Lit.rúcho svetlé - bielé, zlaté, strieborné.\n" +
                "Antifóny a vchod sú zo sviatku(257).Tropár zo sviatku \n" +
                "(258)a ap.Júdovi (387). Sláva: kondak ap.Júdovi. I teraz: \n" +
                "zo sviatku. Prokimen, aleluja a pričasten zo sviatku a ap.\n" +
                "Júdovi. Namiesto Dôstojne - Zvelebuj a irmos zo sviatku.");
        listWtihDays.add(day19);

        Day day20 = new Day();
        day20.setDen("20");
        day20.setMesiac("Jún");
        day20.setMeniny("Valéria");
        day20.setNazovDna("Sobota");
        day20.setNedela_sviatok(false);
        day20.setPoznamka("");
        day20.setSvaty("Presvetej Bohorodičky Spolutrpiteľky (alebo len 15.septembra) \n" +
                "Svätý hieromučeník Metod, patarský biskup.");
        day20.setCitania("Ap. 240. začalo (Flp 2,5-11); Jn 61. začalo (19,25-27)(Bohorodičke)\n" +
                "Ap. 85. začalo (Rim 3,28-4,3); Mt 24. začalo (7,24-8,4)(radové)\n" +
                "   Lit.rúcho svetlé - svetlomodré. Antifóny: predobrazujúce žalmy a blaženstvá.\n" +
                "Menlivé časti zo sviatku Spolutrpiacej (260). \n" +
                "Druhá možnosť: Ap 85. začalo (Rim 3.28-4,3); Mt 24. začalo (7,24-8,4). Lit rúcho \n" +
                "svetlé - biele, zlaté, strieborné. Antifóny každodenné. Menlivé časti zo soboty(160).");
        listWtihDays.add(day20);

        Day day21 = new Day();
        day21.setDen("21");
        day21.setMesiac("Jún");
        day21.setMeniny("Alojz");
        day21.setNazovDna("Nedeľa");
        day21.setNedela_sviatok(true);
        day21.setPoznamka("2.hl., 3.ev.");
        day21.setSvaty("Nedeľa 3.týždňa po Päťdesiatnici. \n" +
                "Svätý mučeník Julián Tarzský.");
        day21.setCitania("Ap. 88. začalo (Rim 5,1-10); Mt 18. začalo (6,22-33)\n" +
                "   Lit.rúcho svetlé - bielé, zlaté, strieborné.\n" +
                "Antifóny: predobrazujúce žalmy a blaženstvá. \n" +
                "Menlivé časti z 2.hlasu(144). ");
        listWtihDays.add(day21);

        Day day22 = new Day();
        day22.setDen("22");
        day22.setMesiac("Jún");
        day22.setMeniny("Paulína");
        day22.setNazovDna("Pondelok");
        day22.setNedela_sviatok(false);
        day22.setPoznamka("");
        day22.setSvaty("Svätý hieromučeník Eusebios, samosatský biskup.");
        day22.setCitania("Ap. 102. začalo (Rim 9,19-33); Mt 40. začalo (11,2-15)\n" +
                "   Lit.rúcho svetlé - bielé, zlaté, strieborné.\n" +
                "Antifóny každodenné. \n" +
                "Menlivé časti z pondelka(154). ");
        listWtihDays.add(day22);

        Day day23 = new Day();
        day23.setDen("23");
        day23.setMesiac("Jún");
        day23.setMeniny("Sidónia");
        day23.setNazovDna("Utorok");
        day23.setNedela_sviatok(false);
        day23.setPoznamka("");
        day23.setSvaty("Svätá mučenica Agripína.");
        day23.setCitania("Ap. 104. začalo (Rim 10,11-11,2a); Mt 41. začalo (11,16-20)(radové)\n" +
                "Ap. 105. začalo (Rim 11,2b-12); Mt 42. začalo (11.20-26)(radové z nasledujúceho dňa)\n" +
                "   Lit.rúcho svetlé - bielé, zlaté, strieborné.\n" +
                "Antifóny každodenné. \n" +
                "Menlivé časti z utorka(155). ");
        listWtihDays.add(day23);

        Day day24 = new Day();
        day24.setDen("24");
        day24.setMesiac("Jún");
        day24.setMeniny("Ján");
        day24.setNazovDna("Streda");
        day24.setNedela_sviatok(true);
        day24.setPoznamka("Odporúčaný sviatok");
        day24.setSvaty("Narodenie úctyhodného a slávneho Pánovho proroka \n" +
                "predchodcu a krstiteľa Jána.");
        day24.setCitania("Ap. 112. začalo (Rim 13,11b-14,4); Lk 1. začalo (1,1-25.57-68.76.80)(svätému)\n" +
                "   Lit.rúcho svetlé - svetločervené.\n" +
                "Antifóny: predobrazujúce žalmy a blažnstvá. \n" +
                "Menlivé časti z Narodenia Jána(388). Myrovanie. ");
        listWtihDays.add(day24);

        Day day25 = new Day();
        day25.setDen("25");
        day25.setMesiac("Jún");
        day25.setMeniny("Olívia, Tadeáš");
        day25.setNazovDna("Štvrtok");
        day25.setNedela_sviatok(false);
        day25.setPoznamka("");
        day25.setSvaty("Svätá prepodobná mučenica Febrónia.");
        day25.setCitania("Ap. 106. začalo (Rim 11,13-24); Mt 43. začalo (11,27-30) \n" +
                "   Lit.rúcho svetlé - bielé, zlaté, strieborné.\n" +
                "Antifóny každodenné. \n" +
                "Menlivé časti zo štvrtka(157). ");
        listWtihDays.add(day25);

        Day day26 = new Day();
        day26.setDen("26");
        day26.setMesiac("Jún");
        day26.setMeniny("Adriána");
        day26.setNazovDna("Piatok");
        day26.setNedela_sviatok(false);
        day26.setPoznamka("Zdržanlivosť od mäsa");
        day26.setSvaty("Náš prepodobný otec Dávid zo Solúna.");
        day26.setCitania("Ap. 107. začalo (Rim 11,25-36); Mt 44. začalo (12,1-8)(radové) \n" +
                "Ap. 109. začalo (Rim 12,4-5.15-21); Mt 45. začalo (12,9-13)(radové z nasledujúceho pondelka) \n" +
                "   Lit.rúcho tmavé - bordové.\n" +
                "Antifóny každodenné. \n" +
                "Menlivé časti z piatka(159). ");
        listWtihDays.add(day26);

        Day day27 = new Day();
        day27.setDen("27");
        day27.setMesiac("Jún");
        day27.setMeniny("Ladislav, Ladislava");
        day27.setNazovDna("Sobota");
        day27.setNedela_sviatok(false);
        day27.setPoznamka("");
        day27.setSvaty("Náš prepodobný otec Samson Pohostinný.");
        day27.setCitania("Ap. 92. začalo (Rim 6,11-17); Mt 26. začalo (8,14-23) \n" +
                "   Lit.rúcho svetlé - bielé, zlaté, strieborné.\n" +
                "Antifóny každodenné. \n" +
                "Menlivé časti zo soboty(160). ");
        listWtihDays.add(day27);

        Day day28 = new Day();
        day28.setDen("28");
        day28.setMesiac("Jún");
        day28.setMeniny("Beáta");
        day28.setNazovDna("Nedeľa");
        day28.setNedela_sviatok(true);
        day28.setPoznamka("3.hl., 4.ev.");
        day28.setSvaty("Nedeľa 4.týždňa po Päťdesiatnici.\n" +
                "Prenesenie pozostatkov svätých nezištníkov Kýra a Jána.\n" +
                "Posledný deň petro-pavlovského pôstu.");
        day28.setCitania("Ap. 93. začalo (Rim 6,18-23); Mt 25. začalo (8,5-13) \n" +
                "   Lit.rúcho svetlé - bielé, zlaté, strieborné.\n" +
                "Antifóny: predobrazujúce žalmy a blaženstvá. \n" +
                "Menlivé časti z 3.hlasu(145). ");
        listWtihDays.add(day28);

        Day day29 = new Day();
        day29.setDen("29");
        day29.setMesiac("Jún");
        day29.setMeniny("Peter, Pavol, Petra");
        day29.setNazovDna("Pondelok");
        day29.setNedela_sviatok(true);
        day29.setPoznamka("Prikázaný sviatok");
        day29.setSvaty("Svätí, slávni a všechválni najvýšší apoštoli \n" +
                "Peter a Pavol.");
        day29.setCitania("Ap. 193. začalo (2Kor 11,21b-12,9); Mt 67. začalo (16,13-19) \n" +
                "   Lit.rúcho svetlé - bielé, zlaté, strieborné.\n" +
                "Antifóny: predobrazujúce žalmy a blaženstvá. \n" +
                "Menlivé časti ap.Petrovi a Pavlovi(390). \n" +
                "Myrovanie.");
        listWtihDays.add(day29);

        Day day30 = new Day();
        day30.setDen("30");
        day30.setMesiac("Jún");
        day30.setMeniny("Melánia");
        day30.setNazovDna("Utorok");
        day30.setNedela_sviatok(true);
        day30.setPoznamka("");
        day30.setSvaty("Zbor svätých, slávnych a všechválnych dvanástich apoštolov");
        day30.setCitania("Ap. 114. začalo (Rim 14,9-18); Mt 46. začalo (12,14-16.22-30)(radové) \n" +
                "Ap. 131. začalo (1Kor 4,9-16); Mk 12. začalo (3,13-19)(Zboru) \n" +
                "   Lit.rúcho svetlé - bielé, zlaté, strieborné.\n" +
                "Antifóny: predobrazujúce žalmy a blaženstvá. \n" +
                "Menlivé časti zo Zboru(392).");
        listWtihDays.add(day30);


        return listWtihDays;
    }
}
