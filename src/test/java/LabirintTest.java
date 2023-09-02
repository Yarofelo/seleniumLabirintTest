//Напиать автотест:
//Шаги:
//Открыть labirint.ru
//Скрыть плашку с cookies
//В поисковую строку написать Java
//Выполнить поиск
//Изменить сортировку с Сначала релевантные на Сначала высокий рейтинг
//Добавить все товары на странице в корзину (кнопка Купить)
//ОР:
//Счетчик товаров в корзине равен количеству добавленных товаров на шаге 6

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.cssSelector;

public class LabirintTest {

    @Test
    public void labirint() {
        // Открыть labirint.ru
        WebDriver browser = new ChromeDriver();
        browser.get("http://labirint.ru");

        // Скрыть плашку с cookies
        Cookie cookie = new Cookie("cookie-policy", "1");
        browser.manage().addCookie(cookie);
        browser.navigate().refresh();

        // В поисковую строку написать Java
        // Выполонить поиск
        browser.findElement(cssSelector("#search-field")).sendKeys("Java", Keys.ENTER);

        // Изменить сортировку с Сначала релевантные на Сначала высокий рейтинг
        browser.findElement(cssSelector("[data-event-content='высокий рейтинг']")).submit();

        //Дальнешие шаги обсудить на консультации
    }
}
