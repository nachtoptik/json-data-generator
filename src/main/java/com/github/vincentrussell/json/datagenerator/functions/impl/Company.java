package com.github.vincentrussell.json.datagenerator.functions.impl;

import com.github.vincentrussell.json.datagenerator.functions.Function;
import com.github.vincentrussell.json.datagenerator.functions.FunctionInvocation;

@Function(name = "company")
public class Company {
    private static String[] COMPANIES = new String[]{"Accel", "Accidency", "Accruex", "Accufarm", "Accupharm", "Accuprint", "Accusage", "Acium", "Aclima", "Acrodance", "Acruex", "Acumentor", "Acusage", "Adornica", "Aeora", "Affluex", "Amril", "Amtap", "Amtas", "Anacho", "Anarco", "Andershun", "Andryx", "Animalia", "Anivet", "Anixang", "Anocha", "Apex", "Apexia", "Apextri", "Applica", "Applidec", "Applideck", "Aquacine", "Aquafire", "Aquamate", "Aquasseur", "Aquasure", "Aquazure", "Aquoavo", "Architax", "Arctiq", "Artiq", "Artworlds", "Asimiline", "Assistia", "Assistix", "Assitia", "Assurity", "Atgen", "Atomica", "Austech", "Austex", "Autograte", "Automon", "Avenetro", "Avit", "Balooba", "Baluba", "Barkarama", "Beadzza", "Bedder", "Bedlam", "Besto", "Bezal", "Bicol", "Biflex", "Billmed", "Biohab", "Biolive", "Biospan", "Biotica", "Bisba", "Bitendrex", "Bitrex", "Bittor", "Bizmatic", "Blanet", "Bleeko", "Bleendot", "Bluegrain", "Bluplanet", "Blurrybus", "Boilcat", "Boilicon", "Boink", "Bolax", "Bostonic", "Bovis", "Brainclip", "Brainquil", "Bristo", "Bugsall", "Bulljuice", "Bullzone", "Bunga", "Buzzmaker", "Buzzness", "Buzzopia", "Buzzworks", "Bytrex", "Cablam", "Calcu", "Calcula", "Callflex", "Candecor", "Canopoly", "Capscreen", "Caxt", "Cedward", "Cemention", "Centice", "Centree", "Centregy", "Centrexin", "Centuria", "Ceprene", "Chillium", "Chorizon", "Cinaster", "Cincyr", "Cinesanct", "Cipromox", "Circum", "Coash", "Codact", "Codax", "Cofine", "Cogentry", "Cognicode", "Colaire", "Collaire", "Columella", "Combogen", "Combogene", "Combot", "Comcubine", "Comcur", "Comdom", "Comfirm", "Comstar", "Comstruct", "Comtent", "Comtest", "Comtext", "Comtour", "Comtours", "Comtract", "Comtrail", "Comtrak", "Comtrek", "Comvene", "Comverges", "Comvex", "Comvey", "Comveyer", "Comveyor", "Comvoy", "Concility", "Conferia", "Confrenzy", "Conjurica", "Corecom", "Corepan", "Coriander", "Cormoran", "Corporana", "Corpulse", "Cosmetex", "Cosmosis", "Cowtown", "Crustatia", "Cubicide", "Cubix", "Cuizine", "Cujo", "Cyclonica", "Cytrak", "Cytrek", "Cytrex", "Dadabase", "Daido", "Daisu", "Dancerity", "Dancity", "Danja", "Darwinium", "Datacator", "Datagen", "Datagene", "Daycore", "Decratex", "Deepends", "Delphide", "Deminimum", "Dentrex", "Deviltoe", "Digial", "Digifad", "Digigen", "Digigene", "Diginetic", "Digiprint", "Digique", "Digirang", "Digitalus", "Dognosis", "Dognost", "Dogspa", "Dogtown", "Dragbot", "Dreamia", "Duflex", "Duoflex", "Dymi", "Dyno", "Earbang", "Eargo", "Earthmark", "Earthplex", "Earthpure", "Earthwax", "Earwax", "Ebidco", "Eclipsent", "Eclipto", "Ecolight", "Ecosys", "Ecrater", "Ecratic", "Ecraze", "Ecstasia", "Edecine", "Egypto", "Electonic", "Elemantra", "Elentrix", "Elita", "Elpro", "Emergent", "Emoltra", "Empirica", "Emtrac", "Emtrak", "Enaut", "Endicil", "Endipin", "Endipine", "Enerforce", "Enersave", "Enersol", "Enervate", "Enjola", "Enomen", "Enormo", "Enquility", "Entality", "Enthaze", "Entogrok", "Entroflex", "Entropix", "Envire", "Eplode", "Eplosion", "Equicom", "Equitax", "Equitox", "Ersum", "Escenta", "Eschoir", "Essensia", "Eternis", "Euron", "Eventage", "Eventex", "Eventix", "Everest", "Evidends", "Ewaves", "Eweville", "Exerta", "Exiand", "Exoblue", "Exodoc", "Exoplode", "Exosis", "Exospace", "Exospeed", "Exostream", "Exoswitch", "Exotechno", "Exoteric", "Exovent", "Exozent", "Exposa", "Extragen", "Extragene", "Extrawear", "Extremo", "Extro", "Eyeris", "Eyewax", "Ezent", "Ezentia", "Fanfare", "Fangold", "Farmage", "Farmex", "Fiberox", "Fibrodyne", "Filodyne", "Firewax", "Fishland", "Fitcore", "Fleetmix", "Flexigen", "Flotonic", "Flum", "Flumbo", "Flyboyz", "Fortean", "Fossiel", "Franscene", "Freakin", "Frenex", "Frolix", "Frosnex", "Fuelton", "Fuelworks", "Furnafix", "Furnigeer", "Furnitech", "Futuris", "Futurity", "Futurize", "Gadtron", "Gallaxia", "Gaptec", "Gazak", "Geeketron", "Geekfarm", "Geekko", "Geekmosis", "Geeknet", "Geekol", "Geekola", "Geekology", "Geekosis", "Geekular", "Geekus", "Geekwagon", "Geeky", "Genekom", "Genesynk", "Genmex", "Genmom", "Genmy", "Geofarm", "Geoform", "Geoforma", "Geologix", "Geostele", "Gink", "Ginkle", "Ginkogene", "Glasstep", "Gleamink", "Globoil", "Gluid", "Glukgluk", "Gogol", "Goko", "Golistic", "Gology", "Gonkle", "Gorganic", "Gracker", "Grainspot", "Greeker", "Grok", "Gronk", "Grupoli", "Gushkool", "Gynk", "Gynko", "Hairport", "Halap", "Handshake", "Harmoney", "Hatology", "Hawkster", "Helixo", "Hinway", "Hivedom", "Homelux", "Hometown", "Honotron", "Hopeli", "Hotcakes", "Housedown", "Hydrocom", "Hyplex", "Icology", "Idealis", "Idego", "Idetica", "Illumity", "Imageflow", "Imaginart", "Imant", "Imkan", "Immunics", "Imperium", "Incubus", "Indexia", "Inear", "Infotrips", "Injoy", "Inquala", "Inrt", "Insectus", "Insource", "Insuresys", "Insurety", "Insurity", "Insuron", "Interfind", "Intergeek", "Interloo", "Interodeo", "Intradisk", "Intrawear", "Inventure", "Iplax", "Irack", "Isbol", "Isis", "Isodrive", "Isologia", "Isologica", "Isologics", "Isologix", "Isonus", "Isoplex", "Isopop", "Isosphere", "Isostream", "Isosure", "Isoswitch", "Isoternia", "Isotrack", "Isotronic", "Izzby", "Jamnation", "Jasper", "Jetsilk", "Jimbies", "Joviold", "Jumpstack", "Junipoor", "Kage", "Kaggle", "Kangle", "Katakana", "Keeg", "Keengen", "Kegular", "Kenegy", "Kengen", "Kidgrease", "Kidstock", "Kiggle", "Kindaloo", "Kinetica", "Kineticut", "Kiosk", "Klugger", "Kneedles", "Knowlysis", "Koffee", "Kog", "Kongene", "Kongle", "Konnect", "Koogle", "Kozgene", "Krag", "Kraggle", "Krog", "Kyagoro", "Kyaguru", "Letpro", "Lexicondo", "Limage", "Limozen", "Lingoage", "Liquicom", "Liquidoc", "Locazone", "Lotron", "Lovepad", "Ludak", "Lumbrex", "Lunchpad", "Lunchpod", "Luxuria", "Lyria", "Lyrichord", "Macronaut", "Magmina", "Magnafone", "Magneato", "Magnemo", "Magnina", "Maineland", "Makingway", "Malathion", "Mangelica", "Manglo", "Mantrix", "Mantro", "Manufact", "Marketoid", "Maroptic", "Marqet", "Martgo", "Marvane", "Matrixity", "Maxemia", "Maximind", "Mazuda", "Medalert", "Medcom", "Medesign", "Medicroix", "Medifax", "Mediot", "Medmex", "Megall", "Melbacor", "Memora", "Menbrain", "Metroz", "Microluxe", "Micronaut", "Minga", "Miraclis", "Miracula", "Mitroc", "Mixers", "Mobildata", "Moltonic", "Momentia", "Mondicil", "Moreganic", "Motovate", "Multiflex", "Multron", "Musanpoly", "Musaphics", "Musix", "Myopium", "Namebox", "Namegen", "Navir", "Naxdis", "Nebulean", "Neocent", "Neptide", "Netagy", "Netbook", "Neteria", "Netility", "Netplax", "Netplode", "Netropic", "Netur", "Neurocell", "Newcube", "Nexgene", "Nikuda", "Nimon", "Nipaz", "Niquent", "Nitracyr", "Nixelt", "Noralex", "Norali", "Norsul", "Norsup", "Nspire", "Nurali", "Nurplex", "Nutralab", "Oatfarm", "Obliq", "Obones", "Oceanica", "Octocore", "Ohmnet", "Olucore", "Olympix", "Omatom", "Omnigog", "Ontagene", "Ontality", "Opportech", "Opticall", "Opticom", "Opticon", "Optique", "Optyk", "Orbalix", "Orbaxter", "Orbean", "Orbiflex", "Orbin", "Orbixtar", "Orboid", "Organica", "Oronoko", "Otherside", "Otherway", "Oulu", "Ovation", "Overfork", "Overplex", "Ovium", "Ovolo", "Ozean", "Panzent", "Papricut", "Paprikut", "Paragonia", "Parcoe", "Parleynet", "Pasturia", "Pathways", "Pawnagra", "Pearlesex", "Pearlessa", "Perkle", "Permadyne", "Peticular", "Petigems", "Pharmacon", "Pharmex", "Pheast", "Pholio", "Phormula", "Photobin", "Phuel", "Pigzart", "Pivitol", "Plasmos", "Plasmosis", "Plasmox", "Plasto", "Playce", "Plexia", "Plutorque", "Podunk", "Polarax", "Polaria", "Polarium", "Poochies", "Portaline", "Portalis", "Portica", "Portico", "Poshome", "Powernet", "Premiant", "Primordia", "Printspan", "Prismatic", "Proflex", "Progenex", "Prosely", "Prosure", "Protodyne", "Providco", "Prowaste", "Proxsoft", "Pulze", "Puria", "Pushcart", "Pyramax", "Pyrami", "Pyramia", "Pyramis", "Qaboos", "Qiao", "Qimonk", "Qnekt", "Qot", "Quadeebo", "Quailcom", "Qualitern", "Qualitex", "Quantalia", "Quantasis", "Quarex", "Quarmony", "Quarx", "Quilch", "Quility", "Quilk", "Quilm", "Quiltigen", "Quinex", "Quintity", "Quizka", "Quizmo", "Quonata", "Quonk", "Quordate", "Quotezart", "Radiantix", "Rameon", "Ramjob", "Realmo", "Realysis", "Recognia", "Recrisys", "Recritube", "Remold", "Remotion", "Renovize", "Repetwire", "Retrack", "Retrotex", "Reversus", "Roboid", "Rockabye", "Rocklogic", "Rockyard", "Rodemco", "Rodeocean", "Rodeology", "Rodeomad", "Ronbert", "Ronelon", "Rooforia", "Rotodyne", "Roughies", "Rubadub", "Rugstars", "Sarasonic", "Satiance", "Savvy", "Scentric", "Scenty", "Schoolio", "Sealoud", "Securia", "Senmao", "Senmei", "Sensate", "Sentia", "Sequitur", "Shadease", "Shepard", "Shopabout", "Signidyne", "Signity", "Silodyne", "Singavera", "Skinserve", "Skybold", "Skyplex", "Slambda", "Slax", "Slofast", "Sloganaut", "Slumberia", "Snacktion", "Snips", "Snorus", "Snowpoke", "Softmicro", "Solaren", "Solgan", "Songbird", "Songlines", "Sonique", "Soprano", "Spacewax", "Speedbolt", "Spherix", "Splinx", "Sportan", "Springbee", "Squish", "Steelfab", "Steeltab", "Stelaecor", "Stockpost", "Straloy", "Stralum", "Strezzo", "Strozen", "Stucco", "Sulfax", "Sultrax", "Sultraxin", "Sunclipse", "Supportal", "Supremia", "Surelogic", "Suremax", "Sureplex", "Suretech", "Sustenza", "Sybixtex", "Synkgen", "Syntac", "Talae", "Talendula", "Talkalot", "Talkola", "Tasmania", "Techade", "Techmania", "Techtrix", "Telepark", "Telequiet", "Tellifly", "Telpod", "Temorak", "Teraprene", "Terascape", "Terragen", "Terrago", "Terrasys", "Tersanki", "Tetak", "Tetratrex", "Thredz", "Tingles", "Tourmania", "Toyletry", "Translink", "Trasola", "Tri@Tribalog", "Tripsch", "Trollery", "Tropoli", "Tropolis", "Tsunamia", "Tubalum", "Tubesys", "Turnabout", "Turnling", "Twiggery", "Twiist", "Typhonica", "Uberlux", "Ultrasure", "Ultrimax", "Uncorp", "Undertap", "Uneeq", "Uni", "Unia", "Unisure", "Uniworld", "Unq", "Updat", "Uplinx", "Urbanshee", "Utara", "Utarian", "Uxmox", "Valpreal", "Valreda", "Vantage", "Velity", "Velos", "Vendblend", "Venoflex", "Veraq", "Verbus", "Vertide", "Verton", "Vetron", "Viagrand", "Viagreat", "Viasia", "Vicon", "Vidto", "Vinch", "Viocular", "Virva", "Virxo", "Visalia", "Visualix", "Vitricomp", "Vixo", "Voipa", "Volax", "Voratak", "Vortexaco", "Vurbo", "Waab", "Waretel", "Waterbaby", "Wazzu", "Webiotic", "Wrapture", "Xanide", "Xelegyl", "Xerex", "Xeronk", "Xiix", "Xinware", "Xixan", "Xleen", "Xoggle", "Xplor", "Xsports", "Xth", "Xumonk", "Xurban", "Xylar", "Xymonk", "Xyqag", "Yogasm", "Yurture", "Zaggle", "Zaggles", "Zaj", "Zanilla", "Zanity", "Zanymax", "Zaphire", "Zappix", "Zaya", "Zboo", "Zeam", "Zedalis", "Zenco", "Zenolux", "Zensor", "Zensure", "Zensus", "Zenthall", "Zentia", "Zentility", "Zentime", "Zentix", "Zentry", "Zentury", "Zepitope", "Zerbina", "Zerology", "Zialactic", "Zidant", "Zidox", "Ziggles", "Zilch", "Zilencio", "Zilidium", "Zilla", "Zillacom", "Zillacon", "Zillactic", "Zilladyne", "Zillan", "Zillanet", "Zillar", "Zillatide", "Zillidium", "Zilodyne", "Zilphur", "Zinca", "Ziore", "Zipak", "Zisis", "Zizzle", "Zoarere", "Zogak", "Zoid", "Zoinage", "Zolar", "Zolarex", "Zolarity", "Zolavo", "Zomboid", "Zork", "Zorromop", "Zosis", "Zounds", "Zoxy", "Zuvy", "Zyple", "Zytrac", "Zytrax", "Zytrek", "Zytrex"};

    @FunctionInvocation
    public String company() {
        return FunctionUtils.getRandomElementFromArray(COMPANIES);
    }
}
