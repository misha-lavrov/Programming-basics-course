# Матеріали до занять блоку 6

Цей блок поєднує кілька різних типів матеріалів — реальні перевірені HTTP-обміни,
робочий Java-сервер, HTML/CSS, і матеріали для фінального проєкту.

## 010-030 — довідкові файли з реальними HTTP-обмінами

Усі приклади в цих текстових файлах — **не вигадані**, а реально отримані
командою `curl` проти публічного тестового API
[jsonplaceholder.typicode.com](https://jsonplaceholder.typicode.com)
(спеціально створений для навчання й тестування, безпечно використовувати
на заняттях):
- [`010-yak-pratsiuie-internet/raw-http-example.txt`](010-yak-pratsiuie-internet/raw-http-example.txt)
- [`020-http-detalno/http-methods-status-codes.txt`](020-http-detalno/http-methods-status-codes.txt)
- [`030-shcho-take-api/api-json-example.txt`](030-shcho-take-api/api-json-example.txt)
- [`040-postman/postman-requests-guide.txt`](040-postman/postman-requests-guide.txt)

## 050 — простий HTTP-сервер на Java

[`050-http-server-na-java/SimpleHttpServer.java`](050-http-server-na-java/SimpleHttpServer.java) —
реально запущений і перевірений через `curl` (обидва маршрути, `/` і
`/api/students`, повертають очікувані статус 200 і тіло відповіді). Використовує
`com.sun.net.httpserver.HttpServer` — вбудований у JDK, без зовнішніх
залежностей і фреймворків.

**Як запустити:** звичайний спосіб (IntelliJ ▶ або `java`), як і всі попередні
приклади. Після запуску відкрити в браузері `http://localhost:8080/` та
`http://localhost:8080/api/students`, або перевірити через `curl` чи Postman.

## 060-070 — HTML/CSS

[`060-osnovy-html/index.html`](060-osnovy-html/index.html) та
[`070-osnovy-css/index.html`](070-osnovy-css/index.html) + [`style.css`](070-osnovy-css/style.css) —
перевірені відкриттям у браузері (реально відрендерені, включно з
підключеною стилізацією). Відкрити `.html`-файл подвійним кліком або через
"Open in Browser" в IntelliJ IDEA.

## 080 — матеріали для фінального проєкту

[`080-pidgotovka-finalnogo-proektu/project-ideas.md`](080-pidgotovka-finalnogo-proektu/project-ideas.md) —
5 ідей проєктів з обов'язковими критеріями та шаблоном технічного завдання.

## Примітка про іменування

Коментарі — українською; імена змінних, методів і класів — англійською.
