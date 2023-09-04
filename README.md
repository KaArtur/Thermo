
#Artur Kawa

# Thermo

https://thermo.up.railway.app/

Aplikacja bedzie wyliczać uproszczoną metoda zapotrzebowanie na cieplo do budynku oraz zaproponuje dobor odpowiedniego urzadzenia grzewczego wzgledem danych budynku. Aplikcja bedzie zbierac dane klientow (dane o budynku, dane klienta) chcących skorzystać z pomocy przy pozyskaniu dofinansowania na ten cel.
Podsumowując aplikcja służy do wstepnego oszacowania zapotrzebowania na moc do budynku, poinformowania klienta o możliwym dofinansowaniu, zebraniu danych oraz zapisaniu ich do bazy. 

W dalszej czesci aplikacji planowane jest dolaczenie panelu do logowania dla operatora ktory bedzie mógł wykorzystywać zapisane do bazy rekordy.


Update 31.08.2023
Aplikacja składa się z zakładek:
1) Thermo(strona główna) - krótki opis co znajduje się na stronie oraz button przekierowujący
2)  Kalkulator zapotrzebowania - po podaniu danych budynku oraz ilosci osob wraz z zuzyciem ciepłej wody na dobe, pokazuje sie wynik mocy dla domu
3)  Program Czyste Powietrze - strona z grafikami informująca o obecnej dotacji na termomodernizację
4)  Zostań partnerem - strona na której dany wykonawca który chce trafić do bazdy danych (potencjalna reklama), wpisuje swoje dane a następnie trafia do zakładki (Baza firm).  
5)  Baza firm - tutaj trafiają rekordy zapisane na stronie Zostań partnerem
6)  Szukasz pomocy - strona która ma na celu zbieranie potencjalnych klientów, którzy potrzebują pomocy przy szukaniu wykonawcy, przeprowadzeniu przez proces dotacji. Dane zbierane z tego widoku są ukryte. Dopiero po dostaniu się na portal admina można nimi zarządzać
7)  Dashboard - strona z logowaniem, gdzie po wpisaniu usera: admin oraz hasła: admin123 strona przekierowuje na strone admin. Panel pozwala na podgląd trafiających danych z zakładki Szukasz pomocy oraz na usunięcie konkretnego rekordu za pomocą buttona. Pod tabelką z potencjalnymi klientami jest tabelka z Bazą firm, które trafiały z widoku Zostań partnerem. Jeśli chcemy usunąć jakiś rekord z bazy firm to możemy to wykonać za pomocą buttona, a następnie widok Baza firm zostanie uaktualniony z widokiem Admin.

   Aplikacja wymaga jeszcze kilku ulepszeń, które w niedługiej przyszłości zostaną wykonane. Kilka danych testowych zostało umieszczonych w aplikacji, dostęp do nich jest w widoku admin

   Stos technologi użyty w aplikacji:
   -Java, Spring Boot, thymeleaf, javascript, html, css, postgresSQL, aplikacja hostowana na railway
