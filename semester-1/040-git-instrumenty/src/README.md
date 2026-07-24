# Матеріали до занять блоку 4

Цей блок — про Git і інструменти розробника, тому тут менше окремих `.java`-файлів,
ніж у попередніх блоках, і більше послідовностей git-команд прямо в тексті занять.

## practice-project/ — наскрізний навчальний проєкт

[`practice-project/Calculator.java`](practice-project/Calculator.java) — простий
консольний калькулятор. Це файл, який студенти перетворять на свій ПЕРШИЙ git-репозиторій
на занятті 020, і продовжать з ним працювати (гілки — заняття 030, GitHub — заняття 040,
Pull Request — заняття 050, конфлікти — заняття 060, .gitignore/README — заняття 070,
командний проєкт — заняття 080). Один наскрізний проєкт замість окремого прикладу на
кожне заняття — навмисно, щоб історія комітів і гілок будувалась природно, як у
реальній роботі над одним репозиторієм.

## 060-merge-conflicts/ — перевірений сценарій конфлікту

Усі команди в занятті 060 реально виконані й перевірені (не вигадані):
- [`Calculator-feature-stepin.java`](060-merge-conflicts/Calculator-feature-stepin.java) — версія на гілці `feature/stepin` (додає операцію `^`)
- [`Calculator-feature-ostacha.java`](060-merge-conflicts/Calculator-feature-ostacha.java) — версія на гілці `feature/ostacha` (додає операцію `%`) у ТОМУ САМОМУ місці коду
- [`conflict-markers-example.txt`](060-merge-conflicts/conflict-markers-example.txt) — точний вигляд файлу з маркерами конфлікту (`<<<<<<<`, `=======`, `>>>>>>>`), скопійований з реального виводу `git merge`
- [`Calculator-resolved.java`](060-merge-conflicts/Calculator-resolved.java) — результат вирішення конфлікту (обидві операції залишені)

## 090-instrumenty-rozrobnyka/ — вправа на дебагер

- [`BuggyCalculator.java`](090-instrumenty-rozrobnyka/BuggyCalculator.java) — компілюється й запускається без помилок, але видає НЕПРАВИЛЬНИЙ результат (два навмисних баги)
- [`BuggyCalculatorFixed.java`](090-instrumenty-rozrobnyka/BuggyCalculatorFixed.java) — виправлена версія для звірки (не показувати одразу)

## Як запустити приклади

Той самий підхід, що й у попередніх блоках:

**Варіант A — IntelliJ IDEA (рекомендовано):** відкрити файл, клацнути ▶ біля `main`.

**Варіант B — термінал:** `java -Dfile.encoding=UTF-8 ІмяФайлу.java`

Ті самі відомі пастки з кирилицею й Windows-консоллю, що й у попередніх блоках —
детальніше в `src/README.md` блоку 1.
