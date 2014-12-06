package databasegenerator;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;

/**
 *
 * @author Johny
 */
public class DatabaseGenerator {

    private static final String NAMES[] = { "Alexandra","Daniela","Drahoslav","Andrea","Antónia","Bohuslava","Severín","Alexej","Dáša","Malvína","Ernest","Rastislav","Radovan","Dobroslav","Kristína","Nataša","Bohdana","Drahomíra","Vincent","Zora","Miloš","Timotej","Gejza","Tamara","Bohuš","Alfonz","Gašpar","Ema","Emil","Tatiana","Erika","Blažej","Veronika","Agáta","Dorota","Vanda","Zoja","Zdenko","Gabriela","Dezider","Perla","Arpád","Valentín","Pravoslav","Ida, Liana","Miloslava","Jaromír","Vlasta","Lívia","Eleonóra","Etela","Roman","Matej","Frederik","Viktor","Alexander","Zlatica","Albín","Anežka","Bohumil","Kazimír","Fridrich","Radoslav","Tomáš","Alan","Františka","Bruno","Angela","Gregor","Vlastimil","Matilda","Svetlana","Boleslav","Ľubica","Eduard","Jozef","Víťazoslav","Blahoslav","Beňadik","Adrián","Gabriel","Marián","Emanuel","Alena","Soňa","Miroslav","Vieroslava","Benjamín","Hugo","Zita","Richard","Izidor","Miroslava","Irena","Zoltán","Albert","Milena","Igor","Július","Estera","Aleš","Justina","Fedor","Dana","Valér","Jela","Marcel","Ervín","Slavomír","Vojtech","Juraj","Marek","Jaroslava","Jaroslav","Jarmila","Lea","Anastázia","Žigmund","Galina","Florián","Lesia","Hermína","Monika","Ingrida","Roland","Viktória","Blažena","Pankrác","Servác","Bonifác","Žofia","Svetozár","Gizela","Viola","Gertrúda","Bernard","Zina","Júlia","Želmíra","Ela","Urban","Dušan","Iveta","Viliam","Vilma","Ferdinand","Petrana","Žaneta","Xénia","Karolína","Lenka","Laura","Norbert","Róbert","Medard","Stanislava","Margaréta","Dobroslava","Zlatko","Anton","Vasil","Vít","Blanka","Adolf","Vratislav","Alfréd","Valéria","Alojz","Paulína","Sidónia","Ján","Olívia","Adriána","Ladislav","Beáta","Peter","Melánia","Diana","Berta","Miloslav","Prokop","Cyril","Patrik","Oliver","Ivan","Lujza","Amália","Milota","Nina","Margita","Kamil","Henrich","Drahomír","Bohuslav","Kamila","Dušana","Iľja","Daniel","Magdaléna","Oľga","Vladimír","Jakub","Anna","Božena","Krištof","Marta","Libuša","Ignác","Božidara","Gustáv","Jerguš","Dominika","Hortenzia","Jozefína","Štefánia","Oskar","Ľubomíra","Vavrinec","Zuzana","Darina","Ľubomír","Mojmír","Marcela","Leonard","Milica","Elena","Lýdia","Anabela","Jana","Tichomír","Filip","Bartolomej","Ľudovít","Samuel","Silvia","Augustín","Nikola","Ružena","Nora","Drahoslava","Linda","Belo","Rozália","Regina","Alica","Marianna","Miriama","Martina","Oleg","Bystrík","Mária","Ctibor","Ľudomil","Jolana","Ľudmila","Olympia","Eugénia","Konštantín","Ľuboslav","Matúš","Móric","Zdenka","Ľuboš","Vladislav","Edita","Cyprián","Václav","Michal","Jarolím","Arnold","Levoslav","Stela","František","Viera","Natália","Eliška","Brigita","Dionýz","Slavomíra","Valentína","Maximilián","Koloman","Boris","Terézia","Vladimíra","Hedviga","Lukáš","Kristián","Vendelín","Uršuľa","Sergej","Alojzia","Kvetoslava","Aurel","Demeter","Sabína","Dobromila","Klára","Šimon, Simona","Aurélia","Denis","Hubert","Karol","Imrich","Renáta","René","Bohumír","Teodor","Tibor","Martin","Svätopluk","Stanislav","Irma","Leopold","Agnesa","Klaudia","Eugen","Alžbeta","Félix","Elvíra","Cecília","Klement","Emília","Katarína","Kornel","Milan","Henrieta","Vratko","Ondrej","Edmund","Bibiána","Oldrich","Barbora","Oto","Mikuláš","Ambróz","Marína","Izabela","Radúz","Hilda","Otília","Lucia","Branislava","Ivica","Albína","Kornélia","Sláva","Judita","Dagmara","Bohdan","Adela","Nadežda","Adam, Eva","Štefan","Filoména","Ivana, Ivona","Milada","Dávid","Silvester" };
    private static final String SURNAMES[] = { "Baber","Babula","Bach","Bachta","Badovsky","Badovszky","Badura","Bajzik","Bakic","Bakicova","Balczár","Balladics","Balladies","Ballard","BalláS","BaláZik","BaláZs","Banczik","Bankratz","Baranovics","Barbados","Barciska","Bardoll","Bärhofer","Barics","Baricza","Baris","Barisch","Barkol","Barkó","Barner","Barton","Bartos","Bartosch","Bartosova","Basik","Bauberter","Bauer","Baumann","Baumart","Baumgartner","Bausackl","Baxdrucker","Bechdian","Beck","Becker","Bednaric","Bednarics","BednáR","Beer","Behm","Behringer","Behrnt","Behunek","Beisel","Bekolory","Beladic","Beladics","Beladicz","Beladovic","Belevics","Belicza","Bellaticz","BelláK","Bellán","Bengh","Benjam","Benk","Benko","Benkovics","BenöHr","Bentsiova","Berg","Berger","Bergo","Beringer","Bernhard","Bernhardt","Berringer","Bestanovics","Beutler","Beyer","Beysel","Biber","Bichelberger","Biegler","Bilcik","Biller","Binart","Binder","Bintziger","Birnbaum","Biro","Bisztro","Bivin","Bjelko","Blaho","Blake","Blaser","Blum","Bock","Bodita","Boehm","Bogner","Bogsch","Böhm","Bojkovszky","Bök","Bolak","Bolener","Bolgács","Bolten","Boock","Bordacz","Bordács","Bork","Börner","Bösor","Boszvig","Boszák","Brachtl","Brandtner","Bratt","Braunschmid","Brechtel","Brechtl","Breem","Brennig","Breyer","Brichtova","Brkovics","Brna","Brtko","Bruckner","Brunner","Brychta","Bryndzov","Buchemer","Buchleitner","Büchler","Buchleutner","Buchmann","Buchner","Buchöcker","Buchowiek","BüChschaftner","Budovsky","Bukovinyi","Bukwa","Buncak","Burda","Burdt","Burg","Burns","Burreyter","Bürschel","Busch","Bán","Bána","Bánl","Dacej","Dan","Dana","Danek","Danko","Dankó","Dano","Daněk","Daňa","Daňko","Daňo","Debnár","Dej","Dekýš","Devečka","Dibarbora","Dobšinský","Doležal","Dostal","Dostál","Dočolomanský","Drajna","Droppa","Dubovský","Dudek","Dudik","Dudok","Dudík","Dula","Dulla","Durdík","Dusík","Dvonč","Dzurjanin","Dán","Dávid","Dáňa","Hablák","Habšuda","Hagara","Haluška","Halák","Hanko","Hanzal","Hanzel","Hargaš","Haščák","Heretik","Hečko","Hlaváček","Hlinka","Hliník","Hochschorner","Holub","Holuby","Horváth","Hossa","Hoza","Hořava","Hraško","Hrdlička","Hrianka","Hric","Hrmo","Hroboň","Hrušovský","Hryc","Huba","Hudáček","Huszár","Husár","Hála","Fabian","Fabián","Fabuš","Faith","Fajnor","Farkas","Farkaš","Farkašovský","Fedor","Feldek","Fico","Figuli","Filc","Filip","Filipek","Filipko","Filípek","Janek","Janka","Janko","Jankó","Jano","Janoušek","Janočko","Janoš","Janošek","Janoška","Janoško","Janošo","Jantošovič","Janík","Janča","Janček","Jančo","Jedľovský","Jendek","Jeník","Jerkovič","Jirka","Jonata","Jurina","Jurka","Jurko","Jurkovič","Juroška","Juráš","Jurík","Jurča","Jurčina","Jurčo","Ján","Jánek","Jáni","Jáno","János","Jánoska","Jánoš","Jánoška","Jánoško","Jánošík","Kaliský","Karul","Karvaš","Kello","Kelo","Keníž","Klapka","Klapko","Klaus","Kližan","Klokoč","Kolesár","Kollár","Kolnik","Kolník","Kolár","Kolář","Konstantinidis","Korec","Korčák","Kostka","Kostrec","Koszta","Kosztka","Labant","Labuda","Laca","Lacka","Lacko","Laco","Lajčiak","Lajčák","Lamač","Langoš","Lepšík","Lesný","Lettrich","Lexa","Lintner","Lipták","Lisický","Litva","Liška","Machata","Madej","Magál","Majeský","Malachovský","Malina","Malíšek","Mamojka","Marcinko","Marián","Marta","Masaryk","Masarík","Masařík","Maslo","Masný","Masár","Masárik","Matiaško","Medved","Medveď","Melcer","Melczer","Melichar","Melicher","Melicherík","Melicherčík","Melichár","Melichárek","Meltzer","Melzer","Menhart","Menyhért","Mečiar","Mečíř","Meňhart","Meňhárt","Meňhért","Michalech","Michalek","Michalica","Michalka","Michalko","Michalík","Michálech","Michálek","Michálik","Mihalik","Mihál","Mihálik","Mikloš","Mikloško","Miklík","Miklós","Mikulík","Pap","Papp","Pauk","Pauko","Pauliny","Paulíny","Pavka","Pavko","Pavlikovský","Pavuk","Pavúk","Paúk","Pašek","Paška","Paško","Pelikan","Pelikán","Petrovický","Petruška","Pešek","Peška","Peško","Pichlík","Pika","Plaucha","Plavec","Plavucha","Plch","Plekanec","Plešivec","Podhradský","Podkonický","Polgár","Poliak","Pollák","Polák","Prochazka","Procháska","Procházka","Prohaska","Proháska","Prohászka","Pupák","Puskás","Puška","Puškár","Puškáš","Píka","Rak","Raši","Repiský","Richard","Richter","Richtár","Riha","Riszdorfer","Riša","Riška","Riško","Rišo","Romančík","Rosa","Rosina","Rozenberg","Rubik","Sabo","Sadiki","Saliji","Samel","Sameľ","Samson","Samuel","Sanitra","Scherer","Sedliak","Sekera","Senko","Seč","Sidor","Sklenařík","Sklenica","Sklenička","Sklenka","Sklenár","Sklenárik","Sklenář","Sklár","Sklář","Skokan","Skutecký","Slašťan","Sloboda","Slobodník","Slota","Slovák","Smrek","Sokol","Solan","Stantien","Stefan","Stefanovič","Stevanovič","Stodola","Straka","Strnisko","Stümpel","Svrbík","Szabo","Szabó","Szekeres","Szelepcsényi","Szomolányi","Tatar","Tatarka","Tatár","Tatárka","Thoma","Thomka","Timek","Timka","Timko","Tiso","Tomas","Tomaschek","Tomašek","Tomaška","Tomaško","Tomek","Tomeček","Tomečka","Tomečko","Tomka","Tomko","Tomáš","Tomášek","Tomášik","Tomáška","Tomáško","Truben","Tuma","Turčok","Tóth","Tůma","Zachar","Zachara","Zachariaš","Zachariáš","Zajac","Zajíc","Zatopek","Zima","Zimka","Zipser","Zoubek","Zubek","Zubka","Zubko","Zubrík","Záborský","Zátopek"};
    private static final String TOWNS[] = { "Ábelová", "Abovce", "Abrahám", "Abrahámovce", "Abrahámovce", "Abramová", "Abranovce", "Adamovské Kochanovce", "Adidovce", "Alekšince", "Andovce", "Andrejová", "Ardanovce", "Ardovo", "Arnutovce", "Báb", "Babie", "Babín", "Babiná", "Babindol", "Babinec", "Bacúch", "Bacúrov", "Báč", "Bačka", "Bačkov", "Bačkovík", "Baďan", "Badín", "Báhoň", "Bajany", "Bajč", "Bajerov", "Bajerovce", "Bajka", "Bajtava", "Baka", "Baláže", "Baldovce", "Balog nad Ipľom", "Baloň", "Baňa", "Banka", "Bánov", "Bánovce nad Bebravou", "Bánovce nad Ondavou", "Banská Belá", "Banská Bystrica", "Banská Štiavnica", "Banské", "Banský Studenec", "Bara", "Barca", "Bardejov", "Bardoňovo", "Bartošova Lehôtka", "Bartošovce", "Baška", "Baškovce", "Baškovce", "Bašovce", "Batizovce", "Bátka", "Bátorová", "Bátorove Kosihy", "Bátovce", "Beckov", "Beharovce", "Becherov", "Belá", "Belá", "Belá - Dulice", "Belá nad Cirochou", "Beladice", "Belejovce", "Belín", "Belina", "Belince", "Bellova Ves", "Beloveža", "Beluj", "Beluša", "Belža", "Beňadiková", "Beňadikovce", "Beňadovo", "Beňatina", "Beniakovce", "Benice", "Benkovce", "Beňuš", "Bernolákovo", "Bertotovce", "Beša", "Beša", "Bešeňov", "Bešeňová", "Betlanovce", "Betliar", "Bežovce", "Bidovce", "Biel", "Bielovce", "Biely Kostol", "Bijacovce", "Bílkove Humence", "Bíňa", "Bíňovce", "Biskupice", "Biskupová", "Bitarová", "Blahová", "Blatná na Ostrove", "Blatná Polianka", "Blatné", "Blatné Remety", "Blatné Revištia", "Blatnica", "Blažice", "Blažovce", "Blesovce", "Blhovce", "Bobot", "Bobrov", "Bobrovček", "Bobrovec", "Bobrovník", "Bočiar", "Bodíky", "Bodiná", "Bodorová", "Bodovce", "Bodružal", "Bodza", "Bodzianske Lúky", "Bogliarka", "Bohdanovce", "Bohdanovce nad Trnavou", "Boheľov", "Bohunice", "Bohunice", "Bohúňovo", "Bojná", "Bojnice", "Bojničky", "Boľ", "Boldog", "Boleráz", "Bolešov", "Boliarov", "Boľkovce", "Borcová", "Borčany", "Borčice", "Borinka", "Borová", "Borovce", "Borský Mikuláš", "Borský Svätý Jur", "Borša", "Bory", "Bošáca", "Bošany", "Boťany", "Bottovo", "Bôrka", "Bracovce", "Branč", "Branovo", "Bratislava - Čunovo", "Bratislava - Devín", "Bratislava - Devínska Nová Ves", "Bratislava - Dúbravka", "Bratislava - Jarovce", "Bratislava - Karlova Ves", "Bratislava - Lamač", "Bratislava - Nové Mesto", "Bratislava - Petržalka", "Bratislava - Podunajské Biskupice", "Bratislava - Rača", "Bratislava - Rusovce", "Bratislava - Ružinov", "Bratislava - Staré Mesto", "Bratislava - Vajnory", "Bratislava - Vrakuňa", "Bratislava - Záhorská Bystrica", "Braväcovo", "Brdárka", "Brehov", "Brehy", "Brekov", "Brestov", "Brestov", "Brestov nad Laborcom", "Brestovany", "Brestovec", "Brestovec", "Bretejovce", "Bretka", "Breza", "Brezany", "Brezina", "Breziny", "Breznica", "Breznička", "Breznička", "Brezno", "Brezolupy", "Brezov", "Brezová pod Bradlom", "Brezovec", "Brezovica", "Brezovica", "Brezovička", "Brezovka", "Brežany", "Brhlovce", "Brieštie", "Brodské", "Brodzany", "Brunovce", "Brusnica", "Brusník", "Brusno", "Brutovce", "Bruty", "Brvnište", "Brzotín", "Buclovany", "Búč", "Bučany", "Budča", "Budikovany", "Budimír", "Budiná", "Budince", "Budiš", "Budkovce", "Budmerice", "Buglovce", "Buková", "Bukovce", "Bukovec", "Bukovec", "Bukovina", "Bulhary", "Bunetice", "Bunkovce", "Bušince", "Bušovce", "Buzica", "Buzitka", "Bystrá", "Bystrá", "Bystrany", "Bystré", "Bystričany", "Bystrička", "Byšta", "Bytča", "Bzenica", "Bzenov", "Bzince pod Javorinou", "Bziny", "Bzovík", "Bzovská Lehôtka", "Bžany", "Cabaj - Čápor", "Cabov", "Cakov", "Cejkov", "Cernina", "Cerová", "Cerovo", "Cestice", "Cífer", "Cigeľ", "Cigeľka", "Cigla", "Cimenná", "Cinobaňa", "Čab", "Čabalovce", "Čabiny", "Čabradský Vrbovok", "Čadca", "Čachtice", "Čajkov", "Čaka", "Čakajovce", "Čakanovce", "Čakanovce", "Čakany", "Čaklov", "Čalovec", "Čamovce", "Čaňa", "Čaradice", "Čáry", "Častá", "Častkov", "Častkovce", "Čata", "Čataj", "Čavoj", "Čebovce", "Čečehov", "Čečejovce", "Čechy", "Čechynce", "Čekovce", "Čeľadice", "Čeľadince", "Čeláre", "Čelkova Lehota", "Čelovce", "Čelovce", "Čeľovce", "Čenkovce", "Čereňany", "Čerenčany", "Čerhov", "Čerín", "Čermany", "Černík", "Černina", "Černochov", "Čertižné", "Červená Voda", "Červeňany", "Červenica", "Červenica pri Sabinove", "Červeník", "Červený Hrádok", "Červený Kameň", "Červený Kláštor", "České Brezovo", "Čičarovce", "Čičava", "Čičmany", "Číčov", "Čierna", "Čierna Lehota", "Čierna Lehota", "Čierna nad Tisou", "Čierna Voda", "Čierne", "Čierne Kľačany", "Čierne nad Topľou", "Čierne Pole", "Čierny Balog", "Čierny Brod", "Čierny Potok", "Čifáre", "Čiližská Radvaň", "Čimhová", "Čirč", "Číž", "Čižatice", "Čoltovo", "Čremošné", "Čučma", "Čukalovce", "Ďačov", "Dačov Lom", "Daletice", "Danišovce", "Ďanová", "Ďapalovce", "Dargov", "Davidov", "Debraď", "Dedačov", "Dedina Mládeže", "Dedinka", "Dedinky", "Dechtice", "Dekýš", "Demandice", "Demänovská Dolina", "Demjata", "Detrík", "Detva", "Detvianska Huta", "Devičany", "Devičie", "Dežerice", "Diaková", "Diakovce", "Diviacka Nová Ves", "Diviaky nad Nitricou", "Divín", "Divina", "Divinka", "Dlhá", "Dlhá nad Kysucou", "Dlhá nad Oravou", "Dlhá nad Váhom", "Dlhá Ves", "Dlhé Klčovo", "Dlhé nad Cirochou", "Dlhé Pole", "Dlhé Stráže", "Dlhoňa", "Dlžín", "Dobrá", "Dobrá Niva", "Dobrá Voda", "Dobroč", "Dobrohošť", "Dobroslava", "Dobšiná", "Dohňany", "Dojč", "Doľany", "Doľany", "Dolinka", "Dolná Breznica", "Dolná Krupá", "Dolná Lehota", "Dolná Mariková", "Dolná Mičiná", "Dolná Poruba", "Dolná Seč", "Dolná Streda", "Dolná Strehová", "Dolná Súča", "Dolná Tižina", "Dolná Trnávka", "Dolná Ves", "Dolná Ždaňa", "Dolné Dubové", "Dolné Kočkovce", "Dolné Lovčice", "Dolné Mladonice", "Dolné Naštice", "Dolné Obdokovce", "Dolné Orešany", "Dolné Otrokovce", "Dolné Plachtince", "Dolné Saliby", "Dolné Semerovce", "Dolné Srnie", "Dolné Strháre", "Dolné Trhovište", "Dolné Vestenice", "Dolné Zahorany", "Dolné Zelenice", "Dolný Badín", "Dolný Bar", "Dolný Harmanec", "Dolný Hričov", "Dolný Chotár", "Dolný Kalník", "Dolný Kubín", "Dolný Lieskov", "Dolný Lopašov", "Dolný Ohaj", "Dolný Pial", "Dolný Štál", "Dolný Vadičov", "Domadice", "Domaníky", "Domaniža", "Domaňovce", "Donovaly", "Drábsko", "Drahňov", "Drahovce", "Dravce", "Dražice", "Dražkovce", "Drážovce", "Drienčany", "Drienica", "Drienov", "Drienovec", "Drienovo", "Drienovská Nová Ves", "Drietoma", "Drňa", "Drnava", "Družstevná pri Hornáde", "Drženice", "Držkovce", "Ďubákovo", "Dubinné", "Dubnica nad Váhom", "Dubnička", "Dubník", "Dubno", "Dubodiel", "Dubová", "Dubová", "Dubovany", "Dubovce", "Dubové", "Dubové", "Dubovec", "Dubovica", "Dúbrava", "Dúbrava", "Dúbrava", "Dúbravica", "Dúbravka", "Dúbravy", "Ducové", "Dudince", "Dukovce", "Dulov", "Dulova Ves", "Dulovce", "Dulovo", "Dunajov", "Dunajská Lužná", "Dunajská Streda", "Dunajský Klátov", "Duplín", "Ďurčiná", "Ďurďoš", "Ďurďošík", "Ďurďové", "Ďurkov", "Ďurková", "Ďurkovce", "Dvorany nad Nitrou", "Dvorec", "Dvorianky", "Dvorníky", "Dvorníky - Včeláre", "Dvory nad Žitavou", "Egreš", "Fačkov", "Falkušovce", "Farná", "Fekišovce", "Figa", "Fijaš", "Fiľakovo", "Fiľakovské Kováče", "Fintice", "Folkušová", "Forbasy", "Frička", "Fričkovce", "Fričovce", "Fulianka", "Gabčíkovo", "Gaboltov", "Gajary", "Galanta", "Galovany", "Gáň", "Gánovce", "Gbeľany", "Gbelce", "Gbely", "Geča", "Gelnica", "Gemer", "Gemerček", "Gemerská Hôrka", "Gemerská Panica", "Gemerská Poloma", "Gemerská Ves", "Gemerské Dechtáre", "Gemerské Michalovce", "Gemerské Teplice", "Gemerský Jablonec", "Gemerský Sad", "Geraltov", "Gerlachov", "Gerlachov", "Giglovce", "Giraltovce", "Girovce", "Glabušovce", "Gočaltovo", "Gočovo", "Golianovo", "Gortva", "Gôtovany", "Granč - Petrovce", "Gregorova Vieska", "Gregorovce", "Gribov", "Gruzovce", "Gyňov", "Habovka", "Habura", "Hačava", "Háj", "Háj", "Hajná Nová Ves", "Hajnáčka", "Hájske", "Hajtovka", "Haláčovce", "Halič", "Haligovce", "Haluzice", "Hamuliakovo", "Handlová", "Hanigovce", "Haniska", "Haniska", "Hanková", "Hankovce", "Hankovce", "Hanušovce nad Topľou", "Harakovce", "Harhaj", "Harichovce", "Harmanec", "Hatalov", "Hatné", "Havaj", "Havka", "Havranec", "Hažín", "Hažín nad Cirochou", "Hažlín", "Helcmanovce", "Heľpa", "Henckovce", "Henclová", "Hencovce", "Hendrichovce", "Herľany", "Hermanovce", "Hermanovce nad Topľou", "Hertník", "Hervartov", "Hiadeľ", "Hincovce", "Hladovka", "Hlboké", "Hlboké nad Váhom", "Hliník nad Hronom", "Hlinné", "Hlivištia", "Hlohovec", "Hniezdne", "Hnilčík", "Hnilec", "Hnojné", "Hnúšťa", "Hodejov", "Hodejovec", "Hodkovce", "Hodruša - Hámre", "Hokovce", "Holčíkovce", "Holiare", "Holice", "Holíč", "Holiša", "Holumnica", "Honce", "Hontianska Vrbica", "Hontianske Moravce", "Hontianske Nemce", "Hontianske Tesáre", "Hontianske Trsťany", "Horňa", "Horná Breznica", "Horná Kráľová", "Horná Krupá", "Horná Lehota", "Horná Lehota", "Horná Mariková", "Horná Mičiná", "Horná Poruba", "Horná Potôň", "Horná Seč", "Horná Streda", "Horná Strehová", "Horná Súča", "Horná Štubňa", "Horná Ves", "Horná Ves", "Horná Ždaňa", "Horňany", "Horné Dubové", "Horné Hámre", "Horné Chlebany", "Horné Mladonice", "Horné Mýto", "Horné Naštice", "Horné Obdokovce", "Horné Orešany", "Horné Otrokovce", "Horné Plachtince", "Horné Pršany", "Horné Saliby", "Horné Semerovce", "Horné Srnie", "Horné Strháre", "Horné Štitáre", "Horné Trhovište", "Horné Turovce", "Horné Vestenice", "Horné Zahorany", "Horné Zelenice", "Horný Badín", "Horný Bar", "Horný Hričov", "Horný Kalník", "Horný Lieskov", "Horný Pial", "Horný Tisovník", "Horný Vadičov", "Horovce", "Horovce", "Hoste", "Hostice", "Hostie", "Hostišovce", "Hosťová", "Hosťovce", "Hosťovce", "Hostovice", "Hozelec", "Hôrka", "Hôrka nad Váhom", "Hôrky", "Hrabičov", "Hrabkov", "Hrabová Roztoka", "Hrabovčík", "Hrabovec", "Hrabovec nad Laborcom", "Hrabovka", "Hrabské", "Hrabušice", "Hradisko", "Hradište", "Hradište", "Hradište pod Vrátnom", "Hrádok", "Hrachovište", "Hrachovo", "Hraň", "Hraničné", "Hranovnica", "Hrašné", "Hrašovík", "Hrčeľ", "Hrhov", "Hriadky", "Hričovské Podhradie", "Hriňová", "Hrišovce", "Hrkovce", "Hrlica", "Hrnčiarovce nad Parnou", "Hrnčiarska Ves", "Hrnčiarske Zalužany", "Hrochoť", "Hromoš", "Hronec", "Hronovce", "Hronsek", "Hronská Breznica", "Hronská Dúbrava", "Hronské Kľačany", "Hronské Kosihy", "Hronský Beňadik", "Hrubá Borša", "Hruboňovo", "Hrubov", "Hrubý Šúr", "Hrušov", "Hrušov", "Hrušovany", "Hrušovo", "Hruštín", "Hubice", "Hubina", "Hubošovce", "Hubová", "Hubovo", "Hucín", "Hudcovce", "Hul", "Humenné", "Huncovce", "Hunkovce", "Hurbanova Ves", "Hurbanovo", "Husák", "Husiná", "Hutka", "Huty", "Hviezdoslavov", "Hvozdnica", "Hybe", "Hýľov", "Chanava", "Chľaba", "Chlebnice", "Chlmec", "Chmeľnica", "Chmeľov", "Chmeľová", "Chmeľovec", "Chmiňany", "Chminianska Nová Ves", "Chminianske Jakubovany", "Choča", "Chocholná - Velčice", "Choňkovce", "Chorvátsky Grob", "Chorváty", "Chotča", "Chotín", "Chrabrany", "Chrámec", "Chrasť nad Hornádom", "Chrastince", "Chrastné", "Chrenovec - Brusno", "Chropov", "Chrťany", "Chtelnica", "Chudá Lehota", "Chvalová", "Chvojnica", "Chvojnica", "Chynorany", "Chyžné", "Igram", "Ihľany", "Ihráč", "Ilava", "Iliašovce", "Ilija", "Imeľ", "Iňa", "Iňačovce", "Inovce", "Ipeľské Predmostie", "Ipeľské Úľany", "Ipeľský Sokolec", "Istebné", "Ivachnová", "Ivančiná", "Ivanice", "Ivanka pri Dunaji", "Ivanka pri Nitre", "Ivanovce", "Iža", "Ižipovce", "Ižkovce", "Jabloň", "Jablonec", "Jablonica", "Jablonka", "Jablonov", "Jablonov nad Turňou", "Jabloňovce", "Jablonové", "Jablonové", "Jacovce", "Jahodná", "Jaklovce", "Jakovany", "Jakubany", "Jakubov", "Jakubova Voľa", "Jakubovany", "Jakubovany", "Jakušovce", "Jalová", "Jalovec", "Jalovec", "Jalšové", "Jalšovík", "Jamník", "Jamník", "Janice", "Janík", "Janíky", "Jankovce", "Janov", "Janova Lehota", "Janovce", "Jánovce", "Jánovce", "Janovík", "Jarabá", "Jarabina", "Jarok", "Jarovnice", "Jasenica", "Jasenie", "Jasenov", "Jasenov", "Jasenová", "Jasenovce", "Jasenové", "Jasenovo", "Jaslovské Bohunice", "Jasov", "Jásová", "Jastrabá", "Jastrabie nad Topľou", "Jastrabie pri Michalovciach", "Jatov", "Jazernica", "Jedlinka", "Jedľové Kostoľany", "Jelenec", "Jelka", "Jelšava", "Jelšovce", "Jelšovec", "Jenkovce", "Jesenské", "Jesenské", "Jestice", "Ješkova Ves", "Jezersko", "Jovice", "Jovsa", "Jur nad Hronom", "Jurkova Voľa", "Jurová", "Jurské", "Juskova Voľa", "Kačanov", "Kajal", "Kaľamenová", "Kalameny", "Kaľava", "Kalinkovo", "Kalinov", "Kalinovo", "Kalná nad Hronom", "Kalná Roztoka", "Kalnica", "Kalnište", "Kalonda", "Kaloša", "Kalša", "Kaluža", "Kamanová", "Kameňany", "Kamenec pod Vtáčnikom", "Kamenica", "Kamenica nad Cirochou", "Kamenica nad Hronom", "Kameničany", "Kameničná", "Kamenín", "Kamenná Poruba", "Kamenná Poruba", "Kamenné Kosihy", "Kamenný Most", "Kamienka", "Kamienka", "Kanianka", "Kapince", "Kapišová", "Kaplna", "Kapušany", "Kapušianske Kľačany", "Karlová", "Karná", "Kašov", "Kátlovce", "Kátov", "Kazimír", "Kecerovce", "Kecerovský Lipovec", "Kečkovce", "Kečovo", "Kechnec", "Kendice", "Kesovce", "Keť", "Kežmarok", "Kiarov", "Kľačany", "Kľače", "Kľačno", "Kladzany", "Kľak", "Klasov", "Kláštor pod Znievom", "Klátova Nová Ves", "Klčov", "Kleňany", "Klenov", "Klenová", "Klenovec", "Klieština", "Klin", "Klin nad Bodrogom", "Klížska Nemá", "Klokoč", "Klokočov", "Klokočov", "Klubina", "Kľúčovec", "Kluknava", "Kľušov", "Kmeťovo", "Kobeliarovo", "Kobylnice", "Kobyly", "Koceľovce", "Kociha", "Kocurany", "Kočín - Lančár", "Kočovce", "Kochanovce", "Kochanovce", "Kojatice", "Kojšov", "Kokava nad Rimavicou", "Kokošovce", "Kokšov - Bakša", "Kolačkov", "Kolačno", "Koláre", "Kolárovice", "Kolárovo", "Kolbasov", "Kolbovce", "Kolibabovce", "Kolíňany", "Kolinovce", "Kolonica", "Kolta", "Komárany", "Komárno", "Komárov", "Komárovce", "Komjatice", "Komjatná", "Komoča", "Koniarovce", "Konrádovce", "Konská", "Konská", "Koňuš", "Kopčany", "Kopernica", "Koplotovce", "Koprivnica", "Kordíky", "Korejovce", "Korňa", "Koromľa", "Korunková", "Korytárky", "Korytné", "Kosihovce", "Kosihy nad Ipľom", "Kosorín", "Kostoľany pod Tribečom", "Kostolec", "Kostolište", "Kostolná - Záriečie", "Kostolná pri Dunaji", "Kostolná Ves", "Kostolné", "Kostolné Kračany", "Koš", "Košariská", "Košarovce", "Košeca", "Košecké Podhradie", "Košice - Barca", "Košice - Dargovských hrdinov", "Košice - Džungľa", "Košice - Juh", "Košice - Kavečany", "Košice - Košická Nová Ves", "Košice - Krásna", "Košice - Lorinčík", "Košice - Luník IX", "Košice - Myslava", "Košice - Nad jazerom", "Košice - Pereš", "Košice - Poľov", "Košice - Sever", "Košice - Sídlisko KVP", "Košice - Sídlisko Ťahanovce", "Košice - Staré Mesto", "Košice - Šaca", "Košice - Šebastovce", "Košice - Ťahanovce", "Košice - Vyšné Opátske", "Košice - Západ", "Košická Belá", "Košická Polianka", "Košické Oľšany", "Košický Klečenov", "Koškovce", "Košolná", "Košťany nad Turcom", "Košúty", "Kotešová", "Kotmanová", "Kotrčiná Lúčka", "Kováčová", "Kováčová", "Kováčovce", "Koválov", "Koválovec", "Kovarce", "Kozárovce", "Kozelník", "Kozí Vrbovok", "Kožany", "Kožuchov", "Kožuchovce", "Kračúnovce", "Krahule", "Krajná Bystrá", "Krajná Poľana", "Krajná Porúbka", "Krajné", "Krajné Čierno", "Krakovany", "Kráľ", "Králiky", "Kráľov Brod", "Kráľova Lehota", "Kráľová nad Váhom", "Kráľová pri Senci", "Kraľovany", "Kráľovce", "Kráľovce - Krnišov", "Kráľovičove Kračany", "Kráľovský Chlmec", "Kraskovo", "Krásna Lúka", "Krásna Ves", "Krasňany", "Krásno", "Krásno nad Kysucou", "Krásnohorská Dlhá Lúka", "Krásnohorské Podhradie", "Krásnovce", "Krásny Brod", "Kravany", "Kravany", "Kravany nad Dunajom", "Krčava", "Kremná", "Kremnica", "Kremnické Bane", "Kristy", "Krišľovce", "Krišovská Liesková", "Krivá", "Kriváň", "Krivany", "Krivé", "Krivoklát", "Krivosúd - Bodovka", "Kríže", "Krížová Ves", "Krížovany", "Križovany nad Dudváhom", "Krná", "Krnča", "Krokava", "Krompachy", "Krpeľany", "Krškany", "Krtovce", "Kručov", "Krupina", "Krušetnica", "Krušinec", "Krušovce", "Kružlov", "Kružlová", "Kružná", "Kružno", "Kšinná", "Kubáňovo", "Kučín", "Kučín", "Kuchyňa", "Kuklov", "Kuková", "Kukučínov", "Kunerad", "Kunešov", "Kunova Teplica", "Kuraľany", "Kurima", "Kurimany", "Kurimka", "Kurov", "Kusín", "Kútniky", "Kúty", "Kuzmice", "Kuzmice", "Kvačany", "Kvačany", "Kvakovce", "Kvašov", "Kvetoslavov", "Kyjatice", "Kyjov", "Kynceľová", "Kysak", "Kyselica", "Kysta", "Kysucké Nové Mesto", "Kysucký Lieskovec", "Láb", "Lackov", "Lacková", "Lackovce", "Lada", "Ladce", "Ladice", "Ladmovce", "Ladomerská Vieska", "Ladomirov", "Ladomirová", "Ladzany", "Lakšárska Nová Ves", "Lascov", "Laskár", "Lastomír", "Lastovce", "Laškovce", "Látky", "Lazany", "Lazisko", "Lazy pod Makytou", "Lažany", "Lednica", "Lednické Rovne", "Lefantovce", "Legnava", "Lehnice", "Lehota", "Lehota nad Rimavicou", "Lehota pod Vtáčnikom", "Lehôtka", "Lehôtka pod Brehmi", "Lechnica", "Lekárovce", "Leľa", "Leles", "Lemešany", "Lenartov", "Lenartovce", "Lendak", "Lenka", "Lentvora", "Leopoldov", "Lesenice", "Lesíček", "Lesné", "Lesnica", "Leštiny", "Letanovce", "Letničie", "Leváre", "Levice", "Levkuška", "Levoča", "Ležiachov", "Libichava", "Licince", "Ličartovce", "Liesek", "Lieskovany", "Lieskovec", "Lieskovec", "Liešno", "Liešťany", "Lietava", "Lietavská Lúčka", "Lietavská Svinná - Babkov", "Likavka", "Limbach", "Lipany", "Lipník", "Lipníky", "Lipová", "Lipová", "Lipovany", "Lipovce", "Lipové", "Lipovec", "Lipovec", "Lipovník", "Lipovník", "Liptovská Anna", "Liptovská Kokava", "Liptovská Lúžna", "Liptovská Osada", "Liptovská Porúbka", "Liptovská Sielnica", "Liptovská Štiavnica", "Liptovská Teplá", "Liptovská Teplička", "Liptovské Beharovce", "Liptovské Kľačany", "Liptovské Matiašovce", "Liptovské Revúce", "Liptovský Hrádok", "Liptovský Ján", "Liptovský Michal", "Liptovský Mikuláš", "Liptovský Ondrej", "Liptovský Peter", "Liptovský Trnovec", "Lisková", "Lišov", "Litava", "Litmanová", "Livina", "Livinské Opatovce", "Livov", "Livovská Huta", "Lodno", "Lok", "Lokca", "Lom nad Rimavicou", "Lomná", "Lomné", "Lomnička", "Lontov", "Lopašov", "Lopúchov", "Lopušné Pažite", "Lošonec", "Lovce", "Lovča", "Lovčica - Trubín", "Lovinobaňa", "Lozorno", "Ložín", "Ľubá", "Ľubeľa", "Lubeník", "Ľubica", "Ľubietová", "Lubina", "Ľubiša", "Ľubochňa", "Ľuboreč", "Ľuboriečka", "Ľubotice", "Ľubotín", "Ľubovec", "Lúč na Ostrove", "Lučatín", "Lučenec", "Lúčina", "Lučivná", "Lúčka", "Lúčka", "Lúčka", "Lúčka", "Lúčky", "Lúčky", "Lúčky", "Lúčnica nad Žitavou", "Ludanice", "Ľudovítová", "Ludrová", "Luhyňa", "Lúka", "Lukačovce", "Lukáčovce", "Lukavica", "Lukavica", "Lukov", "Lukovištia", "Lúky", "Lula", "Lupoč", "Lutila", "Ľutina", "Lutiše", "Ľutov", "Lužany", "Lužany pri Topli", "Lužianky", "Lysá pod Makytou", "Lysica", "Macov", "Mad", "Madunice", "Magnezitovce", "Machulince", "Majcichov", "Majere", "Majerovce", "Makov", "Makovce", "Malá Čalomija", "Malá Čausa", "Malá Čierna", "Malá Domaša", "Malá Franková", "Malá Hradná", "Malá Ida", "Malá Lehota", "Malá Lodina", "Malá nad Hronom", "Malá Poľana", "Malá Tŕňa", "Malacky", "Malachov", "Málaš", "Malatiná", "Malatíny", "Malcov", "Malčice", "Malé Borové", "Malé Dvorníky", "Malé Hoste", "Malé Chyndice", "Malé Kosihy", "Malé Kozmálovce", "Malé Kršteňany", "Malé Lednice", "Malé Leváre", "Malé Ludince", "Malé Ozorovce", "Malé Raškovce", "Malé Ripňany", "Malé Straciny", "Malé Trakany", "Malé Uherce", "Malé Vozokany", "Malé Zálužie", "Malé Zlievce", "Málinec", "Malinová", "Malinovo", "Malužiná", "Malý Cetín", "Malý Čepčín", "Malý Horeš", "Malý Kamenec", "Malý Krtíš", "Malý Lapáš", "Malý Lipník", "Malý Slavkov", "Malý Slivník", "Malý Šariš", "Malženice", "Maňa", "Mankovce", "Marcelová", "Margecany", "Marhaň", "Marianka", "Markovce", "Markuška", "Markušovce", "Maršová", "Martin", "Martin nad Žitavou", "Martinček", "Martinová", "Martovce", "Mašková", "Maškovce", "Matejovce", "Matiaška", "Matiašovce", "Matovce", "Maťovské Vojkovce", "Matúškovo", "Matysová", "Medovarce", "Medvedie", "Medveďov", "Medzany", "Medzev", "Medzianky", "Medzibrod", "Medzibrodie nad Oravou", "Medzilaborce", "Melčice - Lieskové", "Melek", "Meliata", "Mengusovce", "Merašice", "Merník", "Mestečko", "Mestisko", "Mičakovce", "Mierovo", "Miezgovce", "Michajlov", "Michal na Ostrove", "Michal nad Žitavou", "Michaľany", "Michalková", "Michalok", "Michalová", "Michalovce", "Miklušovce", "Miková", "Mikulášová", "Mikušovce", "Mikušovce", "Milhosť", "Miloslavov", "Milpoš", "Miňovce", "Mirkovce", "Miroľa", "Mládzovo", "Mlynárovce", "Mlynčeky", "Mlynica", "Mlynky", "Mníchova Lehota", "Mníšek nad Hnilcom", "Mníšek nad Popradom", "Moča", "Močenok", "Močiar", "Modra", "Modra nad Cirochou", "Modrany", "Modrová", "Modrovka", "Modrý Kameň", "Mojmírovce", "Mojš", "Mojtín", "Mojzesovo", "Mokrá Lúka", "Mokrance", "Mokroluh", "Mokrý Háj", "Moldava nad Bodvou", "Moravany", "Moravany nad Váhom", "Moravské Lieskové", "Moravský Svätý Ján", "Most pri Bratislave", "Mostová", "Moškovec", "Mošovce", "Moštenica", "Mošurov", "Motešice", "Motyčky", "Môlča", "Mrázovce", "Mučín", "Mudroňovo", "Mudrovce", "Muľa", "Muráň", "Muránska Dlhá Lúka", "Muránska Huta", "Muránska Lehota", "Muránska Zdychava", "Mútne", "Mužla", "Myjava", "Myslina", "Mýtna", "Mýtne Ludany", "Mýto pod Ďumbierom", "Nacina Ves", "Nadlice", "Ňagov", "Naháč", "Nálepkovo", "Námestovo", "Nána", "Nandraž", "Ňárad", "Necpaly", "Nedanovce", "Nedašovce", "Neded", "Nededza", "Nedožery - Brezany", "Nechválova Polianka", "Nemce", "Nemcovce", "Nemcovce", "Nemčice", "Nemčiňany", "Nemecká", "Nemečky", "Nemešany", "Nemšová", "Nenince", "Neporadza", "Neporadza", "Nesluša", "Nesvady", "Neverice", "Nevidzany", "Nevidzany", "Nevoľné", "Nezbudská Lúčka", "Nimnica", "Nitra", "Nitra nad Ipľom", "Nitrianska Blatnica", "Nitrianska Streda", "Nitrianske Hrnčiarovce", "Nitrianske Pravno", "Nitrianske Rudno", "Nitrianske Sučany", "Nitrica", "Nižná", "Nižná", "Nižná Boca", "Nižná Hutka", "Nižná Jablonka", "Nižná Jedľová", "Nižná Kamenica", "Nižná Myšľa", "Nižná Olšava", "Nižná Pisaná", "Nižná Polianka", "Nižná Rybnica", "Nižná Sitnica", "Nižná Slaná", "Nižná Voľa", "Nižné Ladičkovce", "Nižné Nemecké", "Nižné Repaše", "Nižné Ružbachy", "Nižný Čaj", "Nižný Hrabovec", "Nižný Hrušov", "Nižný Klátov", "Nižný Komárnik", "Nižný Kručov", "Nižný Lánec", "Nižný Mirošov", "Nižný Orlík", "Nižný Skálnik", "Nižný Slavkov", "Nižný Tvarožec", "Nižný Žipov", "Nolčovo", "Norovce", "Nová Baňa", "Nová Bašta", "Nová Bošáca", "Nová Bystrica", "Nová Dedina", "Nová Dedinka", "Nová Dubnica", "Nová Kelča", "Nová Lehota", "Nová Lesná", "Nová Ľubovňa", "Nová Polhora", "Nová Polianka", "Nová Sedlica", "Nová Ves", "Nová Ves nad Váhom", "Nová Ves nad Žitavou", "Nová Vieska", "Nováčany", "Nováky", "Nové Hony", "Nové Mesto nad Váhom", "Nové Sady", "Nové Zámky", "Novosad", "Novoť", "Nový Ruskov", "Nový Salaš", "Nový Tekov", "Nový Život", "Nýrovce", "Obeckov", "Obid", "Obišovce", "Oborín", "Obručné", "Obyce", "Očkov", "Očová", "Odorín", "Ohrady", "Ohradzany", "Ochodnica", "Ochtiná", "Okoč", "Okoličná na Ostrove", "Okrúhle", "Okružná", "Olcnava", "Oľdza", "Olejníkov", "Olešná", "Oľka", "Olováry", "Oľšavce", "Oľšavica", "Oľšavka", "Oľšavka", "Oľšinkov", "Oľšov", "Olšovany", "Omastiná", "Omšenie", "Ondavka", "Ondavské Matiašovce", "Ondrašová", "Ondrašovce", "Ondrejovce", "Opátka", "Opatovce", "Opatovce nad Nitrou", "Opatovská Nová Ves", "Opava", "Opiná", "Opoj", "Oponice", "Oravce", "Orávka", "Oravská Jasenica", "Oravská Lesná", "Oravská Polhora", "Oravská Poruba", "Oravské Veselé", "Oravský Biely Potok", "Oravský Podzámok", "Ordzovany", "Orechová", "Orechová Potôň", "Oreské", "Oreské", "Orešany", "Orlov", "Orovnica", "Ortuťová", "Osádka", "Osadné", "Osikov", "Oslany", "Osrblie", "Ostrá Lúka", "Ostratice", "Ostrov", "Ostrov", "Ostrovany", "Ostrý Grúň", "Osturňa", "Osuské", "Oščadnica", "Otrhánky", "Otročok", "Ovčiarsko", "Ovčie", "Ozdín", "Ožďany", "Pača", "Padáň", "Padarovce", "Pakostov", "Palárikovo", "Palín", "Palota", "Paňa", "Panické Dravce", "Paňovce", "Papín", "Papradno", "Parchovany", "Parihuzovce", "Párnica", "Partizánska Ľupča", "Partizánske", "Pastovce", "Pastuchov", "Pašková", "Paština Závada", "Pata", "Pataš", "Patince", "Pavčina Lehota", "Pavľany", "Pavlice", "Pavlová", "Pavlova Ves", "Pavlovce", "Pavlovce", "Pavlovce nad Uhom", "Pažiť", "Pčoliné", "Pečeňady", "Pečeňany", "Pečenice", "Pečovská Nová Ves", "Peder", "Perín - Chym", "Pernek", "Petkovce", "Petrikovce", "Petrová", "Petrova Lehota", "Petrova Ves", "Petrovany", "Petrovce", "Petrovce", "Petrovce", "Petrovce nad Laborcom", "Petrovice", "Petrovo", "Pezinok", "Piešťany", "Pichne", "Píla", "Píla", "Píla", "Pinciná", "Pinkovce", "Piskorovce", "Pitelová", "Plášťovce", "Plavé Vozokany", "Plavecké Podhradie", "Plavecký Mikuláš", "Plavecký Peter", "Plavecký Štvrtok", "Plaveč", "Plavnica", "Plechotice", "Pleš", "Plešivec", "Plevník - Drienové", "Pliešovce", "Ploské", "Ploské", "Pobedim", "Počarová", "Počúvadlo", "Podbiel", "Podbranč", "Podbrezová", "Podhájska", "Podhorany", "Podhorany", "Podhorany", "Podhorie", "Podhorie", "Podhoroď", "Podhradie", "Podhradie", "Podhradie", "Podhradík", "Podkonice", "Podkriváň", "Podkylava", "Podlužany", "Podlužany", "Podolie", "Podolínec", "Podrečany", "Podskalie", "Podtureň", "Podvysoká", "Podzámčok", "Pohorelá", "Pohranice", "Pohronská Polhora", "Pohronský Bukovec", "Pohronský Ruskov", "Pochabany", "Pokryváč", "Poľanovce", "Poľany", "Poliakovce", "Polianka", "Polichno", "Polina", "Poľný Kesov", "Poloma", "Polomka", "Poltár", "Poluvsie", "Pongrácovce", "Poniky", "Poprad", "Poproč", "Poproč", "Popudinské Močidľany", "Poráč", "Poriadie", "Porostov", "Poruba", "Poruba pod Vihorlatom", "Porúbka", "Porúbka", "Porúbka", "Porúbka", "Poša", "Potok", "Potok", "Potoky", "Potôčky", "Potvorice", "Považany", "Považská Bystrica", "Povina", "Povoda", "Povrazník", "Pozba", "Pozdišovce", "Pôtor", "Praha", "Prakovce", "Prašice", "Prašník", "Pravenec", "Pravica", "Pravotice", "Práznovce", "Prečín", "Predajná", "Predmier", "Prenčov", "Preseľany", "Prestavlky", "Prešov", "Príbelce", "Pribeník", "Pribeta", "Pribiš", "Príbovce", "Pribylina", "Priechod", "Priekopa", "Priepasné", "Prietrž", "Prietržka", "Prievaly", "Prievidza", "Prihradzany", "Príkra", "Príslop", "Prituľany", "Proč", "Prochot", "Prosačov", "Prosiek", "Prša", "Pruské", "Prusy", "Pružina", "Pstriná", "Ptičie", "Ptrukša", "Pucov", "Púchov", "Pukanec", "Pusté Čemerné", "Pusté Pole", "Pusté Sady", "Pusté Úľany", "Pušovce", "Rabča", "Rabčice", "Rad", "Radatice", "Radava", "Radimov", "Radnovce", "Radobica", "Radoľa", "Radoma", "Radošina", "Radošovce", "Radošovce", "Radôstka", "Radvaň nad Dunajom", "Radvaň nad Laborcom", "Radvanovce", "Radzovce", "Rafajovce", "Rajčany", "Rajec", "Rajecká Lesná", "Rajecké Teplice", "Rákoš", "Rákoš", "Raková", "Rakovčík", "Rakovec nad Ondavou", "Rakovice", "Rakovnica", "Rakovo", "Rakša", "Rakúsy", "Rakytník", "Rankovce", "Rapovce", "Raslavice", "Rastislavice", "Rašice", "Ratka", "Ratková", "Ratkovce", "Ratkovo", "Ratkovská Lehota", "Ratkovská Suchá", "Ratkovské Bystré", "Ratnovce", "Ratvaj", "Ráztočno", "Ráztoka", "Ražňany", "Reca", "Regetovka", "Rejdová", "Reľov", "Remeniny", "Remetské Hámre", "Renčišov", "Repejov", "Repište", "Rešica", "Rešov", "Revúca", "Revúcka Lehota", "Riečka", "Riečka", "Richnava", "Richvald", "Rimavská Baňa", "Rimavská Seč", "Rimavská Sobota", "Rimavské Brezovo", "Rimavské Janovce", "Rimavské Zalužany", "Rišňovce", "Rohov", "Rohovce", "Rohožník", "Rohožník", "Rochovce", "Rokycany", "Rokytov", "Rokytov pri Humennom", "Rokytovce", "Rosina", "Roškovce", "Roštár", "Rovensko", "Rovinka", "Rovňany", "Rovné", "Rovné", "Rovné", "Rozhanovce", "Rozložná", "Roztoky", "Rožkovany", "Rožňava", "Rožňavské Bystré", "Rúbaň", "Rudina", "Rudinka", "Rudinská", "Rudlov", "Rudná", "Rudňany", "Rudnianska Lehota", "Rudník", "Rudník", "Rudno", "Rudno nad Hronom", "Rumanová", "Rumince", "Runina", "Ruská", "Ruská Bystrá", "Ruská Kajňa", "Ruská Nová Ves", "Ruská Poruba", "Ruská Voľa", "Ruská Voľa nad Popradom", "Ruská Volová", "Ruskov", "Ruskovce", "Ruskovce", "Ruský Hrabovec", "Ruský Potok", "Ružiná", "Ružindol", "Ružomberok", "Rybany", "Rybky", "Rybník", "Rybník", "Rykynčice", "Sabinov", "Sačurov", "Sádočné", "Sady nad Torysou", "Salka", "Santovka", "Sap", "Sása", "Sása", "Sasinkovo", "Sazdice", "Sebedín - Bečov", "Sebedražie", "Sebechleby", "Seč", "Sečianky", "Sečovce", "Sečovská Polianka", "Sedliacka Dubová", "Sedlice", "Sedliská", "Sedmerovec", "Sejkov", "Sekule", "Seľany", "Selce", "Selce", "Selce", "Selec", "Selice", "Semerovo", "Seňa", "Senec", "Seniakovce", "Senica", "Senné", "Senné", "Senohrad", "Sereď", "Sielnica", "Sihelné", "Sihla", "Sikenica", "Sikenička", "Siladice", "Silica", "Silická Brezová", "Silická Jablonica", "Sirk", "Sirník", "Skačany", "Skalica", "Skalité", "Skalka nad Váhom", "Skároš", "Skerešovo", "Sklabiná", "Sklabiňa", "Sklabinský Podzámok", "Sklené", "Sklené Teplice", "Skrabské", "Skýcov", "Sládkovičovo", "Slančík", "Slanec", "Slanská Huta", "Slanské Nové Mesto", "Slaská", "Slatina", "Slatina nad Bebravou", "Slatinka nad Bebravou", "Slatinské Lazy", "Slatvina", "Slavec", "Slavkovce", "Slavnica", "Slavoška", "Slavošovce", "Sľažany", "Slepčany", "Sliač", "Sliače", "Sliepkovce", "Slivník", "Slizké", "Slopná", "Slovany", "Slovenská Kajňa", "Slovenská Ľupča", "Slovenská Nová Ves", "Slovenská Ves", "Slovenská Volová", "Slovenské Ďarmoty", "Slovenské Kľačany", "Slovenské Krivé", "Slovenské Nové Mesto", "Slovenské Pravno", "Slovenský Grob", "Slovinky", "Smilno", "Smižany", "Smolenice", "Smolinské", "Smolnícka Huta", "Smolník", "Smrdáky", "Smrečany", "Snakov", "Snežnica", "Snina", "Soblahov", "Soboš", "Sobotište", "Sobrance", "Socovce", "Sokoľ", "Sokoľany", "Sokolce", "Sokolovce", "Soľ", "Solčany", "Solčianky", "Soľnička", "Soľník", "Sološnica", "Somotor", "Sopkovce", "Spišská Belá", "Spišská Nová Ves", "Spišská Stará Ves", "Spišská Teplica", "Spišské Bystré", "Spišské Hanušovce", "Spišské Podhradie", "Spišské Tomášovce", "Spišské Vlachy", "Spišský Hrhov", "Spišský Hrušov", "Spišský Štiavnik", "Spišský Štvrtok", "Stakčín", "Stakčínska Roztoka", "Stanča", "Stankovany", "Stankovce", "Stará Bašta", "Stará Bystrica", "Stará Halič", "Stará Huta", "Stará Kremnička", "Stará Lehota", "Stará Lesná", "Stará Ľubovňa", "Stará Myjava", "Stará Turá", "Stará Voda", "Staré", "Staré Hory", "Starina", "Starý Hrádok", "Starý Tekov", "Staškov", "Staškovce", "Stebnícka Huta", "Stebník", "Stožok", "Stráňany", "Stráňavy", "Stráne pod Tatrami", "Stránska", "Stránske", "Stratená", "Stráža", "Strážne", "Strážske", "Strečno", "Streda nad Bodrogom", "Stredné Plachtince", "Strekov", "Strelníky", "Stretava", "Stretavka", "Streženice", "Strihovce", "Stročín", "Stropkov", "Studená", "Studenec", "Studienka", "Stuľany", "Stupava", "Stupné", "Sučany", "Sudince", "Súdovce", "Suchá Dolina", "Suchá Hora", "Suchá nad Parnou", "Sucháň", "Suché", "Suché Brezovo", "Suchohrad", "Sukov", "Sulín", "Súľov - Hradná", "Súlovce", "Sušany", "Sútor", "Svätá Mária", "Svätoplukovo", "Svätuš", "Svätuše", "Svätý Anton", "Svätý Jur", "Svätý Kríž", "Svätý Peter", "Svederník", "Sverepec", "Sveržov", "Svetlice", "Svidnička", "Svidník", "Svinia", "Svinica", "Svinice", "Svinná", "Svit", "Svodín", "Svrbice", "Svrčinovec", "Šahy", "Šajdíkove Humence", "Šaľa", "Šalgočka", "Šalgovce", "Šalov", "Šambron", "Šamorín", "Šamudovce", "Šandal", "Šarbov", "Šarišská Poruba", "Šarišská Trstená", "Šarišské Bohdanovce", "Šarišské Čierne", "Šarišské Dravce", "Šarišské Jastrabie", "Šarišské Michaľany", "Šarišské Sokolovce", "Šarišský Štiavnik", "Šarkan", "Šarovce", "Šašová", "Šaštín - Stráže", "Šávoľ", "Šelpice", "Šemetkovce", "Šemša", "Šenkvice", "Šiatorská Bukovinka", "Šiba", "Šíd", "Šimonovce", "Šindliar", "Šintava", "Šípkov", "Šípkové", "Širákov", "Širkovce", "Široké", "Šišov", "Šivetice", "Šmigovec", "Šoltýska", "Šoporňa", "Špačince", "Špania Dolina", "Španie Pole", "Šrobárová", "Štefanov", "Štefanov nad Oravou", "Štefanová", "Štefanovce", "Štefanovce", "Štefanovičová", "Štefurov", "Šterusy", "Štiavnické Bane", "Štiavnička", "Štiavnik", "Štítnik", "Štós", "Štôla", "Štrba", "Štrkovec", "Štúrovo", "Štvrtok", "Štvrtok na Ostrove", "Šuja", "Šuľa", "Šumiac", "Šuňava", "Šurany", "Šurianky", "Šurice", "Šúrovce", "Šutovce", "Šútovo", "Švábovce", "Švedlár", "Švošov", "Tachty", "Tajná", "Tajov", "Ťapešovo", "Tarnov", "Tašuľa", "Tatranská Javorina", "Tehla", "Tekolďany", "Tekovská Breznica", "Tekovské Lužany", "Tekovské Nemce", "Tekovský Hrádok", "Telgárt", "Telince", "Temeš", "Teplička", "Teplička nad Váhom", "Tepličky", "Teplý Vrch", "Terany", "Terchová", "Teriakovce", "Terňa", "Tesáre", "Tesárske Mlyňany", "Tešedíkovo", "Tibava", "Tichý Potok", "Timoradza", "Tisinec", "Tisovec", "Tlmače", "Točnica", "Tokajík", "Tomášikovo", "Tomášov", "Tomášovce", "Tomášovce", "Topoľa", "Topoľčany", "Topoľčianky", "Topoľnica", "Topoľníky", "Topoľovka", "Toporec", "Tornaľa", "Torysa", "Torysky", "Tovarné", "Tovarnianska Polianka", "Tovarníky", "Tôň", "Trakovice", "Trávnica", "Trávnik", "Trebatice", "Trebejov", "Trebeľovce", "Trebichava", "Trebišov", "Trebostovo", "Trebušovce", "Trenč", "Trenčianska Teplá", "Trenčianska Turná", "Trenčianske Bohuslavice", "Trenčianske Jastrabie", "Trenčianske Mitice", "Trenčianske Stankovce", "Trenčianske Teplice", "Trenčín", "Trhová Hradská", "Trhovište", "Trnava", "Trnavá Hora", "Trnava pri Laborci", "Trnávka", "Trnávka", "Tŕnie", "Trnkov", "Trnovec", "Trnovec nad Váhom", "Trnovo", "Tročany", "Trpín", "Trsťany", "Trstená", "Trstená na Ostrove", "Trstené", "Trstené pri Hornáde", "Trstice", "Trstín", "Tuhár", "Tuhrina", "Tuchyňa", "Tulčík", "Tupá", "Turá", "Turany", "Turany nad Ondavou", "Turcovce", "Turček", "Turčianky", "Turčianska Štiavnička", "Turčianske Jaseno", "Turčianske Kľačany", "Turčianske Teplice", "Turčiansky Ďur", "Turčiansky Peter", "Turčok", "Turecká", "Tureň", "Turie", "Turík", "Turňa nad Bodvou", "Turnianska Nová Ves", "Turová", "Turzovka", "Tušice", "Tušická Nová Ves", "Tužina", "Tvarožná", "Tvrdomestice", "Tvrdošín", "Tvrdošovce", "Ubľa", "Úbrež", "Udavské", "Udiča", "Údol", "Uhliská", "Úhorná", "Uhorská Ves", "Uhorské", "Uhrovec", "Uhrovské Podhradie", "Úľany nad Žitavou", "Ulič", "Uličské Krivé", "Uloža", "Uňatín", "Unín", "Urmince", "Utekáč", "Uzovce", "Uzovská Panica", "Uzovské Pekľany", "Uzovský Šalgov", "Vaďovce", "Vagrinec", "Váhovce", "Vajkovce", "Valaliky", "Valaská", "Valaská Belá", "Valaská Dubová", "Valča", "Valentovce", "Valice", "Valkovce", "Vaľkovňa", "Vaniškovce", "Vápeník", "Varadka", "Varechovce", "Varhaňovce", "Varín", "Vasiľov", "Vavrečka", "Vavrinec", "Vavrišovo", "Važec", "Včelince", "Večelkov", "Vechec", "Veľaty", "Velčice", "Veličná", "Veľká Čalomija", "Veľká Čausa", "Veľká Čierna", "Veľká Dolina", "Veľká Franková", "Veľká Hradná", "Veľká Ida", "Veľká Lehota", "Veľká Lesná", "Veľká Lodina", "Veľká Lomnica", "Veľká Lúka", "Veľká Mača", "Veľká nad Ipľom", "Veľká Paka", "Veľká Tŕňa", "Veľká Ves", "Veľká Ves nad Ipľom", "Veľké Bierovce", "Veľké Blahovo", "Veľké Borové", "Veľké Dravce", "Veľké Držkovce", "Veľké Dvorany", "Veľké Dvorníky", "Veľké Hoste", "Veľké Chlievany", "Veľké Chyndice", "Veľké Kapušany", "Veľké Kosihy", "Veľké Kostoľany", "Veľké Kozmálovce", "Veľké Kršteňany", "Veľké Leváre", "Veľké Lovce", "Veľké Ludince", "Veľké Orvište", "Veľké Ozorovce", "Veľké Pole", "Veľké Raškovce", "Veľké Revištia", "Veľké Ripňany", "Veľké Rovné", "Veľké Slemence", "Veľké Straciny", "Veľké Teriakovce", "Veľké Trakany", "Veľké Turovce", "Veľké Uherce", "Veľké Úľany", "Veľké Vozokany", "Veľké Zálužie", "Veľké Zlievce", "Veľkrop", "Veľký Biel", "Veľký Blh", "Veľký Cetín", "Veľký Čepčín", "Veľký Ďur", "Veľký Folkmar", "Veľký Grob", "Veľký Horeš", "Veľký Kamenec", "Veľký Klíž", "Veľký Krtíš", "Veľký Kýr", "Veľký Lapáš", "Veľký Lipník", "Veľký Lom", "Veľký Meder", "Veľký Slavkov", "Veľký Slivník", "Veľký Šariš", "Veľopolie", "Velušovce", "Vernár", "Veselé", "Veterná Poruba", "Vidiná", "Vieska", "Vieska", "Vieska nad Blhom", "Vieska nad Žitavou", "Vígľaš", "Vígľašská Huta - Kalinka", "Vikartovce", "Vinica", "Viničky", "Viničné", "Vinné", "Vinodol", "Vinohrady nad Váhom", "Vinosady", "Virt", "Vislanka", "Vislava", "Visolaje", "Višňov", "Višňové", "Višňové", "Višňové", "Vištuk", "Vitanová", "Víťaz", "Víťazovce", "Vítkovce", "Vlača", "Vladiča", "Vlachovo", "Vlachy", "Vlčany", "Vlčkovce", "Vlkanová", "Vlkas", "Vlková", "Vlkovce", "Vlky", "Vlkyňa", "Voderady", "Vojany", "Vojčice", "Vojka", "Vojka nad Dunajom", "Vojkovce", "Vojňany", "Vojnatina", "Vojtovce", "Voľa", "Volica", "Volkovce", "Voznica", "Vozokany", "Vozokany", "Vráble", "Vrádište", "Vrakúň", "Vranov nad Topľou", "Vrbnica", "Vrbov", "Vrbová nad Váhom", "Vrbovce", "Vrbové", "Vrbovka", "Vrchteplá", "Vrícko", "Vršatské Podhradie", "Vrútky", "Vtáčkovce", "Výborná", "Výčapy - Opatovce", "Vydrany", "Vydrná", "Vydrník", "Vyhne", "Východná", "Výrava", "Vysočany", "Vysoká", "Vysoká", "Vysoká nad Kysucou", "Vysoká nad Uhom", "Vysoká pri Morave", "Vysoké Tatry", "Vyškovce", "Vyškovce nad Ipľom", "Vyšná Boca", "Vyšná Hutka", "Vyšná Jablonka", "Vyšná Jedľová", "Vyšná Kamenica", "Vyšná Myšľa", "Vyšná Olšava", "Vyšná Pisaná", "Vyšná Polianka", "Vyšná Rybnica", "Vyšná Sitnica", "Vyšná Slaná", "Vyšná Šebastová", "Vyšná Voľa", "Vyšné Ladičkovce", "Vyšné nad Hronom", "Vyšné Nemecké", "Vyšné Remety", "Vyšné Repaše", "Vyšné Ružbachy", "Vyšné Valice", "Vyšný Čaj", "Vyšný Hrabovec", "Vyšný Hrušov", "Vyšný Kazimír", "Vyšný Klátov", "Vyšný Komárnik", "Vyšný Kručov", "Vyšný Kubín", "Vyšný Medzev", "Vyšný Mirošov", "Vyšný Orlík", "Vyšný Skálnik", "Vyšný Slavkov", "Vyšný Tvarožec", "Vyšný Žipov", "Zábiedovo", "Záborie", "Záborské", "Zádiel", "Zádor", "Záhor", "Záhorce", "Záhorská Ves", "Záhradné", "Zacharovce", "Zákamenné", "Zákopčie", "Zalaba", "Zálesie", "Zálesie", "Zalužice", "Zamarovce", "Zámutov", "Záriečie", "Záskalie", "Zatín", "Závada", "Závada", "Závada", "Závadka", "Závadka", "Závadka", "Závadka nad Hronom", "Zavar", "Závažná Poruba", "Závod", "Zázrivá", "Zbehňov", "Zbehy", "Zboj", "Zbojné", "Zborov", "Zborov nad Bystricou", "Zbrojníky", "Zbudská Belá", "Zbudské Dlhé", "Zbudza", "Zbyňov", "Zeleneč", "Zemianska Olča", "Zemianske Kostoľany", "Zemianske Podhradie", "Zemianske Sady", "Zemiansky Vrbovok", "Zemné", "Zemplín", "Zemplínska Nová Ves", "Zemplínska Široká", "Zemplínska Teplica", "Zemplínske Hámre", "Zemplínske Hradište", "Zemplínske Jastrabie", "Zemplínske Kopčany", "Zemplínsky Branč", "Zlatá Baňa", "Zlatá Idka", "Zlaté", "Zlaté Klasy", "Zlaté Moravce", "Zlatná na Ostrove", "Zlatník", "Zlatníky", "Zlatno", "Zlatno", "Zliechov", "Zohor", "Zombor", "Zubák", "Zuberec", "Zubné", "Zubrohlava", "Zvolen", "Zvolenská Slatina", "Zvončín", "Žabokreky", "Žabokreky nad Nitrou", "Žakarovce", "Žakovce", "Žalobín", "Žarnov", "Žarnovica", "Žaškov", "Žbince", "Ždaňa", "Ždiar", "Žehňa", "Žehra", "Železná Breznica", "Železník", "Želiezovce", "Želmanovce", "Želovce", "Žemberovce", "Žemliare", "Žiar", "Žiar", "Žiar nad Hronom", "Žibritov", "Žihárec", "Žikava", "Žilina", "Žíp", "Žipov", "Žirany", "Žitavce", "Žitná - Radiša", "Žlkovce", "Župčany", "Župkov" };
    private static final String STREETS[] = { "Agátová ulica", "Automobilová ulica", "Belgická ulica", "Bratislavská ulica", "Bulharská ulica", "Coburgova ulica", "Cukrová ulica", "Čerešňová ulica", "Dedinská ulica", "Dolné bašty", "Dúhová ulica", "Farárske", "Horné bašty", "Chrenová ulica", "Hradobná ulička", "Jabloňová ulica", "Jazdecká ulica", "Kamenná cesta", "Kamenný mlyn", "Koceľova ulica", "Kočišské", "Kopánková ulica", "Krátka ulica", "Krupská ulica", "Legionárska ulica", "Lúčna ulica", "Malinová ulica", "Malženická cesta", "Medziháj", "Mesačná", "Múzejné námestie", "Na hlinách", "Námestie Jozefa Herdu", "Námestie Slov.národ.povstania", "Námestie Slov.učeného tovarišstva", "Námestie sv. Mikuláša", "Narcisová ulica", "Okružná ulica", "Okružné námestie", "Olympijská ulica", "Oravné", "Orechová ulica", "Orešianska ulica", "Park Janka Kráľa", "Pásová ulica", "Pažitný mlyn", "Poštová ulica", "Prechodná ulica", "Pri potoku", "Pri kalvárii", "Priemyselná ulica", "Pútnická ulica", "Rajčurská ulica", "Roľnícka ulica", "Rovná ulica", "Saleziánska ulica", "Schumerova ulica", "Slovenská ulica", "Spojná ulica", "Stará ulica", "Starohájska ulica", "Strmá ulica", "Stromová ulica", "Šípová ulica", "ŠM Dolina", "ŠM Farský mlyn", "ŠM Veľký dvor", "Špačinská cesta", "Šrobárova ulica", "Štrky", "Tichá ulica Modranka", "Traťová ulica", "Tŕnitá ulička", "Trojičné námestie", "Trstínska cesta", "Tulipánová ulica", "9. mája", "A. Sládkoviča", "Adama Štrekára", "Alfréda Wetzlera", "Andreja Hlinku", "Andreja Kmeťa", "Andreja Kubinu", "Andreja Žarnova", "Antona Malatinského", "Astrová", "Atómová", "Átriová", "B. Němcovej", "B. S. Timravy", "Bedřicha Smetanu", "Bernolákova", "Bočná", "Bosniacka", "Botanická", "Bradlanská", "Bučianska", "Čajkovského", "Daxnerova", "Denisova", "Diaľničná", "Divadelná", "Dohnányho", "Dolnopotočná", "E.M.Šoltésovej", "Ferka Urbánka", "Fraňa Kráľa", "Francisciho", "Františka Veselovského", "Františkánska", "Gábora Steinera", "Gavlovičova", "Gejzu Dusíka", "gen. Goliána", "Halenárska", "Hattalova", "Haulíkova", "Hlavná", "Hlboká", "Hodžova", "Hornopotočná", "Hospodárska", "Hraničná", "Hurbanova", "Hviezdna", "Hviezdoslavova", "Chovateľská", "Invalidská", "Ivana Krasku", "J. G. Tajovského", "Jačmenná", "Jaderná", "Jána Bottu", "Jána Hajdóczyho", "Jána Hlubíka", "Jána Hollého", "Jána Sambucusa", "Jánošíkova", "Jarná Modranka", "Jasná", "Javorová", "Jerichova", "Jeruzalemská", "Jesenského", "Jiráskova", "Johna Dopyeru", "Júliusa Gábriša", "Juraja Fándlyho", "Juraja Slottu", "Kalinčiakova", "Kapitulská", "Karola Ježíka", "Karpatská", "Klempova", "Kollárova", "Komenského", "Koniarekova", "Konštantína Čulena", "Konvalinková", "Kornela Mahra", "Kozácka", "Krajná", "Krížová", "Kukučínova", "Kuzmányho", "Kvetná", "Ľaliová", "Leoša Janáčka", "Letecká", "Letná", "Lichardova", "Limbová", "Lipová", "Lomonosovova", "Lovecká", "Ľudmily Podjavorinskej", "Ulice Ľudová", "Ludvika van Beethovena", "M. Schneidra Trnavského", "Malá", "Markovičova", "Martina Benku", "Martina Gregora", "Matuškova", "Maxima Gorkého", "Maximiliána Hella", "Mierová", "Michalská", "Mikovíniho", "Mikuláša Koperníka", "Modranská", "Mozartova", "Murgašova", "Mýtna", "Nerudova", "Nevädzová", "Nezábudková", "Nitrianska", "Nobelova", "Nová", "Novosadská", "Oblúková", "Odbojárska", "Olivová", "Orgovánová", "Orolská", "Osadná", "Oskára Čepana", "Ostravská", "Osvaldova", "Ovocná", "Palárikova", "parašutistov", "Parková", "Paulínska", "Pavla Hlbinu", "Pavla Mudroňa", "Pažitná", "Pekárska", "Petra Bohúňa", "Petra Pázmaňa", "Petzvalova", "Piešťanská", "Pobrežná", "Poľná", "Púpavová", "Radarová", "Radlinského", "Rekreačná", "Rázusova", "Robotnícka", "Rudolfa Dilonga", "Rudolfa Vrbu", "Ružindolská", "Ružová", "Rybníková", "Sadová", "Samuela Jurkoviča", "Sasinkova", "Seredská", "Severná", "Sibírska", "Skladová", "Sladovnícka", "Slnečná", "Slovanská", "Spartakovská", "Staničná", "Stavebná", "Stredná", "Strelecká", "Strojárenská", "Suchá", "Suchovská", "sv. Cyrila a Metoda", "Šafárikova", "Školská", "Športová", "Štefana Baniča", "Štefana C.Parráka", "Štefana Fidlíka", "Štefana Moyzesa", "Štefánikova", "Študentská", "Štúrova", "Tamaškovičova", "Tatranská", "Tehelná", "Teodora Tekela", "Terézie Vansovej", "Tibora Kružliaka", "Tich. Milkina", "Tomášikova", "Topoľová", "Trhová", "Ustianska", "V. Paulínyho Tótha", "Vajanského", "Vančurova", "Veselá", "Veterná", "Vladimíra Clementisa", "Vladimíra Roya", "Vlárska", "Vodná", "Williama Schiffera", "Západná", "Zavarská", "Zelená", "Zvončeková", "Železná", "Žitná", "Univerzitné námestie", "V jame", "Vajslova ulica", "Viktoríniho námestie", "Východná ulica", "Zámočnícka", "Zelenečská ulica", "Zelený kríčok", "Zlievarenská ulica", "Železničná ulica" };
    private static String LETTERS[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
    private static final String COMPANIES[] = { "Dis Parturient Montes Incorporated", "Ipsum Sodales Purus LLP", "At Egestas A PC", "Diam Corporation", "Placerat Orci PC", "Suscipit Nonummy Fusce Institute", "Nec Eleifend PC", "Proin Nisl Inc.", "Ligula Aenean Euismod Consulting", "Donec Felis Orci LLP", "Varius Nam Porttitor Inc.", "Integer Foundation", "Amet Consulting", "Bibendum Fermentum Metus Inc.", "Erat Sed Nunc LLC", "At Libero Associates", "Cursus Nunc Institute", "Pretium Aliquet Metus Ltd", "Sit Foundation", "Nulla Ante Iaculis Incorporated", "Eu Erat Consulting", "Integer Aliquam Consulting", "Sed Diam Lorem Industries", "Sed Industries", "Pede Nec Ante Foundation", "Donec LLC", "Magna Company", "Dignissim Lacus LLP", "Arcu Vestibulum Ante Foundation", "Cras Interdum Nunc LLP", "Fusce Diam Nunc Ltd", "Amet Risus Corp.", "Lacinia Sed LLC", "Sodales Mauris Company", "Eu Arcu Morbi Industries", "Ac Mattis Velit Associates", "Velit Quisque Varius Ltd", "Tempus Foundation", "Leo Cras LLC", "Sed Limited", "Nullam Ut Ltd", "In Associates", "Magna Malesuada Limited", "Mauris Eu LLP", "Nunc Risus Varius Consulting", "Non Arcu LLP", "Interdum Enim Limited", "Eleifend Foundation", "Aliquam Enim Nec Consulting", "Elit Industries", "Dui Associates", "Est Mauris Eu Corp.", "Sapien Company", "Mus Donec Dignissim Associates", "Blandit Limited", "Nibh Enim Gravida Associates", "Et Tristique Pellentesque Institute", "Quisque Inc.", "Vestibulum Neque Company", "Dapibus Gravida Aliquam Industries", "Maecenas Ornare Egestas Company", "Ullamcorper Viverra Ltd", "Congue Elit Sed LLC", "Aliquet Proin Associates", "Orci Limited", "Euismod Associates", "Libero Company", "Ac Eleifend Vitae Associates", "Dolor Sit Corporation", "Nisl Nulla Eu Limited", "Nisi Aenean Eget Corporation", "Ultrices Institute", "Ut Erat Sed LLC", "Per Conubia Foundation", "Sollicitudin Commodo Ipsum Corporation", "Ut Pharetra Sed Inc.", "Ac LLC", "Auctor Institute", "Porttitor Tellus Non Company", "At Egestas A Limited", "Convallis Convallis LLC", "Eu Sem Pellentesque Institute", "Cum Sociis PC", "Aenean Sed Pede Ltd", "Nullam Velit Dui Foundation", "Ante Industries", "Urna Foundation", "Egestas A Scelerisque Limited", "Eleifend Nunc Risus Consulting", "Neque Ltd", "Risus In Mi Consulting", "Nunc Ac Industries", "A Magna Lorem Institute", "Lectus Nullam Suscipit Institute", "Tempor Corp.", "Et Magnis Ltd", "Blandit Industries", "Nec Diam Incorporated", "Est Mauris LLP", "Curabitur Egestas Nunc Limited" };
    private static final String EMAILS[] = { "rhoncus.Proin.nisl@faucibus.ca", "dignissim.pharetra.Nam@dictummiac.edu", "tincidunt.dui.augue@leo.edu", "interdum.feugiat@gravida.co.uk", "diam.Sed@aliquetmolestie.ca", "lacus@liberoInteger.net", "velit.eget@condimentum.ca", "cursus.vestibulum@justo.co.uk", "odio.sagittis.semper@ullamcorpermagnaSed.org", "pharetra.Nam@anteiaculisnec.com", "porttitor.tellus@Quisquefringilla.net", "Nullam.ut@Nam.ca", "sed.dui@Vivamusrhoncus.org", "neque.et@etpedeNunc.co.uk", "turpis.Nulla.aliquet@Phaselluselit.edu", "molestie.tortor.nibh@maurisid.net", "luctus.lobortis@ultriciesadipiscing.edu", "facilisis.lorem.tristique@cursusdiamat.ca", "ac@nascetur.co.uk", "placerat.eget.venenatis@Duiscursus.com", "Donec@vitaemauris.edu", "Mauris@rutrumeuultrices.net", "venenatis.vel@convallisdolor.org", "amet@sitametnulla.net", "eget.odio@molestie.net", "justo@sodales.net", "neque@Vivamus.org", "Morbi.sit@lectusrutrumurna.net", "Nulla@Quisque.edu", "felis.ullamcorper@augueeutellus.org", "erat.eget@orcitincidunt.ca", "nibh@DonecegestasDuis.edu", "Nulla@nunc.edu", "risus.In.mi@dictum.net", "faucibus.ut@consequat.com", "ullamcorper.eu@euismod.edu", "lacus.Cras.interdum@consequat.edu", "ornare@non.net", "sit@risusNulla.org", "posuere@malesuadafamesac.edu", "laoreet.posuere@enimEtiamgravida.com", "Donec@Integer.org", "venenatis.vel@elitelit.org", "sem.semper.erat@lectuspede.org", "Cum.sociis@rutrum.co.uk", "ac.mattis@ut.org", "erat.nonummy@erat.org", "posuere@Sedegetlacus.org", "at.velit.Pellentesque@orciUt.net", "ornare@Utsagittis.com", "Mauris.eu.turpis@elementumsem.ca", "purus.gravida.sagittis@Nam.org", "id.mollis@orciUtsemper.com", "Donec@tellusAeneanegestas.co.uk", "dolor@dui.edu", "ultrices@ac.ca", "Cras.dolor@habitant.net", "nisl@Donecelementum.net", "libero@dapibus.net", "Donec@Suspendisse.com", "nibh.dolor.nonummy@necmauris.net", "risus.Donec@elitCurabitur.com", "Donec@molestie.edu", "nec.malesuada.ut@euultrices.net", "Nunc@vitaevelit.com", "natoque@nonummy.org", "sit@sempercursusInteger.net", "libero.Morbi@ultriciesornare.com", "quis.diam.luctus@nullaInteger.ca", "Lorem@utpharetrased.com", "non.enim.Mauris@adipiscinglobortis.co.uk", "magna.Lorem.ipsum@ornare.co.uk", "Nunc.quis@gravidaAliquam.com", "lectus@orci.co.uk", "velit@volutpatNulladignissim.com", "rutrum.eu@pharetranibhAliquam.com", "Phasellus.libero@Sed.ca", "tincidunt.Donec.vitae@aarcu.org", "et.malesuada@malesuada.com", "eget@variusultricesmauris.co.uk", "magnis.dis@idlibero.org", "Sed.congue@Nam.org", "sem.egestas.blandit@Etiamgravida.co.uk", "dictum.cursus@egestas.ca", "sed.dolor.Fusce@sempercursusInteger.net", "urna@porttitor.ca", "ipsum.dolor.sit@eros.co.uk", "in.molestie@Donec.com", "ante.dictum.mi@blanditenim.co.uk", "montes@temporestac.edu", "vel@pede.co.uk", "augue.malesuada.malesuada@Sed.com", "Nulla.facilisi.Sed@feliseget.org", "non.lorem.vitae@luctusetultrices.com", "consectetuer.mauris.id@lectusa.com", "Nullam.enim@tellus.edu", "orci.in.consequat@quamelementum.edu", "orci@augue.org", "Nullam.feugiat.placerat@ipsum.ca", "risus@Fuscemi.edu" };
    
    private static final String DOM_JAZYK[] = { "SK","EN","G","FR","IT","CZ","PL","RUS","HU" };
    private static final String[] examSubversions = { "a", "b", "c", "d", "e", "f", "g" };
    
    private static final Random gen = new Random();
    private static final LoremIpsum loremIpsumGenerator = new LoremIpsum( 4 );
    
    /*SETTERS*/
    private static final int POCET_OSOB = 500;
    private static final int POCET_SKUSOK = 100;
    private static final int POCET_TEM = 30;
    private static final int POCET_VERZII_DB_OD = 6;
    private static final int POCET_VERZII_DB_DO = 12;
    private static final int POCET_TYPOV_CERTIFIKATOV = 10;
    private static final int POCET_UROVNI_CERTIFIKATOV = 5;
    private static final int POCET_TYPOV_DODATOCNYCH_PODMIENOK = 10;
    private static final int POCET_CERTIFIKATOV = 10;
    private static final int POCET_PONUKANYCH_SKUSOK = 50;
    private static final int POCET_REGISTRACII_NA_SKUSKU = 200;
    private static final int POCET_VYDANYCH_CERTIFIKATOV = 100;
    private static final int POCET_OKRUHOV_TEM = 300;
    private static final int POCET_ALTERNATIV_SKUSOK = 100;
    private static final int POCET_PREREKVIZIT = 5;
    private static final int POCET_DODATOCNYCH_PODMIENOK = 10;
    private static final int POCET_SPLNENYCH_DODATOCNYCH_PODMIENOK = 100;
    private static final int POCET_PREDCHADZAJUCICH_SKUSOK = 10;
    
    /*Variables*/
    private static int pocetMiest;
    private static int pocetCertifikacnychFiriem;
    private static int pocetDbVerzii;
    private static final ArrayList< String > rodneCislaBuffer = new ArrayList<>( POCET_OSOB );
    private static final ArrayList< String > datumyPonukaneSkuskyBuffer = new ArrayList<>( POCET_PONUKANYCH_SKUSOK );
    private static final ArraySet dodatocnePodmienkyBuffer = new ArraySet();
    
    public static void main( String[] args ) {
        bringTheTide();
    }
    
    public static void bringTheTide() { // fill the database
        
        generateTableKrajina();
        generateTableMesto();
        generateTableOsoba();
        generateTableCertifikacnaFirma();
        generateTableSkuska();
        generateTableTema();
        generateTableTypCertifikatu();
        generateTableDbVerzia();
        generateTableCertLevel();
        generateTableTypDodatocnejPodmienky();
        generateTableCertifikat();
        generateTablePonukaneSkusky();
        generateTableRegistraciaNaSkusku();
        generateTableVydanyCertifikat();
        generateTableOkruhTem();
        generateTablePredchadzajuceSkusky();
        generateTableAlternativySkusky();
        generateTablePrerekvizity();
        generateTableDodatocnePodmienky();
        generateTableSplnenieDodatocnejSkusky();
    }
       
    private static String getPSC() {
        return "" + getRandomDigit() + getRandomDigit() + getRandomDigit() + getRandomDigit() + getRandomDigit();
    }
    
    private static int getRandomDigit() {
        return gen.nextInt( 10 );
    }
    
    private static void generateTableKrajina() {
        System.out.println( "\n--### Generujem krajiny ###\n" );
        printInsertKrajina( 1, "Slovensko", "SVK");
    }
    
    private static void printInsertKrajina( int idKrajiny, String nazovKrajiny, String kodKrajiny ) {
        System.out.println( 
                "INSERT INTO krajina(id_krajiny, nazov, kod) VALUES(" 
                        + idKrajiny 
                        + ", '" 
                        + nazovKrajiny 
                        + "', '" 
                        + kodKrajiny 
                        + "');" );
    }
    
    private static void generateTableMesto() {
        System.out.println( "\n--### Generujem mestá ###\n" );
        
        int counter = 1;
        for( String town : TOWNS) {
            printInsertMesto( counter++, 1, town, getPSC() );
        }
        pocetMiest = counter - 1;
    }
    
    private static void printInsertMesto( int idMesta, int idKrajiny, String nazovMesta, String pscMesta ) {
        System.out.println( 
                "INSERT INTO mesto(id_mesta, id_krajiny, nazov, psc) VALUES(" 
                        + idMesta 
                        + ", '" 
                        + idKrajiny 
                        + "', '" 
                        + nazovMesta 
                        + "', '" 
                        + pscMesta 
                        + "');" 
        );
    }
    
    private static void generateTableOsoba() {
        System.out.println( "\n--### Generujem osoby ###\n" );
        
        boolean female;
        String rodneCislo;
        LinkedHashSet< String > uniqueRodneCisla = new LinkedHashSet<>();
        
        for( int personNumber = 1; personNumber <= POCET_OSOB; ) {
            female = gen.nextBoolean();
            rodneCislo = getRodneCislo( female );
            
            if( uniqueRodneCisla.add( rodneCislo ) ) {
                personNumber++;
            }
        }
        
        for( String uniqueRodneCislo : uniqueRodneCisla) {
            rodneCislaBuffer.add( uniqueRodneCislo );
            int month = Integer.parseInt( uniqueRodneCislo.substring( 2, 4 ) );
            female = month > 12;
            printInsertOsoba( uniqueRodneCislo, getRandomIdMesta(), getRandomStreet(), getRandomName( female ), getRandomSurname( female ) );
        }
    }
    
    private static int getRandomIdMesta() {
        return gen.nextInt( pocetMiest ) + 1;
    }
    
    private static String getRandomStreet() {
        return STREETS[ gen.nextInt( STREETS.length ) ];
    }
    
    private static String getRandomName( boolean female ) {
        String name;
        if( female ) {
            do {
                name = NAMES[ gen.nextInt( NAMES.length ) ];
            } while( name.substring( name.length() - 1 ).equals( "a" ) == false );
        }
        else {
            do {
                name = NAMES[ gen.nextInt( NAMES.length ) ];
            } while( name.substring( name.length() - 1 ).equals( "a" ) );
        }    
        return name;
    }
    
    private static String getRandomSurname( boolean female ) {
        
        String surname = SURNAMES[ gen.nextInt( SURNAMES.length ) ];
        if( female ) {
            String lastCharacter = surname.substring( surname.length() - 1 );
            if( lastCharacter.equals( "a" ) ) {
                return surname.substring( 0, surname.length() - 2 ) + "ová";
            }
            else if( lastCharacter.equals( "y" ) ) {
                return surname.substring( 0, surname.length() - 2 ) + "a";
            }
            else if( lastCharacter.equals( "ý" ) ) {
                return surname.substring( 0, surname.length() - 2 ) + "á";
            }
            else if( lastCharacter.equals( "ó" ) ) {
                return surname.substring( 0, surname.length() - 2 ) + "ová";
            }
            else if( lastCharacter.equals( "o" ) ) {
                return surname.substring( 0, surname.length() - 2 ) + "ová";
            }
            else {
                return surname + "ová";
            }
        }
        else {
            return surname;
        }
    }
    
    private static String getRodneCislo( boolean female ) {
        int num;
        
        return "" + getRandomDigit() + getRandomDigit()
                + ( ( num = gen.nextInt( 12 ) + 1 + ( female ? 50 : 0 ) ) < 10 ? ( "0" + num ) : num )
                + gen.nextInt( 4 ) + getRandomDigit()
                + getRandomDigit() + getRandomDigit() + getRandomDigit() + getRandomDigit();
    }
    
    private static void printInsertOsoba( String rodneCislo, int idMesta, String ulica, String meno, String priezvisko ) {
        System.out.println( 
                "INSERT INTO osoba(rod_cislo, id_mesta, ulica, meno, priezvisko) VALUES(" 
                        + rodneCislo 
                        + ", '" 
                        + idMesta 
                        + "', '" 
                        + ulica 
                        + "', '" 
                        + meno 
                        + "', '" 
                        + priezvisko 
                        + "');" 
        );
    }
    
    private static void generateTableCertifikacnaFirma() {
        System.out.println( "\n--### Generujem Certifikačné firmy ###\n" );
        
        String telephoneNumber;
        String email;
        int companyNumber;
        for( companyNumber = 1; companyNumber <= COMPANIES.length; companyNumber++ ) {
            telephoneNumber = gen.nextDouble() < 0.5 ? getRandomTelephoneNumber() : "NULL";
            email = gen.nextDouble() < 0.5 ? getRandomEmail() : "NULL";
            printInsertCertifikacnaFirma( companyNumber, getRandomIdMesta(), COMPANIES[ companyNumber - 1 ], getRandomICO(), telephoneNumber, email );
        }
        pocetCertifikacnychFiriem = companyNumber - 1;
    }
    
    private static void printInsertCertifikacnaFirma( int idFirmy, int idMesta, String nazovFirmy, int ico, String mobilneCislo, String email ) {
        System.out.println( 
                "INSERT INTO certifikacna_firma(id_firmy, id_mesta, nazov, ICO, tel_c, mail) VALUES(" 
                        + idFirmy 
                        + ", " 
                        + idMesta 
                        + ", '" 
                        + nazovFirmy 
                        + "', " 
                        + ico 
                        + ", " 
                        + getProperFormatForPrint( mobilneCislo )
                        + ", " 
                        + getProperFormatForPrint( email )
                        + ");" 
        );
    }
    
    /**
     * 
     * @param string
     * @return "NULL" if string is "NULL", "'string'" otherwise
     */
    private static String getProperFormatForPrint( String string ) {
        if( string.equals( "NULL" ) ) {
            return "NULL";
        }
        else {
            return "'" + string + "'";
        }
    }
    
    private static String getRandomEmail() {
        return getRandomName( false ) + "." + getRandomSurname( false ) + gen.nextInt(1000) +"@gmail.com";
    }
    
    private static String getRandomTelephoneNumber() {
        String telephoneNumber = "0";
        for( int i = 0; i < 9; i++ ) {
            telephoneNumber += getRandomDigit();
        }
        return telephoneNumber;  
    }
    
    private static int getRandomICO() {
        return gen.nextInt( 90000000 ) + 10000000;
    }
    
    
    
    private static void generateTableSkuska() {
        System.out.println( "\n--### Generujem Skúšky ###\n" );
        
        for( int examNumber = 1; examNumber <= POCET_SKUSOK; examNumber++ ) {
            printInsertSkuska( examNumber, getRandomExamName(), getRandomMaxNumberOfPointsForExam(), getRandomTimeInMinutesForExam(), 
                    getRandomPercentLimitForExam(), getRandomDocumentationForExam(), getRandomLiteratureForExam(), getRandomLanguageForExam() );
        }
    }
    
    private static String getRandomExamName() {
        return "Oracle " + ( gen.nextInt( POCET_VERZII_DB_DO - POCET_VERZII_DB_OD + 1 ) + POCET_VERZII_DB_OD ) 
                + examSubversions[ gen.nextInt( examSubversions.length - 1 ) ];
    }
    
    private static int getRandomMaxNumberOfPointsForExam() {
        return gen.nextInt( 101 ) + 100;
    }
    
    private static int getRandomTimeInMinutesForExam() {
        return gen.nextInt( 91 ) + 30;
    }
    
    private static int getRandomPercentLimitForExam() {
        return gen.nextInt( 41 ) + 50;
    }
    
    private static String getRandomWords( int number ) {
        String words = "";
        for( int i = 0; i < number; i++ ) {
            words += loremIpsumGenerator.randomLipsumWord() + " ";
        }
        return words.substring( 0, words.length() - 2);
    }
    
    private static String getRandomDocumentationForExam() {
        boolean isNull = gen.nextBoolean();
        if( isNull ) {
            return "NULL";
        }
        else {
            return getRandomWords( 12 );
        }
    }
    
    private static String getRandomLiteratureForExam() {
        boolean isNull = gen.nextBoolean();
        if( isNull ) {
            return "NULL";
        }
        else {
            return getRandomWords( 12 );
        }
    }
    
    private static String getRandomLanguageForExam() {
        return DOM_JAZYK[ gen.nextInt( DOM_JAZYK.length - 1 ) ];
    }
    
    private static void printInsertSkuska( int idSkusky, String nazovSkusky, int maxPocetBodov, int casVMinutach, int percentualnyLimit,
            String dokumentacia, String literatura, String domJazyk ) { 
        System.out.println( 
                "INSERT INTO skuska(id_skusky, nazov, max_pocet_bodov, cas_min, limit_percento, dokumentacia, literatura, jazyk) VALUES(" 
                        + idSkusky 
                        + ", " 
                        + getProperFormatForPrint( nazovSkusky )
                        + ", " 
                        + maxPocetBodov 
                        + ", " 
                        + casVMinutach 
                        + ", " 
                        + percentualnyLimit 
                        + ", " 
                        + getProperFormatForPrint( dokumentacia )
                        + ", " 
                        + getProperFormatForPrint( literatura )
                        + ", " 
                        + getProperFormatForPrint( domJazyk )
                        + ");" 
        );
    }
    
    private static void generateTableTema() {
        System.out.println( "\n--### Generujem Témy ###\n" );
        
        String topicName;
        for( int topicNumber = 1; topicNumber <= POCET_TEM; topicNumber++ ) {
            topicName = "Téma" + topicNumber;
            printInsertTema( topicNumber, topicName, getRandomDescriptionForTopic() );
        }
    }
    
    private static String getRandomDescription( int upToLines ) {
        LoremIpsum ipsum = new LoremIpsum( gen.nextInt( upToLines ) + 1 );
        String description = "";
        for( String line : ipsum.getLines() ) {
            description += line;
        }
        return description;
    }
    
    private static String getRandomDescriptionForTopic() {
        boolean isNull = gen.nextBoolean();
        if( isNull ) {
            return "NULL";
        }
        else {
            return getRandomDescription( 7 );
        }
    }
    
    private static void printInsertTema( int idTemy, String nazovTemy, String popisTemy ) {
        System.out.println( 
                "INSERT INTO tema(id_temy, nazov, popis) VALUES(" 
                        + idTemy 
                        + ", " 
                        + getProperFormatForPrint( nazovTemy )
                        + ", " 
                        + getProperFormatForPrint( popisTemy )
                        + ");" 
        );
    }
    
    private static void generateTableTypCertifikatu() {
        System.out.println( "\n--### Generujem Typy certifikátov ###\n" );
        
        String typeName;
        for( int topicNumber = 1; topicNumber <= POCET_TYPOV_CERTIFIKATOV; topicNumber++ ) {
            typeName = "Typ" + topicNumber;
            printInsertTypCertifikatu( topicNumber, typeName, getRandomPopisTypu() );
        }
    }
    
    private static String getRandomPopisTypu() {
        boolean isNull = gen.nextBoolean();
        if( isNull ) {
            return "NULL";
        }
        else {
            return getRandomDescription( 7 );
        }
    }
    
    
    
    private static void printInsertTypCertifikatu( int idTypu, String nazovTypu, String popisTypu ) {
        System.out.println( 
                "INSERT INTO typ_certifikatu(id_typu, nazov_typu, popis_typu) VALUES(" 
                        + idTypu 
                        + ", " 
                        + getProperFormatForPrint( nazovTypu )
                        + ", " 
                        + getProperFormatForPrint( popisTypu )
                        + ");" 
        );
    }
    
    private static void generateTableDbVerzia() {
        System.out.println( "\n--### Generujem DB verzie ###\n" );
        
        String dbVersionName;
        int numberOfSubversions = examSubversions.length;
        int counter = 1;
        for( int versionIndex = POCET_VERZII_DB_OD; versionIndex <= POCET_VERZII_DB_DO; versionIndex++ ) {
            for( int subversionIndex = 0; subversionIndex < numberOfSubversions; subversionIndex++ ) {
                dbVersionName = "" + versionIndex + examSubversions[ subversionIndex ];
                printInsertDbVerzia( counter++, dbVersionName);
            }
        }
        pocetDbVerzii = counter - 1;
    }
    
    private static void printInsertDbVerzia( int idVerzie, String nazovVerzie ) {
        System.out.println( 
                "INSERT INTO db_verzia(id_verzie, nazov) VALUES(" 
                        + idVerzie 
                        + ", " 
                        + getProperFormatForPrint( nazovVerzie )
                        + ");" 
        );
    }
    
    private static void generateTableCertLevel() {
        System.out.println( "\n--### Generujem Certifikačné levely ###\n" );
        
        String levelName;
        for( int levelNumber = 1; levelNumber <= POCET_UROVNI_CERTIFIKATOV; levelNumber++ ) {
            levelName = LETTERS[ levelNumber - 1 ];
            printInsertCertLevel( levelNumber, levelName );
        }

    }
    
    private static void printInsertCertLevel( int idLevelu, String nazovLevelu ) {
        System.out.println( 
                "INSERT INTO cert_level(id_levelu, nazov) VALUES(" 
                        + idLevelu 
                        + ", " 
                        + getProperFormatForPrint( nazovLevelu )
                        + ");" 
        );
    }
    
    private static void generateTableTypDodatocnejPodmienky() {
        System.out.println( "\n--### Generujem Typy dodatocnej podmienky ###\n" );
        
        String typeName;
        for( int typeNumber = 1; typeNumber <= POCET_TYPOV_DODATOCNYCH_PODMIENOK; typeNumber++ ) {
            typeName = "Typ" + typeNumber;
            printInsertTypDodatocnejPodmienky( typeNumber, typeName );
        }

    }
    
    private static void printInsertTypDodatocnejPodmienky( int idTypuPodmienky, String nazovTypuPodmienky ) {
        System.out.println( 
                "INSERT INTO typ_dodatocnej_podmienky(id_typu_podmienky, nazov) VALUES(" 
                        + idTypuPodmienky 
                        + ", " 
                        + getProperFormatForPrint( nazovTypuPodmienky )
                        + ");" 
        );
    }
    
    private static void generateTableCertifikat() {
        System.out.println( "\n--### Generujem Certifikaty ###\n" );
        
        ArraySet uniqueCertificates = new ArraySet();
        Object[] certificate;
        for( int certificateNumber = 1; certificateNumber <= POCET_CERTIFIKATOV; ) {

            certificate = new Object[]{ certificateNumber, getRandomIdLevelu(), getRandomIdTypuCertifikatu(), getRandomIdVerzie() };
            if( uniqueCertificates.insert( certificate ) ) {
                certificateNumber++;
            }

            printInsertCertifikat( certificateNumber, getRandomIdLevelu(), getRandomIdTypuCertifikatu(), getRandomIdVerzie(),
                    getRandomDobaPlatnostiCertifikatu() );
        }
        
        for( Object[] uniqueCertificate : uniqueCertificates) {
            printInsertCertifikat( (int)uniqueCertificate[ 0 ], (int)uniqueCertificate[ 1 ], (int)uniqueCertificate[ 2 ], (int)uniqueCertificate[ 3 ],
                    getRandomDobaPlatnostiCertifikatu() );
        }
    }
    
    private static int getRandomIdLevelu() {
        return gen.nextInt( POCET_UROVNI_CERTIFIKATOV ) + 1;
    }
    
    private static int getRandomIdVerzie() {
        return gen.nextInt( pocetDbVerzii ) + 1;
    }
    
    private static int getRandomIdTypuCertifikatu() {
        return gen.nextInt( POCET_TYPOV_CERTIFIKATOV ) + 1;
    }
    
    private static int getRandomDobaPlatnostiCertifikatu() {
        return gen.nextInt( 10 ) + 1;
    }
    
    private static void printInsertCertifikat( int idCertifikatu, int idLevelu, int idTypu, int idVerzie, int dobaPlatnosti ) {
        System.out.println( 
                "INSERT INTO certifikat(id_certifikatu, id_levelu, id_typu, id_verzie, doba_platnosti) VALUES(" 
                        + idCertifikatu 
                        + ", " 
                        + idLevelu 
                        + ", " 
                        + idTypu 
                        + ", " 
                        + idVerzie 
                        + ", " 
                        + dobaPlatnosti 
                        + ");" 
        );
    }
    
    private static void generateTablePonukaneSkusky() {
        System.out.println( "\n--### Generujem Ponúkané skúšky ###\n" );
        
        ArraySet unikatnePonukaneSkusky = new ArraySet();
        Object[] ponukanaSkuska;
        for( int certificateNumber = 1; certificateNumber <= POCET_PONUKANYCH_SKUSOK;  ) {
            ponukanaSkuska = new Object[]{ getRandomIdSkusky(), getRandomIdMesta(), getRandomIdFirmy(), getRandomDateString( 2015, 2015) };
            if( unikatnePonukaneSkusky.insert( ponukanaSkuska ) ) {
                certificateNumber++;
            }
        }
        
        for( Object[] unikatnaPonukanaSkuska : unikatnePonukaneSkusky) {
            datumyPonukaneSkuskyBuffer.add( (String)unikatnaPonukanaSkuska[ 3 ] );
            printInsertPonukaneSkusky( (int)unikatnaPonukanaSkuska[ 0 ], (int)unikatnaPonukanaSkuska[ 1 ], (int)unikatnaPonukanaSkuska[ 2 ],
                    (String)unikatnaPonukanaSkuska[ 3 ], getRandomUmiestenieFirmy(), getRandomNumber( 10, 50 ), getRandomNumber( 50, 500 ) );
        }
    }
    
    private static int getRandomIdSkusky() {
        return gen.nextInt( POCET_SKUSOK ) + 1;
    }
    
    private static int getRandomIdFirmy() {
        return gen.nextInt( pocetCertifikacnychFiriem ) + 1;
    }
    
    // TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss')
    private static String getRandomDateString( int fromYear, int toYear ) { //inclusive, inclusive
        String year = String.format( "%04d", ( toYear - fromYear ) == 0 ? fromYear : ( gen.nextInt( toYear - fromYear ) + fromYear ) );
        String month = String.format( "%02d",gen.nextInt( 12 ) + 1 );
        String day = String.format( "%02d",gen.nextInt( 28 ) + 1 );
        String hour = String.format( "%02d",gen.nextInt( 24 ) );
        String minute = String.format( "%02d",gen.nextInt( 60 ) );
        String second = String.format( "%02d",gen.nextInt( 60 ) );
        
        return String.format( "TO_DATE('%s/%s/%s %s:%s:%s', 'yyyy/mm/dd hh24:mi:ss')",
                year, month, day, hour, minute, second );
    }
    
    private static String getRandomUmiestenieFirmy() {
        return "Poschodie: " + ( gen.nextInt( 4 ) + 1 ) + " Číslo miestnosti: " + ( gen.nextInt( 30 ) + 1 );
    }
    
    private static int getRandomNumber( int from, int to) { //inclusive, inclusive
        return gen.nextInt( to - from ) + from;
    }
        
    private static void printInsertPonukaneSkusky( int idSkusky, int idMesta, int idFirmy, String datumSkusky, String dodatocneUmiestnenie,
            int kapacita, int cena ) {
        System.out.println( 
                "INSERT INTO ponukane_skusky(id_skusky, id_mesta, id_firmy, datum, dodatocne_umiestnenie, kapacita, cena) VALUES(" 
                        + idSkusky 
                        + ", " 
                        + idMesta 
                        + ", " 
                        + idFirmy 
                        + ", " 
                        + getProperFormatForPrint( datumSkusky )
                        + ", " 
                        + getProperFormatForPrint( dodatocneUmiestnenie ) 
                        + ", " 
                        + kapacita 
                        + ", " 
                        + cena 
                        + ");" 
        );
    }
    
    private static void generateTableRegistraciaNaSkusku() {
        System.out.println( "\n--### Generujem Registrácie na skúšky ###\n" );
        
        ArraySet unikatneRegistracieNaSkusku = new ArraySet();
        Object[] registrovanaSkuska;
        
        for( int registrationNumber = 1; registrationNumber <= POCET_REGISTRACII_NA_SKUSKU;  ) {
            registrovanaSkuska = new Object[]{ getRandomRodneCisloFromBuffer(), getRandomIdMesta(), getRandomIdFirmy(), getRandomIdFirmy(),
                    getRandomDatumPonukanychSkusokFromBuffer() };
            if( unikatneRegistracieNaSkusku.insert( registrovanaSkuska ) ) {
                registrationNumber++;
            }
            printInsertRegistraciaNaSkusku( getRandomRodneCisloFromBuffer(), getRandomIdMesta(), getRandomIdFirmy(), getRandomIdFirmy(),
                    getRandomDatumPonukanychSkusokFromBuffer(), getRandomDateString( 2014, 2014), "NULL", "NULL", "NULL", "NULL" );
        }
        
        for( Object[] unikatnaRegistraciaNaSkusku : unikatneRegistracieNaSkusku) {
            printInsertRegistraciaNaSkusku( (String)unikatnaRegistraciaNaSkusku[ 0 ], (int)unikatnaRegistraciaNaSkusku[ 1 ],
                    (int)unikatnaRegistraciaNaSkusku[ 2 ], (int)unikatnaRegistraciaNaSkusku[ 3 ],
                    (String)unikatnaRegistraciaNaSkusku[ 4 ], getRandomDateString( 2014, 2014), "NULL", "NULL", "NULL", "NULL" );
        }
    }
    
    private static String getRandomRodneCisloFromBuffer() {
        return rodneCislaBuffer.get( gen.nextInt( rodneCislaBuffer.size() ) );
    }
    
    private static String getRandomDatumPonukanychSkusokFromBuffer() {
        return datumyPonukaneSkuskyBuffer.get( gen.nextInt( datumyPonukaneSkuskyBuffer.size() ) );
    }
    
    private static void printInsertRegistraciaNaSkusku( String rodneCislo, int idMesta, int idFirmy, int idSkusky, String datumSkusky,
            String datumRegistracie, String datumZrusenia, String datumZaplatenia, String uctovanaCena, String pocetZiskanychBodov ) {
        System.out.println( 
                "INSERT INTO registracia_na_skusku(rod_cislo, id_mesta, id_firmy, id_skusky, datum, datum_registracie,"
                        + " datum_zrusenia, datum_zaplatenia, uctovana_cena, pocet_ziskanych_bodov) VALUES(" 
                        + getProperFormatForPrint( rodneCislo ) 
                        + ", " 
                        + idMesta 
                        + ", " 
                        + idFirmy 
                        + ", " 
                        + idSkusky
                        + ", " 
                        + getProperFormatForPrint( datumSkusky ) 
                        + ", " 
                        + getProperFormatForPrint( datumRegistracie ) 
                        + ", " 
                        + getProperFormatForPrint( datumZrusenia ) 
                        + ", " 
                        + getProperFormatForPrint( datumZaplatenia ) 
                        + ", "
                        + getProperFormatForPrint( uctovanaCena )
                        + ", "
                        + getProperFormatForPrint( pocetZiskanychBodov )
                        + ");" 
        );
    }
    
    private static void generateTableVydanyCertifikat() {
        System.out.println( "\n--### Generujem Vydané certifikáty ###\n" );
        
        ArraySet unikatneVydaneCertifikaty = new ArraySet();
        Object[] vydanyCertifikat;
        
        for( int certificateNumber = 1; certificateNumber <= POCET_VYDANYCH_CERTIFIKATOV;  ) {
            vydanyCertifikat = new Object[]{ getRandomIdTypuCertifikatu(), getRandomRodneCisloFromBuffer() };
            if( unikatneVydaneCertifikaty.insert( vydanyCertifikat ) ) {
                certificateNumber++;
            }
            printInsertVydanyCertifikat( getRandomIdTypuCertifikatu(), getRandomRodneCisloFromBuffer(),
                    getRandomDateString( 2005, 2013), getRandomDateString( 2014, 2018 ) );
        }
        
        for( Object[] unikatnyVydanyCertifikat : unikatneVydaneCertifikaty ) {
            printInsertVydanyCertifikat( (int)unikatnyVydanyCertifikat[ 0 ], (String)unikatnyVydanyCertifikat[ 1 ],
                    getRandomDateString( 2005, 2013), getRandomDateString( 2014, 2018 ) );
        }
    }
    
    private static void printInsertVydanyCertifikat( int idCertifikatu, String rodneCislo, String datumZiskania, String platnostDo ) {
        System.out.println( 
                "INSERT INTO vydany_certifikat(id_certifikatu, rod_cislo, datum_ziskania, platnost_do) VALUES(" 
                        + idCertifikatu
                        + ", " 
                        + getProperFormatForPrint( rodneCislo ) 
                        + ", " 
                        + getProperFormatForPrint( datumZiskania ) 
                        + ", " 
                        + getProperFormatForPrint( platnostDo ) 
                        + ");" 
        );
    }
    
    private static void generateTableOkruhTem() {
        System.out.println( "\n--### Generujem Okruh tém ###\n" );
        
        ArraySet unikatneOkruhyTem = new ArraySet();
        Object[] okruhTem;
        
        for( int domainNumber = 1; domainNumber <= POCET_OKRUHOV_TEM;  ) {
            okruhTem = new Object[]{ getRandomIdSkusky(), getRandomIdTemy() };
            if( unikatneOkruhyTem.insert( okruhTem ) ) {
                domainNumber++;
            }
        }
        
        for( Object[] unikatnyOkruhTem : unikatneOkruhyTem ) {
            printInsertOkruhTem( (int)unikatnyOkruhTem[ 0 ], (int)unikatnyOkruhTem[ 1 ] );
        }
    }
    
    private static int getRandomIdTemy() {
        return gen.nextInt( POCET_TEM ) + 1;
    }
    
    private static void printInsertOkruhTem( int idSkusky, int idTemy ) {
        System.out.println( 
                "INSERT INTO okruh_tem(id_skusky, id_temy) VALUES(" 
                        + idSkusky
                        + ", " 
                        + idTemy
                        + ");" 
        );
    }
    
    private static void generateTablePredchadzajuceSkusky() {
        System.out.println( "\n--### Generujem Predchadzajúce skúšky ###\n" );
        
        ArraySet unikatnePredchadzajuceSkusky = new ArraySet();
        Object[] predchadzajucaSkuska;
        
        for( int precedentExamNumber = 1; precedentExamNumber <= POCET_PREDCHADZAJUCICH_SKUSOK;  ) {
            int firstId;
            int secondId;
            do {                
                firstId = getRandomIdSkusky();
                secondId = getRandomIdSkusky();
            }
            while( firstId == secondId );
            
            predchadzajucaSkuska = new Object[]{ firstId, secondId };
            if( unikatnePredchadzajuceSkusky.insert( predchadzajucaSkuska ) ) {
                precedentExamNumber++;
            }
        }
        
        for( Object[] unikatnyOkruhTem : unikatnePredchadzajuceSkusky ) {
            printInsertPredchadzajuceSkusky( (int)unikatnyOkruhTem[ 0 ], (int)unikatnyOkruhTem[ 1 ] );
        }
    }

    private static void printInsertPredchadzajuceSkusky( int idSkusky, int idPredchadzajucej ) {
        System.out.println( 
                "INSERT INTO predchadzajuce_skusky(id_skusky, id_predchadzajucej) VALUES(" 
                        + idSkusky
                        + ", " 
                        + idPredchadzajucej
                        + ");" 
        );
    }
    
    private static void generateTableAlternativySkusky() {
        System.out.println( "\n--### Generujem Alternatívy skúšky ###\n" );
        
        ArraySet unikatneAlternativySkusky = new ArraySet();
        Object[] alternatnativaSkusky;
        
        for( int alternateExamNumber = 1; alternateExamNumber <= POCET_ALTERNATIV_SKUSOK;  ) {
            
            alternatnativaSkusky = new Object[]{ getRandomIdCertifikatu(), getRandomIdSkusky() };
            if( unikatneAlternativySkusky.insert( alternatnativaSkusky ) ) {
                alternateExamNumber++;
            }
        }
        
        for( Object[] unikatnaAlternativaSkusky : unikatneAlternativySkusky ) {
            printInsertAlternativySkusky( (int)unikatnaAlternativaSkusky[ 0 ], (int)unikatnaAlternativaSkusky[ 1 ] );
        }
    }
    
    private static int getRandomIdCertifikatu() {
        return gen.nextInt( POCET_CERTIFIKATOV ) + 1;
    }

    private static void printInsertAlternativySkusky( int idCertifikatu, int idSkusky ) {
        System.out.println( 
                "INSERT INTO alternativy_skusky(id_certifikatu, id_skusky) VALUES(" 
                        + idCertifikatu
                        + ", " 
                        + idSkusky
                        + ");" 
        );
    }
    
    private static void generateTablePrerekvizity() {
        System.out.println( "\n--### Generujem Prerekvizity ###\n" );
        
        ArraySet unikatnePrerekvizity = new ArraySet();
        Object[] prerekvizita;
        
        for( int prerequestNumber = 1; prerequestNumber <= POCET_PREREKVIZIT;  ) {
            int firstId;
            int secondId;
            do {                
                firstId = getRandomIdCertifikatu();
                secondId = getRandomIdCertifikatu();
            }
            while( firstId == secondId );
            
            prerekvizita = new Object[]{ firstId, secondId };
            if( unikatnePrerekvizity.insert( prerekvizita ) ) {
                prerequestNumber++;
            }
        }
        
        for( Object[] unikatnaPrerekvizita : unikatnePrerekvizity ) {
            printInsertPrerekvizity( (int)unikatnaPrerekvizita[ 0 ], (int)unikatnaPrerekvizita[ 1 ] );
        }
    }
    
    private static void printInsertPrerekvizity( int idCertifikatu, int idPredchodcu ) {
        System.out.println( 
                "INSERT INTO prerekvizity(id_certifikatu, id_predchodcu) VALUES(" 
                        + idCertifikatu
                        + ", " 
                        + idPredchodcu
                        + ");" 
        );
    }
    
    private static void generateTableDodatocnePodmienky() {
        System.out.println( "\n--### Generujem Dodatočné podmienky ###\n" );
        
        ArraySet unikatneDodatocnePodmienky = new ArraySet();
        Object[] dodatocnaPodmienka;
        
        for( int additionalConditionNumber = 1; additionalConditionNumber <= POCET_DODATOCNYCH_PODMIENOK;  ) {
            dodatocnaPodmienka = new Object[]{ getRandomIdCertifikatu(), getRandomIdTypuPodmienky() };
            if( unikatneDodatocnePodmienky.insert( dodatocnaPodmienka ) ) {
                additionalConditionNumber++;
            }
        }
        
        for( Object[] unikatnaDodatocnaPodmienka : unikatneDodatocnePodmienky ) {
            dodatocnePodmienkyBuffer.insert( unikatnaDodatocnaPodmienka );
            printInsertDodatocnePodmienky( (int)unikatnaDodatocnaPodmienka[ 0 ], (int)unikatnaDodatocnaPodmienka[ 1 ] );
        }
    }
    
    private static int getRandomIdTypuPodmienky() {
        return gen.nextInt( POCET_DODATOCNYCH_PODMIENOK ) + 1;
    }
    
    private static void printInsertDodatocnePodmienky( int idCertifikatu, int idTypuPodmienky ) {
        System.out.println( 
                "INSERT INTO dodatocne_podmienky(id_certifikatu, id_typu_podmienky) VALUES(" 
                        + idCertifikatu
                        + ", " 
                        + idTypuPodmienky
                        + ");" 
        );
    }
    
    private static void generateTableSplnenieDodatocnejSkusky() {
        System.out.println( "\n--### Generujem Splnenia dodatočných skúšok ###\n" );
        
        ArraySet unikatneSplneniaDodatocnejSkusky = new ArraySet();
        Object[] splnenieDodatocnejSkusky;
        Object[] dodatocnaPodmienka;
        
        for( int additionalConditionNumber = 1; additionalConditionNumber <= POCET_SPLNENYCH_DODATOCNYCH_PODMIENOK;  ) {
            dodatocnaPodmienka = getRandomDodatocnuPodmienkuFromBuffer();
            splnenieDodatocnejSkusky = new Object[]{ (int)dodatocnaPodmienka[ 0 ], (int)dodatocnaPodmienka[ 1 ], getRandomRodneCisloFromBuffer() };
            if( unikatneSplneniaDodatocnejSkusky.insert( splnenieDodatocnejSkusky ) ) {
                additionalConditionNumber++;
            }
        }
        
        for( Object[] unikatneSplnenieDodatocnejSkusky : unikatneSplneniaDodatocnejSkusky ) {
            printInsertSplnenieDodatocnejSkusky( (int)unikatneSplnenieDodatocnejSkusky[ 0 ], (int)unikatneSplnenieDodatocnejSkusky[ 1 ],
                    (String)unikatneSplnenieDodatocnejSkusky[ 2 ] );
        }
    }
    
     private static Object[] getRandomDodatocnuPodmienkuFromBuffer() {
        return dodatocnePodmienkyBuffer.get( gen.nextInt( POCET_DODATOCNYCH_PODMIENOK ) );
    }
    
    private static void printInsertSplnenieDodatocnejSkusky( int idCertifikatu, int idTypuPodmienky, String rodneCislo ) {
        System.out.println( 
                "INSERT INTO splnenie_dodatocnej_skusky(id_certifikatu, id_typu_podmienky, rod_cislo) VALUES(" 
                        + idCertifikatu
                        + ", " 
                        + idTypuPodmienky
                        + ", " 
                        + getProperFormatForPrint( rodneCislo )
                        + ");" 
        );
    }
}
