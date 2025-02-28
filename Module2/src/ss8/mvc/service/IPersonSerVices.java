package ss8.mvc.service;
import java.util.List;
public interface IPersonSerVices<E> {
    List<E> getAll();
    List<E> getAllSortById();
    List<E> getAllSortByName();
}
