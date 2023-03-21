# RbaTests
Selenium Test
Za izradu Selenium testova treba pripremiti radnu okolinu koja uključuje:
-	Java JDK 1.8.261 (ili sl)
-	Selenium 4
-	TestNG
-	Chrome Browser
-	Chrome driver

Od Kandidata se očekuje da:
-	kreirati novi projekt
-	projekt stavi na git
-	koristiti isključivo Selenium, Javascript Executor nije dozvoljen
-	koristi isključivo Javu, jer je to okolina koju koristimo u Banci
-	koristi testNG za pokretanje testa
Test
- url: www.rba.hr
- odabrati Tečajni kalkulator
- simulirati kupnju funti i prodaju dolara, te za svaku transakciju pročitati tečaj i konačni iznos
npr kupnja GBP: tečaj je 1 EUR = 0.91 GBP, za 40 EUR dobijem 36.29 GBP

Postman Testovi
1 Basic REST
- napraviti gornji primjer iz Seleniuma korištenjem REST poziva

2 Wikipedia – osnovna pretraga, potraži naziv 'Raiffeisen' i vrati prvih 10 rezultata u JSON objektu
Provjeri da je :
- response code 200
- response time manji od 5 sekundi
- response sadrži objekt 'pages'
- neka od stranica sadrži key 'title' i vrijednost 'Raiffeisen Bank International'


JAVA

Priprema
- Koristiti Java JDK 1.8.261 (ili sl), sve ostalo po želji kandidata
- Napravi program koji JSON sa rezultatima sa Wikipedije pretvara u validni XML.
