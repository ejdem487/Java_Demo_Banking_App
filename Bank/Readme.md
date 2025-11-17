Konzolová inter-bankovní aplikace(zatím bez databáze)

 - Slouží jako tréninkový projekt pro práci s objekty, návrhovými vzory a interaktivním CLI.

## Hlavní vlastnosti
- Registrace uživatelů s validací vstupů a ukládáním do paměťové “databáze”.
- Přihlášení uživatele a vlastní uživatelské menu.
- Správa bankovních účtů (běžný/premium/spořicí), generování čísel účtů, výpis všech klientů.
- Základ pro bankovní operace jako vklad, výběr a převody mezi účty.
- Konzolové rozhraní, které využívá Command pattern pro jednotlivé akce.


## Architektura a vzory
- `Account` – factory pro jednotlivé typy účtů a singleton pro generování čísel.
- `Users` – Builder + Director pro bezpečnou konstrukci uživatele, přehled správy účtů.
- `Operations` – rozhraní `Operation` + `OperationInvoker` (Command pattern) pro konzolové akce, specializované operace (vytvoření uživatele, přihlášení,
  přidání účtu, vklady/výběry/převody).
- `Bank` – centrální služba držící uživatele a konzoli (`BankConsole`), která řídí životní cyklus aplikace.

## Konzolové menu

1. Create Account – vede uživatele krok za krokem validovaným formulářem a uloží ho do banky.
2. Display Accounts – vypíše všechny uživatele a jejich účty.
3. Log in – ověření e-mailu a hesla, následně otevře uživatelské menu (např. přidání běžného účtu, budoucí operace).
4. Quit – ukončí aplikaci.

## To-do
- Dodělat transfer opperation
- přidat uživatele worker, který bude pracovat s userem
- Vytvořit Dodelat console menu 
- Udelat logger file
- Udelat další Junit (používam verzi 4) testy
- Mozna i napojit na databazi H2
