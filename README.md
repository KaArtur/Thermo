
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

<hr>

The application will calculate the heat demand for the building using a simplified method and will suggest the selection of the appropriate heating device in relation to the building data. The application will collect customer data (data about the building, customer data) who want to use assistance in obtaining funding for this purpose. To sum up, the application is used for initial estimation of the power demand for the building, informing the client about possible co-financing, collecting data and saving them to the database.

In the further part of the application, it is planned to add a login panel for the operator who will be able to use the records saved to the database.

Update 08/31/2023 The application consists of tabs:

1) Thermo(home page) - a short description of what is on the page and a redirect button
2) Demand calculator - after entering the building data and the number of people along with hot water consumption per day, the power result for the house is shown
3) Clean Air Program - a page with graphics informing about the current subsidy for thermomodernization
4) Become a partner - a page on which a given contractor who wants to be included in the database (potential advertisement), enters his data and then goes to the tab (Company database).
5) Companies database - records saved on the Become a partner page go here
6) Looking for help - a website that aims to collect potential customers who need help in finding a contractor, carrying out the grant process. Data collected from this view is hidden. You can manage them only after getting to the admin portal
7) Dashboard - login page, where after entering the user: admin and password: admin123, the page redirects to the admin page. The panel allows you to view the incoming data from the Looking for help tab and to delete a specific record using the button. Under the table with potential customers, there is a table with the Database of companies that came from the Become a partner view. If we want to delete a record from the company database, we can do it using the button, and then the Company database view will be updated with the Admin view.

   The application still needs some improvements, which will be made in the near future. Several test data have been placed in the application, access to them is in the admin view

Technology stack used in the application: -Java, Spring Boot, thymeleaf, javascript, html, css, postgresSQL, application hosted on railway
