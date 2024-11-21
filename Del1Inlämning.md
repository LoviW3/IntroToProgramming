Java vs Python
En stor skillnad mellan dessa två programmerings språk är att i java måste man ange typen av data som variabeln ska arbeta med innan programmet körs.
Python läser i stället av vilken typ av data som ska användas först när programmet körs. 
Detta leder dock till att python utför program lite långsammare eftersom den måste förstå vilken sorts data som den ska arbeta med i realtid. 
En likhet som jag kunde hitta mellan java och python är att de båda är plattformsoberoendespråk, vilket betyder att båda dessa programmeringsspråk fungerar bra på flera olika plattformar utan större problem.

Objekt
Objekt används när man vill skapa flera olika instanser av en klass, eftersom varje objekt innehåller en instans så är dem väldigt användbara när man vill spara information om flera personer/saker samtidigt. 
Konstruktor
En konstruktor används för att ge ett objekt ett värde när objektet skapas. Dessa kodblock skickar inte ut någonting utan finns bara till för att initiera tillståndet som objektet ska ha.
Attribut
Variabler som beskriver den lagrade data i ett objekt, låt oss säga att du har ett biblioteks program som håller reda på vilka böcker som är utlånade. 
Attributen som skulle kunna finnas i varje objekt i detta program skulle kunna vara: bokens namn, författaren och om den är utlånad eller inte. 

Versionshantering
Versionshanteringar finns till för att man ska kunna hålla reda på vad som har ändrats i ett program så att man vid ett senare tillfälle kan återskapa en tidigare version av ett program eller kodfil.
Detta är användbart eftersom det ger kodare ett lätt sätt att ta reda på vad som har ändrats mellan versionerna och på så sätt lättare kunna hitta vad som har gått fel ifall en ny bug eller nya problem har uppstått när en ny version går live. 
I stället för att försöka komma ihåg allt som har ändrats kan man öppna upp den nya version bredvid en äldre version och se vad som kan ha gått fel. 

TDD
Testdriven utveckling bygger på att man börjar skriva tester utifrån kraven innan man börjar skriva kod.
Detta leder till att i stället för att skriva test i efterhand så ger testfallen en ram att följa när det kommer till vilken kod som behövs skrivas för att just detta testfall kommer att uppfyllas.
Där efter kan man skriva ett nytt testfall och så fortsätter programmerings cykeln tills man har uppnått de krav som fanns på koden. 
Att jobba på detta sätt kan också förebygga att nya buggar lyckas hamna i koden eftersom man på en gång kan testa att den nya koden fungerar som den ska.
