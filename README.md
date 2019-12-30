# microserv
**Задание:** 
Требуется написать простенький микросервис для поиска 256 дня в году.  
Сервис создается на любом языке программирования и ожидает GET-запросы на 80-м порту.  
- Docker
    - Сборка образа： 
    ```
    gradle buildDocker
    ```
    - Создание container
    ```
    docker run -p 8080:8080 -t com.homework.micserv/microserv:0.0.1-SNAPSHOT
    ```
- Пример работы  
    1. curl http://localhost:8080/?year=2020  
    Ответ (JSON): ```{"errorCode":200,"dataMessage":"13/9/2020"}```
    2. curl http://localhost:8080/?year=2019  
    Ответ (JSON): ```{"errorCode":200,"dataMessage":"14/9/2019"}```
    3. curl http://localhost:8080/?year=201s  
    Ответ (JSON): ```{"errorCode":10,"dataMessage":""}```  
    Ошибка:errorCode":10 (Содержит нечисловые символы)
    4. curl http://localhost:8080/?year=209890238  
    Ответ (JSON): ```{"errorCode":20,"dataMessage":""}```  
    Ошибка:errorCode":20 (Слишком долго)
