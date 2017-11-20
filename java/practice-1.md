# practice-1.md
1. git-repo for labs
2. maven project хранить в репке (!= idea project)
3.1 Person entity, fields:
    - id
    - date of birthday
    - last name
    - метод который возвращает возраст этого чувака
- repo-class в котором можно хранить людей
    - добавить метод
    - удалить метод
- no collection, на массивах


1 maven проект - pom.xml
    - все лабы - как модули этого проекта, jar

- date storage - localdate from `Joda time` - подгрузить зависимости - через maven

---
target folder - папка куда все компилится - в `.gitignore`

## maven
- юзать maven для компайла. И вообще все через maven делать. 
- maven = pom.xml + sources (какая то структура папок)
- pom - описание проекта, как что собирать
- в поме указывается что проект является главным (каталогом проектов)
    - а у него уже будут модули
        - модуль - это просто папка. В нем также pom и также src. Остальное по сути не нужно
        - в pom модулей - есть тема `<dependencies>` - там указываешь какие либы подтягиваешь
        - если все модули используют одну либу - то в главном pom их указываешь
- в поме указываются java version / компилятор
- если управлять maven из консоли (а не из  idea)- то нужно его отдельно установить. Но также нужно в PATH прописать


## GroupId and ArtifactsID
- просто описание проекта
- GroupId - допустим ru.vsu
- ArtifactsID - имя проекта / labs допустим


внутри подмодули:
- GroupId = ru.vsu (такой-же)
- ArtifactsID = lab-1

необязательно чтобы это совпадало с названиями папок / модулей

## что прописывать в `pom.xml` на данном этапе (дфи-])
- для данного проекта - просто добавить joba в dependencies
- maven-compile-plugin
- [MaickelVRN/NCLab](https://github.com/MaickelVRN/NCLab) - nfv nbgf 

---
javadoc прописывать для методов
