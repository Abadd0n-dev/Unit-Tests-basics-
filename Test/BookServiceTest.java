import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import seminars.fourth.book.Book;
import seminars.fourth.book.BookRepository;
import seminars.fourth.book.BookService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BookServiceTest {

    private BookRepository bookRepository;
    private BookService bookService;

    @BeforeEach
    public void setUp() {
        // Создаем мок-объект BookRepository
        bookRepository = Mockito.mock(BookRepository.class);
        // Инициализируем BookService с мок-объектом
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testFindBookById() {
        // Задаем сценарий для метода findById
        String bookId = "123";
        Book expectedBook = new Book(bookId, "Test Book", "Author");
        when(bookRepository.findById(bookId)).thenReturn(expectedBook);

        // Вызываем метод и проверяем результат
        Book actualBook = bookService.findBookById(bookId);
        assertEquals(expectedBook, actualBook);

        // Проверяем, что метод findById был вызван с правильным аргументом
        verify(bookRepository).findById(bookId);
    }

    @Test
    public void testFindAllBooks() {
        // Задаем сценарий для метода findAll
        Book book1 = new Book("1", "First Book", "Author1");
        Book book2 = new Book("2", "Second Book", "Author2");
        List<Book> expectedBooks = Arrays.asList(book1, book2);

        when(bookRepository.findAll()).thenReturn(expectedBooks);

        // Вызываем метод для получения всех книг и проверяем результат
        List<Book> actualBooks = bookService.findAllBooks();
        assertEquals(expectedBooks, actualBooks);

        // Проверяем, что метод findAll был вызван
        verify(bookRepository).findAll();
    }
}
