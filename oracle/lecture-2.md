# Lecture 1
- `to_char` есть формат `'nls_numeric_characters='something here'`
- `to_number`, есть формат
- `to_char(sysdate, 'DD:MM:YYYY HH24:MI:SS')`
- `to_char(sysdate, 'MON Month')`
- `to_char(sysdate, 'MON Month', 'nls_date_language=english')`
- `to_date(2017-10-01, 'YYYY-MM-DD')`

---

- sysdate - текущее время
- systimestamp (до микросекунд)

```sql
SELECT sysdate, systimestamp
    FROM dual;
```
- dual - dummy table 
- [What is the dual table in Oracle? - Stack Overflow](https://stackoverflow.com/questions/73751/what-is-the-dual-table-in-oracle)

## string functions
- `instr('bc', 'abcdefg_bc')` - поиск подстроки в строке, возвращает первое вхождение. (индексация с 1). Если ничего не найдено то 0
- `substr('abcdef', 3, 4)` - с третьей позиции 4 символа
- `substr('abcdef', 3)` - с третьей позиции до конца строки
- `substr('abcdef', -2)` - от второго с конца до конца
- `replace('abcdef', 'cd', '34')` - меняет все вхождения `cd` на `34`
- `chr(64) = @` - перевод из числа ascii в сисмвол
- `ascii('a') = 97` - наоборот число по символу
- `ltrim()`, `rtrim()` `trim()` - убрать пробелы слева, справа, вообще

## number functions
- `round()` - округляет математически. Можно использовать для дат: `round(sysdate)`
- `trunc()` - тупо отбрасыв
- `flor`, `ceil`
- есть sin, cos, pow, 
- `extract (month from sysdate)`
